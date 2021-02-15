package ru.transfer.webservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.transfer.webservice.model.entity.Client;
import ru.transfer.webservice.repository.ClientRepository;
import ru.transfer.webservice.service.ClientService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
//    private final ClientRepository clientRepository;
    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    @Transactional
    public Client update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    @Transactional
    public Optional<Client> getById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    @Transactional
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
}
