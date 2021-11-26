package com.bogliaccino.automobili.integration;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bogliaccino.automobili.entities.Automobile;
import com.bogliaccino.automobili.service.AutoService;

@RestController
@RequestMapping("/api")
public class AutoRestCtrl {

	@Autowired
	private AutoService service;

	@GetMapping("/{marca}")
	public List<Automobile> getAllByMarca(@PathVariable String marca){
//		List<Automobile> allAuto = this.service.getAllAuto();
//		List<Automobile> autoFiltrate = allAuto.stream()
//			.filter(a -> a.getMarca().equals(marca))
//			.collect(Collectors.toList());
//		System.out.println(marca);
		return this.service.getAllAutoByMarca(marca);
	}
	
	@GetMapping
	public List<Automobile> getAll(){
		return this.service.getAllAuto();
	}
	
	@PostMapping(consumes = "application/json")
	public void addAuto(@RequestBody Automobile a) {
		this.service.addAuto(a);
	}
}
