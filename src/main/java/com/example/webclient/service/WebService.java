package com.example.webclient.service;

import com.example.webclient.dto.WebDto;
import reactor.core.publisher.Flux;

public interface WebService {

    WebDto getMono(WebDto webDto);

    Flux<WebDto> getFlux();

}
