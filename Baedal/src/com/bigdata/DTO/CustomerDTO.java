package com.bigdata.DTO;

import java.sql.Date;

public class CustomerDTO {

	String code;
	String id;
	String password;
	String address;
	String mobile;
	String vip;
	String name;
	Date deletedate;
	
	public CustomerDTO() {
		super();
	}
	

	public CustomerDTO(String name, String id, String password,  String mobile, String address) {
		super();
		this.id = id;
		this.password = password;
		this.address = address;
		this.mobile = mobile;
		this.name = name;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDeletedate() {
		return deletedate;
	}

	public void setDeletedate(Date deletedate) {
		this.deletedate = deletedate;
	}

	
}
