package reva.springframework.sfgrecipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import reva.springframework.sfgrecipeproject.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
