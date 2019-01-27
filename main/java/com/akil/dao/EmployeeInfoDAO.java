package com.akil.dao;

import com.akil.model.Employee;
import com.akil.model.EmployeeInfo;

public interface EmployeeInfoDAO {
	boolean InnerJoinByID();
	boolean LeftJoinByID();
	boolean RightJoinByID();
	boolean FullJoinByID();
	boolean SelfJoinByID();
	boolean AlterTableData(String col_name);
	boolean DropTableData(String col_name);
	boolean ModifyTableData(String col_name);
	boolean addEmployeeInfo(EmployeeInfo user);
}
