
# создаем таблицу pack_animals, добавляем в неё данные из двух таблиц horses и donkeys
CREATE TABLE pack_animals (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY )
SELECT nikname, birthday, colour, load_capacity, max_speed, owner_id FROM horses
UNION
SELECT nikname, birthday, colour, load_capacity, max_speed, owner_id FROM donkeys;