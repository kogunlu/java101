Odev_11

1st part
SELECT first_name from customer
UNION
SELECT first_name from actor
ORDER BY first_name;

2nd part
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer;

3rd part
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer;

4th part;

SELECT first_name from customer
UNION ALL
SELECT first_name from actor
ORDER BY first_name;

SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer;

SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer;