package com.dsrc.rentahome.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="housedata")
public class House {
	@Id
	@Column(name="adno")
       private int adno;
	@Column(name="housetype")
       private String housetype;
	@Column(name="location")
       private String location;
	@Column(name="buildingage")
       private int buildingage;
	@Column(name="carparkingavailable")
       private String carparkingavailable;
	@Column(name="bikeparkingavailable")
       private String bikeparkingavailable;
	@Column(name="askingrent")
       private int askingrent;
	public int getAdno() {
		return adno;
	}
	public void setAdno(int adno) {
		this.adno = adno;
	}
	public String getHousetype() {
		return housetype;
	}
	public void setHousetype(String housetype) {
		this.housetype = housetype;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getBuildingage() {
		return buildingage;
	}
	public void setBuildingage(int buildingage) {
		this.buildingage = buildingage;
	}
	public String getCarparkingavailable() {
		return carparkingavailable;
	}
	public void setCarparkingavailable(String carparkingavailable) {
		this.carparkingavailable = carparkingavailable;
	}
	public String getBikeparkingavailable() {
		return bikeparkingavailable;
	}
	public void setBikeparkingavailable(String bikeparkingavailable) {
		this.bikeparkingavailable = bikeparkingavailable;
	}
	public int getAskingrent() {
		return askingrent;
	}
	public void setAskingrent(int askingrent) {
		this.askingrent = askingrent;
	}
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	public House(int adno, String housetype, String location, int buildingage, String carparkingavailable,
			String bikeparkingavailable, int askingrent) {
		super();
		this.adno = adno;
		this.housetype = housetype;
		this.location = location;
		this.buildingage = buildingage;
		this.carparkingavailable = carparkingavailable;
		this.bikeparkingavailable = bikeparkingavailable;
		this.askingrent = askingrent;
	}
	@Override
	public String toString() {
		return "HouseData [adno=" + adno + ", housetype=" + housetype + ", location=" + location + ", buildingage="
				+ buildingage + ", carparkingavailable=" + carparkingavailable + ", bikeparkingavailable="
				+ bikeparkingavailable + ", askingrent=" + askingrent + "]";
	}
	
}
