-- select 기본 연습

-- 예제1: departments 테이블의 모든 데이터를 출력
select * from departments;

-- 프로젝션(projection)
-- 예제2: employees 테이블에서 직원 이름, 성별, 입사일을 출력
select first_name as '이름',
       gender as '성', 
       hire_date as '입사일'
from employees;

-- distinct
-- 예제3: titles 테이블에서 모든 직급을 출력
select title from titles limit 0,1000;
-- 0부터 1000개
-- 예제4: titles 테이블에서 직급은 어떤 것들이 있는지 직급이름을 한 번씩만 출력
select distinct title from titles;

-- where 절
-- 예제5: 비교연산자: employees 테이블에서 1991년 이전에 입사한 직원의 이름, 
--                성별, 입사일을 출력
SELECT 
    first_name, gender, hire_date
FROM
    employees
WHERE
    hire_date < '1991-01-01'
ORDER BY hire_date DESC;

-- 예제6: 논리연산자: employees 테이블에서 1989년 이전에 입사한 여직원의 이름, 
--                성별, 입사일을 출력
SELECT 
    first_name, gender, hire_date
FROM
    employees
WHERE
    hire_date < '1989-01-01' and gender like 'F'
ORDER BY hire_date DESC;

-- 예제7: in 연산자: dept_emp 테이블에서 부서 번호가 d005이거나 d009에 속한, 
--                사원의 사번, 부서 번호를 출력
SELECT 
    emp_no, dept_no
FROM
    dept_emp
WHERE
    dept_no in ('d005', 'd009');
    
-- 예제8: like 연산자: employees 테이블에서 1989년에 입사한 직원들의 이름, 입사일을 출력
SELECT 
    first_name, hire_date
FROM
    employees
WHERE
    hire_date like '1989%';
    
SELECT 
    first_name, hire_date
FROM
    employees
WHERE
    hire_date between '1989-01-01' and '1989-12-31';
    
SELECT 
    first_name, hire_date
FROM
    employees
WHERE
    '1989-01-01' <= hire_date and hire_date <= '1989-12-31';

-- order by
-- 예제9: employees 테이블에서 직원 이름, 성별, 입사일을 입사일 빠른 순으로 출력
SELECT 
    CONCAT(first_name, ' ', last_name) as 'full name', gender, hire_date
FROM
    employees
ORDER BY hire_date ASC;

-- 예제10: salaries 테이블에서 2001년 월급이 가장 높은 순으로 사번, 월급을 출력
SELECT 
    emp_no, salary
FROM
    salaries
WHERE
    to_date LIKE '2001%'
        OR from_date LIKE '2001%'
order by salary desc;

-- 예제 11: 남자 직원의 이름, 성별, 입사일을 선임순으로 출력
SELECT 
    CONCAT(first_name, ' ', last_name) as 'full name', gender, hire_date
FROM
    employees
where gender = 'M'
ORDER BY hire_date asc;

-- 예제 11: 직원들의 사번, 월급을 사번순으로 출력하되 같은 직원의 월급이 높은 순도 반영
SELECT 
    emp_no, salary
FROM
    salaries
ORDER BY emp_no asc, salary desc;