import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Student student = new Student();
        Address address = new Address();
        address.setPinCode(193101);
        address.setState("Kashmir");
        address.setCountry("India");

        student.setStudentID(1L);
        student.setStudentName("sahil amin");
        student.setAddress("baramulla");
        student.setContact(7006620331L);
        student.setAddress(address);
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
        factory.close();
    }

}
