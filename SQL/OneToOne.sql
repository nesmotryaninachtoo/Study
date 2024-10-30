CREATE TABLE person
(
	person_id integer PRIMARY KEY,
	first_name varchar(64) NOT NULL,
	last_name varchar(64) NOT NULL
);

CREATE TABLE passport
(
	passport_id integer PRIMARY KEY,
	serial_number integer NOT NULL,
	registration text NOT NULL,
	fk_passport_person integer REFERENCES person(person_id)
);

INSERT INTO person
VALUES 
	(1, 'John', 'Snow'),
	(2, 'Ned', 'Stark'),
	(3, 'Rob', 'Baratheon');

INSERT INTO passport
VALUES 
	(1, 123456, 'Winterfell', 1),
	(2, 789012, 'Winterfell', 2),
	(3, 345678, 'King''s Landing', 3);
