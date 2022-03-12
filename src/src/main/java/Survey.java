import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Question> survey;

//    private List<Answer> answers;

    public Survey(){
        survey = new ArrayList<>();
    }

    public void addQuestions(Question q){
        survey.add(q);
    }

    public void removeQuestions(Question q){
        survey.remove(q);
    }

    public List<Question> getSurvey() {
        return survey;
    }

    public void setSurvey(List<Question> questions) {
        this.survey = questions;
    }
}
