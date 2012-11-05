package com.training.detective.server.services;

import com.training.detective.server.dao.EmployeeDAO;
import com.training.detective.shared.dto.EmployeeDTO;
import com.training.detective.shared.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: a.korchan
 * @since: 11/2/12 1:34 PM
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeDAO employeeDAO;

	@PostConstruct
	public void init() throws Exception {
	}

	@PreDestroy
	public void destroy() {
	}

	public EmployeeDTO findEmployee(long employeeId) {

		return employeeDAO.findById(employeeId);

	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void saveEmployee(long employeeId, String name, String surname, String jobDescription) throws Exception {

		EmployeeDTO employeeDTO = employeeDAO.findById(employeeId);

		if (employeeDTO == null) {
			employeeDTO = new EmployeeDTO(employeeId, name, surname, jobDescription);
			employeeDAO.persist(employeeDTO);
		}

	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void updateEmployee(long employeeId, String name, String surname, String jobDescription) throws Exception {

		EmployeeDTO employeeDTO = employeeDAO.findById(employeeId);

		if (employeeDTO != null) {
			employeeDTO.setEmployeeName(name);
			employeeDTO.setEmployeeSurname(surname);
			employeeDTO.setJob(jobDescription);
		}

	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void deleteEmployee(long employeeId) throws Exception {

		EmployeeDTO employeeDTO = employeeDAO.findById(employeeId);

		if (employeeDTO != null)
			employeeDAO.remove(employeeDTO);

	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void saveOrUpdateEmployee(long employeeId, String name, String surname, String jobDescription) throws Exception {

		EmployeeDTO employeeDTO = new EmployeeDTO(employeeId, name, surname, jobDescription);

		employeeDAO.merge(employeeDTO);

		logger.error("Fake error, just for test. Employee id: {}", employeeId);

	}

}
