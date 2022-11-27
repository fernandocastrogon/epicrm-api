package com.estoque.crm.repository;
import com.estoque.crm.model.Epi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpiRepository extends JpaRepository<Epi, Long> {

}
