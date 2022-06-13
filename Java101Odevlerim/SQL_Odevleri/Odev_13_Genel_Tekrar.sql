Bolum Sonu Odevi

1- Film tablosundan 'K' karakteri ile başlayan en uzun ve replacenet_cost u en düşük 4 filmi sıralayınız.

SELECT title, length, replacement_cost FROM film
WHERE title LIKE 'K%'
ORDER BY length DESC, replacement_cost ASC
LIMIT 4;

2- Film tablosunda içerisinden en fazla sayıda film bulunduran rating kategorisi hangisidir?

SELECT category.name, COUNT(film.rating) AS number_of_films FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON category.category_id = film_category.category_id
GROUP BY category.name
ORDER BY COUNT(film.rating) DESC
LIMIT 3;

3- Customer tablosunda en çok alışveriş yapan müşterinin adı nedir?

SELECT customer.first_name, customer.last_name,customer.customer_id, COUNT (payment.amount) AS number_of_purchase FROM customer
JOIN payment ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id
ORDER BY COUNT (payment.amount) DESC
LIMIT 3;

4- Category tablosundan kategori isimlerini ve kategori başına düşen film sayılarını sıralayınız.

SELECT category.name, COUNT(film) AS film_number FROM category
JOIN film_category ON film_category.category_id = category.category_id
JOIN film ON film_category.film_id = film.film_id
GROUP BY category.name
ORDER BY COUNT(film) DESC;

5- Film tablosunda isminde en az 4 adet 'e' veya 'E' karakteri bulunan kç tane film vardır?

SELECT COUNT(*) FROM film
WHERE title ILIKE '%e%e%e%e%';


