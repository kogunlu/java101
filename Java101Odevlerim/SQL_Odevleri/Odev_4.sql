Odev_4

1st part
SELECT DISTINCT replacement_cost FROM film;

2nd part
SELECT COUNT (DISTINCT replacement_cost) FROM film;

3rd part
SELECT COUNT (*) FROM film
WHERE title ILIKE 'T%' AND rating = 'G';

4th part
SELECT COUNT (*) FROM country
WHERE country LIKE '_____'

5th part
SELECT COUNT (*) FROM city
WHERE city ILIKE '%r';