package reva.springframework.sfgrecipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import reva.springframework.sfgrecipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
