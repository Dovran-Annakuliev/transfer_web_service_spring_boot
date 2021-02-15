package ru.transfer.webservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.transfer.webservice.model.entity.Transaction;
import ru.transfer.webservice.repository.TransactionRepository;
import ru.transfer.webservice.service.TransactionService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    @Transactional
    public Transaction create(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    @Transactional
    public Transaction update(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    @Transactional
    public Optional<Transaction> getById(Long id) {
        return transactionRepository.findById(id);
    }

    @Override
    @Transactional
    public List<Transaction> getAll() {
        return transactionRepository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        transactionRepository.deleteById(id);
    }
}
