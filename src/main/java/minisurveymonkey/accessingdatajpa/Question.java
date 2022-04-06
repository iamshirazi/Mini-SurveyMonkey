package minisurveymonkey.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionID;
    private String question;
    private String questionType;
    private String options;

    public Question(){

    }

    public Question(String question, String questionType, String options){
        this.question = question;
        this.questionType = questionType;
        this.options = options;
    }

    /**
     * sets ID of question.
     * @param id Long
     */
    public void setID(Long id) {
        this.questionID = id;
    }

    /**
     * returns question id.
     * @return Long
     */
    public Long getID() {
        return this.questionID;
    }

    /**
     * Returns question
     * @return String
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * Sets question.
     * @param question String
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Sets the type of question. Textbox, radio button, or check box.
     * @param questionType String
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    /**
     * Returns the specific type of a question.
     * @return String
     */
    public String getQuestionType() {
        return this.questionType;
    }

    /**
     * Sets the options of a question.
     * @param options String
     */
    public void setOptions(String options) {
        this.options = options;
    }

    /**
     * Return options of a question.
     * @return String
     */
    public String getOptions() {
        return this.options;
    }

    @Override
    public String toString() {
        return String.format("ID[id=%d, minisurveymonkey.accessingdatajpa.Question='%s', minisurveymonkey.accessingdatajpa.Question Type='%s']", questionID, question, questionType);
    }
}
