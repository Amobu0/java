# 날짜 : 24/01/05
# 이름 : 송상도
# 내용 : SQL 연습문제1

#실습 1-1
create database `shop`;
create user 'shop'@'%' identified by '1234';
grant all privileges on shop.*to 'shop'@'%';
flush privileges; 

#실습 1-2
create table `Customer` (
	`custId`varchar(10) primary key not null,
    `name`	varchar(10) not null,
	`hp`	varchar(13),
    `addr`	varchar(100),
    `rdate` date
    );

create table `Product` (
	`prodNo`	int primary key not null,
    `prodName`	varchar(10) not null,
    `stock`		int default 0 not null ,
    `price`		int,
    `company`	varchar(20) not null
);

create table `Order` (
	`orderNo`		int primary key auto_increment not null,
    `orderId`		varchar(10) not null,
    `orderProduct`	int not null,
    `orderCount`	int default 1 not null,
    `orderDate`		timestamp not null
);

#실습 1-3
insert into `customer` values ('c101', '김유신', '010-1234-1001', '김해시 봉황동', now());
insert into `customer` values ('c102', '김춘추', '010-1234-1001', '경주시 보문동', now());
insert into `customer` values ('c103', '장보고', '010-1234-1001', '완도군 청산면', now());
insert into `customer` values ('c104', '강감찬', '010-1234-1001', '서울시 마포구', now());
insert into `customer` (`custID`, `name`, `rdate`)
values ('c105', '이성계', now());

insert into `customer` values ('c106', '정철', '010-1234-1006', '경기도 용인시', now());
insert into `customer` (`custID`, `name`, `rdate`)
values ('c107', '허준', now());
insert into `customer` values ('c108', '이순신', '010-1234-1008', '서울시 영등포구', now());
insert into `customer` values ('c109', '송상현', '010-1234-1009', '부산시 동래구', now());
insert into `customer` values ('c110', '정약용', '010-1234-1010', '경기도 광주시', now());

insert into `product` values (1, '새우깡', 5000, 1500, '농심');
insert into `product` values (2, '초코파이', 2500, 2500, '오리온');
insert into `product` values (3, '포카칩', 3600, 1700, '오리온');
insert into `product` values (4, '양파링', 1250, 1800, '농심');
insert into `product` (`prodno`, `prodname`, `stock`, `company`) values (5, '죠리퐁', 2200, '크라운');
insert into `product` values (6, '마카렛트', 3500, 3500, '롯데');
insert into `product` values (7, '뿌셔뿌셔', 1650, 1200, '오뚜기');

insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c102', 3, 2, now());
insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c101', 4, 1, now());
insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c108', 1, 1, now());
insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c109', 6, 5, now());
insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c102', 2, 1, now());

insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c101', 7, 3, now());
insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c110', 1, 2, now());
insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c104', 2, 4, now());
insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c102', 1, 3, now());
insert into `order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) values ('c107', 6, 2, now());

#실습 1-4
select * from `customer`;

#실습 1-5
select `custid`, `name`, `hp` from `customer`;

#실습 1-6
select * from `product`;

#실습 1-7
select `company` from `product`;

#실습 1-8
select distinct `company` from `product`; 

#실습 1-9
select `prodname`, `price` from `product`;

#실습 1-10
select `prodname`, `price` + 500 as `조정단가`from `product`;

#실습 1-11
select `prodname`, `stock`, `price` from `product` where `company` = '오리온';

#실습 1-12
select `orderproduct`, `ordercount`, `orderdate` from `order` where `orderid` = 'c102';

#실습 1-13
select `orderproduct`, `ordercount`, `orderdate` from `order` where `orderid` = 'c102' and `ordercount` >= 2;

#실습 1-14
select * from `product` where `price` >= 1000 and `price` <= 2000;
select * from `product` where `price` between 1000 and  2000;

#실습 1-15
select `custid`, `name`, `hp`, `addr` from `customer` where `name` like '김%';

#실습 1-16
select `custid`, `name`, `hp`, `addr` from `customer` where `name` like '__';

#실습 1-17
select * from `customer` where `hp` is null;

#실습 1-18
select * from `customer` where `addr` is not null;

#실습 1-19
select * from `customer` order by `rdate` desc;

#실습 1-20
select * from `order` where `ordercount` >= 3 order by `ordercount` desc, `orderProduct` asc;

#실습 1-21
select avg(`price`) from `product`;

#실습 1-22
select sum(`stock`) as `재고량 합계` from `product` where `company` = '농심';

#실습 1-23
select count(*) as '고객수' from `customer`;

#실습 1-24productproduct
select count(distinct `company`) as '제조업체 수' from `product`;

#실습 1-25
select `orderproduct` as `주문 상품번호`, sum(`ordercount`) as `총 주문수량` from `order` 
group by `orderproduct` order by `주문 상품번호`;

#실습 1-26
select `company` as `제조업체`, count(*) as `제품수`, max(`price`) as `최고가` from `product`
group by `company` order by `company`;

#실습 1-27
select `company` as `제조업체`, count(*) as `제품수`, max(`price`) as `최고가` from `product`
group by `company` having count(`제조업체`) >= 2;

#실습 1-28
select `orderproduct`, `orderid`, sum(`ordercount`) as `총 주문수량` from `order`
group by `orderproduct`, `orderid`
order by `orderproduct`;

#실습 1-29
select a.`orderid`, b.`prodname` from `order` as a
join `product` as b
on a.`orderproduct` = b.`prodno`
where `orderid` = 'c102';

#실습 1-30
select `orderid`, `name`, `prodname`, `orderdate` from `order` as a
join `customer` as b 
on a.`orderid` = b.`custid`
join `product` as c 
on a.`orderproduct` = c.`prodno`
WHERE left(`orderDate`, 10) = '2022-07-03';