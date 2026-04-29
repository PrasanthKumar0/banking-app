package com.bank.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingController {

    @GetMapping("/")
    public String home() {
        return "Secure Banking Application Running Successfully";
    }

    @GetMapping("/balance")
    public String balance() {
        return "Available Balance: ₹50,000";
    }

    @PostMapping("/deposit")
    public String deposit() {
        return "Amount Deposited Successfully";
    }

    @PostMapping("/withdraw")
    public String withdraw() {
        return "Amount Withdrawn Successfully";
    }
}