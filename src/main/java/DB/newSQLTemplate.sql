/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  HOANG SON
 * Created: Oct 4, 2022
 */create database demo_hibernate
go

use demo_hibernate
go

create table category
(
	id int identity not null primary key,
	category_name varchar(50),
);

create table product
(
	id int identity not null primary key,
	product_name varchar(50) not null,
	price money not null,
	quantity int not null,
	category_id int not null FOREIGN KEY(id) REFERENCES category(id)
);

