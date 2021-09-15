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

-- hotel_booking_city H2 cleaned

/*
CREATE OR REPLACE TABLE hotel_booking_city_c 
  ( 
     IsCanceled                     INT(10) DEFAULT NULL,
     LeadTime                       INT(10) DEFAULT NULL,
     StaysInWeekendNights           INT(10) DEFAULT NULL,
     StaysInWeekNights              INT(11) DEFAULT NULL,
     Adults                         INT(11) DEFAULT NULL, 
     Children                       FLOAT DEFAULT NULL, 
     Babies                         INT(11) DEFAULT NULL,
     Meal                           VARCHAR(15) DEFAULT NULL,
    IsRepeatedGuest                 INT(11) DEFAULT NULL,
    PreviousCancellations           INT(11) DEFAULT NULL,
    PreviousBookingsNotCanceled     INT(11) DEFAULT NULL,
    ReservedRoomType                VARCHAR(5) DEFAULT NULL,
    AssignedRoomType                VARCHAR(5) DEFAULT NULL,
    BookingChanges                  INT(11) DEFAULT NULL,
    DepositType                     VARCHAR(25) DEFAULT NULL,
    DaysInWaitingList               INT(11) DEFAULT NULL,
    CustomerType                    VARCHAR(25) DEFAULT NULL,
    ADR                             FLOAT DEFAULT NULL,
    RequiredCarParkingSpaces        INT(11) DEFAULT NULL,
    TotalOfSpecialRequests          INT(11) DEFAULT NULL
  ) 
engine=innodb 
DEFAULT charset=latin1; 


 LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/hotel_booking/hotel_booking_city_clean.csv' 
 INTO table master_maria_db.hotel_booking_city_c
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  



-- trying to time mindsdb
 CREATE OR REPLACE TABLE master_maria_db.prediction_timestamps
(
  prediction_name   VARCHAR(255) DEFAULT NULL,
  prediction_status VARCHAR(255) DEFAULT NULL,
  inserted_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)
engine=innodb 
DEFAULT charset=latin1;

CREATE or replace
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