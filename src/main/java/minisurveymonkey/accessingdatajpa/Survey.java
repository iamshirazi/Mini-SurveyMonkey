package minisurveymonkey.accessingdatajpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *An entity in the database.A Survey containing a list of questions
 */

@Entity
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * List of questions in the survey
     */
    @OneToMany
    private List<Question> survey;

    /**
     * title of the survey
     */
    private String title;

    /**
     * An empty constructor. This is needed for the Controller.
     */
    public Survey(){
        survey = new ArrayList<>();
    }

    /**
     * A constructor that takes the survey title as a parameter
     * @param title The title of the survey
     */
    public Survey(String title){
        this.title = title;
        survey = new ArrayList<>();
    }

    /**
     * Returns the survey title
     * @return the survey title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the survey title
     * @param title The title of the survey
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Add questions to the survey
     * @param q Question to add
     */
    public void addQuestions(Question q){
        survey.add(q);
    }

    /**
     * Remove Questions from the survey
     * @param q Question to remove
     */
    public void removeQuestions(Question q){
        survey.remove(q);
    }

    /**
     * Returns the list of questions in the survey
     * @return The survey
     */
    public List<Question> getSurvey() {
        return survey;
    }

    /**
     * Sets the survey
     * @param questions List of questions to put in the survey
     */
    public void setSurvey(List<Question> questions) {
        this.survey = questions;
    }

    /**
     * Produces a string that represents the survey
     * @return The string is a concatenation of all the questions in the survey
     */
    public String toString(){
        String s = "Survey: \n";
        for(Question q : this.survey){
            s += survey.toString() + "\n";
        }
        return s;
    }
}
