package com.crud.vehical.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.vehical.Repository.BikeRepository;

import com.crud.vehical.entity.BikeEntity;

@Repository
public class BikeDAO {
	@Autowired
	BikeRepository br;
	
	public String saveing(List<BikeEntity> b) {
		 br.saveAll(b);
		 return "Posted successfull";
	}

	public List<BikeEntity> getFind() {
		return br.findAll();
	}

	public String getDelete(int id) {
		br.deleteById(id);
		return "Deleted Successfully";
	}

	public String change(BikeEntity k,int b) {
		br.save(k);
		return "Updated";
	}

	public String cs(int i, BikeEntity b) {
		BikeEntity bi=br.findById(i).get();
		bi.setColor(b.getColor());
		br.save(bi);
		return "Chaged single field";
	}

	public int max() {
		return br.max();
	}
//
//	public List<BikeEntity> getLen(int a, int b) {
//		return br.getLen(a,b);
//	}

}
