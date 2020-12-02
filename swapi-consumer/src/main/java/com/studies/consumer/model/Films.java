package com.studies.consumer.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Films {
    private String title;
    private String episodeId;
    private String director;
    private String producer;
    private String releaseDate;
}
