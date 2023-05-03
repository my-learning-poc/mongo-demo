package com.racloop.mongo.perusal.repository;

import com.racloop.mongo.perusal.entity.RpsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RpsRepository extends MongoRepository<RpsEntity,Number> {
//    Optional<RpsEntity> findById(String id);
}
