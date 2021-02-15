package ru.transfer.webservice.service;

import ru.transfer.webservice.model.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client create(Client client);
    Client update(Client client);
    Optional<Client> getById(Long id);
    List<Client> getAll();
    void deleteById(Long id);
}
