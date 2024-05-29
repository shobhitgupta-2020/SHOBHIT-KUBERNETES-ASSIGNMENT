package com.example.citizenRecordApplication.repo;

import com.example.citizenRecordApplication.entity.CitizenRecordEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CitizenRecordRepository extends MongoRepository<CitizenRecordEntity, String> {

    List<CitizenRecordEntity> findAll();

    Optional<CitizenRecordEntity> findByCitizenId(Integer citizenId);
}
