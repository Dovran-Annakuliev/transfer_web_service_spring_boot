package ru.transfer.webservice.service;

import ru.transfer.webservice.model.entity.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
    Transaction create(Transaction transaction);
    Transaction update(Transaction transaction);
    Optional<Transaction> getById(Long id);
    List<Transaction> getAll();
    void deleteById(Long id);
}
