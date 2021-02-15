DROP SCHEMA IF EXISTS public CASCADE;
CREATE SCHEMA public;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO public;

CREATE TABLE clients
(
    client_id   bigint NOT NULL,
    name        varchar(50) NOT NULL,
    surename    varchar(50) NOT NULL,
    birthday    date NOT NULL,
    CONSTRAINT  PK_users PRIMARY KEY ( client_id )
);

CREATE TABLE cards
(
    card_id     bigint NOT NULL,
    client_id   bigint NOT NULL,
    card_number bigint NOT NULL,
    balance     real,
    CONSTRAINT  PK_cards PRIMARY KEY ( card_id, client_id ),
    CONSTRAINT  FK_11 FOREIGN KEY ( client_id ) REFERENCES clients ( client_id )
);

CREATE INDEX fkIdx_12 ON cards
(
    client_id
);

CREATE TABLE transactions
(
    transaction_id  bigint NOT NULL,
    card_id         bigint NOT NULL,
    client_id       bigint NOT NULL,
    sender_card     bigint NOT NULL,
    recipient_card  bigint NOT NULL,
    amount         real NOT NULL,
    "date"          date NOT NULL,
    CONSTRAINT PK_history PRIMARY KEY ( transaction_id, card_id, client_id ),
    CONSTRAINT FK_19 FOREIGN KEY ( card_id, client_id ) REFERENCES cards ( card_id, client_id )
);

CREATE INDEX fkIdx_20 ON transactions
(
    card_id,
    client_id
);
