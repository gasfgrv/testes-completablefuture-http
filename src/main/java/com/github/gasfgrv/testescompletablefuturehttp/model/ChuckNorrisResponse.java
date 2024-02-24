package com.github.gasfgrv.testescompletablefuturehttp.model;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ChuckNorrisResponse {
    private List<Object> categories;
    private String createdAt;
    private String iconUrl;
    private String id;
    private String updatedAt;
    private String url;
    private String value;
}
