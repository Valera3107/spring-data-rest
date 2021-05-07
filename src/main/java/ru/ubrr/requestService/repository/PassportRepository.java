package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.Passport;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "passports", path = "passports")
public interface PassportRepository extends CrudRepository<Passport, UUID> {
}
