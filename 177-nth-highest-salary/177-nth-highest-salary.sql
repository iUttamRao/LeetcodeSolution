CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE var INT;
SET var = N-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary from employee order by salary desc limit var,1
  );
END