package com.racloop.mongo.perusal.controller;

import com.racloop.mongo.perusal.entity.AccountingEntity;
import com.racloop.mongo.perusal.entity.RpsEntity;
import com.racloop.mongo.perusal.service.AccountingService;
import com.racloop.mongo.perusal.service.RpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rps")
public class RpsController {
    @Autowired
    private RpsService rpsService;

    @GetMapping
    public List<RpsEntity> getAllAccount() {
        return rpsService.getAllRps();
    }

    @GetMapping("/{id}")
    public RpsEntity getRpsById(@PathVariable Number id) {
        return rpsService.getRpsById(id);
    }

    @PostMapping
    public RpsEntity createRpsDetails(@Valid @RequestBody RpsEntity rpsEntity) {
        return rpsService.createRpsDetails(rpsEntity);
    }

    @PutMapping("/{id}")
    public RpsEntity updateRpsDetails(@PathVariable Number id, @Valid @RequestBody RpsEntity rpsEntity) {
        return rpsService.updateRps(id, rpsEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRps(@PathVariable Number id) {
        boolean deleted = rpsService.deleteRps(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
