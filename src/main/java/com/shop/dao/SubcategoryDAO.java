package com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.Subcategory;

@Repository("subcategoryRepository")
public interface SubcategoryDAO extends JpaRepository<Subcategory, Long>{

//	@Query("Select new com.shop.model.Subcategory(s.id, s.name, c.id)"+
//			"from Subcategory s, Category c where s.id = c.id")
//	List<Subcategory> findAllSubcategories();
}
