package com.docter.DocterInfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docter.DocterInfo.entity.doctorPojo;
import com.docter.DocterInfo.service.doctorService;





@RestController
public class doctorController {
	
	@Autowired
	private doctorService docterservice;
	
	@GetMapping("/doctors")
	public List<doctorPojo> getDoctors(){
		
		List<doctorPojo> list=docterservice.getAll();
		return list;
	}
	
	@GetMapping("doctors/{id}")
	public Optional<doctorPojo> getbyid(@PathVariable("id") int id){
		
		Optional<doctorPojo> pojo=docterservice.getDoctorById(id);
		return pojo;
	}
	
	@PutMapping("doctor/update")
	public doctorPojo update(@RequestBody doctorPojo pojo) {
		return docterservice.update(pojo);
	}
}


