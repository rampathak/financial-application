package com.example.financial.dto;

public class FinancialMessageRequest {

    private String senderBank;
    private String receiverBank;
    private double amount;
    private String currency;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSenderBank() {
        return senderBank;
    }

    public void setSenderBank(String senderBank) {
        this.senderBank = senderBank;
    }

    public String getReceiverBank() {
        return receiverBank;
    }

    public void setReceiverBank(String receiverBank) {
        this.receiverBank = receiverBank;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }



}
