package com.racloop.mongo.perusal.repository;

import com.racloop.mongo.perusal.entity.LoanDataStoreEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanDSRepository extends MongoRepository<LoanDataStoreEntity,String> {
}
