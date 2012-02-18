package com.proto.jsflow.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import com.proto.jsflow.domain.Product;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooEntity(table = "ARTICLE")
public class Article {

    private Integer articleId;

    private String articleName;

    private float price;

    @ManyToOne
    private Product product;

    private Integer qty;
}
