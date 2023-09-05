SELECT DISTINCT product_code
,SUM(price*sales_amount) OVER(PARTITION BY product_code ORDER BY product_code)
FROM PRODUCT p JOIN OFFLINE_SALE o
ON p.product_id = o.product_id
ORDER BY SUM(price*sales_amount) OVER(PARTITION BY product_code ORDER BY product_code) desc;