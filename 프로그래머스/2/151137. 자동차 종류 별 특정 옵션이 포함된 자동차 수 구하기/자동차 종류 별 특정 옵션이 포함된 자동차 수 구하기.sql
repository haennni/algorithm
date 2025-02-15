-- 코드를 입력하세요
SELECT CAR_TYPE, COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%통풍시트%'
    OR OPTIONS LIKE '%열선시트%'
    OR OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE

/*
where -> OPTIONS 통풍시트, 열선시트, 가죽시트 중 하나 이상의 옵션이 포함 되어있나 확인

CAR_ID, OPTION 
HAVING OPTION에 '통풍시트', '열선시트', '가죽시트'가 1개 이상이면
    자동차 종류 별로 몇 대 인가?

*/