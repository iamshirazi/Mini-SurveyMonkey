package minisurveymonkey.accessingdatajpa;

import java.util.List;

public interface QuestionService {
    List<Question> findAll();

    void save(Question buddy);
}
