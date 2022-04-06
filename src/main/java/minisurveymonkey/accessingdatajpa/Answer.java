package minisurveymonkey.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long answerID;
    private String answer;

    public Answer() {

    }

    public Answer(String answer){
        this.answer = answer;
    }

    /**
     * sets ID of answer.
     * @param id Long
     */
    public void setID(Long id) {
        this.answerID = id;
    }

    /**
     * returns answer id.
     * @return Long
     */
    public Long getID() {
        return this.answerID;
    }

    /**
     * Returns the answer of a question.
     * @return String
     */
    public String getAnswer(){
        return this.answer;
    }


    /**
     * Sets the answer of a question.
     * @param answer String
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
