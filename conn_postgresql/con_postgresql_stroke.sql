create table public.stroke(
	id integer,
	gender varchar(10),
	age numeric,
	hypertension numeric,
	heart_disease integer,
	ever_married varchar(3),
	work_type varchar(25),
	Residence_type varchar(25),
	avg_glucose_level numeric,
	bmi numeric,
	smoking_status varchar(25),
	stroke integer
); 

COPY stroke
FROM '/home/vanda_1345/Projects/postgresql/dbs/stroke/healthcare-dataset-stroke-data.csv'
WITH(FORMAT CSV, DELIMITER ',', NULL  'N/A', HEADER); 
