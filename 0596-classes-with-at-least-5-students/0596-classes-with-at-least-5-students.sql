# Write your MySQL query statement below
SELECT class FROM Courses c 
GROUP BY class
HAVING COUNT(student) >= 5;