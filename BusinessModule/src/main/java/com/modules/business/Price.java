package com.modules.business;

public class Price {
	private Currency currency;
	private float value;

	public Price() {
		// TODO Auto-generated constructor stub
	}

	public Price(Currency currency, float value) {
		this.currency = currency;
		this.value = value;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
}