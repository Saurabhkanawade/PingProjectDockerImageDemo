package com.crossasyst.pingproject.controller;

import com.crossasyst.pingproject.model.PingRequest;
import com.crossasyst.pingproject.service.PingService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
public class PingController {

    @Autowired
    private PingService pingService;

    @GetMapping(path="/pings")
    public ResponseEntity<List<PingRequest>> getPing(){
        log.info("The ping is fetching .........................");
        return new ResponseEntity(pingService.getList(),HttpStatus.OK);
    }

    @GetMapping(path="/ping")
    public ResponseEntity getPings(){
        log.info("The ping is fetching .........................");
        return new ResponseEntity("Success .......",HttpStatus.OK);
    }



}
