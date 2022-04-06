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

    @GetMapping ("/surveyCreation")
    public String createView() {return "creationView";}

//    @RequestMapping("/surveyView")
//    public String surveyView(@RequestParam("title") String title, Model model){
//        Iterable<Question> questions = questionRepository.findAll();
//        Survey survey = new Survey();
//        for(Question q: questions){
//            if(q.get)
//            survey.addQuestions(q);
//        }
//        model.addAttribute("Survey", survey.getSurvey());
//        return "surveyView";
//    }

//    @GetMapping("/surveyView")
//    public String createSurvey(@RequestParam("title") String title, Model model){
//        model.addAttribute("title",title);
//        surveyRepository.save()
//        return "questions";
//    }

    public AppController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/questions")
    public String showForm(Model model) {
        model.addAttribute("questions", new Question());
        return "questions";
    }


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
