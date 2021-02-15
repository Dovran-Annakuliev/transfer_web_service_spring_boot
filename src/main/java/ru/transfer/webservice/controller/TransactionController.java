package ru.transfer.webservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.web.bind.annotation.*;
import ru.transfer.webservice.model.entity.Transaction;
import ru.transfer.webservice.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/transfer/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/{id}")
    public Transaction getById(@PathVariable("id") Long id) {
        return transactionService.getById(id).orElseThrow(() -> new ExpressionException("Client not found"));
    }

    @GetMapping("/")
    public List<Transaction> getAll() {
        return transactionService.getAll();
    }
}
