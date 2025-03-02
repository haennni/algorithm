SELECT HISTORY_ID, ROUND(CC.DAILY_FEE*(DATEDIFF(CRH.END_DATE,CRH.START_DATE)+1)*(100-IFNULL(CDP.DISCOUNT_RATE,0))/100) FEE
FROM CAR_RENTAL_COMPANY_CAR CC
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY CRH
    ON CC.CAR_ID = CRH.CAR_ID
LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN CDP
    ON CC.CAR_TYPE = CDP.CAR_TYPE
    AND (
        (DATEDIFF(CRH.END_DATE,CRH.START_DATE) + 1 >= 90 AND CDP.DURATION_TYPE = '90일 이상')
        OR ((DATEDIFF(CRH.END_DATE,CRH.START_DATE) + 1 BETWEEN 30 AND 89) AND CDP.DURATION_TYPE = '30일 이상')
        OR ((DATEDIFF(CRH.END_DATE,CRH.START_DATE) + 1 BETWEEN 7 AND 29) AND CDP.DURATION_TYPE = '7일 이상')
    )
WHERE CC.CAR_TYPE='트럭'
ORDER BY FEE DESC, HISTORY_ID DESC