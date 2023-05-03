package com.racloop.mongo.perusal.service;

import com.racloop.mongo.perusal.entity.TransactionEntity;
import com.racloop.mongo.perusal.repository.TransactionRepository;
import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TransactionService {
    private static final Logger logger = LoggerFactory.getLogger(LoanService.class);
    @Autowired
    TransactionRepository transactionRepository;
    public List<TransactionEntity> getAllTransaction() {
        return transactionRepository.findAll();
    }

    public TransactionEntity getTransactiontById(String id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public TransactionEntity createTransactionDetails(@RequestBody TransactionEntity transactionEntity) {
        logger.info("LoanService -> createLoanDetails :" + Response.SC_CREATED);
        return transactionRepository.save(transactionEntity);
    }

    public TransactionEntity updateTransaction(String id, TransactionEntity transactionEntity) {
        TransactionEntity existingTransaction = transactionRepository.findById(id).orElse(null);
        if (existingTransaction != null) {
//            existingTransaction.setAccounting_branch(accountingEntity.getAccounting_branch());
//             Implement all fields (Set all fields by fetching from request)
            return transactionRepository.save(existingTransaction);
        }
        return null;

    }

    public boolean deleteTransaction(String id) {
        TransactionEntity existingAccount = transactionRepository.findById(id).orElse(null);
        if (existingAccount != null) {
            transactionRepository.delete(existingAccount);
            return true;
        }
        return false;
    }
}
