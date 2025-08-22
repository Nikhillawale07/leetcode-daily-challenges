# Write your MySQL query statement below
select MAx(salary) AS SecondHighestSalary from Employee 
WHERE salary<(select MAX(salary) from Employee);