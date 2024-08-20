

-- users
-- (id, nume, etc.)             users
--                     (id, nume_mat, etc._)
-- - 78: Vasilica          - 11: Mate
-- - 79: Gigel             - 12: Romana
--                     - 13: Engleza

--             + 1 tabel

--         following (elevi <=> materii)
--         (id_intrare?, id_elev, id_materie)
--         (0 ,            78,         11)
--         (0 ,            78,         12)
--         (0 ,            79,         12)


SELECT * FROM `students` WHERE `first_name` LIKE "Vasile";
SELECT * FROM `students` WHERE `age` BETWEEN (18, 25);
SELECT * FROM `students` WHERE `genre` IN ("m", "f");
SELECT * FROM `students` WHERE `genre` = 'm';


-- students
CREATE TABLE students (
                          id int,
                          first_name VARCHAR(25),
                          age FLOAT,
                          genre CHAR(2),
                          PRIMARY KEY(id)
);

-- courses
CREATE TABLE courses (
                         id INT,
                         `name` VARCHAR(50),
                         id_module INT,
                         PRIMARY KEY(id)
                             FOREIGN KEY(id_module) REFERENCES modules(id)
)

-- modules
CREATE TABLE modules (
                         id INT,
                         `name` VARCHAR(50),
                         PRIMARY KEY(id)
)

-- Toate cursurile de la modulul cu id 7
SELECT c.name
FROM courses c
         JOIN modules AS m
              ON c.id_module
WHERE m.id = 7 -- inner join


SELECT c.name FROM courses c, modules m WHERE c.id_module = m.id -- inner join

-- ??? --
SELECT c.name
FROM courses c LEFT JOIN modules AS m
                         ON c.id_module
WHERE m.id = 7 -- left outer join
-- cursurile de la modulul 7
-- toate celelalte intrari din courses (care nu au id_module setat)

-- ??? --
SELECT c.name
FROM courses c RIGHT JOIN modules AS m
                          ON c.id_module
WHERE m.id = 7 -- right outer join
-- cursurile de la modulul 7
-- toate celelalte intrari din modules (care nu au cursurile corelate)

-- ??? ---
SELECT c.name
FROM courses c FULL JOIN modules AS m
                         ON c.id_module
WHERE m.id = 7 -- full outer join
-- cursurile de la modulul 7
SELECT c.name
FROM courses c RIGHT JOIN modules AS m
                          ON c.id_module
WHERE m.id = 7 -- right outer join
-- cursurile de la modulul 7
-- toate celelalte intrari din modules (care nu au cursurile corelate)
-- toate celelalte intrari din modules (care nu au cursurile corelate)

-- following
CREATE TABLE following(
                          id_student INT,
                          id_course INT,
                          FOREIGN KEY(id_student) REFERENCES students(id),
                          FOREIGN KEY(id_course) REFERENCES courses(id),
)


    INSERT INTO `students` ('id', 'first_name', 'age') VALUES (0, 'Gigel', 19);

UPDATE `students` SET `genre` = 'f'; -- all

UPDATE `students` SET `genre` = 'f' WHERE `first_name` = 'Gigel';

DELETE FROM `studente` WHERE `genre` <> 'f' AND `genre` <> 'm';
DELETE FROM `studente` WHERE `genre` NOT IN ('f', 'm');
