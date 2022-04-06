package minisurveymonkey.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log =
            LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }

    @Bean
    public CommandLineRunner minisurveymonkey(QuestionRepository repository) {
        return (args) -> {
            // save a few questions
            repository.save(new Question("What is your favourite colour?", "text", ""));
            repository.save(new Question("What is your full name?", "text", ""));
            repository.save(new Question("What continent are you from?", "radio", "NA, SA, AF, AS, AU, AN, EU"));
            repository.save(new Question("What is your age range?", "radio", "<19, 19-29, 30-39, 40-49, 50-59, >60"));

            // fetch all Questions
            log.info("Questions found with findAll():");
            log.info("-------------------------------");
            for (Question que : repository.findAll()) {
                log.info(que.toString());
            }
            log.info("");

            // fetch an individual question by ID
            Question question = repository.findById(1L);
            log.info("minisurveymonkey.accessingdatajpa.Question found with findById(1L):");
            log.info("--------------------------------");
            log.info(question.toString());
            log.info("");

            // fetch minisurveymonkey.accessingdatajpa.Question by name
            log.info("minisurveymonkey.accessingdatajpa.Question found with findByQuestion('What is your favourite colour?'):");
            log.info("--------------------------------------------");
            repository.findByQuestion("What is your favourite colour?").forEach(question1 -> {
                log.info(question1.toString());
            });

            log.info("");

        };
    }

//    @Bean
//    public CommandLineRunner demoSurveyRepository(Survey repository){
//        return (args) -> {
//
//        };
//    }



}