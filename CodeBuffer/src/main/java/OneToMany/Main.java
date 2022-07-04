package OneToMany;

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
        Question question = new Question();
        question.setQuestion("who are you..?");
        question.setQuestionId(198);
        Answer answer = new Answer();
        answer.setAnswerId(198);
        answer.setAnswer("Worthless");
        answer.setQuestion(question);

        Answer answer1 = new Answer();
        answer1.setAnswerId(199);
        answer1.setAnswer("my being an invisible mote of dust");
        answer1.setQuestion(question);


        List<Answer> list = new ArrayList<>();
        list.add(answer);
        list.add(answer1);
        question.setAnswers(list);


        Transaction transaction = session.beginTransaction();
        session.save(question);
        session.save(answer);
        session.save(answer1);
        transaction.commit();
        session.close();
        factory.close();






    }
}
