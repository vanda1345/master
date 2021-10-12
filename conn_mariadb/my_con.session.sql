CREATE OR REPLACE TABLE stroke_clean 
  ( 
     id                   INT NOT NULL, 
     gender               INT(11) DEFAULT NULL, 
     age                 INT(11) DEFAULT NULL, 
     hypertension        INT(11) DEFAULT NULL, 
     heart_disease        INT(11) DEFAULT NULL, 
     ever_married        INT(11) DEFAULT NULL, 
     work_type           INT(11) DEFAULT NULL,
     Residence_type      INT(11) DEFAULT NULL, 
     avg_glucose_level   FLOAT DEFAULT NULL, 
     bmi                  FLOAT DEFAULT NULL, 
     smoking_status       INT(11) DEFAULT NULL, 
     stroke              INT(11) DEFAULT NULL 
  ) 
engine=innodb 
DEFAULT charset=latin1; 


 LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/stroke/stroke_clean.csv' 
 INTO table master_maria_db.stroke_clean 
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  
