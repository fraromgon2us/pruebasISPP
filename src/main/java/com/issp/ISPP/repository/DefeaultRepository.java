package com.issp.ISPP.repository;

import com.issp.ISPP.entity.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefeaultRepository extends CrudRepository<Alumno, Long> {
    public long countByEmail(String email);
}
