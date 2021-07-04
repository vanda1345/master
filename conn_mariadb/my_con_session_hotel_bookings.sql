-- hotel_booking_resort H1 && hotel_booking_city H2

CREATE OR REPLACE TABLE hotel_booking_resort 
  ( 
    IsCanceled                     INT(10) DEFAULT NULL,
    LeadTime                       INT(10) DEFAULT NULL,
    ArrivalDateYear                INT(11) DEFAULT NULL,
    ArrivalDateMonth               VARCHAR(15) DEFAULT NULL, 
    ArrivalDateWeekNumber          INT(10) DEFAULT NULL,
    ArrivalDateDayOfMonth          INT(10) DEFAULT NULL, 
    StaysInWeekendNights           INT(10) DEFAULT NULL,
    StaysInWeekNights              INT(11) DEFAULT NULL,
    Adults                         INT(11) DEFAULT NULL, 
    Children                       FLOAT DEFAULT NULL, 
    Babies                         INT(11) DEFAULT NULL,
    Meal                           VARCHAR(15) DEFAULT NULL,
    Country                        VARCHAR(15) DEFAULT NULL,
    MarketSegment                  VARCHAR(50) DEFAULT NULL,
    DistributionChannel            VARCHAR(50) DEFAULT NULL,
    IsRepeatedGuest                INT(11) DEFAULT NULL,
    PreviousCancellations          INT(11) DEFAULT NULL,
    PreviousBookingsNotCanceled    INT(11) DEFAULT NULL,
    ReservedRoomType               VARCHAR(5) DEFAULT NULL,
    AssignedRoomType               VARCHAR(5) DEFAULT NULL,
    BookingChanges                 INT(11) DEFAULT NULL,
    DepositType                    VARCHAR(25) DEFAULT NULL,
    Agent                          VARCHAR(25) DEFAULT NULL,
    Company                        VARCHAR(25) DEFAULT NULL,
    DaysInWaitingList              INT(11) DEFAULT NULL,
    CustomerType                   VARCHAR(25) DEFAULT NULL,
    ADR                            FLOAT DEFAULT NULL,
    RequiredCarParkingSpaces       INT(11) DEFAULT NULL,
    TotalOfSpecialRequests         INT(11) DEFAULT NULL,
    ReservationStatus              VARCHAR(25) DEFAULT NULL,
    ReservationStatusDate          DATETIME DEFAULT NULL
  ) 
engine=innodb 
DEFAULT charset=latin1; 


 LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/hotel_booking/H2.csv' 
 INTO table master_maria_db.hotel_booking_city
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

*/


