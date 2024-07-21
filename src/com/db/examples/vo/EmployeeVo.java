package com.db.examples.vo;

public class EmployeeVo {

    private int employeeId;
    private String employeeName;
    private String JobRole;
    private int salary;
    private int wrk_exp;

    public int getWrk_exp() {
        return wrk_exp;
    }

    public int getSalary() {
        return salary;
    }

    public String getJobRole() {
        return JobRole;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void set(int employeeId,String employeeName,String JobRole,int salary,int wrk_exp){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.JobRole = JobRole;
        this.salary = salary;
        this.wrk_exp = wrk_exp;
    }
}
