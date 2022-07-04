package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session  = factory.openSession();
        Answer answer = new Answer();
        answer.setAnswerId(198);
        answer.setAnswer("i want to be good man");
        Question question = new Question();
        question.setQuestion("what you want to be..?");
        question.setQuestionId(130);
        question.setAnswer(answer);
        Transaction transaction= session.beginTransaction();
        session.save(question);
        session.save(answer);
        transaction.commit();
        session.close();
        factory.close();

    }
}
