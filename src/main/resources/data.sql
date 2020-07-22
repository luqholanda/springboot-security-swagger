DROP TABLE IF EXISTS example;
 
CREATE TABLE example (
  id INT AUTO_INCREMENT PRIMARY KEY,
  content VARCHAR(250) NOT NULL,
  insert_date date NOT NULL
);
 
INSERT INTO example (content, insert_date) VALUES ('Example 01', CURRENT_DATE);
INSERT INTO example (content, insert_date) VALUES ('Example 02', CURRENT_DATE);
INSERT INTO example (content, insert_date) VALUES ('Example 03', CURRENT_DATE);

DROP TABLE IF EXISTS usr;
 
CREATE TABLE usr (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  login VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);

-- Password 123 (md5)
INSERT INTO usr (name, login, password) VALUES ('name', 'user', '202cb962ac59075b964b07152d234b70');
