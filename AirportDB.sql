CREATE DATABASE AirportDB;

USE AirportDB;

CREATE TABLE Airport (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL
);

CREATE TABLE Aircraft (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          max_passengers INT NOT NULL
);

CREATE TABLE Passenger (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           seat_number INT NOT NULL
);