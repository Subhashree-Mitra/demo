package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;

@RestController
public class MainController {
	
	List<Product> prodList=new ArrayList();	
	public MainController() {
		super();
		prodList.add(new Product(1,"TV",95000,1,"Apple",0));
		prodList.add(new Product(2,"Tripod",7000,2,"Digitech",100));
		prodList.add(new Product(3,"CCTV Camera",4500,5,"Mi",150));
		prodList.add(new Product(4,"Mobile",50000,1,"Samsung",0));
		prodList.add(new Product(5,"Monitor",16000,4,"Dell",100));
		prodList.add(new Product(6,"Mouse",1200,15,"logitech",50));
	}
	
	@GetMapping("/show")// GET HTTP Method
	public String show()
	{
		return "dfqecdkxlksfhcdjmq";
	}
	
	//read all
	@GetMapping("/getAll")
	public List<Product> productList(){
		return prodList;
	}
	
	@GetMapping("/getOne/{id}")
	public Product readOne(@PathVariable int id) {
		return prodList.get(id-1);
	}
	
	@PutMapping("/update/{id}")
	public void updateProduct(@RequestBody Product p, @PathVariable int id) {
		for(int i=0; i<prodList.size(); i++) {
			Product prod = prodList.get(i);
			if(prod.getProdId()==id) {
				prodList.set(i, p);
			}
		}
	}
	
	@PostMapping("/add")
	public void addProduct(@RequestBody Product p) {
		prodList.add(p);
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteProduct(@PathVariable int id) {
		for(int i=0; i<prodList.size(); i++) {
			Product prod = prodList.get(i);
			if(prod.getProdId()==id) {
				prodList.remove(i);
			}
		}
	}
	
}
