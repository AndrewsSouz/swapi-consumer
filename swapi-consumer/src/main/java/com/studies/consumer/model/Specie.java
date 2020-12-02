package com.studies.consumer.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Specie {
    private String name;
    private String classification;
    private String designation;
    private String averageHeight;
    private String skinColors;
    private String hairColors;
    private String eyeColors;
    private String averageLifeSpan;
    private String language;
}
