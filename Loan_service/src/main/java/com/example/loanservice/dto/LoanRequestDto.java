package com.example.loanservice.dto;

import org.antlr.v4.runtime.misc.NotNull;

public class LoanRequestDto {
    @NotNull private Long userId;

     private Double amount;
    @NotNull private String loanType;

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }






}
