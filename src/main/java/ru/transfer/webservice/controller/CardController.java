package ru.transfer.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.web.bind.annotation.*;
import ru.transfer.webservice.model.entity.Card;
import ru.transfer.webservice.model.entity.Transaction;
import ru.transfer.webservice.service.CardService;
import ru.transfer.webservice.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/transfer/cards")
public class CardController {
    @Autowired
    private CardService cardService;

    @Autowired
    TransactionService transactionService;

    @PostMapping("/")
    public Card create(@RequestBody Card card) {
        return cardService.create(card);
    }

    @PutMapping("/")
    public Card update(@RequestBody Card card) {
        return cardService.update(card);
    }

    @GetMapping("/{id}")
    public Card getById(@PathVariable("id") Long id) {
        return cardService.getById(id).orElseThrow(() -> new ExpressionException("Card not found"));
    }

    @GetMapping("/")
    public List<Card> getAll() {
        return cardService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        cardService.deleteById(id);
    }

    @PutMapping("/{id}/replenishment")
    public Card replenishmentBalance(@PathVariable("id") Long id, @RequestBody Card card){
        return cardService.update(card);
    }

    @PostMapping("/{id}/transaction")
    public Transaction createTransaction(@PathVariable("id") Long id, @RequestBody Transaction transaction){
        return transactionService.create(transaction);
    }
}
