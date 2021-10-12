CREATE OR REPLACE TABLE hotel_satisfaction 
  ( 
     id                               INT NOT NULL, 
     gender                           VARCHAR(10) DEFAULT NULL,
     age                              INT(11) DEFAULT NULL, 
     purpose_of_travel                VARCHAR(25) DEFAULT NULL, 
     type_of_travel                   VARCHAR(50) DEFAULT NULL, 
     type_of_booking                  VARCHAR(50) DEFAULT NULL, 
     hotel_wifi_service               INT(11) DEFAULT NULL,
     departure_arrival_convenience    INT(11) DEFAULT NULL, 
     ease_of_online_booking           INT(11) DEFAULT NULL, 
     hotel_location                   INT(11) DEFAULT NULL,
     food_and_drink                   INT(11) DEFAULT NULL, 
     stay_comfort                     INT(11) DEFAULT NULL, 
     common_room_entertainment        INT(11) DEFAULT NULL,
     checkin_checkout_service         INT(11) DEFAULT NULL, 
     other_service                    INT(11) DEFAULT NULL, 
     cleanliness                      INT(11) DEFAULT NULL, 
     satisfaction                     VARCHAR(50)  DEFAULT NULL 
  ) 
engine=innodb 
DEFAULT charset=latin1; 


 LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/hotel_satisfaction/Hotel_Booking_Satisfaction_Score.csv' 
 INTO table master_maria_db.hotel_satisfaction
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  
