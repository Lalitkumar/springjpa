/**
 * 
 */
package com.springjpa.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.db.model.User;

/**
 * @author Lalit
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByfName(String fName);
	
	public List<User> findByCity(String city);

}
