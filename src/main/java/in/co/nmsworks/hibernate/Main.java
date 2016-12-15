package in.co.nmsworks.hibernate;

import in.co.nmsworks.hibernate.examples.Employee;
import in.co.nmsworks.hibernate.examples.OfficialEmployeeDetail;
import in.co.nmsworks.hibernate.examples.PersonalEmployeeDetail;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import java.util.Date;
import java.util.List;

/**
 * Created by kamal (kamal@nmsworks.co.in) on 12/14/16.
 * <p>
 * Copyright 2016-2017 NMSWorks Software Pvt Ltd. All rights reserved.
 * NMSWorks PROPRIETARY/CONFIDENTIAL. Use is subject to licence terms.
 */
public class Main {

    public static void main(String[] args) {

        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        PersonalEmployeeDetail personalEmployeeDetail = new PersonalEmployeeDetail("10th Street", "LA", "San Francisco", "U.S.", 35, "Male");
        Employee employee = new Employee("Nina", "Mayers", new Date(121212),
                "114-857-965");
        employee.setEmployeeDetail(personalEmployeeDetail);
        personalEmployeeDetail.setEmployee(employee);

        OfficialEmployeeDetail officialEmployeeDetail = new OfficialEmployeeDetail("11th Street", "AC", "California", "U.S.", "SSE", 5000);
        Employee emp1 = new Employee("Rahul", "Kumar", new Date(123345), "123-456-789");
        emp1.setEmployeeDetail(officialEmployeeDetail);
        officialEmployeeDetail.setEmployee(emp1);

        // save or update here..
        session.save(employee);
        session.save(emp1);
        
        final List<Employee> employees = session.createQuery("from Employee").list();
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        transaction.commit();
        session.close();
    }
}
