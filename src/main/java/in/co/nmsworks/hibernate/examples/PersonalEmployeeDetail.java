package in.co.nmsworks.hibernate.examples;

/**
 * Created by kamal (kamal@nmsworks.co.in) on 12/14/16.
 * <p>
 * Copyright 2016-2017 NMSWorks Software Pvt Ltd. All rights reserved.
 * NMSWorks PROPRIETARY/CONFIDENTIAL. Use is subject to licence terms.
 */
public class PersonalEmployeeDetail extends EmployeeDetail {
    
    private int age;
    private String gender;
    
    public PersonalEmployeeDetail() {
        
    }

    public PersonalEmployeeDetail(String street, String city, String state, String country, int age, String gender) {
        super(street, city, state, country);
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonalEmployeeDetail{" +
                "employeeId=" + employeeId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
