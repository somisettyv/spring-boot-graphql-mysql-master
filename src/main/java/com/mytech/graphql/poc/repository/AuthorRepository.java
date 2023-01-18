package com.mytech.graphql.poc.repository;

import com.mytech.graphql.poc.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}