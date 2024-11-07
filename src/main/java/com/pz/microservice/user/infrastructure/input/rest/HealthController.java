package com.pz.microservice.user.infrastructure.input.rest;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/status")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class HealthController {
    @Operation(summary = "Valida la salud de la aplicación")
    @GetMapping("/health")
    public ResponseEntity<String> status(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
