#날짜 : 24/01/02
#이름 : 송상도
#내용 : 1장 데이터에비스 생성과 사용자 관리

#실습 1-1
create	database `StudyDB`;
drop database `StudyDB`;

#실습 1-2
create user 'amobu'@'%' identified by '1234';
grant all privileges on `studydb`.*to 'amobu'@'%';
flush privileges;

#실습 1-3
alter user 'amobu'@'%' identified by 'abc1234';
drop user 'amobu'@'%';
flush privileges;