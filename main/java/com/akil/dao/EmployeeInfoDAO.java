package com.akil.dao;

import com.akil.model.Employee;
import com.akil.model.EmployeeInfo;

public interface EmployeeInfoDAO {
	boolean InnerJoinByID();
	boolean LeftJoinByID();
	boolean RightJoinByID();
	boolean FullJoinByID();
	boolean SelfJoinByID();
	boolean addEmployeeInfo(EmployeeInfo user);
}
