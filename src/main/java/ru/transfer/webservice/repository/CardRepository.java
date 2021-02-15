package ru.transfer.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.transfer.webservice.model.entity.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
}
