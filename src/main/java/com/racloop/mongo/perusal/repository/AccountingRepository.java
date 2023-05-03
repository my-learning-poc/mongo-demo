package com.racloop.mongo.perusal.repository;

import com.racloop.mongo.perusal.entity.AccountingEntity;
import com.racloop.mongo.perusal.entity.TransactionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountingRepository extends MongoRepository<AccountingEntity,Number> {

}
