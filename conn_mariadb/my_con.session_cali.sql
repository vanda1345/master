
CREATE OR REPLACE TABLE cali_housing 
  ( 
     MedInc         FLOAT DEFAULT NULL,
     HouseAge       FLOAT DEFAULT NULL,
     AveRooms       FLOAT DEFAULT NULL,
     AveBedrms      FLOAT DEFAULT NULL, 
     Population     FLOAT DEFAULT NULL,
     AveOccup       FLOAT DEFAULT NULL, 
     Lattitude      FLOAT DEFAULT NULL,
     Longitude      FLOAT DEFAULT NULL,
     MedHouseVal    FLOAT DEFAULT NULL
  ) 
engine=innodb 
DEFAULT charset=latin1; 


 LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/cali_housing.csv' 
 INTO table master_maria_db.cali_housing
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  
