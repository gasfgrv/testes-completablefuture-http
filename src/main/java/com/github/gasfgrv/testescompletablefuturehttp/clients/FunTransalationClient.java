package com.github.gasfgrv.testescompletablefuturehttp.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.gasfgrv.testescompletablefuturehttp.model.TranslationResponse;

@FeignClient(name = "funTransalationClient", url = "https://api.funtranslations.com/translate/pirate.json?text=Hello%20sir%21%20my%20mother%20goes%20with%20me%20to%20the%20ocean.")
public interface FunTransalationClient {
    @GetMapping
    TranslationResponse getTranslation();
}
