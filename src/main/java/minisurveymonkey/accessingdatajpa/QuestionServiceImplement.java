package minisurveymonkey.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImplement implements QuestionService {

    // Creates repository so we can save questions there.
    @Autowired
    private QuestionRepository questionRepository;

    // Finds all questions saved to repository.
    @Override
    public List<Question> findAll() {
        return (List<Question>) questionRepository.findAll();
    }

    // Save question to the repository.
    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }
}
