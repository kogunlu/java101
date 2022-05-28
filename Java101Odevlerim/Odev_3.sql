SQL Odev_3

1st part
SELECT country FROM country
WHERE country LIKE 'A%a';

2nd part
SELECT country FROM country
WHERE country ILIKE '%T%T%T%T%';

3rd part
SELECT title FROM film
WHERE title ILIKE '%T%';

4th part
SELECT * FROM film
WHERE title LIKE 'C%' AND length >90 AND rental_rate = 2.99 ;
