INSERT INTO owners (name)
values ('Маша'),
       ('Олег'),
       ('Анна'),
       ('Алексей'),
       ('Павел'),
       ('Рома'),
       ('Даша'),
       ('Оксана');


INSERT INTO cats (nikname, birthday, colour, has_pet_house, breed, owner_id)
VALUES ('Том', '2015-06-08', 'Серый', false, 'Сибирская', 2),
       ('Вася', '2020-12-25', 'Белый', true, 'Сиамская', 4),
       ('Милка', '2019-05-15', 'Рыжий', false, 'Мэйн-кун', 3);

INSERT INTO dogs (nikname, birthday, colour, has_pet_house, purpous, owner_id)
VALUES ('Рич', '2018-04-18', 'Черный', true, 'сторожевая', 1),
       ('Лорд', '2020-01-16', 'Черно-белый', true, 'охотничья', 5),
       ('Малыш', '2018-02-24', 'Рыжий', false, 'сторожевая', 3);

INSERT INTO hamsters (nikname, birthday, colour, has_pet_house, owner_id)
VALUES ('Валя', '2021-06-25', 'Рыжий', true, 6),
       ('Валера', '2022-03-15', 'Рыжий', true, 7);

INSERT INTO horses (nikname, birthday, colour, load_capacity, max_speed, purpous, breed, owner_id)
VALUES ('Огонь', '2010-06-23', 'Черный', 150, 60, 'Ездовая', 'Орловская', 8),
       ('Арни', '2015-04-29', 'Серый', 250, 40, 'Гужевая', 'Русский тяжеловоз', 8),
       ('Маруся', '2013-08-24', 'Рыже-белый', 200, 40, 'Ездовая', 'Тверская', 8);

INSERT INTO donkeys (nikname, birthday, colour, load_capacity, max_speed, owner_id)
VALUES ('Иа', '2019-03-12', 'Серый', 200, 10, 6);

INSERT INTO camels (nikname, birthday, colour, load_capacity, max_speed, humps_amount, owner_id)
VALUES ('Вася', '2010-05-26', 'Рыжий', 300, 40, 1, 8);


