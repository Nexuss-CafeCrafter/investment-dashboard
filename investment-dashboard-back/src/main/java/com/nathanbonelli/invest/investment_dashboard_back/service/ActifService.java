package com.nathanbonelli.invest.investment_dashboard_back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathanbonelli.invest.investment_dashboard_back.entity.Actif;
import com.nathanbonelli.invest.investment_dashboard_back.repository.ActifRepository;

@Service
public class ActifService {
    @Autowired
    private ActifRepository actifRepository;

    public Actif saveActif(Actif actif) {
        return actifRepository.save(actif);
    }

    public Iterable<Actif> getAllActifs() {
        return actifRepository.findAll();
    }

    public List<Actif> getActifByUserId(Long userId) {
        return actifRepository.findByUserId(userId);
    }

    public void deleteActifById(Long id) {
        actifRepository.deleteById(id);
    }
}
