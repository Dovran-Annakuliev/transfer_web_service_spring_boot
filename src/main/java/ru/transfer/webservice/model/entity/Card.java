package ru.transfer.webservice.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "card")
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long cardId;

    @Column(name = "card_number")
    private Long cardNumber;

    @Column(name = "balance")
    private Float balance;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "card")
    private Set<Transaction> transactions = new HashSet<>();

    public Card() {
    }

    public Card(Long cardNumber, Float balance, Client client, Set<Transaction> transactions) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.client = client;
        this.transactions = transactions;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", cardNumber=" + cardNumber +
                ", balance=" + balance +
                ", client=" + client +
                ", transactions=" + transactions +
                '}';
    }
}
