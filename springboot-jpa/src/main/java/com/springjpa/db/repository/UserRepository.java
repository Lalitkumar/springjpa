/**
 * 
 */
package com.springjpa.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.db.model.User;

/**
 * @author Lalit
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>{

}
