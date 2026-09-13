package com.example.financial.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public String checkHealth(){
        return "up";
    }
}
