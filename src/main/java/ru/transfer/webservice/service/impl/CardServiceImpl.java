package ru.transfer.webservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.transfer.webservice.model.entity.Card;
import ru.transfer.webservice.repository.CardRepository;
import ru.transfer.webservice.service.CardService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardRepository cardRepository;

    @Override
    @Transactional
    public Card create(Card card) {
        return cardRepository.save(card);
    }

    @Override
    @Transactional
    public Card update(Card card) {
        return cardRepository.save(card);
    }

    @Override
    @Transactional
    public Optional<Card> getById(Long id) {
        return cardRepository.findById(id);
    }

    @Override
    @Transactional
    public List<Card> getAll() {
        return cardRepository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        cardRepository.deleteById(id);
    }


}
