package com.bigdata.DTO;

public class BasketDTO {
	String code;
	String food_name;
	String basket_number;
	int food_price;
	
	public BasketDTO() {
		super();
	}

	
	public BasketDTO(String food_name, String basket_number, int food_price) {
		super();
		this.food_name = food_name;
		this.basket_number = basket_number;
		this.food_price = food_price;
	}

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getBasket_number() {
		return basket_number;
	}

	public void setBasket_number(String basket_number) {
		this.basket_number = basket_number;
	}

	public int getFood_price() {
		return food_price;
	}

	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}
	
	
}
