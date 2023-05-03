package com.racloop.mongo.perusal.service;

import com.racloop.mongo.perusal.entity.AccountingEntity;
import com.racloop.mongo.perusal.entity.LoanEntity;
import com.racloop.mongo.perusal.repository.AccountingRepository;
import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AccountingService {

    private static final Logger logger = LoggerFactory.getLogger(LoanService.class);
    @Autowired
    AccountingRepository accountingRepository;
    public List<AccountingEntity> getAllAccount() {
        return accountingRepository.findAll();
    }

    public AccountingEntity getAccountById(Number id) {
        return accountingRepository.findById(id).orElse(null);
    }

    public AccountingEntity createAccountingDetails(@RequestBody AccountingEntity accountingEntity) {
        logger.info("LoanService -> createLoanDetails :" + Response.SC_CREATED);
        return accountingRepository.save(accountingEntity);
    }

    public AccountingEntity updateAccount(Number id, AccountingEntity accountingEntity) {
        AccountingEntity existingAccount = accountingRepository.findById(id).orElse(null);
        if (existingAccount != null) {
            existingAccount.setAccounting_branch(accountingEntity.getAccounting_branch());
            // Implement all fields (Set all fields by fetching from request)
            return accountingRepository.save(existingAccount);
        }
        return null;

    }

    public boolean deleteEmployee(Number id) {
        AccountingEntity existingAccount = accountingRepository.findById(id).orElse(null);
        if (existingAccount != null) {
            accountingRepository.delete(existingAccount);
            return true;
        }
        return false;
    }
}
