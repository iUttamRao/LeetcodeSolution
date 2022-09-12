# Write your MySQL query statement below
select u.name,coalesce(sum(r.distance),0) as travelled_distance
from users u left join rides r 
on u.id=r.user_id 
group by u.id
order by travelled_distance desc,u.name;

# SELECT u.name,
# (SELECT IFNULL(SUM(r.distance), 0)
# FROM rides AS r
# WHERE u.id = r.user_id) AS travelled_distance
# FROM users AS u
# GROUP BY u.name
# ORDER BY travelled_distance DESC, u.name;