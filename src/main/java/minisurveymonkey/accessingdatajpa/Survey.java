package minisurveymonkey.accessingdatajpa;

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

    private String title;

    public Survey(){
        survey = new ArrayList<>();
    }

    public Survey(String title){
        this.title = title;
        survey = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

//    public Question getQuestion(String name){
//        for(int i=0; i<this.survey.size();i++){
//            if(this.survey.get(i).getQuestion().equals(name)){
//                return this.survey.get(i);
//            }
//        }
//        return null;
//    }

    public void setSurvey(List<Question> questions) {
        this.survey = questions;
    }

    public String toString(){
        String s = "Survey: \n";
        for(Question q : this.survey){
            s += survey.toString() + "\n";
        }
        return s;
    }
}
