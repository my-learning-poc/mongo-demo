package com.racloop.mongo.perusal.repository;

import com.racloop.mongo.perusal.entity.LoanEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends MongoRepository<LoanEntity,String> {
}
