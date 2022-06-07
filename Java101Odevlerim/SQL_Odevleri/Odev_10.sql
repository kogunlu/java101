Odev_10

1st part
SELECT city, country FROM City
LEFT JOIN country ON city.country_id = country.country_id
ORDER BY country;

2nd part
SELECT payment_id, first_name, last_name FROM customer
RIGHT JOIN payment ON payment.customer_id = customer.customer_id
ORDER BY first_name;

3rd part
SELECT rental_id, first_name, last_name FROM rental
FULL JOIN customer ON customer.customer_id = rental.customer_id
ORDER BY first_name;