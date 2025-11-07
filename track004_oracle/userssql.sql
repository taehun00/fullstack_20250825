CREATE TABLE users (
    userid NUMBER PRIMARY KEY,
    email VARCHAR2(200) NOT NULL UNIQUE,
    nickname VARCHAR2(100) NOT NULL,
    password VARCHAR2(100) NOT NULL,
    createdat DATE NOT NULL
);

CREATE SEQUENCE userid_seq;

INSERT INTO users (userid, email, nickname, password, createdat)
VALUES (userid_seq.NEXTVAL, 'user2@example.com', '김철수', 'pass456', SYSDATE);

INSERT INTO users (userid, email, nickname, password, createdat)
VALUES (userid_seq.NEXTVAL, 'user2@example.com', '이영', 'mypasswo', SYSDATE);


desc users;

select * from users;