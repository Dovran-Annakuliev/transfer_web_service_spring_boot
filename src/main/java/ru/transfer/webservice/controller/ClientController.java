package ru.transfer.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.web.bind.annotation.*;
import ru.transfer.webservice.model.entity.Client;
import ru.transfer.webservice.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/transfer/clients")
public class ClientController {
//    private final ClientService clientService;

    @Autowired
    private ClientService clientService;

    @PostMapping("/")
    public Client create(@RequestBody Client client) {
        return clientService.create(client);
    }

    @PutMapping("/")
    public Client update(@RequestBody Client client) {
        return clientService.update(client);
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable("id") Long id) {
        return clientService.getById(id).orElseThrow(() -> new ExpressionException("Client not found"));
    }

    @GetMapping("/")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        clientService.deleteById(id);
    }
}
