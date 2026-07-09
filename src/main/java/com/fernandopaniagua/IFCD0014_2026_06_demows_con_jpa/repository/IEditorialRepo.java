package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.repository;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface IEditorialRepo extends JpaRepository<Editorial, Integer> {

}
