Odev_8

1st part
CREATE TABLE employee  (
	id INTEGER PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);

2nd part
Values (50 rows) added.

3rd part
UPDATE employee
SET name = 'UPDATED'
WHERE ID BETWEEN 15 AND 18
RETURNING *;

UPDATE employee
SET birthday = '1990-01-01'
WHERE name ILIKE 'k%'
RETURNING *;

UPDATE employee
SET email = 'updated@google.com'
WHERE id > 25 AND name LIKE '%a'
RETURNING *;

4th part
DELETE FROM employee
WHERE id BETWEEN 45 AND 48
RETURNING *;

DELETE FROM employee
WHERE birthday > '1985-10-10'
RETURNING *;

DELETE FROM employee
WHERE ID IN(22,32,42)
RETURNING *;