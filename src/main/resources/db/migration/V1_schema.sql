CREATE TABLE IF NOT EXISTS category (
   category_id INT AUTO_INCREMENT PRIMARY KEY,
   name TEXT NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS recipe (
   recipe_id INT AUTO_INCREMENT PRIMARY KEY,
   name TEXT NOT NULL ,
   description TEXT NOT NULL ,
   category_id int NOT NULL ,
    FOREIGN KEY (category_id)
        REFERENCES category (category_id)
        ON UPDATE RESTRICT ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;