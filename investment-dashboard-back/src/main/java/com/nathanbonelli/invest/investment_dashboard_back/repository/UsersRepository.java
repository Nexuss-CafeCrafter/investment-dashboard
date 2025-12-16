package com.nathanbonelli.invest.investment_dashboard_back.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nathanbonelli.invest.investment_dashboard_back.entity.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    Users findByUsername(String username);
}
