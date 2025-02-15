-- 1. 2022년 5월에 예약한 환자 수를 진료과코드 별로 조회하는 sql문을 작성
-- 2. 2022년 5월에 예약한 환자 추출
-- WHERE 진료예약일시(APNT_YMD) = BETWEEN '2022-05-01' and '2022-05-31' 
-- 3. 진료과 코드 별로 그룹화 GROUP BY mcdp_cd
-- 4. HAVING (CASE WHEN APNT_CNCL_YN = 'Y' THEN 0 ELSE 'N' THEN 1 END) >= 1



SELECT MCDP_CD AS 진료과코드, COUNT(PT_NO) AS 5월예약건수
FROM APPOINTMENT
WHERE MONTH(APNT_YMD) = 5 AND YEAR(APNT_YMD) = 2022
GROUP BY MCDP_CD
ORDER BY 2, MCDP_CD