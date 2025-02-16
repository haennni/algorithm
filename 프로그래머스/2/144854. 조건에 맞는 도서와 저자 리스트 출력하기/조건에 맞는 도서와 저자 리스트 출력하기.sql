-- '경제' 카테고리 도서 ID(BOOK_ID), 저자명(AUTHOR_NAME), 출판일(PUBLISHED_DATE) 리스트 출력


SELECT B.BOOK_ID, A.AUTHOR_NAME, DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK AS B
LEFT JOIN AUTHOR AS A ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE CATEGORY LIKE '경제'
ORDER BY PUBLISHED_DATE 
