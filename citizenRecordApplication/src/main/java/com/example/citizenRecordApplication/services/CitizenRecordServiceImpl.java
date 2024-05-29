package com.example.citizenRecordApplication.services;

import com.example.citizenRecordApplication.entity.CitizenRecordEntity;
import com.example.citizenRecordApplication.repo.CitizenRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenRecordServiceImpl implements CitizenRecordService {

    @Autowired
    CitizenRecordRepository citizenRecordRepository;

    @Override
    public CitizenRecordEntity getCitizenById(Integer citizenId) {
        return citizenRecordRepository.findByCitizenId(citizenId).get();
    }

    @Override
    public List<CitizenRecordEntity> getAllCitizen() {
        return citizenRecordRepository.findAll();
    }

    @Override
    public CitizenRecordEntity createCitizen(CitizenRecordEntity citizenRecordEntity) {
        return citizenRecordRepository.save(citizenRecordEntity);
    }
}
