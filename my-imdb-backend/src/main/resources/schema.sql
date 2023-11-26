CREATE TABLE IF NOT EXISTS movies (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    release_year VARCHAR(255),
    director VARCHAR(255),
    poster_url VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS persons (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    person_name VARCHAR(255),
    age VARCHAR(255),
    photo_url VARCHAR(255)
    );