package com.atul.springdata.springdata.repos;

import com.atul.springdata.springdata.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(final String description);
}
