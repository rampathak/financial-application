package com.example.financial.controller;
import com.example.financial.dto.FinancialMessageRequest;
import com.example.financial.service.MessageService;
import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

@PostMapping("/api/messages")
  public String createMessage(@RequestBody FinancialMessageRequest request) {

    return messageService.processMessage(request);
}

}

