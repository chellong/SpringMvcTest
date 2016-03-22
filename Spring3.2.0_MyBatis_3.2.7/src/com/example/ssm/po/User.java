package com.example.ssm.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2423919223920882801L;
	
	private int id;
	/**
	 * �û���
	 */
	private String username;
	/**
	 * �û��Ա�
	 */
	private String sex;
	/**
	 * �û�����
	 */
	private Date birthDay;
	/**
	 * �û���ַ
	 */
	private String address;
	/**
	 * �û�����
	 */
	private List<Orders> orders;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public boolean equals(Object obj) {
		User u = (User) obj;
		if (u.getId() == this.id)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", birthDay=" + birthDay + ", address="
				+ address + "]";
	}

	
}
