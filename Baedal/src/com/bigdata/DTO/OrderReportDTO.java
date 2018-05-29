package com.bigdata.DTO;

public class OrderReportDTO {

	String order_code;
	String customer_code;
	String customer_name;
	String customer_mobile;
	String customer_address;
	String food_code;
	String food_name;
	String menu_number;
	String order_ok;
	
	public String getCustomer_code() {
		return customer_code;
	}

	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}

	public String getOrder_ok() {
		return order_ok;
	}

	public void setOrder_ok(String order_ok) {
		this.order_ok = order_ok;
	}

	public OrderReportDTO() {
		super();
	}

	public String getOrder_code() {
		return order_code;
	}

	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_mobile() {
		return customer_mobile;
	}

	public void setCustomer_mobile(String customer_mobile) {
		this.customer_mobile = customer_mobile;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getFood_code() {
		return food_code;
	}

	public void setFood_code(String food_code) {
		this.food_code = food_code;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getMenu_number() {
		return menu_number;
	}

	public void setMenu_number(String menu_number) {
		this.menu_number = menu_number;
	}
	
	
	
}
