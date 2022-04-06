package minisurveymonkey.accessingdatajpa;

import java.util.List;

public interface QuestionService {
    /*
     * Lists all questions saved to the repository.
     */
    List<Question> findAll();

    /*
     * Saves a question to the repository.
     */
    void save(Question question);
}
