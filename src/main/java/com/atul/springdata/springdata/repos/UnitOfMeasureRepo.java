package com.atul.springdata.springdata.repos;

import com.atul.springdata.springdata.entity.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnitOfMeasureRepo extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByUom(final String desc);
}
