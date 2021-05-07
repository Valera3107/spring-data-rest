package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.Document;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "documents", path = "documents")
public interface DocumentRepository extends CrudRepository<Document, UUID> {
}
