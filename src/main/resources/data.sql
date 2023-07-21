DROP TABLE IF EXISTS msg;
 
CREATE TABLE msg (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  texte VARCHAR(200) NOT NULL,
  date_time DATETIME NOT NULL,
  utilisateur VARCHAR(100) NOT NULL
);
 
INSERT INTO msg (texte, date_time, utilisateur) VALUES
  ('Twitter message 1', '2023-07-21 15:30:00', 'John Doe'),
  ('Twitter message 2', '2023-07-11 16:30:00', 'Nicolas'),
  ('Twitter message 3', '2023-07-18 1:30:00', 'Pascal');