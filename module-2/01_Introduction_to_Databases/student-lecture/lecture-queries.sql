-- SELECT ... FROM
-- Selecting the names for all countries
SELECT name
FROM country;

-- Selecting the name and population of all countries
SELECT name, population FROM country;

-- Selecting all columns from the city table
SELECT * FROM city;

SELECT DISTINCT district FROM city;

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
SELECT * 
FROM city
WHERE district = 'Ohio';

-- Selecting countries that gained independence in the year 1776
SELECT *
FROM country
WHERE indepyear = 1776;

-- Selecting countries not in Asia
SELECT * FROM country WHERE continent != 'Asia';

-- Selecting countries that do not have an independence year

-- Selecting countries that do have an independence year


-- Selecting countries that have a population greater than 5 million



-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000

-- Selecting country names on the continent North America or South America
SELECT name FROM country WHERE continent = 'North America' OR continent = 'South America';

SELECT name FROM country WHERE continent IN ('North America', 'South America');

-- LIKE
SELECT name FROM country WHERE continent LIKE '%America';

-- All cities where the name ends with a
SELECT * FROM city WHERE name LIKE '%a';

-- All cities where the name contains the letter a (case sensitive)
SELECT * FROM city WHERE name LIKE '%a%';

-- All cities where the name contains the letter a (case INensitive)
SELECT * FROM city WHERE name ILIKE '%a%';

-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword
SELECT name, population, lifeexpectancy, (population / surfacearea) AS density FROM country;


