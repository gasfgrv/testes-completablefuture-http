package com.github.gasfgrv.testescompletablefuturehttp.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.gasfgrv.testescompletablefuturehttp.model.DeckOfCardsResponse;

@FeignClient(name = "deckOfCardsClient", url = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
public interface DeckOfCardsClient {
    @GetMapping
    DeckOfCardsResponse getDeck();
}
