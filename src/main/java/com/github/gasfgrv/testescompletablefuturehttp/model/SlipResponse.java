package com.github.gasfgrv.testescompletablefuturehttp.model;

import lombok.Data;

@Data
public class SlipResponse {

    private Slip slip;

    @Data
    static class Slip {
        private int id;
        private String advice;
    }

}
