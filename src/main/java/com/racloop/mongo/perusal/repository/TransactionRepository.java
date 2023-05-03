package com.racloop.mongo.perusal.repository;

import com.racloop.mongo.perusal.entity.TransactionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends MongoRepository<TransactionEntity, String> {
}
