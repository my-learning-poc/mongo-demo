package com.racloop.mongo.perusal.controller;

import com.racloop.mongo.perusal.entity.LoanEntity;
import com.racloop.mongo.perusal.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<LoanEntity> getAllLoans() {
        return loanService.getAllLoans();
    }

    @GetMapping("/{id}")
    public LoanEntity getLoanById(@PathVariable String id) {
        return loanService.getLoanById(id);
    }

    @PostMapping
    public LoanEntity createLoanDetails(@Valid @RequestBody LoanEntity loanEntity) {
        return loanService.createLoanDetails(loanEntity);
    }

    @PutMapping("/{id}")
    public LoanEntity updateLoanDetails(@PathVariable String id, @Valid @RequestBody LoanEntity loanEntity) {
        return loanService.updateEmployee(id, loanEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String id) {
        boolean deleted = loanService.deleteEmployee(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
