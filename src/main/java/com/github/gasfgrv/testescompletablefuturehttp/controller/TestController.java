package com.github.gasfgrv.testescompletablefuturehttp.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.gasfgrv.testescompletablefuturehttp.model.ChuckNorrisResponse;
import com.github.gasfgrv.testescompletablefuturehttp.model.DeckOfCardsResponse;
import com.github.gasfgrv.testescompletablefuturehttp.model.KayneRestResponse;
import com.github.gasfgrv.testescompletablefuturehttp.model.RickAndMortyResponse;
import com.github.gasfgrv.testescompletablefuturehttp.model.SlipResponse;
import com.github.gasfgrv.testescompletablefuturehttp.service.ApiFutureService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

    private final ApiFutureService service;

    @GetMapping("/teste")
    public ResponseEntity<Void> testarVariasRequisicoesEmParalelo() {
        CompletableFuture<SlipResponse> advicefFuture = service.getAdvice();
        CompletableFuture<ChuckNorrisResponse> jokeFuture = service.getJoke();
        CompletableFuture<KayneRestResponse> quoteFuture = service.getQuote();
        CompletableFuture<DeckOfCardsResponse> deckFuture = service.getDeck();
        CompletableFuture<RickAndMortyResponse> characterFuture = service.getCharacter();
        
        log.info(advicefFuture.join().toString());
        log.info(jokeFuture.join().toString());
        log.info(quoteFuture.join().toString());
        log.info(deckFuture.join().toString());
        log.info(characterFuture.join().toString());

        return ResponseEntity.noContent().build();
    }

}