package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.ubrr.requestService.domain.Applicant;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "applicants", path = "applicants")
public interface ApplicantRepository extends CrudRepository<Applicant, UUID> {

    @RestResource(path = "byDp", rel = "findMethod")
    Applicant findApplicantByDp(@Param("dp") String dp);
}
