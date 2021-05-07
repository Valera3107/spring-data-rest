package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.Work;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "works", path = "works")
public interface WorkRepository extends CrudRepository<Work, UUID> {
}
