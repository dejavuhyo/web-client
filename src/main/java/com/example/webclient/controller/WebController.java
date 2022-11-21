package com.example.webclient.controller;

import com.example.webclient.dto.WebDto;
import com.example.webclient.service.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/web")
public class WebController {

    @Resource
    private WebService webService;

    @PostMapping(path = "/mono")
    public WebDto getMono(@RequestBody WebDto webDto) {
        return webService.getMono(webDto);
    }

    @GetMapping(path = "/flux")
    public Flux<WebDto> getFlux() {
        return webService.getFlux();
    }

}
