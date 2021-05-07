package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.Request;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "requests", path = "requests")
public interface RequestRepository extends CrudRepository<Request, UUID> {
}
//8565898b-134f-46aa-a966-057e8edd08df
//        changed status
//        569430ea-8d60-11eb-b0a2-97c4f2050099