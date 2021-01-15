
CREATE SEQUENCE hibernate_sequence START 1 INCREMENT 1;

DROP TABLE IF EXISTS test-habeeb;
CREATE TABLE test-habeeb (
    "id" VARCHAR(255) NOT NULL,
    "created" TIMESTAMP NOT NULL,
    "updated" TIMESTAMP NOT NULL,
    "version" INT8 DEFAULT 0,
    "description" VARCHAR(255) NULL,
    primary key (id)
);


