package reva.springframework.sfgrecipeproject.services;

import reva.springframework.sfgrecipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
