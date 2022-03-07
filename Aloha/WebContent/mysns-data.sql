USE mysns;

INSERT INTO user VALUES("kim@abc.com", "1111", "Kim", now());
INSERT INTO user VALUES("lee@abc.com", "1111", "Lee", now());
INSERT INTO user(id, password, name) VALUES("kwon@abc.com", "1111", "Kwon");

INSERT INTO feed(id, content) VALUES("kim@abc.com", "Hello, World!");
INSERT INTO feed(id, content) VALUES("kwon@abc.com", "Aloha, World!");
