package ru.transfer.webservice.service;

import ru.transfer.webservice.model.entity.Card;

import java.util.List;
import java.util.Optional;

public interface CardService {
    Card create(Card card);
    Card update(Card card);
    Optional<Card> getById(Long id);
    List<Card> getAll();
    void deleteById(Long id);
}
