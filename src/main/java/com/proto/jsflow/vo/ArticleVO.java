package com.proto.jsflow.vo;

import java.io.Serializable;

import com.proto.jsflow.domain.Product;

public class ArticleVO implements Serializable {

	private Integer articleId;

    private String articleName;

    private float price;

    private Product product;

    private Integer qty;

	public ArticleVO(Integer articleId, String articleName, float price,
			Product product, Integer qty) {
		
		this.articleId = articleId;
		this.articleName = articleName;
		this.price = price;
		this.product = product;
		this.qty = qty;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
    
    
}
