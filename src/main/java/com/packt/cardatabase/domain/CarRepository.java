package com.packt.cardatabase.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@RepositoryRestResource
//@CrossOrigin("http://localhost:3000")
public interface CarRepository extends CrudRepository<Car, Long> {

	List<Car> findByBrand(@Param("brand") String brand);
	List<Car> findByColor(@Param("color") String color);
	List<Car> findByYear(int year);
	
	List<Car> findByBrandAndModel(String brand, String model);
	List<Car> findByBrandAndColor(String brand, String color);
	
	List<Car> findByBrandOrderByYearAsc(String brand);
}
