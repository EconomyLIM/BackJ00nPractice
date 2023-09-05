SELECT i.animal_id, i.animal_type, i.name
FROM animal_ins i JOIN animal_outs o
ON i.animal_id = o.animal_id
WHERE regexp_like(sex_upon_intake, '^[^Neutered|^Spayed]')
and regexp_like(sex_upon_outcome, '^[Neutered|Spayed]');