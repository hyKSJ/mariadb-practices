--
-- ddl
--

drop table member;
create table member (
	no int not null auto_increment,
    email varchar(200) not null,
    password varchar(64) not null,
    name varchar(100) not null,
    department varchar(100),
    primary key(no)
);
desc member;

alter table member add column juminbunho char(13) not null;
desc member;

alter table member drop column juminbunho;
desc member;

alter table member add column juminbunho char(13) not null after email;
desc member;

alter table member change column department dept varchar(200) not null;
desc member;

alter table member add self_intro text;
desc member;

alter table member drop column juminbunho;
desc member;

--
-- dml
--

-- insert
insert 
	into member (no, email, password, name, dept, self_intro)
    values (null, 'tkdwns9494@gmail.com', password('1234'), '김상준', '개발팀', null);
    select * from member;
    
insert 
	into member (email, password, name, dept)
    values ('tkdwns9494@gmail.com', password('1234'), '김상준', '개발팀');
    select * from member;

insert 
	into member (email, name, dept, password)
    values ('tkdwns9494@gmail.com', '김상준', '개발팀', password('1234'));
    select * from member;
    
-- update
update member
	set email='ksj@gmail.com', name='준'
    where no = 4;
    
select * from member;

-- delete
delete 
	from member 
	where no = 4;
    
select * from member;


-- transaction begin
set autocommit = 0;
select @@autocommit from dual;

insert 
	into member (email, password, name, dept)
    values ('tkdwns9494@gmail.com', password('1234'), '김상준', '개발팀');
    select * from member;

select no,email,dept  from member;

commit;

select no,email,dept  from member;