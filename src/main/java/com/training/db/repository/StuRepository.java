package com.training.db.repository;


import com.training.db.entity.MyStu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StuRepository extends MongoRepository<MyStu, String> {

}
