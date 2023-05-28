
# создаем таблицу all_human_friends для заполнения данными из всех таблиц
CREATE TABLE all_human_friends
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY
)
SELECT nikname, birthday, colour, owner_id FROM dogs
UNION
SELECT nikname, birthday, colour, owner_id FROM cats
UNION
SELECT nikname, birthday, colour, owner_id FROM hamsters
UNION
SELECT nikname, birthday, colour, owner_id FROM horses
UNION
SELECT nikname, birthday, colour, owner_id FROM donkeys;