package com.example.financial.service;

import com.example.financial.dto.FinancialMessageRequest;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessageStatus() {
        return "READY";
    }

    public String processMessage(FinancialMessageRequest request) {

        return "Received payment from "
                +request.getSenderBank()
                + "to"
                +request.getReceiverBank()
                + "for "
                +request.getAmount()
                + " "
                +request.getCurrency();


    }

}
