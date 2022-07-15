package com.targetind.ryse.learningresourcesapi.repository;

import com.targetind.ryse.learningresourcesapi.entity.LearningResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningResourceRepository extends JpaRepository<LearningResource,Integer> {

}
