package com.github.gasfgrv.testescompletablefuturehttp.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.gasfgrv.testescompletablefuturehttp.model.ChuckNorrisResponse;

@FeignClient(name = "ChuckNorrisApi", url = "https://api.chucknorris.io")
public interface ChuckNorrisClient {
    @GetMapping("/jokes/random")
    ChuckNorrisResponse getJoke();
}
