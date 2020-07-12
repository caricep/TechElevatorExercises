-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The
-- countrycode is 'USA', and population of 45001. (Yes, I looked it up on
-- Wikipedia.)

SELECT * FROM city WHERE name = 'Smallville';

INSERT INTO city VALUES (4080, 'Smallville', 'USA', 'Kansas', 45001);

-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.

SELECT * FROM countrylanguage WHERE countrycode = 'USA';

INSERT INTO countrylanguage VALUES ('USA', 'Kryptonese', false, 0.0001);

-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble", change
-- the appropriate record accordingly.

SELECT * FROM countrylanguage WHERE language = 'Krypto-babble';

UPDATE countrylanguage
SET language = 'Krypto-babble' WHERE language = 'Kryptonese';

-- 4. Set the US captial to Smallville, Kansas in the country table. 3813

SELECT * FROM country
WHERE code = 'USA';

UPDATE country
SET capital = 4080 WHERE capital = 3813;

-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)

-- We cannot just delete Smallville since it also exists in country table and it is the capital of USA(foreign key constraint).

SELECT * FROM city
WHERE countrycode = 'USA' AND id = 4080;

DELETE FROM city
WHERE countrycode = 'USA' AND id = 4080;

-- 6. Return the US captial to Washington.

SELECT * FROM country
WHERE code = 'USA';

UPDATE country
SET capital = 3813 WHERE capital = 4080;

-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)

-- It did succeed this time. Since, it is no longer the capital of USA.

SELECT * FROM city
WHERE countrycode = 'USA' AND id = 4080;

DELETE FROM city
WHERE countrycode = 'USA' AND id = 4080;

-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972
-- (exclusive).
-- (590 rows affected)

SELECT *
FROM countrylanguage -- countrycode
JOIN country ON country.code = countrylanguage.countrycode
WHERE indepyear > 1800 AND indepyear < 1972;

START TRANSACTION;

UPDATE countrylanguage
SET isofficial = NOT isofficial
WHERE countrycode IN (SELECT code FROM country WHERE indepyear > 1800 AND indepyear < 1972);

COMMIT;
ROLLBACK;

-- 9. Convert population so it is expressed in 1,000s for all cities. (Round to
-- the nearest integer value greater than 0.)
-- (4079 rows affected)

SELECT * FROM city;

START TRANSACTION;

UPDATE city
SET population = round(population / 1000);

COMMIT;
ROLLBACK;

-- 10. Assuming a country's surfacearea is expressed in miles, convert it to 1 mile = 1609.34
-- meters for all countries where French is spoken by more than 20% of the
-- population.
-- (7 rows affected)

SELECT * FROM countrylanguage; -- countrycode

SELECT * FROM country;

SELECT *
FROM country
JOIN countrylanguage ON country.code = countrylanguage.countrycode
WHERE countrylanguage.language = 'French' AND countrylanguage.percentage > 20;

START TRANSACTION;

UPDATE country
SET surfacearea = surfacearea * 1609
WHERE code IN(SELECT countrycode FROM countrylanguage WHERE countrylanguage.language = 'French' AND countrylanguage.percentage > 20);

COMMIT;
ROLLBACK;