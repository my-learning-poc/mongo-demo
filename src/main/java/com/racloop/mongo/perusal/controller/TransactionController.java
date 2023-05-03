package com.racloop.mongo.perusal.controller;

import com.racloop.mongo.perusal.entity.TransactionEntity;
import com.racloop.mongo.perusal.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController  {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<TransactionEntity> getAllAccount() {
        return transactionService.getAllTransaction();
    }

    @GetMapping("/{id}")
    public TransactionEntity getTransactionById(@PathVariable String id) {
        return transactionService.getTransactiontById(id);
    }

    @PostMapping
    public TransactionEntity createTransactionDetails(@Valid @RequestBody TransactionEntity transactionEntity) {
        return transactionService.createTransactionDetails(transactionEntity);
    }

    @PutMapping("/{id}")
    public TransactionEntity updateTransactionDetails(@PathVariable String id, @Valid @RequestBody TransactionEntity transactionEntity) {
        return transactionService.updateTransaction(id, transactionEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable String id) {
        boolean deleted = transactionService.deleteTransaction(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
