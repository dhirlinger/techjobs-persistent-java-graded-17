--Part 1
---------------------+-----------+
--| column_name      | DATA_TYPE |
 --------------------+-----------+
--| id               | int       |
--| employer         | varchar   |
--| name             | varchar   |
--| skills           | varchar   |
---------------------+-----------+

--Part 2
SELECT name FROM employer
WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT * FROM skill
LEFT JOIN job_skills
ON job_skills.skills_id = skill.id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;

