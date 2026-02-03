CREATE FUNCTION getNthHighestSalary(N INT)
RETURNS INT
DETERMINISTIC
BEGIN
  RETURN (
      SELECT salary
      FROM (
          SELECT salary,
                 DENSE_RANK() OVER (ORDER BY salary DESC) AS r
          FROM Employee
      ) AS ranked
      WHERE r = N
      LIMIT 1
  );
END;