package minisurveymonkey.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionRepository extends CrudRepository<Question, Long> {

    /* Searches for the question String, returns
     * questionType, options, the ID, and the question itself.
     */
    List<Question> findByQuestion(String question);

    /* Searches for the ID of a question, returns
     * questionType, options, the ID, and the question itself.
     */
    Question findById(long id);
}