package com.training.detective.server.dao;

import com.training.detective.shared.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

/**
 * @author: a.korchan
 * @since: 11/2/12 1:30 PM
 */
@Repository("employeeDAO")
public class EmployeeDAO extends JpaDAO<Long, EmployeeDTO> {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	@PostConstruct
	public void init() {
		super.setEntityManagerFactory(entityManagerFactory);
	}

}
