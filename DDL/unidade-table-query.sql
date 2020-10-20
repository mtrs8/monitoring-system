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

INSERT INTO unidade (x, y, tipo, video, termometro, co2, ch4)
VALUES (5.3, 6.7, 1, false, true, false, true), (7.9, 8.7, 1, true, false, false, true),
(4.9, 4.7, 0, false, false, false, false), (9.9, 9.7, 1, true, true, true, false), 
(10.5, 10.0, 1, false, false, true, true), (11.3, 13.5, 1, true, false, false, false);

SELECT * FROM unidade