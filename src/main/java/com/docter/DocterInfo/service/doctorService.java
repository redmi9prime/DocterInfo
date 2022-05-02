package com.docter.DocterInfo.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.docter.DocterInfo.entity.doctorPojo;
import com.docter.DocterInfo.repo.doctorRepository;




@Component
public class doctorService {

	@Autowired
	public doctorRepository doctorrepository;
	
	public List<doctorPojo> getAll(){
		
		List<doctorPojo> list=(List<doctorPojo>) this.doctorrepository.findAll();
		Collections.sort(list, (d1,d2) -> d1.getName().compareTo(d2.getName()));
		return list;
		
	}
	
	//getting particular doctor by id
	public Optional<doctorPojo> getDoctorById(int id){
		Optional<doctorPojo> pojo=null;
		try {
			pojo=this.doctorrepository.findById(id);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return pojo;
	}
	
	//updating doctor specialist
	//update by id
	public doctorPojo update(doctorPojo pojo) {
		doctorPojo old=null;
		Optional<doctorPojo> optionaldoctor=doctorrepository.findById(pojo.getId());
		if(optionaldoctor.isPresent()) {
			old=optionaldoctor.get();
			old.setName(pojo.getName());
			old.setSpecialist(pojo.getSpecialist());
			doctorrepository.save(old);
		}
		else {
			return new doctorPojo();
		}
		return old;
	}
		
}
