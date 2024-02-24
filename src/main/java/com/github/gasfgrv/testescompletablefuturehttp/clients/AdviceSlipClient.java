package com.github.gasfgrv.testescompletablefuturehttp.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.gasfgrv.testescompletablefuturehttp.config.DecoderConfig;
import com.github.gasfgrv.testescompletablefuturehttp.model.SlipResponse;

@FeignClient(name = "adviceSlipClient", url = "https://api.adviceslip.com", configuration = DecoderConfig.class)
public interface AdviceSlipClient {
    @GetMapping(value = "/advice", consumes = MediaType.TEXT_HTML_VALUE)
    SlipResponse getAdvice();
}
