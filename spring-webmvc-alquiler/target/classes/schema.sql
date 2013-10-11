drop table usuario;

CREATE TABLE usuario (
  idUsuario INT NOT NULL AUTO_INCREMENT ,
  nombre VARCHAR(45) NOT NULL ,
  apepat VARCHAR(45) NOT NULL ,
  apemat VARCHAR(45) NOT NULL ,
  email VARCHAR(45) NULL ,
  fechanac DATE NOT NULL ,
  clave VARCHAR(45) NOT NULL ,
  tipousuario TINYINT(1) NULL ,
  PRIMARY KEY (`idUsuario`) );
