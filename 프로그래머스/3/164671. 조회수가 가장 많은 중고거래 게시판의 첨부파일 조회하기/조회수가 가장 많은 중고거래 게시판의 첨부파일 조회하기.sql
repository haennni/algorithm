/* 가장 조회수가 높은 게시물에 대한 첨부파일 경로를 조회하라. FILE ID 정렬 DESC */

SELECT CONCAT('/home/grep/src/',B.BOARD_ID,'/',F.FILE_ID,F.FILE_NAME,F.FILE_EXT) FILE_PATH
FROM USED_GOODS_BOARD B INNER JOIN USED_GOODS_FILE F
ON B.BOARD_ID = F.BOARD_ID
WHERE B.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY F.FILE_ID DESC