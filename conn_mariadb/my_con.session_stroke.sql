 CREATE OR REPLACE TABLE stroke 
  ( 
     id                  INT NOT NULL, 
     gender              VARCHAR(10) DEFAULT NULL, 
     age                 INT(11) DEFAULT NULL, 
     hypertension        INT(11) DEFAULT NULL, 
     heart_disease       INT(11) DEFAULT NULL, 
     ever_married        VARCHAR(5) DEFAULT NULL, 
     work_type           VARCHAR(25) DEFAULT NULL,
     Residence_type      VARCHAR(15) DEFAULT NULL, 
     avg_glucose_level   FLOAT DEFAULT NULL, 
     bmi                 FLOAT DEFAULT NULL, 
     smoking_status      VARCHAR(35) DEFAULT NULL, 
     stroke              INT(11) DEFAULT NULL 
  ) 
engine=innodb 
DEFAULT charset=latin1; 


LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/stroke/healthcare-dataset-stroke-data.csv' 
 INTO table master_maria_db.stroke 
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  

/*  CREATE OR REPLACE TABLE stroke_clean 
  ( 
     id                  INT NOT NULL, 
     gender              INT(11) DEFAULT NULL, 
     age                 INT(11) DEFAULT NULL, 
     hypertension        INT(11) DEFAULT NULL, 
     heart_disease       INT(11) DEFAULT NULL, 
     ever_married        INT(11) DEFAULT NULL, 
     work_type           INT(11) DEFAULT NULL,
     Residence_type      INT(11) DEFAULT NULL, 
     avg_glucose_level   FLOAT DEFAULT NULL, 
     bmi                 FLOAT DEFAULT NULL, 
     smoking_status      INT(11) DEFAULT NULL, 
     stroke              INT(11) DEFAULT NULL 
  ) 
engine=innodb 
DEFAULT charset=latin1; 


 LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/stroke/stroke_clean.csv' 
 INTO table master_maria_db.stroke_clean 
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  

*/

/* CREATE OR REPLACE TABLE master_maria_db.prediction_timestamps
(
  prediction_name   VARCHAR(255) DEFAULT NULL,
  prediction_status VARCHAR(255) DEFAULT NULL,
  inserted_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)
engine=innodb 
DEFAULT charset=latin1; */

/* CREATE or replace
    TRIGGER mindsdb.after_insert_predictions AFTER INSERT
    ON mindsdb.predictors
    FOR EACH ROW
    INSERT INTO master_maria_db.prediction_timestamps(prediction_name, prediction_status) VALUES (new.name, new.status);


 CREATE or replace
    TRIGGER mindsdb.after_update_predictions before UPDATE
    ON mindsdb.predictors
    FOR EACH ROW
    INSERT INTO master_maria_db.prediction_timestamps(prediction_name, prediction_status) 
      VALUES (new.name, new.status); 


 CREATE or replace
    TRIGGER mindsdb.after_delete_predictions AFTER DELETE
    ON mindsdb.predictors
    FOR EACH ROW
    INSERT INTO master_maria_db.prediction_timestamps(prediction_name, prediction_status) 
      VALUES (old.name, old.status); */