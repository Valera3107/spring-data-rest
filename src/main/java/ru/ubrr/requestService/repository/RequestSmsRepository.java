package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.RequestSms;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "requestSms", path = "requestSms")
public interface RequestSmsRepository extends CrudRepository<RequestSms, UUID> {
}
