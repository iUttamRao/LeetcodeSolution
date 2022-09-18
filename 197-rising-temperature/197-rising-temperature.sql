# Write your MySQL query statement below
select w.id from Weather w, Weather r
WHERE DATEDIFF(w.recordDate, r.recordDate) = 1 and w.temperature > r.temperature;