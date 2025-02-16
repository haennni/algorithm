-- 리뷰를 가장 많이 작성한 회원의 리뷰들을 조회
SELECT MP.MEMBER_NAME, RR.REVIEW_TEXT, DATE_FORMAT(RR.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE AS MP
JOIN REST_REVIEW AS RR ON MP.MEMBER_ID = RR.MEMBER_ID
WHERE RR.MEMBER_ID = (
                    /*가장 리뷰를 많이 작성한 유저 찾기*/
                    SELECT MEMBER_ID
                    FROM REST_REVIEW
                    GROUP BY MEMBER_ID
                    /* 해당 멤버가 작성한 댓글 갯수가 */
                    HAVING COUNT(*) =  (
                    /*가장 큰 값이라면 출력*/
                        SELECT MAX(REVIEW_AMOUNT)
                        FROM ( SELECT MEMBER_ID,
                                      COUNT(*) AS REVIEW_AMOUNT
                                      FROM REST_REVIEW
                                      GROUP BY MEMBER_ID) 
                                AS TEMP)
                    ORDER BY COUNT(*) DESC
                    LIMIT 1
) ORDER BY RR.REVIEW_DATE, RR.REVIEW_TEXT