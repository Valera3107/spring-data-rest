package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.Lead;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "leads", path = "leads")
public interface LeadRepository extends CrudRepository<Lead, UUID> {
}
