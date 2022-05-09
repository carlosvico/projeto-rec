/* Lógico_1: */

CREATE TABLE Habitantes (
    id INTEGER PRIMARY KEY,
    nome VARCHAR,
    sobrenome VARCHAR,
    dtNascimento DATE,
    cpf VARCHAR,
    renda DOUBLE,
    id_vila INTEGER
);

CREATE TABLE Vila (
    id INTEGER PRIMARY KEY,
    gTotal DOUBLE,
    orcamento DOUBLE,
    nome VARCHAR
);

CREATE TABLE Reletorios (
    id INTEGER PRIMARY KEY,
    gTotal DOUBLE,
    orcamento VARCHAR,
    id_vila INTEGER
);
 
ALTER TABLE Habitantes ADD CONSTRAINT FK_Habitantes_2
    FOREIGN KEY (id_vila???)
    REFERENCES ??? (???);
 
ALTER TABLE Reletorios ADD CONSTRAINT FK_Reletorios_2
    FOREIGN KEY (id_vila???)
    REFERENCES ??? (???);