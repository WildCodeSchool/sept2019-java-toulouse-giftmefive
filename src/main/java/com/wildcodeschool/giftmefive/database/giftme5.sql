# noinspection SqlNoDataSourceInspectionForFile

#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------

#------------------------------------------------------------
# Database: gift_me_five
#------------------------------------------------------------

CREATE SCHEMA `gift_me_five` DEFAULT CHARACTER SET latin1 COLLATE latin1_bin ;
use gift_me_five;

#------------------------------------------------------------
# Table: user
#------------------------------------------------------------

CREATE TABLE user(
        id_user  Int  Auto_increment  NOT NULL ,
        username Varchar (80) NOT NULL ,
        password Varchar (255) NOT NULL ,
        email    Varchar (255) NOT NULL
	,CONSTRAINT user_PK PRIMARY KEY (id_user)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: list
#------------------------------------------------------------

CREATE TABLE list(
        id_list    Int  Auto_increment  NOT NULL ,
        list_name  Varchar (255) NOT NULL ,
        description Text NOT NULL ,
        url_image  Varchar (255) ,
        url_share  Varchar (255) NOT NULL ,
        id_user    Int NOT NULL
	,CONSTRAINT list_PK PRIMARY KEY (id_list)

	,CONSTRAINT list_user_FK FOREIGN KEY (id_user) REFERENCES user(id_user)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: gift
#------------------------------------------------------------

CREATE TABLE gift(
        id_gift     Int  Auto_increment  NOT NULL ,
        gift_name   Varchar (80) NOT NULL ,
        description Text NOT NULL ,
        price       Float ,
        preference  Int NOT NULL ,
        url_image   Text ,
        url_website Text ,
        id_list     Int NOT NULL ,
        id_friend   Int
	,CONSTRAINT gift_PK PRIMARY KEY (id_gift)

	,CONSTRAINT gift_list_FK FOREIGN KEY (id_list) REFERENCES list(id_list)
	,CONSTRAINT gift_user0_FK FOREIGN KEY (id_friend) REFERENCES user(id_user)
)ENGINE=InnoDB;

