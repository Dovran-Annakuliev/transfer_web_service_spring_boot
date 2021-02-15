package ru.transfer.webservice.model.entity;


import javax.persistence.*;
import java.sql.Date;

@Entity(name = "transaction")
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "sender_card")
    private Long senderCard;

    @Column(name = "recipient_card")
    private Long recipientCard;

    @Column(name = "amount")
    private Float amount;

    @Column(name = "date")
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id")
    private Card card;

    public Transaction() {
    }

    public Transaction(Long senderCard, Long recipientCard, Float amount, Date date, Card card) {
        this.senderCard = senderCard;
        this.recipientCard = recipientCard;
        this.amount = amount;
        this.date = date;
        this.card = card;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long tramsactionId) {
        this.transactionId = tramsactionId;
    }

    public Long getSenderCard() {
        return senderCard;
    }

    public void setSenderCard(Long senderCard) {
        this.senderCard = senderCard;
    }

    public Long getRecipientCard() {
        return recipientCard;
    }

    public void setRecipientCard(Long recipientCard) {
        this.recipientCard = recipientCard;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "tramsactionId=" + transactionId +
                ", senderCard=" + senderCard +
                ", recipientCard=" + recipientCard +
                ", amount=" + amount +
                ", date=" + date +
                ", card=" + card +
                '}';
    }
}
