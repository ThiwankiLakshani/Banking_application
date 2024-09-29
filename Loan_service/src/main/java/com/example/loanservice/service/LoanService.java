package com.example.loanservice.service;

import com.example.loanservice.dto.LoanRequestDto;
import com.example.loanservice.model.Loan;
import com.example.loanservice.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public Loan createLoan(LoanRequestDto loanRequestDto) {
        Loan loan = new Loan();
        loan.setUserId(loanRequestDto.getUserId());
        loan.setAmount(loanRequestDto.getAmount());
        loan.setLoanType(loanRequestDto.getLoanType());
        return loanRepository.save(loan);
    }

    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElseThrow(() -> new RuntimeException("Loan not found"));
    }

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Loan updateLoan(Long id, Loan loanRequestDto) {
        Loan loan = getLoanById(id);
        loan.setAmount(loanRequestDto.getAmount());
        loan.setLoanType(loanRequestDto.getLoanType());
        return loanRepository.save(loan);
    }

    public boolean deleteLoan(Long id) {
        loanRepository.deleteById(id);
        return false;
    }
}
