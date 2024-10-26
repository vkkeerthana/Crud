package com.crud.vehical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.vehical.DAO.CarDAO;
import com.crud.vehical.entity.CarEntity;



@Service
public class CarService {
	@Autowired
	CarDAO cd;
	public CarEntity maxobj;

	public String saveing(List<CarEntity> b) {
		return cd.saveing(b);
	}

	public List<CarEntity> getFind() {
		return cd.getFind();
	}

	public String getDelete(int id) {
		return cd.getDelete(id);
	}

	public List<CarEntity> findByBrand(String b) {
		return cd.findByBrand(b);
	}

	public List<CarEntity> findByRange(int a, int b) {
		return cd.findByRange(a,b);
	}

	public int getMax() {
		return cd.getMax();
	}

	public List<CarEntity> maxobj() {
		return cd.maxobj();
	}

	public List<CarEntity> countprice(int p) {
		return cd.countprice(p);
	}

	public List<CarEntity> priceByRange(int a, int b) {
		return cd.priceByRange(a,b);
	}

	public List<String> stringlength(int p) {
		return cd.stringlength(p);
	}

	public CarEntity getc(int a) {
		return cd.getc(a);
	}

	public String getbrands(int a) {
		CarEntity c= cd.getc(a);
		return c.getBrand();
	}

//	public List<CarEntity> lenlimit(int a, int b) {
//		return cd.lenlimit(a,b);
//	}

//	public String branding(int a) {
//		List<CarEntity> c=cd.findall();
//		return str;
//	}

	

	
}
