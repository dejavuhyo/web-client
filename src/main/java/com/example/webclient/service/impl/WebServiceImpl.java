package com.example.webclient.service.impl;

import com.example.webclient.dto.WebDto;
import com.example.webclient.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class WebServiceImpl implements WebService {

    @Autowired
    WebClient webClient;

    public WebDto getMono(WebDto webDto) {
        return webClient.mutate()
                .baseUrl("http://localhost:8081")
                .build()
                .post()
                .uri("/board")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(webDto)
//              .bodyValue(param)
                .retrieve()
                .bodyToMono(WebDto.class)
//              .bodyToMono(String.class)
                .block();
    }

    public Flux<WebDto> getFlux() {
        return webClient.mutate()
                .baseUrl("http://localhost:8081")
                .build()
                .get()
                .uri("/board")
                .retrieve()
                .bodyToFlux(WebDto.class);
    }

}
