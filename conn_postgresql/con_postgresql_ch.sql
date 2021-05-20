create table public.cali_housing(
	MedInc numeric,
	HouseAge numeric,
	AveRooms numeric,
	AveBedrms numeric,
	Population numeric,
	AveOccup numeric,
	Latitude numeric,
	Longitude numeric,
	MedHouseVal numeric
); 



COPY cali_housing
FROM '/home/vanda_1345/Projects/postgresql/dbs/cali_housing.csv'
DELIMITER ','
CSV HEADER;
