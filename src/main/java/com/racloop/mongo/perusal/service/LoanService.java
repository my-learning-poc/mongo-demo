package com.racloop.mongo.perusal.service;

import com.racloop.mongo.perusal.entity.LoanEntity;
import com.racloop.mongo.perusal.repository.LoanRepository;
import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LoanService {
    private static final Logger logger = LoggerFactory.getLogger(LoanService.class);

    @Autowired
    private LoanRepository loanRepository;

    public LoanEntity createLoanDetails(@RequestBody LoanEntity loanEntity) {
        logger.info("LoanService -> createLoanDetails :" + Response.SC_CREATED);
        return loanRepository.save(loanEntity);
    }

    public List<LoanEntity> getAllLoans() {
        return loanRepository.findAll();
    }


    public LoanEntity getLoanById(String id) {
        return loanRepository.findById(id).orElse(null);
    }

    public LoanEntity updateEmployee(String id, LoanEntity loanEntity) {
        LoanEntity existingLoan = loanRepository.findById(id).orElse(null);
        if (existingLoan != null) {
            existingLoan.setBranch_id(loanEntity.getBranch_id());
            // Implement all fields (Set all fields by fetching from request)
            return loanRepository.save(existingLoan);
        }
        return null;
    }

    public boolean deleteEmployee(String id) {
        LoanEntity existingLoan = loanRepository.findById(id).orElse(null);
        if (loanRepository != null) {
            loanRepository.delete(existingLoan);
            return true;
        }
        return false;
    }
}
