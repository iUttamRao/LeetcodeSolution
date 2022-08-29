# Write your MySQL query statement below
select salesperson.name from salesperson
where salesperson.sales_id not in 
(select orders.sales_id from orders left join company on orders.com_id=company.com_id where company.name="RED");