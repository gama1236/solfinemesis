CREATE TABLE users
(
    id       SERIAL PRIMARY KEY,
    email    VARCHAR(255) NOT NULL,
    password BYTEA        NOT NULL
);

CREATE TABLE Nationality
(
    id         SERIAL PRIMARY KEY,
    cod_Country VARCHAR(3)         NOT NULL,
    des_Country VARCHAR(50) UNIQUE NOT NULL
);

INSERT INTO Nationality (cod_Country, des_Country) VALUES ('PER', 'Peru');
INSERT INTO Nationality (cod_Country, des_Country) VALUES ('COL', 'Colombia');
INSERT INTO Nationality (cod_Country, des_Country) VALUES ('CHL', 'Chile');
