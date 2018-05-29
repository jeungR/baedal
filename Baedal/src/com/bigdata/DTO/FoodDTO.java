package com.bigdata.DTO;

public class FoodDTO {

	String code;
	String name;
	int price;
	String date;
	String image;
	String type;
	String restaurant_code;
	String cookingtime;
	
	public FoodDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public FoodDTO(String code, String name, int price, String date, String image, String type, String restaurant_code,
			String cookingtime) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.date = date;
		this.image = image;
		this.type = type;
		this.restaurant_code = restaurant_code;
		this.cookingtime = cookingtime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRestaurant_code() {
		return restaurant_code;
	}

	public void setRestaurant_code(String restaurant_code) {
		this.restaurant_code = restaurant_code;
	}

	public String getCookingtime() {
		return cookingtime;
	}

	public void setCookingtime(String cookingtime) {
		this.cookingtime = cookingtime;
	}
	
	

	
}
