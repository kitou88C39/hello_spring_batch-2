package com.javacodejunkie;

import java.spl.SQLException;

public interface EmployeeDAO {

    Employee get(int id) throws SQLException;

    List<Employee> getAll() throws SQLException;

    int save(Employee employee) throws SQLException;

    int insert(Employee employee) throws SQLException;
}
