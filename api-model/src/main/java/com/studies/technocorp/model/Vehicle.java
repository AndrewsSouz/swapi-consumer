package com.studies.technocorp.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Vehicle {
    private String name;
    private String model;
    private String manufacturer;
    private String costInCredits;
    private String length;
    private String maxAtmosphereingSpeed;
    private String crew;
    private String passengers;
    private String cargoCapacity;
    private String consumables;
    private String vehicleClass;
}
