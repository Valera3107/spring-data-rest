package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.RequestCall;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "requestCalls", path = "requestCalls")
public interface RequestCallRepository  extends CrudRepository<RequestCall, UUID> {
}
