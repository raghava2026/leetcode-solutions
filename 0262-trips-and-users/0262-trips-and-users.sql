# Write your MySQL query statement below
select  t.request_at  Day, round(avg(case when t.status!='completed' then 1 else 0 end),2) as `Cancellation Rate` from Trips t join users u on t.client_id =u.users_id and u.banned='no' join users d on t.driver_id=d.users_id and d.banned='no' 
where t.request_at between '2013-10-01' and '2013-10-03'
group by t.request_at ;
