# Write your MySQL query statement below
select v.customer_id,count(v.visit_id) as count_no_trans 
from visits v natural left join transactions t where t.visit_id is null 
group by v.customer_id;