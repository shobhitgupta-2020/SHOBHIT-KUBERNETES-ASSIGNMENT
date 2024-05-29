package com.example.citizenRecordApplication.services;

import com.example.citizenRecordApplication.entity.CitizenRecordEntity;

import java.util.List;


public interface CitizenRecordService {


    CitizenRecordEntity getCitizenById(Integer citizenId);

    List<CitizenRecordEntity> getAllCitizen();

    CitizenRecordEntity createCitizen(CitizenRecordEntity citizenRecordEntity);
}
