--#1 select all records from the customer's table
SELECT * FROM northwind.customers;

--#2 select distinct countries from the customer table
 SELECT DISTINCT country_region
FROM customers;

 --#3 get all records from customertable where customer last name starts with 'b'
select * from customers
 where last_name like 'B%';
 --#4 get the first 100 records of order table
 SELECT * FROM orders  LIMIT 100;
 
 --#5 get all customers that live in postal code 1010,3012,12209 and 05023
 select * from customers
where zip_postal_code in ('1010','3012','12209','05023');

--#6 get all orders with ship region is not equal to null
SELECT * FROM orders
WHERE ship_country_region NOT LIKE 'null';

--#7 get all customers ordered by the country then by city
SELECT * FROM Customers
ORDER BY Country_region,city; 

--#8 add a new customer to customer table
select* from customers;
INSERT INTO customers (id,company,last_name,first_name,job_title,city,state_province)
VALUES (120,'company q','sasa','manav','purchasing manager','troy','mi');

--#9 update postal code where city is portland
UPDATE orders
SET ship_zip_postal_code='97201'
WHERE ship_city='portland';
--#10 delete all orders from order details that have quantity 1
DELETE FROM order_details
WHERE quantity='1';

--#11 calculate avg,min,nax of quantity at order table
SELECT AVG(quantity),MIN(quantity),MAX(quantity) FROM order_details;

--#12 calculate avg,min,nax of quantity at order table grouped by orderid

SELECT AVG(quantity),MIN(quantity),MAX(quantity)  FROM order_details group by order_id;


--#13 find customer id that placed order id 65
SELECT customer_id
FROM orders
WHERE  id=65;

--#14 inner join returns 48 records
SELECT customers.first_name,customers.last_name,orders.ship_name
FROM orders
inner JOIN customers
ON orders.customer_id=customers.id;

--#14 left join (returns 48 records)
SELECT orders.ship_name,orders.id,customers.first_name,customers.last_name

FROM orders
left JOIN customers
ON orders.customer_id=customers.id;

--#14 right join(returns 63 records)
SELECT orders.ship_name, customers.first_name,customers.last_name
FROM orders
right JOIN customers
ON orders.customer_id=customers.id; 
--#15 get employee firstname for all employess whoes note is null

select  first_name from employees
where notes is null;

--#16 get shipcity for all orders for which customer firstname is fransisco
Select orders.ship_city 
From Orders  inner join customers 
On orders.customer_id =customers.id 
Where  customers.first_name ='Francisco';






