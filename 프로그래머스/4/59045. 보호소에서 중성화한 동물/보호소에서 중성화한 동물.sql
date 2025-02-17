-- 중성화 수술을 거친 동물 정보를 찾아보자
-- 들어올 땐 중성화 되지 않았지만 나갈 땐 중성화 된 동물의
-- 아이디, 생물 종, 이름을 아이디 순으로 조회하는 SQL문을 작성하자.

-- 
SELECT OA.ANIMAL_ID, OA.ANIMAL_TYPE, OA.NAME
FROM ANIMAL_OUTS AS OA
WHERE OA.ANIMAL_ID IN (
                        SELECT IA.ANIMAL_ID
                        FROM ANIMAL_INS AS IA
                        JOIN ANIMAL_OUTS AS OIA ON IA.ANIMAL_ID = OIA.ANIMAL_ID
                        WHERE IA.SEX_UPON_INTAKE LIKE "Intact%"
                        AND OIA.SEX_UPON_OUTCOME NOT LIKE "Intact%"
)