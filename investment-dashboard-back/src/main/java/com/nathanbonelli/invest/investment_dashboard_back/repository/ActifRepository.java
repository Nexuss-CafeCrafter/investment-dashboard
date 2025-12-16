package com.nathanbonelli.invest.investment_dashboard_back.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nathanbonelli.invest.investment_dashboard_back.domain.entity.Actif;

@Repository
public interface ActifRepository extends CrudRepository<Actif, Long> {
    List<Actif> findByUserId(Long userId);
}
