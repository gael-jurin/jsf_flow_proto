package com.proto.jsflow.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.component.html.HtmlDataTable;

import com.proto.jsflow.domain.Payment;
import com.proto.jsflow.vo.ArticleVO;


public class CartBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CustomerBean customer;

    private Payment payment;
    
    //private Payment cashOrCheckPayment;
    
    private List<ArticleVO> articles = new ArrayList<ArticleVO>();

    private float total;
    
    

	public CartBean() {
		
	}



	public CustomerBean getCustomer() {
		return customer;
	}



	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}



	public Payment getPayment() {
		return payment;
	}



	public void setPayment(Payment payment) {
		this.payment = payment;
	}



//	public Payment getCashOrCheckPayment() {
//		return cashOrCheckPayment;
//	}
//
//
//
//	public void setCashOrCheckPayment(Payment cashOrCheckPayment) {
//		this.cashOrCheckPayment = cashOrCheckPayment;
//	}



	public List<ArticleVO> getArticles() {
		return articles;
	}



	public void setArticles(List<ArticleVO> articles) {
		this.articles = articles;
	}



	public float getTotal() {
		return total;
	}



	public void setTotal(float total) {
		this.total = total;
	}
	
	public int getRowCount(){
		
		return getArticles().size();
	}



}
