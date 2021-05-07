package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.PredLimit;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "predLimits", path = "predLimits")
public interface PredLimitRepository extends CrudRepository<PredLimit, UUID> {
}
