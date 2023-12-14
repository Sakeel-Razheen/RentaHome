package com.dsrc.rentahome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsrc.rentahome.pojo.House;
import com.dsrc.rentahome.service.RentService;

@RestController
@RequestMapping("/rentahomerest")

public class RentController {
	
	@Autowired
	RentService Rservice;
	
	
@PostMapping("/home")
public boolean addProperty(@RequestBody House house) {
	return Rservice.addProperty(house);
}

@PutMapping("/home")
public boolean editProperty(@RequestBody House house) {
	return Rservice.editProperty(house);
}

@DeleteMapping("/home/{adno}")
public boolean deleteProperty(@PathVariable ("adno") int adno) {
	return Rservice.deleteProperty(adno);
}

@GetMapping("/searchbylocation/{location}")
public List<House> searchByLocation(@PathVariable ("location") String location){
	return Rservice.searchByLocation(location);
}

@GetMapping("/searchbyhometype/{type}")
public List<House> searchByHouseType(@PathVariable ("type") String type) {
	return Rservice.searchByHouseType(type);
}

@GetMapping("/searchbyrent/{fromprice}/{toprice}")
public List<House> searchByRentAsking(@PathVariable ("fromprice") int fromprice,@PathVariable ("toprice") int toprice){
return Rservice.searchByRentAsking(fromprice, toprice);

}

@GetMapping("/searchbycarparking")
public List<House> searchByCarParking(){
	return Rservice.searchByCarParking();
}

@GetMapping("/searchbybikeparking")
public List<House> searchByBikeParking(){
	return Rservice.searchByBikeParking();
}
}
