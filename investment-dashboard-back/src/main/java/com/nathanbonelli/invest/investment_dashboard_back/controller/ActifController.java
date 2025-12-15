package com.nathanbonelli.invest.investment_dashboard_back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathanbonelli.invest.investment_dashboard_back.entity.Actif;
import com.nathanbonelli.invest.investment_dashboard_back.service.ActifService;

@RestController
@RequestMapping("/api/actifs")
public class ActifController {
    @Autowired
    private ActifService actifService;

    @PostMapping
    public Actif createActif(@RequestBody Actif actif) {
        return actifService.saveActif(actif);
    }

    @GetMapping
    public Iterable<Actif> getAllActifs() {
        return actifService.getAllActifs();
    }

    @GetMapping("/{userId}")
    public List<Actif> getActifByUserId(@PathVariable Long userId) {
        return actifService.getActifByUserId(userId);
    }
}
