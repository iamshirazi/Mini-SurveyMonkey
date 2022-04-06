package minisurveymonkey.accessingdatajpa;

/**
 * Survey Repository
 */

import minisurveymonkey.accessingdatajpa.Survey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "survey", path = "survey")
public interface  SurveyRepository extends CrudRepository<Survey, Long> {
    Survey findById(long id);
}
