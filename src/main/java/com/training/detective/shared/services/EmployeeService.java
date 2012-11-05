package com.training.detective.shared.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.training.detective.shared.dto.EmployeeDTO;

/**
 * @author: a.korchan
 * @since: 11/2/12 1:33 PM
 */
@RemoteServiceRelativePath("springGwtServices/employeeService")
public interface EmployeeService extends RemoteService {

	public EmployeeDTO findEmployee(long employeeId);

	public void saveEmployee(long employeeId, String name, String surname, String jobDescription) throws Exception;

	public void updateEmployee(long employeeId, String name, String surname, String jobDescription) throws Exception;

	public void saveOrUpdateEmployee(long employeeId, String name, String surname, String jobDescription) throws Exception;

	public void deleteEmployee(long employeeId) throws Exception;

}
