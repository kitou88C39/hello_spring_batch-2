package com.javacodejunkie;

public class Employee {

    private int id;
    private int employeeId;
    private String firstName;
    private String lastName;
    private int deptId;

    public Employee(int id, int employeeId, String firstName, String lastName, int deptId) {
        super();
        this.id = id;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDeptId() {
        return deptId;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

}
