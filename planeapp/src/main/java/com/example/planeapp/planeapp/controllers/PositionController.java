package com.example.planeapp.planeapp.controllers;

import ch.qos.logback.core.model.Model;
import com.example.planeapp.planeapp.models.repositories.Aircraft;
import com.example.planeapp.planeapp.models.repositories.AircraftRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Controller
public class PositionController {
    @NonNull
    private final AircraftRepository aircraftRepository;

    @GetMapping("/aircraft")
   public Iterable<Aircraft> getCurrentAircraftPositions(){
        return retriever.retrieveAircraftPositions("aircraft");
    }

    @GetMapping("/aircraftadmin")
    public Iterable<Aircraft> getCurrentAircraftPositionsAdminPrivs(){
        return retriever.retrieveAircraftPosiitions("aircraftadmin");
    }
}
