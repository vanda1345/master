 CREATE OR REPLACE TABLE stroke 
  ( 
     id                  INT NOT NULL, 
     gender              VARCHAR(10) DEFAULT NULL, 
     age                 INT(11) DEFAULT NULL, 
     hypertension        INT(11) DEFAULT NULL, 
     heart_disease       INT(11) DEFAULT NULL, 
     ever_married        VARCHAR(3) DEFAULT NULL, 
     work_type           VARCHAR(25) DEFAULT NULL,
     Residence_type      VARCHAR(25) DEFAULT NULL, 
     avg_glucose_level   FLOAT DEFAULT NULL, 
     bmi                 FLOAT DEFAULT NULL, 
     smoking_status      VARCHAR(25) DEFAULT NULL, 
     stroke              INT(11) DEFAULT NULL 
  ) 
engine=innodb 
DEFAULT charset=latin1; 


LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/stroke/healthcare-dataset-stroke-data.csv' 
 INTO table master_maria_db.stroke 
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  

