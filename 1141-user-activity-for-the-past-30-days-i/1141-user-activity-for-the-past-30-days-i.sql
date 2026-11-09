# Write your MySQL query statement below
select 
ACTIVITY_DATE AS day , count(distinct(user_id)) as active_users from Activity where '2019-06-28'<=activity_date and '2019-07-27'>=activity_date  group by activity_date;