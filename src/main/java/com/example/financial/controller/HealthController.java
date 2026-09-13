package com.example.financial.controller;
import com.example.financial.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
private final MessageService messageService;
public HealthController(MessageService messageService) {
    this.messageService = messageService;
}
    @GetMapping("/api/messages/health")
    public String health() {
     String status = messageService.getMessageStatus();
        return status;

}

}

