package com.mytech.graphql.poc.repository;

import com.mytech.graphql.poc.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
