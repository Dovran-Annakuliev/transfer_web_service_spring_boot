package ru.transfer.webservice.model.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "client")
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "name")
    private String name;

    @Column(name = "surename")
    private String surename;

    @Column(name = "birthday")
    private Date birthday;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private Set<Card> cards = new HashSet<>();

    public Client() {
    }

    public Client(String name, String surename, Date birthday, Set<Card> cards) {
        this.name = name;
        this.surename = surename;
        this.birthday = birthday;
        this.cards = cards;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date DOB) {
        this.birthday = DOB;
    }

    public Set<Card> getCards() {
        return cards;
    }

    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", DOB=" + birthday +
                ", cards=" + cards +
                '}';
    }
}
