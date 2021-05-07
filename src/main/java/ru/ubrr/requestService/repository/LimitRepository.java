package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.Limit;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "limits", path = "limits")
public interface LimitRepository extends CrudRepository<Limit, UUID> {
}
