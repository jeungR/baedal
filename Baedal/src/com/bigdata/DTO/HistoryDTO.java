package com.bigdata.DTO;

public class HistoryDTO {
	String order_code;
	String restaurtant_name;
	String food_name;
	String menu_number;
	int totalprice;
	String startdate;
	String ok;
	
	public HistoryDTO() {
		super();
	}

	public String getOrder_code() {
		return order_code;
	}

	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}

	public String getRestaurtant_name() {
		return restaurtant_name;
	}

	public void setRestaurtant_name(String restaurtant_name) {
		this.restaurtant_name = restaurtant_name;
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

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}
	
	
	
}
