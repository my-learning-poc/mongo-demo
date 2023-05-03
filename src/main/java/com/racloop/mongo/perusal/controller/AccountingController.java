package com.racloop.mongo.perusal.controller;

import com.racloop.mongo.perusal.entity.AccountingEntity;
import com.racloop.mongo.perusal.entity.LoanEntity;
import com.racloop.mongo.perusal.service.AccountingService;
import com.racloop.mongo.perusal.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/accounting")
public class AccountingController {
    @Autowired
    private AccountingService accountingService;

    @GetMapping
    public List<AccountingEntity> getAllAccount() {
        return accountingService.getAllAccount();
    }

    @GetMapping("/{id}")
    public AccountingEntity getAccountById(@PathVariable Number id) {
        return accountingService.getAccountById(id);
    }

    @PostMapping
    public AccountingEntity createAccountingDetails(@Valid @RequestBody AccountingEntity accountingEntity) {
        return accountingService.createAccountingDetails(accountingEntity);
    }

    @PutMapping("/{id}")
    public AccountingEntity updateLoanDetails(@PathVariable Number id, @Valid @RequestBody AccountingEntity accountingEntity) {
        return accountingService.updateAccount(id, accountingEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Number id) {
        boolean deleted = accountingService.deleteEmployee(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
