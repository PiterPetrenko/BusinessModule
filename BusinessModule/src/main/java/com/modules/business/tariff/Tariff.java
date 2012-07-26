package com.modules.business.tariff;

import com.modules.business.Price;

public class Tariff {
	private String name;
	private TariffType type;
	private Price price;

	public Tariff() {
		// TODO Auto-generated constructor stub
	}

	public Tariff(String name, TariffType type, Price price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TariffType getType() {
		return type;
	}

	public void setType(TariffType type) {
		this.type = type;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
}