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



    public Answer( String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return this.answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }
}
