INSERT INTO persons (person_name, age, photo_url) VALUES ('Leonardo Dicaprio', '49', 'https://m.media-amazon.com/images/M/MV5BMjI0MTg3MzI0M15BMl5BanBnXkFtZTcwMzQyODU2Mw@@._UX500_.jpg');
INSERT INTO persons (person_name, age, photo_url) VALUES ('Tom Hardy', '46', 'https://m.media-amazon.com/images/M/MV5BMTQ3ODEyNjA4Nl5BMl5BanBnXkFtZTgwMTE4ODMyMjE@._UX500_.jpg');
INSERT INTO persons (person_name, age, photo_url) VALUES ('Christopher Nolan', '53', 'https://m.media-amazon.com/images/M/MV5BNjE3NDQyOTYyMV5BMl5BanBnXkFtZTcwODcyODU2Mw@@._UX500_.jpg');

INSERT INTO persons (person_name, age, photo_url) VALUES ('Joseph Gordon-Levitt', '42', 'https://m.media-amazon.com/images/M/MV5BMTY3NTk0NDI3Ml5BMl5BanBnXkFtZTgwNDA3NjY0MjE@._UX500_.jpg');
INSERT INTO persons (person_name, age, photo_url) VALUES ('Zooey Deschannel', '43', 'https://m.media-amazon.com/images/M/MV5BMTgzMjM2NDE1OF5BMl5BanBnXkFtZTcwMjA2NDU5OA@@._UX500_.jpg');

INSERT INTO movies (title, release_year, director, poster_url, rating_counter, rating_sum) VALUES ('Inception', '2010', 'Christopher Nolan', 'https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._UX500_.jpg', 0, 0);
INSERT INTO movies (title, release_year, director, poster_url, rating_counter, rating_sum) VALUES ('(500) Days of Summer', '2009', 'Marc Webb', 'https://m.media-amazon.com/images/M/MV5BMTk5MjM4OTU1OV5BMl5BanBnXkFtZTcwODkzNDIzMw@@._UX500_.jpg', 0, 0);

/*Casting for Inception*/
INSERT INTO movie_casting (movie_id, person_id) VALUES (1,1);
INSERT INTO movie_casting (movie_id, person_id) VALUES (1,2);
INSERT INTO movie_casting (movie_id, person_id) VALUES (1,4);

/*Casting for 500 days of summer*/
INSERT INTO movie_casting (movie_id, person_id) VALUES (2,4);
INSERT INTO movie_casting (movie_id, person_id) VALUES (2,5);
