/*고양이와 개가 각각 몇 마리인지 조회*/
select ANIMAL_TYPE, COUNT(*) as count
from ANIMAL_INS
group by ANIMAL_TYPE
order by (case when ANIMAL_TYPE = 'Cat' then 1 else 2 end)