SELECT
    animal_id,
    name
FROM
    animal_ins
WHERE
    animal_type = 'dog'
    AND name REGEXP 'el'
ORDER BY
    2;