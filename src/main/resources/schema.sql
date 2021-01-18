DROP TABLE "user";
CREATE TABLE "user"
(
    id        bigint primary key NOT NULL ,
    username  VARCHAR(45) NOT NULL UNIQUE,
    password  TEXT        NOT NULL,
    algorithm VARCHAR(45) NOT NULL
);
DROP TABLE authority;
CREATE TABLE authority
(
    id     bigint primary key NOT NULL ,
    name   VARCHAR(45) NOT NULL,
    "user" INT         NOT NULL
);
DROP TABLE product;
CREATE TABLE product
(
    id       bigint primary key NOT NULL ,
    name     VARCHAR(45) NOT NULL,
    price    float NOT NULL,
    currency VARCHAR(45) NOT NULL
);
