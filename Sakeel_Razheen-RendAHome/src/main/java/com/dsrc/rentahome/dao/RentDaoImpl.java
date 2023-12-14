package com.dsrc.rentahome.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dsrc.rentahome.pojo.House;


@Repository
public class RentDaoImpl implements RentDao{

@Autowired
EntityManager eMan;
	
	@Override
	public boolean addProperty(House house) {
		// TODO Auto-generated method stub
		eMan.persist(house);
		return true;
	}

	@Override
	public boolean editProperty(House house) {
		// TODO Auto-generated method stub
		eMan.merge(house);
		return true;
	}

	@Override
	public boolean deleteProperty(int adno) {
		// TODO Auto-generated method stub
		House house=eMan.find(House.class, adno);
		eMan.remove(house);
		return true;
	}

	@Override
	public List<House> searchByLocation(String location) {
		// TODO Auto-generated method stub
			Query qry=eMan.createQuery("from House h where h.location=?1");
			qry.setParameter(1, location);
		return qry.getResultList();
	}

	@Override
	public List<House> searchByHouseType(String type) {
		// TODO Auto-generated method stub
		Query qry=eMan.createQuery("from House h where h.housetype=?1");
		qry.setParameter(1, type);
	return qry.getResultList();
		
	}

	@Override
	public List<House> searchByRentAsking(int fromprice, int toprice) {
		// TODO Auto-generated method stub
		//House house=new House();
		Query qry = eMan.createQuery("from House h where  h.askingrent >= :fromprice and h.askingrent <= :toprice");
		
		qry.setParameter("fromprice", fromprice);
		qry.setParameter("toprice", toprice);
		return qry.getResultList();
	}

	@Override
	public List<House> searchByCarParking() {
		// TODO Auto-generated method stub
		
		return eMan.createQuery("FROM House h where h.carparkingavailable IS NOT NULL").getResultList();
	}

	@Override
	public List<House> searchByBikeParking() {
		// TODO Auto-generated method stub
		return eMan.createQuery("FROM House h where h.bikeparkingavailable IS NOT NULL").getResultList();
	}

}
