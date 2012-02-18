package com.proto.jsflow.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.html.HtmlSelectOneRadio;
import javax.faces.event.ActionEvent;

import org.apache.commons.digester.plugins.Declaration;
import org.springframework.beans.factory.annotation.Autowired;

import com.proto.jsflow.domain.CashOrCheckPayment;
import com.proto.jsflow.domain.CreditCardPayment;
import com.proto.jsflow.domain.Payment;
import com.proto.jsflow.domain.PaymentDetails;
import com.proto.jsflow.domain.PaymentType;
import com.proto.jsflow.exception.CustomerNotFoundException;
import com.proto.jsflow.services.CustomerService;
import com.proto.jsflow.vo.ArticleVO;


public class ShoppingFlowActions {
  
	@Autowired
	private CustomerService customerService;
	
	private HtmlDataTable articleTab;
	
	private HtmlSelectOneRadio payradio;
	
	private String paytype;
	
	public boolean showccn =false;
	
	private ArticleVO art;
	
	public ShoppingFlowActions(){
		
	}
	
   public CustomerBean lookupCustomer(String phoneNumber) 
         throws CustomerNotFoundException {     
	   CustomerBean customer = customerService.lookupCustomer(phoneNumber);
      if(customer != null) {        
        return customer;
      } else {
        throw new CustomerNotFoundException();
      }
   }
   
   public void addCustomer(CustomerBean customer) {
      System.out.println("TODO: Flesh out the addCustomer() method.");
      System.out.println(customer.getName() + "Added successfully.");
   }
   
   public void saveCart(CartBean cart) {
	      System.out.println("TODO: Flesh out the saveCart(cart) method.");
	      cart.setTotal(cart.getTotal() + (art.getPrice() * art.getQty()));
	      
	      for(ArticleVO artc: cart.getArticles()){
	    	  if (art.getArticleId().equals(artc.getArticleId()))
	    		  artc.setQty(art.getQty());
	    	  break;
	      }
	      
   }
   
   public void updateArticleSelected(ActionEvent ev) {
	   art = (ArticleVO) articleTab.getRowData();
   }
   
   public void updatePaymentType(ActionEvent ev) {
	   paytype = (String) payradio.getValue();
	   if (paytype.equals("CREDIT_CARD"))
		   showccn = true;
	   else{
		   showccn = false;
	   }
   }

   public Payment verifyPayment(PaymentDetails paymentDetails) {
     Payment payment = null;
     if(paymentDetails.getPaymentType() == PaymentType.CREDIT_CARD) {
       payment = new CreditCardPayment();
     } else {
       payment = new CashOrCheckPayment();
     }
     
     return payment;
   }
   
   
   public List<ArticleVO> loadArticles(CartBean cart){
	   
	   List<ArticleVO> articles = new ArrayList<ArticleVO>();
	   if ( cart.getArticles().size() == 0){
	     
	      articles.add(new ArticleVO(1,"LCD Screen TOSHIBA",3560,null,0));
	      articles.add(new ArticleVO(2,"LCD Screen SONY",4560,null,0));
	      articles.add(new ArticleVO(3,"LCD Screen SIERA",2560,null,0));
	      
	      cart.setArticles(articles);
	   } else{
		   
		   articles = cart.getArticles();
	   }
	      
	   
	   return articles;
	   
   }
   public void saveDeclaration(Declaration declaration) {
	   System.out.println("TODO: Flesh out the saveDeclaration() method.");
   }
   
   public boolean checkDeliveryArea(String zipCode) {
	 System.out.println("TODO: Flesh out the checkDeliveryArea() method.");
     return "75075".equals(zipCode);
   }

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public HtmlDataTable getArticleTab() {
		return articleTab;
	}

	public void setArticleTab(HtmlDataTable articleTab) {
		this.articleTab = articleTab;
	}

	public HtmlSelectOneRadio getPayradio() {
		return payradio;
	}

	public void setPayradio(HtmlSelectOneRadio payradio) {
		this.payradio = payradio;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public boolean isShowccn() {
		return showccn;
	}

	public void setShowccn(boolean showccn) {
		this.showccn = showccn;
	}
	
}
