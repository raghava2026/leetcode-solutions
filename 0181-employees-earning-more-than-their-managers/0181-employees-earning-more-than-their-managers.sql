# Write your MySQL query statement below
select e1.name Employee from employee e1  where e1.salary >(select e2.salary from employee e2  where e2.id=e1.managerId);