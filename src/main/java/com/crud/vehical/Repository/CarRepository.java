package com.crud.vehical.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crud.vehical.entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer>{
	@Query(value="select * from car_table where brand like ?",nativeQuery=true)
	public List<CarEntity> findByBrand(String b);
	
	@Query(value="select * from car_table where price>=? and price<=?",nativeQuery = true)
	public List<CarEntity> findByBrand(int a, int b);
	
	@Query(value="select max(price) from car_table",nativeQuery =true)
	public int getMax();

	@Query(value="select * from car_table where price = (select max(price) from car_table)",nativeQuery=true)
	public List<CarEntity> maxobj();
	
	@Query(value="select count(*)from car_table where price>?",nativeQuery=true)
	public List<CarEntity> countprice(int p);

	@Query(value="select brand from car_table where length(brand)>?",nativeQuery=true)
	List<String> stringlength(int p);
	
	
	
	
	
	//JQuery
	@Query(value="select car from CarEntity car where price>:a and price<:b")
	public List<CarEntity> priceByRange(int a, int b);

//	@Query(value="select car from CarEntity car where length(brand)>:a limit :b")
//	public List<CarEntity> lenlimit(int a, int b);
	
}
