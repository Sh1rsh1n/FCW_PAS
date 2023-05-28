INSERT INTO commands (command)
VALUES ('Сидеть'),
       ('Лежать'),
       ('Стоять'),
       ('Вперед'),
       ('Назад'),
       ('Дать лапу'),
       ('Прыжок');

INSERT INTO dog_commands (dog_id, command_id)
VALUES (1, 1),
       (1, 6),
       (2, 1),
       (2, 2),
       (2, 6),
       (3, 6);

INSERT INTO cat_commands (cat_id, command_id)
VALUES (1, 7),
       (2, 7),
       (3, 7);

INSERT INTO horse_commands (horse_id, command_id)
VALUES (1, 3),
       (1, 4),
       (1, 5),
       (1, 7),
       (2, 3),
       (2, 4),
       (2, 5),
       (3, 3),
       (3, 4);


INSERT INTO camel_commands (camel_id, command_id)
VALUES (1, 2),
       (1, 3),
       (1, 4);

INSERT INTO donkeys_commands (donkey_id, command_id)
VALUES (1, 2),
       (1, 3),
       (1, 4);


