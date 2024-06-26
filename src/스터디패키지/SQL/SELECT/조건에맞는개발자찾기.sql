
-- 개발자의 iD, 이메일, 이름-FIRST_NAME , 성-LAST_NAME 결과는 id를 기준으로 오름차순 정렬
SELECT D.ID,D.EMAIL,D.FIRST_NAME,D.LAST_NAME
FROM DEVELOPERS D
JOIN SKILLCODES S1 ON S1.NAME = 'Python' OR S1.NAME = 'C#'
WHERE (D.SKILL_CODE & S1.CODE) != 0
GROUP BY D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME --
ORDER BY D.ID; --ID를 기준으로 정렬
