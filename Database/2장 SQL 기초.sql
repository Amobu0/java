#날짜 : 24/01/02
#이름 : 송상도
#내용 : 2장 SQL 기초

#실습 2-1
create table `user1` (
	`uid` varchar(10),
    `name` varchar(10),
    `hp` char(13),
    `age` int
    );

#실습 2-2
insert into `user1` values ('A101', '김유신', '010-1234-1111', 25);
insert into `user1` values ('A102', '김춘추', '010-1234-2222', 23);
insert into `user1` values ('A103', '장보고', '010-1234-3333', 32);
insert into `user1` (`uid`, `name`, `age`) values ('A104', '김유신', 25);
insert into `user1` set `uid`= 'A105', `name`='이순신', `hp`='010-1234-5555';

#실습 2-3
select * from `user1`;
select * from `user1` where `uid` = 'A101';
select * from `user1` where `name` = '김춘추';
select * from `user1` where `age` < 30;
select * from `user1` where `age` >= 30;
select `uid`, `name` from `user1`;

#실습 2-4
update `user1` set `hp` = '010-1234-4444' where `uid` = 'A104';
update `user1` set `age` = 51 where `uid` = 'A105';
update `user1` set `hp` = '010-1234-1001', `age` = 27 where `uid` = 'A101';

#실습 2-5
delete from `user1` where `uid` = 'A101';
delete from `user1` where `uid` = 'A102' and `age`= 25;
delete from `user1` where `age`>= 30;

#실습 2-6
alter table `user1` add `gender` tinyint;
alter table `user1` add `birth` char(10) after `name`;
alter table `user1` modify `gender` char(1);
alter table `user1` modify `age` tinyint;
alter table `user1` drop `gender`;

#실습 2-7
create table `user1copy` like `user1`;
insert into `user1copy` select * from `user1`;

#실습 2-8
create table `TblUser` (
	`user_id` varchar(10),
    `user_name` varchar(10),
    `user_hp` varchar(13),
    `user_age` int,
    `user_addr` varchar(20)
    );
    
insert into `TblUser` set `user_id` = 'p101', 
						  `user_name` = '김유신',
                          `user_hp` = '010-1234-1001',
                          `user_age` = 25, `user_addr` = '경남 김해시';
                          
insert into `TblUser` set `user_id` = 'p102',
						  `user_name` = '김춘추',
                          `user_hp` = '010-1234-1002',
                          `user_age` = 31,
                          `user_addr` = '경남 김해시';
                          
insert into `TblUser` set `user_id` = 'p103',
						  `user_name` = '장보고',
                          `user_age` = 31,
                          `user_addr` = '전남 완도군';
                          
insert into `TblUser` set `user_id` = 'p104',
						  `user_name` = '강감찬',
                          `user_addr` = '서울시 중구';
                          
insert into `TblUser` set `user_id` = 'p105',
						  `user_name` = '이순신'
                          , `user_hp` = '010-1234-1005',
                          `user_age` = 50;
			
#실습 2-9
create table `TblProduct` (
	`prod_no` int,
    `prod_name` varchar(20),
    `prod_price` int,
    `prod_stock` int,
    `prod_company` varchar(40),
    `prod_date` date
    );
    
insert into `TblProduct` values (1001, '냉장고', 800000, 25, 'LG전자', '2022-01-06');
insert into `TblProduct` values (1002, '노트북', 1200000, 120, '삼성전자', '2022-01-07');
insert into `TblProduct` values (1003, '모니터', 350000, 35, 'LG전자', '2023-01-13');
insert into `TblProduct` values (1004, '세탁기', 1000000, 80, '삼성전자', '2021-01-01');
insert into `TblProduct` values (1005, '컴퓨터', 1500000, 20, '삼성전자', '2023-10-01');
insert into `TblProduct` values (1006, '휴대폰', 950000, 102, null, null);
