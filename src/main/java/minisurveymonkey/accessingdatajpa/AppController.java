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

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    SurveyRepository surveyRepository;

    //View to create a survey
    @GetMapping ("/surveyCreation")
    public String createView() {return "creationView";}

    //Controller to add survey
    @GetMapping("/addSurvey")
    public Survey addSurvey(@RequestBody Survey survey, Model model){
        Survey s = new Survey(survey.getTitle());
        surveyRepository.save(s);
        model.addAttribute("survey",survey);
        return survey;
    }

    public AppController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/questions")
    public String showForm(@RequestParam(value = "title", defaultValue = "randomSurvey") String title, Model model) {
        model.addAttribute("questions", new Question());
        model.addAttribute("title", title);
        Survey survey = new Survey(title);
        surveyRepository.save(survey);
        return "questions";
    }


    @GetMapping("/questions/show")
    public List<Question> listAll() {
        return service.findAll();
    }

    @PostMapping(value = "/questions",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String newQuestion( Question question, Model model) {
        service.save(question);
        model.addAttribute("questions", question);
        return "questions";
    }
}
