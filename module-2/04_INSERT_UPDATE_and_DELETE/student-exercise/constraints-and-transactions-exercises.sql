-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT * FROM actor;

INSERT INTO actor VALUES (201, 'HAMPTON', 'AVENUE');
INSERT INTO actor VALUES (202, 'LISA', 'BYWAY');


-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
SELECT * FROM film;
SELECT film_id, title, description, release_year, language_id, length FROM film WHERE title = 'EUCLIDEAN PI';

INSERT INTO film (film_id, title, description, release_year, language_id, length)
VALUES (1001, 'EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
SELECT * FROM film_actor WHERE actor_id IN (201, 202);

INSERT INTO film_actor VALUES (201, 1001);
INSERT INTO film_actor VALUES (202, 1001);


-- 4. Add Mathmagical to the category table.
SELECT * FROM category;

INSERT INTO category VALUES (17, 'Mathmagical');


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
SELECT * FROM film_category WHERE category_id = '17';
SELECT * FROM film WHERE title IN ('EUCLIDEAN PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');

INSERT INTO film_category VALUES (1001, 17);
INSERT INTO film_category VALUES (274, 17);
INSERT INTO film_category VALUES (494, 17);
INSERT INTO film_category VALUES (714, 17);
INSERT INTO film_category VALUES (996, 17);


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
SELECT * FROM film
JOIN film_category ON film.film_id = film_category.film_id
WHERE category_id = 17;

UPDATE film
SET rating = 'G'
WHERE rating != 'G';


-- 7. Add a copy of "Euclidean PI" to all the stores.
SELECT * FROM film;
SELECT * FROM inventory
WHERE film_id = 1001;
SELECT * FROM store;

INSERT INTO inventory (film_id, store_id)
VALUES (1001, 1);
INSERT INTO inventory (film_id, store_id)
VALUES (1001, 2);


-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> It did not succeed because there is a foreign key constraint. The film_id for EUCLIDEAN PI is still referenced in the table film_actor.
SELECT * FROM film
WHERE title = 'EUCLIDEAN PI';

START TRANSACTION;

DELETE
FROM film
WHERE title = 'EUCLIDEAN PI';

COMMIT;
ROLLBACK;


-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> It did not succeed because there is a foreign key constraint. The category_id for Mathmagical is still referenced in the table film_category.
SELECT * FROM category WHERE name = 'Mathmagical';

START TRANSACTION;

DELETE
FROM category 
WHERE name = 'Mathmagical';

COMMIT;
ROLLBACK;


-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE> Yes, it succeeded, because this is the only area that category_id is directly linked, and there are no constraints.
SELECT * FROM film_category WHERE category_id = 17;

START TRANSACTION;

DELETE
FROM film_category 
WHERE category_id = 17;

COMMIT;
ROLLBACK;


-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE> 
-- Deleting Mathmagical - Yes, it succeeded because the only link to Mathmagical was category_id and that link was severed in the previous problem first.
-- Deleting "Euclidean Pi" - This did not succeed because the there is still a foreign key constraint. The film_id for EUCLIDEAN PI is still referenced 
-- in the table film_actor and changing the film_category and category table relationships had no impact on the film_id.

SELECT * FROM category WHERE name = 'Mathmagical';
SELECT * FROM film WHERE title = 'EUCLIDEAN PI';

START TRANSACTION;

DELETE
FROM category 
WHERE name = 'Mathmagical';


DELETE
FROM film
WHERE title = 'EUCLIDEAN PI';

COMMIT;
ROLLBACK;


--Per Brian - DON'T DO NUMBER 12!!
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
--Per Brian - DON'T DO NUMBER 12!!