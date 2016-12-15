package in.co.nmsworks.hibernate.examples;

/**
 * Created by kamal (kamal@nmsworks.co.in) on 12/14/16.
 * <p>
 * Copyright 2016-2017 NMSWorks Software Pvt Ltd. All rights reserved.
 * NMSWorks PROPRIETARY/CONFIDENTIAL. Use is subject to licence terms.
 */
public class OfficialEmployeeDetail extends EmployeeDetail {
    
    private String designation;
    private int salary;
    
    public OfficialEmployeeDetail() {}

    public OfficialEmployeeDetail(String street, String city, String state, String country, String designation, int salary) {
        super(street, city, state, country);
        this.designation = designation;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "OfficialEmployeeDetail {" +
                "employeeId=" + employeeId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", designation=" + designation +
                ", salary=" + salary +
                '}';
    }
}
