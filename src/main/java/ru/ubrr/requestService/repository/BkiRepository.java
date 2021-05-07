package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.Bki;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "bkis", path = "bkis")
public interface BkiRepository extends CrudRepository<Bki, UUID> {
}
