package com.modules.business;

import com.modules.social.geo.Country;

public class Currency {
	private String name;
	private Country country;

	public Currency() {
		// TODO Auto-generated constructor stub
	}

	public Currency(String name, Country country) {
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}