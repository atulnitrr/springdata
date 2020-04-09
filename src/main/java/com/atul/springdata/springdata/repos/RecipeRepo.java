package com.atul.springdata.springdata.repos;

import com.atul.springdata.springdata.entity.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepo extends CrudRepository<Recipe, Long> {

}
