CREATE TABLE "user"
(
    id        int primary key NOT NULL ,
    username  VARCHAR(45) NOT NULL UNIQUE,
    password  TEXT        NOT NULL,
    algorithm VARCHAR(45) NOT NULL
);
CREATE TABLE authority
(
    id     int primary key NOT NULL ,
    name   VARCHAR(45) NOT NULL,
    "user" INT         NOT NULL
);
CREATE TABLE product
(
    id       int primary key NOT NULL ,
    name     VARCHAR(45) NOT NULL,
    price    float NOT NULL,
    currency VARCHAR(45) NOT NULL
);
INSERT INTO "user"
VALUES (1, 'john', '$2a$10$xn3LI/AjqicFYZFruSwve.681477XaVNaUQbr1gioaWPn4t1KsnmG', 'BCRYPT');
INSERT INTO authority
VALUES (1, 'READ', '1');
INSERT INTO authority
VALUES (2, 'WRITE', '1');
INSERT INTO product
VALUES (1, 'Chocolate', '10', 'USD');