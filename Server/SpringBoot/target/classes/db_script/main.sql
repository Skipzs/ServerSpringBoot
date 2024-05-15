-- Database NAME:
CREATE DATABASE Login;

use user_manager;

GRANT ALL PRIVILEGES ON Login.* TO 'root'@'localhost' IDENTIFIED BY '';

CREATE TABLE angajati(
    username VARCHAR(100) primary key NOT NULL ,
    nume VARCHAR(50) NOT NULL,
    prenume VARCHAR(50) NOT NULL,
    email VARCHAR(150) NOT NULL,
    password VARCHAR(100) NOT NULL,
    status VARCHAR(30) NOT NULL
);

CREATE TABLE camere(
                         id INT(11) primary key  NOT NULL AUTO_INCREMENT,
                         status TEXT NOT NULL,
                         obs TEXT
);

