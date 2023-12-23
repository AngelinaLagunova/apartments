package org.example.apartments.repos;

import org.example.apartments.models.Apartment;
import org.springframework.data.repository.CrudRepository;

public interface ApartmentRepository extends CrudRepository<Apartment, Integer> {
}
