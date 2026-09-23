CREATE DATABASE pokedex_db;
USE pokedex_db;


CREATE TABLE Usuarios (
	id INT PRIMARY KEY NOT NULL,
    nombre_completo VARCHAR(100),
    pais VARCHAR(100),
    ciudad VARCHAR(100),
    tipo_documento INT,
    numero_identificacion INT,
    fecha_nacimiento DATE,
    numero_celular INT,
    datos_personales BOOLEAN,
    pass VARCHAR,
    fech_registro DATE
);

CREATE TABLE Mochila (
	id INT AUTO_INCREMENT PRIMARY KEY,
    pokemon_id iNT,
    nombre VARCHAR(100),
	imagen VARCHAR(200),
    tipo VARCHAR(50),
    experiencia_base INT,
    es_favorito BOOLEAN  DEFAULT FALSE,
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(id)
);

