-- HR_DEPARTMENT 회사의 부서 정보 테이블 (부서 ID, 국문 부서명, 영문 부서명, 부서 위치)
-- HR_EMPLOYEES 회사의 사원 정보 (사번, 성명, 부서 ID, 직책, 이메일, 전화번호, 입사일, 연봉)
-- HR_GRADE 2022년 사원 평가 정보 (각각 사번, 연도, 반기, 평가 점수)
-- 사원별 평가 점수의 평균을 통해서 구했어야했다.

-- 평가 점수별 등급과 등급에 따른 성과금 정보가 아래와 같을 때 사번, 성명, 평가 등급, 성과금을 조회
WITH EX_GRADE AS (
    SELECT 
        G.EMP_NO, 
        (CASE 
         WHEN AVG(G.SCORE) >= 96 THEN 'S'
         WHEN AVG(G.SCORE) >= 90 THEN 'A'
         WHEN AVG(G.SCORE) >= 80 THEN 'B'
         ELSE 'C'
         END
        ) 
    AS GRADE
    FROM 
        HR_GRADE AS G
    GROUP BY G.EMP_NO
    
)

SELECT 
    HE.EMP_NO, 
    HE.EMP_NAME, 
    EG.GRADE,
    (CASE 
        WHEN
            EG.GRADE LIKE 'S'
        THEN
            HE.SAL * 0.20
        WHEN
            EG.GRADE LIKE 'A'
        THEN
            HE.SAL * 0.15
        WHEN
            EG.GRADE LIKE 'B'
        THEN
            HE.SAL * 0.10
        ELSE 
             0
     END
    ) AS BONUS
                                         
FROM HR_EMPLOYEES AS HE
LEFT JOIN EX_GRADE AS EG ON HE.EMP_NO = EG.EMP_NO
ORDER BY HE.EMP_NO