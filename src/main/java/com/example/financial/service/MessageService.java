package com.example.financial.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessageStatus(){
        return "READY";
    }
}
