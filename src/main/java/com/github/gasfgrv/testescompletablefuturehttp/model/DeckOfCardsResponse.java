package com.github.gasfgrv.testescompletablefuturehttp.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DeckOfCardsResponse {
    private String success;
    private String deckId;
    private int remaining;
    private boolean shuffled;
}
