package com.crud.vehical.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crud.vehical.entity.BikeEntity;

public interface BikeRepository extends JpaRepository<BikeEntity, Integer>{
	
	//JQuery
	@Query(value="select max(price) from BikeEntity")
	int max();
	
//	@Query(value="select bile from BikeEntity bike where length(brand)>? limit ?")
//	List<BikeEntity> getLen(int a, int b);
}
