package ru.transfer.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.transfer.webservice.model.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
