/**
 * 
 */
package com.springjpa.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Lalit
 *
 */

@Entity
public class User {
	
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String fName;
	
	@Column(name="last_name")
	private String lName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="city")
	private String city;
	
	
	public User() {}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	

}
