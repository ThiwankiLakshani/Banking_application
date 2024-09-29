package com.example.loanservice.controller;

import com.example.loanservice.dto.LoanRequestDto;
import com.example.loanservice.model.Loan;
import com.example.loanservice.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    // Get all loans
    @GetMapping
    public ResponseEntity<List<Loan>> getAllLoans() {
        List<Loan> loans = loanService.getAllLoans();
        return new ResponseEntity<>(loans, HttpStatus.OK);
    }

    // Get loan by ID
    @GetMapping("/{id}")
    public ResponseEntity<Loan> getLoanById(@PathVariable Long id) {
        Loan loan = loanService.getLoanById(id);
        if (loan != null) {
            return new ResponseEntity<>(loan, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new loan
    @PostMapping
    public ResponseEntity<Loan> createLoan(@RequestBody LoanRequestDto loan) {
        Loan createdLoan = loanService.createLoan(loan);
        return new ResponseEntity<>(createdLoan, HttpStatus.CREATED);
    }

    // Update an existing loan
    @PutMapping("/{id}")
    public ResponseEntity<Loan> updateLoan(@PathVariable Long id, @RequestBody Loan updatedLoan) {
        Loan loan = loanService.updateLoan(id, updatedLoan);
        if (loan != null) {
            return new ResponseEntity<>(loan, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a loan by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Loan> deleteLoan(@PathVariable Long id) {
        boolean deleted = loanService.deleteLoan(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
