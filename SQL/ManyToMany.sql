CREATE TABLE book 
(
	book_id integer PRIMARY KEY,
	title text NOT NULL,
	isbn text NOT NULL
);

CREATE TABLE author
(
	author_id integer PRIMARY KEY,
	full_name text NOT NULL,
	rating real
);

CREATE TABLE book_author 
(
	book_id integer REFERENCES book(book_id),
	author_id integer REFERENCES author(author_id),
	
	CONSTRAINT book_author_pkey PRIMARY KEY(book_id, author_id)
);

INSERT INTO book
VALUES
	(1, 'Book for Dummies', '123456'),
	(2, 'Book for Smart Guys', '463463'),
	(3, 'Book for Happy People', '776576'),
	(4, 'Book for Unhappy People', '621313');


INSERT INTO author
VALUES
	(1, 'Bob', 4.5),
	(2, 'Alice', 4.0),
	(3, 'John', 4.7);

INSERT INTO book_author
VALUES 
	(1,1),
	(2,1),
	(3,1),
	(3,2),
	(4,1),
	(4,2),
	(4,3);