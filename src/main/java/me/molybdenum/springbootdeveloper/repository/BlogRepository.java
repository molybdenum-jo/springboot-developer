package me.molybdenum.springbootdeveloper.repository;

import me.molybdenum.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}