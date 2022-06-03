Odev_7

1st part
SELECT rating, COUNT(*) FROM film
GROUP BY rating;

2nd part
SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY replacement_cost;

3rd part
SELECT store_id, count(*) FROM customer
GROUP BY store_id;

4th part
SELECT country_id, COUNT(*) FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIT 1;
