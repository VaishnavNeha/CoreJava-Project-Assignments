package com.neha.day3;

public class City {
	
	private String city_Name;
	private int population;
	
	
	public String getCity_Name() {
		return city_Name;
	}
	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public City(String city_Name, int population) {
		super();
		this.city_Name = city_Name;
		this.population = population;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [city_Name=" + city_Name + ", population=" + population + "]";
	}
	
	
	
	
	

}
