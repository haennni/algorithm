-- 1. 부서별 평균 연봉을 조회 -> 부서ID, 영문 부서명, 평균 연봉을 조회하라
-- 2. 서브 쿼리로 GROUP BY를 통해 연봉을 그룹화하고, VAG하자.

SELECT HD.DEPT_ID, HD.DEPT_NAME_EN, ROUND(AVG(HE.SAL)) as AVG_SAL
FROM HR_DEPARTMENT as HD
JOIN HR_EMPLOYEES as HE ON HD.DEPT_ID = HE.DEPT_ID
GROUP BY DEPT_ID
ORDER BY AVG_SAL DESC;