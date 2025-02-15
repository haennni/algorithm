-- 코드를 입력하세요
/*
2022년 1월 카테고리 별 도서 판매량을 합산
카테고리, 총 판매량 리스트로 출력

BOOK
BOOK_SALES
SELECT category, SUM(PRICE) as total_sales
FROM BOOK
WHERE(BOOK_SLAES가 22년 1월인 BOOK_ID 추출)
GROUP BY BOOK_ID
*/
select b.category, sum(bs.sales) as total_sales
from book as b
join book_sales as bs on b.book_id = bs.book_id
where b.book_id IN (select 
                        book_id
                     from 
                        book_sales
                     where 
                        MONTH(bs.sales_date) = 1
                     AND 
                        YEAR(bs.sales_date) = 2022
                    )
group by b.category
order by b.category