-- 코드를 입력하세요
SELECT FW.WAREHOUSE_ID, FW.WAREHOUSE_NAME, FW.ADDRESS, (CASE WHEN FW.FREEZER_YN IS NULL THEN 'N' ELSE FW.FREEZER_YN END) AS FREEZER
FROM FOOD_WAREHOUSE AS FW
WHERE FW.ADDRESS LIKE '경기%'
ORDER BY FW.WAREHOUSE_ID