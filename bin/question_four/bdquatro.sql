CREATE TABLE Address (
    address_id SERIAL PRIMARY KEY,
    zip_code VARCHAR(9) NOT NULL,
    address VARCHAR(255) NOT NULL,
    complement VARCHAR(255),
    neighborhood VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    state VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL
);

CREATE TABLE Person (
    person_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INTEGER NOT NULL,
    phone VARCHAR(20) NOT NULL,
    height FLOAT,
    email VARCHAR(255) NOT NULL,
    cpf CHAR(14) NOT NULL,
    date_of_birth DATE NOT NULL,
    id_address INTEGER NOT NULL,
    FOREIGN KEY (id_address) REFERENCES Address (address_id)
);
