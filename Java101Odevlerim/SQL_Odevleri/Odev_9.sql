Odev_9

1st part
SELECT * FROM city
INNER JOIN country ON city.country_id = country.country_id
ORDER BY country;

2nd part
SELECT payment_id, first_name, last_name FROM customer
INNER JOIN payment ON payment.customer_id = customer.customer_id
ORDER BY customer;

3rd part
SELECT rental_id, customer.first_name, customer.last_name FROM CUSTOMER
INNER JOIN rental ON customer.customer_id = rental.customer_id
ORDER BY first_name;
