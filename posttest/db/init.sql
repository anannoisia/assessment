DROP TABLE IF EXISTS user_ticket CASCADE;
DROP TABLE IF EXISTS lottery CASCADE;
DROP table IF exists user_has_ticket CASCADE;

CREATE TABLE user_ticket (
    id SERIAL PRIMARY KEY
);


CREATE TABLE lottery (
    id SERIAL PRIMARY KEY,
    price INTEGER NOT NULL
);

CREATE TABLE user_has_ticket (
    id SERIAL PRIMARY KEY,
    user_id SERIAL NOT NULL,
    lottery_id SERIAL NOT NULL
);
