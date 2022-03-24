import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionID;
    private String question;
    private QuestionType questionType;
    private Set<String> options;

    public Question(){}

    public Question(String question, QuestionType questionType){
        this.question = question;
        this.questionType = questionType;
//        options = new HashSet<>();

    }

    public Question(String question, QuestionType questionType, Set<String> op){
        this.question = question;
        this.questionType = questionType;
        this.options = op;

    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public QuestionType getQuestionType() {
        return this.questionType;
    }

    public void setOptions(Set<String> options) {
        this.options = options;
    }

    public Set<String> getOptions() {
        return this.options;
    }

    public String toString(){
        return this.question;
    }
}
