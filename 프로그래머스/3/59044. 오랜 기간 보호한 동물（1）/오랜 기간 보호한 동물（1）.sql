-- 입양을 못 간 동물 중 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회
-- O의 ANIMAL_ID가 비어져있고,
-- SELECT문으로 ORDER BY를 DATETIME DESC;로 배치한 다음에
-- LIMIT로 제한을 3걸어주자

SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS AS I
WHERE I.ANIMAL_ID IN (SELECT I.ANIMAL_ID
                     FROM ANIMAL_INS AS I
                     LEFT JOIN ANIMAL_OUTS AS O ON I.ANIMAL_ID = O.ANIMAL_ID
                     WHERE O.ANIMAL_ID IS NULL)
ORDER BY DATETIME 
LIMIT 3