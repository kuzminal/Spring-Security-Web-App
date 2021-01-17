CREATE TABLE IF NOT EXISTS "user"
(
    id        bigint primary key NOT NULL ,
    username  VARCHAR(45) NOT NULL UNIQUE,
    password  TEXT        NOT NULL,
    algorithm VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS authority
(
    id     bigint primary key NOT NULL ,
    name   VARCHAR(45) NOT NULL,
    "user" INT         NOT NULL
);

CREATE TABLE IF NOT EXISTS product
(
    id       bigint primary key NOT NULL ,
    name     VARCHAR(45) NOT NULL,
    price    VARCHAR(45) NOT NULL,
    currency VARCHAR(45) NOT NULL
);
