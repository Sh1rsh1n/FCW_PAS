## создаем новую БД, если не существует

CREATE DATABASE IF NOT EXISTS human_friends;

USE human_friends;

## создаем таблицу 'хозяин животного'

CREATE TABLE IF NOT EXISTS owners
(
    id   INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(25),
    PRIMARY KEY (id)
);

## создаем таблицы с домашними животными

CREATE TABLE IF NOT EXISTS dogs
(
    id            INT         NOT NULL AUTO_INCREMENT,
    nikname       VARCHAR(25) NOT NULL,
    birthday      DATE        NOT NULL,
    colour        VARCHAR(25) NOT NULL,
    has_pet_house boolean,
    purpous       VARCHAR(25),
    owner_id      INT,
    FOREIGN KEY (owner_id) REFERENCES owners (id) ON DELETE CASCADE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS cats
(
    id            INT         NOT NULL AUTO_INCREMENT,
    nikname       VARCHAR(25) NOT NULL,
    birthday      DATE        NOT NULL,
    colour        VARCHAR(25) NOT NULL,
    has_pet_house boolean,
    breed         VARCHAR(25),
    owner_id      INT,
    FOREIGN KEY (owner_id) REFERENCES owners (id) ON DELETE CASCADE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS hamsters
(
    id            INT         NOT NULL AUTO_INCREMENT,
    nikname       VARCHAR(25) NOT NULL,
    birthday      DATE        NOT NULL,
    colour        VARCHAR(25) NOT NULL,
    has_pet_house boolean,
    owner_id      INT,
    FOREIGN KEY (owner_id) REFERENCES owners (id) ON DELETE CASCADE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS horses
(
    id            INT         NOT NULL AUTO_INCREMENT,
    nikname       VARCHAR(25) NOT NULL,
    birthday      DATE        NOT NULL,
    colour        VARCHAR(25) NOT NULL,
    load_capacity INT DEFAULT 1,
    max_speed     INT DEFAULT 5,
    purpous       VARCHAR(25),
    breed         VARCHAR(25),
    owner_id      INT,
    FOREIGN KEY (owner_id) REFERENCES owners (id) ON DELETE CASCADE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS donkeys
(
    id            INT         NOT NULL AUTO_INCREMENT,
    nikname       VARCHAR(25) NOT NULL,
    birthday      DATE        NOT NULL,
    colour        VARCHAR(25) NOT NULL,
    load_capacity INT DEFAULT 1,
    max_speed     INT DEFAULT 5,
    owner_id      INT,
    FOREIGN KEY (owner_id) REFERENCES owners (id) ON DELETE CASCADE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS camels
(
    id            INT         NOT NULL AUTO_INCREMENT,
    nikname       VARCHAR(25) NOT NULL,
    birthday      DATE        NOT NULL,
    colour        VARCHAR(25) NOT NULL,
    load_capacity INT DEFAULT 1,
    max_speed     INT DEFAULT 5,
    humps_amount  INT DEFAULT 1,
    owner_id      INT,
    FOREIGN KEY (owner_id) REFERENCES owners (id) ON DELETE CASCADE,
    PRIMARY KEY (id)
);


## создаем таблицу с командами, которые выполняют животные

CREATE TABLE IF NOT EXISTS commands
(
    id      INT NOT NULL AUTO_INCREMENT,
    command VARCHAR(25),
    PRIMARY KEY (id)
);


## создаем таблицы с отношениями животного к команде

CREATE TABLE IF NOT EXISTS dog_commands
(
    dog_id     INT NOT NULL,
    command_id INT NOT NULL,
    PRIMARY KEY (dog_id, command_id),
    FOREIGN KEY (dog_id) REFERENCES dogs (id) ON DELETE CASCADE,
    FOREIGN KEY (command_id) REFERENCES commands (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS cat_commands
(
    cat_id     INT NOT NULL,
    command_id INT NOT NULL,
    PRIMARY KEY (cat_id, command_id),
    FOREIGN KEY (cat_id) REFERENCES cats (id) ON DELETE CASCADE,
    FOREIGN KEY (command_id) REFERENCES commands (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS horse_commands
(
    horse_id   INT NOT NULL,
    command_id INT NOT NULL,
    PRIMARY KEY (horse_id, command_id),
    FOREIGN KEY (horse_id) REFERENCES horses (id) ON DELETE CASCADE,
    FOREIGN KEY (command_id) REFERENCES commands (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS camel_commands
(
    camel_id   INT NOT NULL,
    command_id INT NOT NULL,
    PRIMARY KEY (camel_id, command_id),
    FOREIGN KEY (camel_id) REFERENCES camels (id) ON DELETE CASCADE,
    FOREIGN KEY (command_id) REFERENCES commands (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS donkeys_commands
(
    donkey_id  INT NOT NULL,
    command_id INT NOT NULL,
    PRIMARY KEY (donkey_id, command_id),
    FOREIGN KEY (donkey_id) REFERENCES donkeys (id) ON DELETE CASCADE,
    FOREIGN KEY (command_id) REFERENCES commands (id) ON DELETE CASCADE
);