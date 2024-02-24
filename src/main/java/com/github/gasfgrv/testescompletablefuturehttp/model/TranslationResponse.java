package com.github.gasfgrv.testescompletablefuturehttp.model;

import lombok.Data;

@Data
public class TranslationResponse {

    private Status success;
    private Contents contents;

    @Data
    static class Status {
        private int total;
    }

    @Data
    static class Contents {
        private String translated;
        private String text;
        private String translation;
    }

}
