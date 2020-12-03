package com.studies.technocorp.model.model_wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FilmWrapper {
    private String count;
    @JsonProperty("results")
    private com.studies.technocorp.model.Films[] Films;
}
