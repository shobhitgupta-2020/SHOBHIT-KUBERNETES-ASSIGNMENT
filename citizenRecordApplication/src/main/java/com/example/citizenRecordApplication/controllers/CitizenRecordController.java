package com.example.citizenRecordApplication.controllers;


import com.example.citizenRecordApplication.entity.CitizenRecordEntity;
import com.example.citizenRecordApplication.services.CitizenRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizensvc/v1/")
public class CitizenRecordController {

	@Autowired
	CitizenRecordService citizenRecordService;

	@GetMapping("/hello")
	public String getCitizen() {
		return "Hello Good Day Docker Image is working";
	}

	@GetMapping("/getCitizen/{citizenId}")
	public CitizenRecordEntity getCitizen(@PathVariable Integer citizenId) {
		return citizenRecordService.getCitizenById(citizenId);
	}

	@GetMapping("/getCitizens")
	public List<CitizenRecordEntity> getCitizens() {
		return citizenRecordService.getAllCitizen();
	}

	@PostMapping("/citizen")
	public CitizenRecordEntity createCitizen(@RequestBody CitizenRecordEntity citizenRecordEntity) {
		return citizenRecordService.createCitizen(citizenRecordEntity);
	}
}
