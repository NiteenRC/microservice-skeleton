package com.nc.apigateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @GetMapping("/product")
    public ResponseEntity<String> productFallback() {
        return ResponseEntity.ok("Attention: PRODUCT-SERVICE is currently DOWN");
    }
}