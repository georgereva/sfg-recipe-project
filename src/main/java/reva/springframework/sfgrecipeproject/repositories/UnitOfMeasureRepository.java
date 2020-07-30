package reva.springframework.sfgrecipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import reva.springframework.sfgrecipeproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
