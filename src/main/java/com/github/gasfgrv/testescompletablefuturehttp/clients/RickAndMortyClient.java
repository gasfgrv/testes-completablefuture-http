package com.github.gasfgrv.testescompletablefuturehttp.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.gasfgrv.testescompletablefuturehttp.model.RickAndMortyResponse;

@FeignClient(name = "rickAndMortyClient", url = "https://rickandmortyapi.com/api/character/2")
public interface RickAndMortyClient {
    @GetMapping
    RickAndMortyResponse getCharacter();
}
