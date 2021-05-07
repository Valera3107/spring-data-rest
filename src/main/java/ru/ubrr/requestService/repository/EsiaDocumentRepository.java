package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.EsiaDocument;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "esiaDocuments", path = "esiaDocuments")
public interface EsiaDocumentRepository extends CrudRepository<EsiaDocument, UUID> {
}
