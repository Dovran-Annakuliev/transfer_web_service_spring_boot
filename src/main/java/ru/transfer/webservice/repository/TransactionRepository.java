package ru.transfer.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.transfer.webservice.model.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
