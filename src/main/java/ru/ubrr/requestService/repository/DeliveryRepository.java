package ru.ubrr.requestService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ubrr.requestService.domain.Delivery;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "deliveries", path = "deliveries")
public interface DeliveryRepository extends CrudRepository<Delivery, UUID> {
}
