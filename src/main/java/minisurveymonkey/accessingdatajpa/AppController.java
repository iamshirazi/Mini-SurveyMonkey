package minisurveymonkey.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private final QuestionService service;

    public AppController(QuestionService service) {
        this.service = service;
    }

    /*
     * Shows the completed form.
     */
    @GetMapping("/questions")
    public String showForm(Model model) {
        model.addAttribute("questions", new Question());
        return "questions";
    }

    /*
     * Lists all questions saved to the repository.
     */
    @GetMapping("/questions/show")
    public List<Question> listAll() {
        return service.findAll();
    }

    @PostMapping(value = "/questions",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String newQuestion(Question question, Model model) {
        service.save(question);
        model.addAttribute("questions", question);
        return "questions";
    }
}
