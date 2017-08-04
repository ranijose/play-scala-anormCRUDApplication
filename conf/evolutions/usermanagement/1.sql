# --- First database schema

# --- !Ups

CREATE TABLE User (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    fullname varchar(255) NOT NULL,
    role_id int(5) NOT NULL,
    FOREIGN KEY (role_id) REFERENCES Role(id),
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE if exists User;


# --- !Ups


CREATE TABLE Role (
  id int(5) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  PRIMARY KEY(id)
);


# --- !Downs

DROP TABLE if exists Role;