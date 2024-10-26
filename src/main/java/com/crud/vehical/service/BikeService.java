package com.crud.vehical.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crud.vehical.DAO.BikeDAO;

import com.crud.vehical.entity.BikeEntity;

@Service
public class BikeService {
	@Autowired
	BikeDAO bd;
	
	public String saveing(List<BikeEntity> b) {
		return bd.saveing(b);
	}

	public List<BikeEntity> getFind() {
		
		return bd.getFind();
	}

	public String getDelete(int id) {
		return bd.getDelete(id);
	}

	public String change(BikeEntity k,int b) {
		return bd.change(k,b);
	}

	public String cs(int i, BikeEntity b) {
		return bd.cs(i,b);
	}
	
	//Service and implementation
	public List<BikeEntity> getExpensive() {
		List<BikeEntity> bikes=bd.getFind();
		List<BikeEntity> expBike=bikes.stream().filter(x->x.getPrice()>300000).collect(Collectors.toList());
		return expBike;
	}

	public List<String> getExp() {
		List<BikeEntity>  bikes=bd.getFind();
		List<String> str=bikes.stream().filter(x->x.getPrice()>300000).map(x->x.getBrand()).collect(Collectors.toList());
		return str;
	}

	public List<String> expbrandcolor() {
		List<BikeEntity> bikes=bd.getFind();
		List<String> BlueBike=bikes.stream().filter(x->x.getColor().equals("Blue")).map(i->i.getBrand()+" : "+i.getPrice()).collect(Collectors.toList());
		return BlueBike;
	}

	public Long getmax() {
		List<BikeEntity> bikes=bd.getFind();
		long max =bikes.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).findFirst().get();
		return max;
	}

	public BikeEntity getobj() {
		List<BikeEntity> bikes=bd.getFind();
		Optional<BikeEntity> b=bikes.stream().max(Comparator.comparing(x->x.getPrice()));
		return b.get();
	}

	public BikeEntity minLength() {
		List<BikeEntity> bikes=bd.getFind();
		Optional<BikeEntity> len=bikes.stream().min(Comparator.comparing(x->x.getBrand().length()));
		return len.get();
	}

	public int max() {
		return bd.max();
	}

//	public List<BikeEntity> getLen(int a, int b) {
//		return bd.getLen(a,b);
//	}

}
