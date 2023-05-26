package com.example.tranbaotu20.repository;

import com.example.tranbaotu20.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}