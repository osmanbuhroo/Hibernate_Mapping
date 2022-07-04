package ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Employee e1 = new Employee();
        e1.setEmpId(630);
        e1.setName("sahil amin");

        Employee e2 = new Employee();
        e2.setEmpId(631);
        e2.setName("raeshma R N");

        Project p = new Project();
        p.setPrjectId(1212);
        p.setProjectName("chatbot");

        Project p1  = new Project();
        p1.setPrjectId(12131);
        p1.setProjectName("Spring Security");

        List<Employee> list1 = new ArrayList<>();
        list1.add(e1);
        list1.add(e2);


        List<Project> list2 = new ArrayList<>();
        list2.add(p);
        list2.add(p1);

        e1.setProject(list2);
        p.setEmployee(list1);



        Transaction transaction = session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(p);
        session.save(p1);

        transaction.commit();
        session.close();
        factory.close();


    }
}
