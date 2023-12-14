package com.dsrc.rentahome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsrc.rentahome.dao.RentDao;
import com.dsrc.rentahome.pojo.House;


@Service
@Transactional
public class RentServiceImpl implements RentService {

	
	@Autowired
	RentDao Rdao;
	@Override
	public boolean addProperty(House house) {
		// TODO Auto-generated method stub
		
		return Rdao.addProperty(house);
	}

	@Override
	public boolean editProperty(House house) {
		// TODO Auto-generated method stub
		return Rdao.editProperty(house);
	}

	@Override
	public boolean deleteProperty(int adno) {
		// TODO Auto-generated method stub
		return Rdao.deleteProperty(adno);
	}

	@Override
	public List<House> searchByLocation(String location) {
		// TODO Auto-generated method stub
           return Rdao.searchByLocation(location);
	}

	@Override
	public List<House> searchByHouseType(String type) {
		// TODO Auto-generated method stub
		return Rdao.searchByHouseType(type);
	}

	@Override
	public List<House> searchByRentAsking(int fromprice, int toprice) {
		// TODO Auto-generated method stub
		return Rdao.searchByRentAsking(fromprice, toprice);
	}

	@Override
	public List<House> searchByCarParking() {
		// TODO Auto-generated method stub
		
		
			
		return Rdao.searchByCarParking();
	}

	@Override
	public List<House> searchByBikeParking() {
		// TODO Auto-generated method stub
		return Rdao.searchByBikeParking();
	}

}
