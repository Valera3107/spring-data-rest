package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.EsiaAddress;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "esiaAddresses", path = "esiaAddresses")
public interface EsiaAddressRepository extends CrudRepository<EsiaAddress, UUID> {
}
