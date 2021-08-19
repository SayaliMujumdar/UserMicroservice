 create database stock_recommender_system;
 use stock_recommender_system;
 create table users(
 userId int ,
 userName varchar(20) primary key,
 password varchar(60),
 email varchar(20),
 identification_no int
);
insert into users values(1,"sayali","sayali");
insert into users value(2,"One","One");
insert into users value(3,"Two","Two");
insert into users value(4,"Three","Three");

create table nifty_stocks
(
stock_symbol varchar(20) primary key,
marketCap int
);

create table user_saved_stock
(
    username varchar(20),
    stock_symbol varchar(20),
    quantity int,
    currentPrice int,
	pricetime timestamp, 
    foreign key(username) references users(userName),
    foreign key(stock_symbol) references nifty_stocks(stock_symbol),
    primary key(username,stock_symbol)
);
insert into nifty_stocks values("AAPL",12000);
insert into nifty_stocks values("BSNL",25000);
insert into nifty_stocks values("INFOSYS",4000);
insert into nifty_stocks values("INFY.NS",3000);
insert into nifty_stocks values("ABC",800);
insert into user_saved_stock values("sayali","AAPL",1,1000,now());
select * from user_saved_stock;
insert into user_saved_stock values("sayali","BSNL",2,900,sysdate());
drop table users;
drop table user_saved_stock;