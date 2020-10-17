CREATE TABLE Unidade (
    id int auto_increment not null,
    x double not null,
    y double not null,
    tipo int not null,
    video boolean,
    termometro boolean,
    co2 boolean,
    ch4 boolean,
    primary key(id)
);

INSERT INTO unidade (x, y, tipo, video, termometro, co2, ch4)
VALUES (1.3, 1.7, 0, true, true, false, true), (1.9, 2.7, 0, true, false, true, true),
(1.9, 2.7, 0, true, true, true, true), (1.9, 2.7, 1, true, false, true, false), 
(3.5, 3.0, 0, true, false, true, true);

SELECT * FROM unidade