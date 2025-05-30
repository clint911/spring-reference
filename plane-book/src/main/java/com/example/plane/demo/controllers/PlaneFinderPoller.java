package com.example.plane.demo.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.plane.demo.domains.Aircraft;
import com.example.plane.demo.repositories.AircraftRepository;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@EnableScheduling
@Component
public class PlaneFinderPoller {
    private WebClient client = WebClient.create("http:localhost:8080/aircraft");

    private final RedisConnectionFactory connectionFactory;
    private final AircraftRepository aircraftRepository;

    PlaneFinderPoller(RedisConnectionFactory connectionFactory, AircraftRepository aircraftRepository) {
        this.connectionFactory = connectionFactory;
        this.aircraftRepository = aircraftRepository;
    }

    @Scheduled(fixedRate = 1000)
    private void pollPlanes(){
        connectionFactory.getConnection().serverCommands().flushDb();

        client.get()
                .retrieve()
                .bodyToFlux(Aircraft.class)
                .filter(plane -> !plane.getReg().isEmpty())
                .toStream()
                .forEach(aircraftRepository::save);

        aircraftRepository.findAll().forEach(System.out::println);
    }
}
