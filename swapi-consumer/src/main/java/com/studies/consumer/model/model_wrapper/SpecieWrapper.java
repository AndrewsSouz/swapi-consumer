package com.studies.consumer.model.model_wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.studies.consumer.model.Specie;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SpecieWrapper {
    private String count;
    @JsonProperty("results")
    private Specie[] planets;
}
