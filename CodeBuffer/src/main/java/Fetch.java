import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();;
        Session session = factory.openSession();

        // Hits the database every time //
//        Student student = (Student) session.get(Student.class,1L);
//        System.out.println(student);
        // Provides us an proxy Object //
        Student student1 = (Student) session.load(Student.class,1L);
        System.out.println(student1.getAddress());

        session.close();
        factory.close();
    }
}
