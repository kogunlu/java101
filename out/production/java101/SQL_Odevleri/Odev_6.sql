Odev_6

Part1
SELECT ROUND(AVG(rental_rate), 3) FROM film;

Part2
SELECT count(*) FROM film
WHERE title LIKE 'C%';

Part3
SELECT max(length) FROM film
WHERE rental_rate = 0.99;

Part4
SELECT COUNT(DISTINCT(replacement_cost)) FROM film
WHERE length > 150;