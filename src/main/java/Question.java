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

    public void setID(Long id) {
        this.questionID = id;
    }

    public Long getID() {
        return this.questionID;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionType() {
        return this.questionType;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getOptions() {
        return this.options;
    }

    @Override
    public String toString() {
        return String.format("ID[id=%d, Question='%s', Question Type='%s']", questionID, question, questionType);
    }
}
