package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.EsiaContact;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "esiaContacts", path = "esiaContacts")
public interface EsiaContactRepository extends CrudRepository<EsiaContact, UUID> {
}
