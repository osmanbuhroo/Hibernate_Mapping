package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    private int AnswerId;

    private  String Answer;
    @OneToOne(mappedBy = "answer")

    private  Question question;

    public Question getQuestion() {
        return question;
    }



    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer(int answerId, String answer, Question question) {
        AnswerId = answerId;
        Answer = answer;
        this.question = question;
    }

    public int getAnswerId() {
        return AnswerId;
    }

    public void setAnswerId(int answerId) {
        AnswerId = answerId;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public Answer() {
    }


}
