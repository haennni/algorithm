/*음식 종류별
즐겨찾기 수가 가장 많은 
식당의 음식 종류, id, 식당이름, 즐겨찾기수
max(favorites) as favorites

group by food type
*/
select FOOD_TYPE, REST_ID, REST_NAME, favorites as FAVORITES
from rest_info as ri
WHERE favorites = (
    select max(favorites)
    from rest_info
    where food_type = ri.food_type
)
group by food_type
order by food_type desc