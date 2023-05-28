
# создаем дополнительную таблицу, куда будут объединены животные
CREATE TABLE pets_and_packs
(
    id       INT NOT NULL AUTO_INCREMENT,
    nikname  VARCHAR(25),
    birthday DATE,
    owner_id INT NOT NULL,
    age DECIMAL,
    PRIMARY KEY (id)
);

# вставляем в таблицу pets_and_packs значения из других таблиц,
# значение поля age получается в результате вычислений разницы года рождения и месяца с текущей датой
INSERT INTO pets_and_packs (nikname, birthday, owner_id, age)
SELECT nikname, birthday, owner_id, ROUND((ABS(year(current_date()) - year(birthday)) + ABS(month(current_date()) - month(birthday)) / 12), 1)
FROM cats
UNION
SELECT nikname, birthday, owner_id, ROUND((ABS(year(current_date()) - year(birthday)) + ABS(month(current_date()) - month(birthday)) / 12), 1)
FROM dogs
UNION
SELECT nikname, birthday, owner_id, ROUND((ABS(year(current_date()) - year(birthday)) + ABS(month(current_date()) - month(birthday)) / 12), 1)
FROM hamsters
UNION
SELECT nikname, birthday, owner_id, ROUND((ABS(year(current_date()) - year(birthday)) + ABS(month(current_date()) - month(birthday)) / 12), 1)
FROM horses
UNION
SELECT nikname, birthday, owner_id, ROUND((ABS(year(current_date()) - year(birthday)) + ABS(month(current_date()) - month(birthday)) / 12), 1)
FROM donkeys;

# создаем таблицу young_human_friends и помещаем туда значения из таблицы pets_and_packs, с выборкой по полю age в диапазоне от 1 до 3
CREATE TABLE young_human_friends
(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT nikname, birthday, owner_id, age
FROM pets_and_packs
WHERE age BETWEEN 1.0 AND 3.0;