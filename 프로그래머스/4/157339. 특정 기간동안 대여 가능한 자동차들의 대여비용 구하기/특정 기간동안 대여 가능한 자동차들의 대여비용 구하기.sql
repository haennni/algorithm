-- CAR_RENTAL_COMPANY_CAR 대여중인 자동차 정보 (자동차 ID, 자동차 종류, 일일 대여 요금(원), 자동차 옵션 리스트)
-- CAR_RENTAL_COMPANY_RENTAL_HISTORY 자동차 대여 기록 정보 (자동차 대여 기록 ID, 자동차 ID, 대여 시작일, 대여 종료일)
-- CAR_RENTAL_COMPANY_DISCOUNT_PLAN 자동차 종류 별 대여 기간 종류 별 할인 정책(요금 할인 정책 ID, 자동차 종류, 대여 기간 종류, 할인율(%))

-- 자동차 종류가 '세단' 또는'SUV'인 자동차
-- 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능
-- 30일간의 대여 금액이 50만원 이상 200만원 미만.  대여 금액(컬럼명: FEE) 
select 
    C.car_id, 
    C.car_type, 
    cast(C.daily_fee*30*(1-0.01*D.discount_rate) as unsigned) as FEE 
from car_rental_company_car C 
left join (select car_id, min(start_date) start_date, max(end_date) end_date from car_rental_company_rental_history group by car_id) H on 
    C.car_id = H.car_id 
inner join CAR_RENTAL_COMPANY_DISCOUNT_PLAN D on 
    D.car_type = C.car_type and 
    D.duration_type like '30%' and 
    C.car_type in ('SUV', '세단') and 
    ('2022-11-01' > H.end_date or '2022-11-30' < H.start_date)
having FEE between 500000 and 2000000
order by FEE desc, C.car_type asc, C.car_id desc