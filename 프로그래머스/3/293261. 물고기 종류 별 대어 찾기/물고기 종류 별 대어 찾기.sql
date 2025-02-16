-- FISH_INFO 잡은 물고기 종류(물고기의 ID, 물고기의 종류(숫자), 잡은 물고기의 길이(cm), 물고기를 잡은 날짜)
-- FISH_NAME_INFO 물고기의 이름에 대한 정보 (고기의 종류(숫자), 물고기의 이름(문자))

-- 물고기의 '종류 별로' 가장 큰 물고기의 ID, 물고기 이름, 길이를 출력

SELECT FI.ID, FN.FISH_NAME, FI.LENGTH
FROM FISH_INFO AS FI
JOIN FISH_NAME_INFO AS FN ON FI.FISH_TYPE = FN.FISH_TYPE
WHERE (FI.FISH_TYPE, FI.LENGTH) IN (SELECT FI.FISH_TYPE, MAX(FI.LENGTH)
                 FROM FISH_INFO AS FI
                 GROUP BY FI.FISH_TYPE)