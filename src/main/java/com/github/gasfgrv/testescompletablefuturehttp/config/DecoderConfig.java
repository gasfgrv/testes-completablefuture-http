package com.github.gasfgrv.testescompletablefuturehttp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import feign.Util;
import feign.codec.Decoder;

@Configuration
public class DecoderConfig {
    @Bean
    public Decoder decoder() {
        return (response, type) -> {
            String body = Util.toString(response.body().asReader(Util.UTF_8));
            JavaType constructType = TypeFactory.defaultInstance().constructType(type);
            return new ObjectMapper().readValue(body, constructType);
        };
    }
}
