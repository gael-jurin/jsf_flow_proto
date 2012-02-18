package com.proto.jsflow.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proto.jsflow.domain.Article;

public interface ArticleRepo extends JpaRepository<Article, Integer> {
	
	List<Article> findAllArticle();
}
