-- 코드를 작성해주세요

select
    e.ID, 
    case 
    when e.SIZE_OF_COLONY < 101 then 'LOW'
    when e.SIZE_OF_COLONY between 101 AND 999 then 'MEDIUM'
    else 'HIGH'
    end as SIZE
from ECOLI_DATA as e
