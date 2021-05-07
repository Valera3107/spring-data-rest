package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.Dictionary;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "dictionaries", path = "dictionaries")
public interface DictionaryRepository extends CrudRepository<Dictionary, UUID> {
}
