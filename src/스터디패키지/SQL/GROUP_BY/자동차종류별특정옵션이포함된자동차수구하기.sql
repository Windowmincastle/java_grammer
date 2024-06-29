-- CAR_RENTAL_COMPANY_CAR
-- CAR_ID , CAR_TYPE, DAILY_FEE , OPTIONS

SELECT CAR_TYPE, COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%통풍시트%' OR
      OPTIONS LIKE '%열선시트%' OR
      OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE;

-- LIKE 문자열 검색 양쪽 % %으로 감싸는것 주의

