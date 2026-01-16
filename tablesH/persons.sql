CREATE TABLE persons (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    surname VARCHAR(50),
    city VARCHAR(50),
    age INT
);

/* вставьте тестовые данные */
INSERT INTO persons (name, surname, city, age) VALUES
('Ivan', 'Ivanov', 'Moscow', 25),
('Petr', 'Petrov', 'Moscow', 35),
('Anna', 'Sidorova', 'Kazan', 28);