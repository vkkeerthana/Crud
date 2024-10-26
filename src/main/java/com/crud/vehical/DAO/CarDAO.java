package com.crud.vehical.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.vehical.Repository.CarRepository;
import com.crud.vehical.entity.CarEntity;


@Repository
public class CarDAO {
	@Autowired
	CarRepository cr;

	public String saveing(List<CarEntity> b) {
		cr.saveAll(b);
		return "Saved successfully";
	}

	public List<CarEntity> getFind() {
		return cr.findAll();
	}

	public String getDelete(int id) {
		
		return "deleted Successfully";
	}

	public List<CarEntity> findByBrand(String b) {
		
		return cr.findByBrand(b);
	}

	public List<CarEntity> findByRange(int a, int b) {
		
		return cr.findByBrand(a,b);
	}

	public int getMax() {
		return cr.getMax();
	}

	public List<CarEntity> maxobj() {
		return cr.maxobj();
	}

	public List<CarEntity> countprice(int p) {
		return cr.countprice(p);
	}

	public List<CarEntity> priceByRange(int a, int b) {
		
		return cr.priceByRange(a,b);
	}

	public List<String> stringlength(int p) {
		return cr.stringlength(p);
	}

	public CarEntity getc(int a) {
		return cr.findById(a).get();
	}

	
//	public List<CarEntity> lenlimit(int a, int b) {
//		return cr.lenlimit(a,b);
//	}

	

	

}
