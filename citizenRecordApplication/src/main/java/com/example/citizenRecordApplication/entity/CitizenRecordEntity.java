package com.example.citizenRecordApplication.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("citizen-data")
public class CitizenRecordEntity {

    @Id
    private String id;
    private Integer citizenId;
    private String name;
    private String email;
    private Integer phoneNumber;
}
