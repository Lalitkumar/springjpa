/**
 * 
 */
package com.springjpa.db.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lalit
 *
 */
public class UserList {
	
	private List<User> userList = new ArrayList<>();
	

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	

}
