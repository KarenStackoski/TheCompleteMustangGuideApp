CREATE DATABASE mustang;

CREATE TABLE mustang.car(
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    car_description varchar(100) NOT NULL,
    date_fabrication datetime NOT NULL,
    engine_id INT NOT NULL,
    chassi_number VARCHAR(17) NOT NULL,
    chassi_id INT NOT NULL,
    FOREIGN KEY(engine_id) REFERENCES mustang.engine_car(id),
    FOREIGN KEY(chassi_id) REFERENCES mustang.chassi(id)
);

CREATE TABLE mustang.engine_car(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    engine_description VARCHAR(100),
    horse_power INT NOT NULL,
    litter_id INT NOT NULL,
    fuel_id INT NOT NULL,
    FOREIGN KEY (litter_id) REFERENCES mustang.litter(id),
    FOREIGN KEY (fuel_id) REFERENCES mustang.fuel(id)
);

CREATE TABLE mustang.litter(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    litter_description VARCHAR(100) NOT NULL,
    litter FLOAT NOT NULL
);

CREATE TABLE mustang.fuel(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    fuel_description VARCHAR(100) NOT NULL
);

CREATE TABLE mustang.chassi(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    chassi_description VARCHAR(100) NOT NULL
);