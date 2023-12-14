package com.dsrc.rentahome.service;

import java.util.List;

import com.dsrc.rentahome.pojo.House;

public interface RentService {
public boolean addProperty(House house);
	
	public boolean editProperty(House house);
	
	public boolean deleteProperty(int adno);
	
	List<House> searchByLocation(String location);
	
	List<House> searchByHouseType(String type);
	
	List<House> searchByRentAsking(int fromprice,int toprice);
	
	List<House> searchByCarParking();
	
	List<House> searchByBikeParking();

}
