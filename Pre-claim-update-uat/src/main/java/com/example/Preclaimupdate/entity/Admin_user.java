package com.example.Preclaimupdate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "admin_user")
@Table(name = "admin_user")
public class Admin_user {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int user_id;
	@Column(name = "full_name")
	private String full_name;
	@Column(name = "role_name")
	private String role_name;
	@Column(name = "username")
	private String username;
	@Column(name = "user_email")
	private String user_email;
	@Column(name = "mobile_number")
	private String mobile_number;
	@Column(name = "address1")
	private String address1;
	@Column(name = "address2")
	private String address2;
	@Column(name = "address3")
	private String address3;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name = "password")
	private String password;
	@Column(name = "status")
	private String status;
	@Column(name = "user_image")
	private String user_image;
	@Column(name = "createdBy")
	private String createdBy;
	@Column(name = "createdon")
	private Date createdon;
	@Column(name = "updatedDate")
	private Date updatedDate;
	@Column(name = "updatedBy")
	private String updatedBy;
	
	public Admin_user(int user_id, String full_name, String role_name, String username, String user_email,
			String mobile_number, String address1, String address2, String address3, String state, String city,
			String password, String status, String user_image, String createdBy, Date createdon, Date updatedDate,
			String updatedBy) {
		super();
		this.user_id = user_id;
		this.full_name = full_name;
		this.role_name = role_name;
		this.username = username;
		this.user_email = user_email;
		this.mobile_number = mobile_number;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.state = state;
		this.city = city;
		this.password = password;
		this.status = status;
		this.user_image = user_image;
		this.createdBy = createdBy;
		this.createdon = createdon;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}

	public Admin_user() {
		super();
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUser_image() {
		return user_image;
	}

	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
