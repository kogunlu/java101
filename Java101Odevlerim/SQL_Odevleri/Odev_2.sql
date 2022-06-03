Odev2

1st part
SELECT * FROM film
WHERE replacement_cost between 12.99 AND 16.99;

2nd part
SELECT first_name, last_name FROM actor
WHERE first_name IN('Penelope', 'Nick', 'Ed');

3rd part

SELECT * FROM film
WHERE rental_rate IN(0.09, 2.99, 4.99) AND replacement_cost IN(12.99, 15.99, 28.99);