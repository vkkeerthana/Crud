package com.crud.vehical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.vehical.entity.BikeEntity;
import com.crud.vehical.service.BikeService;



@RestController
@RequestMapping(value="/bike")
public class BikeController {
	@Autowired
	BikeService bs;
	
	@PostMapping(value="/saveing")
	public String saveing(@RequestBody List<BikeEntity> b) {
		return bs.saveing(b);
	}
	@GetMapping(value="/finding")
	public List<BikeEntity> getFind() {
		return bs.getFind();
	}
	@DeleteMapping(value="/deleting")
	public String getDelete(@RequestParam int id) {
		return bs.getDelete(id);
	}
	@PutMapping(value="/changefield")
	public String change(@RequestBody BikeEntity k,@RequestParam int b) {
		return bs.change(k,b);
	}
	@PatchMapping(value="/changeSingle/{i}")
	public String cs(@PathVariable int i,@RequestBody BikeEntity b) {
		return bs.cs(i,b);
	}
	
	
	
	
	
	//Service and implementation
	@GetMapping(value="/getExp")//expensive bikes
	public List<BikeEntity> getExpensive(){
		return bs.getExpensive();
	}
	@GetMapping(value="/expBrand")//expensive Bike's brand
		public List<String> getExp(){
			return bs.getExp();
	}
	@GetMapping(value="/expbrandcolor") //expensive Bike's brand and color
	List<String> expbrandcolor(){
		return bs.expbrandcolor();
	}
	@GetMapping(value="/maxPrice")//max price
	long getmax() {
		return bs.getmax();
	}
	@GetMapping(value="/maxobj")//max price object
	BikeEntity getobj() {
		return bs.getobj();
	}
	@GetMapping(value="/minLength")//min brand length object
	BikeEntity minLength() {
		return bs.minLength();
	}
	
	
	//JQuery
	@GetMapping(value="/maxprice")
	int max() {
		return bs.max();
	}
//	@GetMapping(value="/brandLen/{a}/{b}")
//	public List<BikeEntity> getLen(@PathVariable int a, @PathVariable int b){
//		return bs.getLen(a,b);
//	}
}
