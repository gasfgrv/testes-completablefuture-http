package com.github.gasfgrv.testescompletablefuturehttp.model;

import java.util.List;

import lombok.Data;

@Data
public class RickAndMortyResponse {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Origin origin;
    private Location location;
    private String image;
    private List<String> episode;
    private String url;
    private String created;

    @Data
    static class Origin {
        private String name;
        private String url;
    }

    @Data
    static class Location {
        private String name;
        private String url;
    }
}
