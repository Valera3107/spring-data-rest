package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.RequestService;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "requestServices", path = "requestServices")
public interface RequestServiceRepository extends CrudRepository<RequestService, UUID> {
}
