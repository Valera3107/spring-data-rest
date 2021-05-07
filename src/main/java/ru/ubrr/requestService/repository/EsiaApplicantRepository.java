package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.EsiaApplicant;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "esiaApplicants", path = "esiaApplicants")
public interface EsiaApplicantRepository extends CrudRepository<EsiaApplicant, UUID> {
}
