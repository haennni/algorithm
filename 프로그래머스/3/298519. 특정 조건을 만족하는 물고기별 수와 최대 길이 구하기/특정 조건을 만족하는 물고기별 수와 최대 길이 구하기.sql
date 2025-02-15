-- FISH_INFO에서 평균 길이가 33CM 이상인 물고기들의 종류를 분류
-- 잡은수, 최대 길이, 물고기의 종류를 출력

-- GROUP BY FISH_TYPE을 통해 물고기 종류를 분류
-- 잡은수는 FISH_TYPE의 COUNT(*), 최대 길이는 MAX(LENGTH), 물고기 종류는 FISH_TYPE

SELECT COUNT(*) AS FISH_COUNT, MAX(LENGTH) AS MAX_LENGTH, FISH_TYPE
FROM FISH_INFO
GROUP BY FISH_TYPE
HAVING AVG(CASE WHEN LENGTH <= 10 THEN 10 WHEN LENGTH IS NULL THEN 0 ELSE LENGTH END) >= 33
ORDER BY FISH_TYPE
