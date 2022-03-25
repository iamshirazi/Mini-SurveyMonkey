package minisurveymonkey.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionRepository extends CrudRepository<Question, Long> {

    List<Question> findByQuestion(String question);

    Question findById(long id);
}