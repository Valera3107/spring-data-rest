package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.ubrr.requestService.domain.DictionaryValue;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "dictionaryValues", path = "dictionaryValues")
public interface DictionaryValueRepository extends CrudRepository<DictionaryValue, UUID> {

    @RestResource(path = "byValue", rel = "findMethod")
    DictionaryValue findDictionaryValueByValue(@Param("value") String value);
}
