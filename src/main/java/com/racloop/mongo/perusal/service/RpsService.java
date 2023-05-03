package com.racloop.mongo.perusal.service;

import com.racloop.mongo.perusal.entity.RpsEntity;
import com.racloop.mongo.perusal.repository.RpsRepository;
import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RpsService {
    private static final Logger logger = LoggerFactory.getLogger(LoanService.class);
    @Autowired
    RpsRepository rpsRepository;
    public List<RpsEntity> getAllRps() {
        return rpsRepository.findAll();
    }

    public RpsEntity getRpsById(Number id) {
        return rpsRepository.findById(id).orElse(null);
    }

    public RpsEntity createRpsDetails(@RequestBody RpsEntity rpsEntity) {
        logger.info("LoanService -> createLoanDetails :" + Response.SC_CREATED);
        return rpsRepository.save(rpsEntity);
    }

    public RpsEntity updateRps(Number id, RpsEntity rpsEntity) {
        RpsEntity existingRps = rpsRepository.findById(id).orElse(null);
        if (existingRps != null) {
//            existingRps.setAccounting_branch(accountingEntity.getAccounting_branch());
//             Implement all fields (Set all fields by fetching from request)
            return rpsRepository.save(existingRps);
        }
        return null;

    }

    public boolean deleteRps(Number id) {
        RpsEntity existingAccount = rpsRepository.findById(id).orElse(null);
        if (existingAccount != null) {
            rpsRepository.delete(existingAccount);
            return true;
        }
        return false;
    }
}
