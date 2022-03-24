import java.util.ArrayList;
import java.util.List;


public class Survey {

    private Long id;
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
