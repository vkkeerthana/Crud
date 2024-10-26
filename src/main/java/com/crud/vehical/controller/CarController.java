package com.crud.vehical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.vehical.entity.CarEntity;
import com.crud.vehical.service.CarService;

@RestController
@RequestMapping(value="/car")
public class CarController {
	@Autowired
	CarService cs;
	@PostMapping(value="/saveing")
	public String saveing(@RequestBody List<CarEntity> b) {
		return cs.saveing(b);
	}
	@GetMapping(value="/finding")
	public List<CarEntity> getFind() {
		return cs.getFind();
	}
	@DeleteMapping(value="/deleting")
	public String getDelete(@RequestParam int id) {
		return cs.getDelete(id);
	}
	@GetMapping(value="/getByBrand/{b}")
	public List<CarEntity> findByBrand(@PathVariable String b){
		return cs.findByBrand(b);
	}
	@GetMapping(value="/getByRange/{a}/{b}")
	public List<CarEntity> findByRange(@PathVariable int a, @PathVariable int b){
		return cs.findByRange(a,b);
	}
	@GetMapping(value="/max")
	public int getMax() {
		return cs.getMax();
	}
	@GetMapping(value="/maxObj")
	public List<CarEntity> maxobj() {
		return cs.maxobj();
	}
	@GetMapping(value="/countprice/{p}")
	public List<CarEntity> countprice(@PathVariable int p){
		return cs.countprice(p);
	}
	@GetMapping(value="/stringlength/{p}")
	public List<String> stringlength(@RequestParam int p){
		return cs.stringlength(p);
	}
	@GetMapping(value = "/findbyid/{a}")
		public CarEntity getc(@PathVariable int a){
		return cs.getc(a);
				}
	@GetMapping(value="/findingbrand/{a}")
	public String getbrands(@PathVariable int a) {
		return cs.getbrands(a);
	}
	
	
	
	//JQuery
//	@GetMapping(value="/priceRange/{a}/{b}")
//	public List<CarEntity> priceByRange(@PathVariable int a,@PathVariable int b){
//		return cs.priceByRange(a,b);
//	}
//	@GetMapping(value="/lenlimit/{a}/{b}")
//	public List<CarEntity> lenlimit(@PathVariable int a,@PathVariable int b){
//		return cs.lenlimit(a,b);
//	}
//		}
}
