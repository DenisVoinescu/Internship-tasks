CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       email VARCHAR(70) NOT NULL,
                       username VARCHAR(25) NOT NULL,
                       password VARCHAR(255)
);