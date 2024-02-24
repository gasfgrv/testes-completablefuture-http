package com.github.gasfgrv.testescompletablefuturehttp.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.gasfgrv.testescompletablefuturehttp.model.KayneRestResponse;

@FeignClient(name = "kayneRestClient", url = "https://api.kanye.rest/")
public interface KayneRestClient {
    @GetMapping
    KayneRestResponse getQuote();
}
