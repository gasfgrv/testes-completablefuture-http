package com.github.gasfgrv.testescompletablefuturehttp.service;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.github.gasfgrv.testescompletablefuturehttp.clients.AdviceSlipClient;
import com.github.gasfgrv.testescompletablefuturehttp.clients.ChuckNorrisClient;
import com.github.gasfgrv.testescompletablefuturehttp.clients.DeckOfCardsClient;
import com.github.gasfgrv.testescompletablefuturehttp.clients.FunTransalationClient;
import com.github.gasfgrv.testescompletablefuturehttp.clients.KayneRestClient;
import com.github.gasfgrv.testescompletablefuturehttp.clients.RickAndMortyClient;
import com.github.gasfgrv.testescompletablefuturehttp.model.ChuckNorrisResponse;
import com.github.gasfgrv.testescompletablefuturehttp.model.DeckOfCardsResponse;
import com.github.gasfgrv.testescompletablefuturehttp.model.KayneRestResponse;
import com.github.gasfgrv.testescompletablefuturehttp.model.RickAndMortyResponse;
import com.github.gasfgrv.testescompletablefuturehttp.model.SlipResponse;
import com.github.gasfgrv.testescompletablefuturehttp.model.TranslationResponse;
import com.github.gasfgrv.testescompletablefuturehttp.threads.ThreadUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ApiFutureService {

    private static final String THREAD_NAME_TIME = "Thread name: {} | Time: {}";
    
    private final AdviceSlipClient adviceSlipClient;
    private final FunTransalationClient funTransalationClient;
    private final ChuckNorrisClient chuckNorrisClient;
    private final KayneRestClient kayneRestClient;
    private final DeckOfCardsClient deckOfCardsClient;
    private final RickAndMortyClient rickAndMortyClient;

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<SlipResponse> getAdvice() {
        ThreadUtils.delay();
        log.info(THREAD_NAME_TIME, Thread.currentThread().getName(), LocalTime.now());
        return CompletableFuture.supplyAsync(adviceSlipClient::getAdvice);
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<TranslationResponse> getTransalation() {
        ThreadUtils.delay();
        log.info(THREAD_NAME_TIME, Thread.currentThread().getName(), LocalTime.now());
        return CompletableFuture.supplyAsync(funTransalationClient::getTranslation);
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<ChuckNorrisResponse> getJoke() {
        ThreadUtils.delay();
        log.info(THREAD_NAME_TIME, Thread.currentThread().getName(), LocalTime.now());
        return CompletableFuture.supplyAsync(chuckNorrisClient::getJoke);
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<KayneRestResponse> getQuote() {
        ThreadUtils.delay();
        log.info(THREAD_NAME_TIME, Thread.currentThread().getName(), LocalTime.now());
        return CompletableFuture.supplyAsync(kayneRestClient::getQuote);
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<DeckOfCardsResponse> getDeck() {
        ThreadUtils.delay();
        log.info(THREAD_NAME_TIME, Thread.currentThread().getName(), LocalTime.now());
        return CompletableFuture.supplyAsync(deckOfCardsClient::getDeck);
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<RickAndMortyResponse> getCharacter() {
        ThreadUtils.delay();
        log.info(THREAD_NAME_TIME, Thread.currentThread().getName(), LocalTime.now());
        return CompletableFuture.supplyAsync(rickAndMortyClient::getCharacter);
    }

}
