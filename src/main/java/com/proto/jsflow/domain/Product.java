package com.proto.jsflow.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Set;
import com.proto.jsflow.domain.Article;
import java.util.HashSet;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity(identifierField = "id", table = "PRODUCT")
public class Product {

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Article> articles = new HashSet<Article>();

    private String name;

    private Integer id;
}
