/*
CREATE OR REPLACE TABLE coupons 
  ( 
    destination            VARCHAR(150) DEFAULT NULL,
    passanger              VARCHAR(15) DEFAULT NULL,
    weather                VARCHAR(15) DEFAULT NULL,
    temperature            INT(11) DEFAULT NULL, 
    time_d                 VARCHAR(5) DEFAULT NULL,
    coupon                 VARCHAR(50) DEFAULT NULL, 
    expiration             VARCHAR(5) DEFAULT NULL,
    gender                 VARCHAR(12) DEFAULT NULL,
    age                    VARCHAR(50) DEFAULT NULL, 
    maritalStatus          VARCHAR(50) DEFAULT NULL, 
    has_children           INT(11) DEFAULT NULL,
    education              VARCHAR(150) DEFAULT NULL,
    occupation             VARCHAR(150) DEFAULT NULL,
    income                 VARCHAR(150) DEFAULT NULL,
    car                    VARCHAR(50) DEFAULT NULL,
    Bar                    VARCHAR(15) DEFAULT NULL,
    CoffeeHouse            VARCHAR(15) DEFAULT NULL,
    CarryAway              VARCHAR(15) DEFAULT NULL,
    RestaurantLessThan20   VARCHAR(15) DEFAULT NULL,
    Restaurant20To50       VARCHAR(15) DEFAULT NULL,
    toCoupon_GEQ5min       INT(11) DEFAULT NULL,
    toCoupon_GEQ15min      INT(11) DEFAULT NULL,
    toCoupon_GEQ25min      INT(11) DEFAULT NULL,
    direction_same         INT(11) DEFAULT NULL,
    direction_opp          INT(11) DEFAULT NULL,
    Y                      INT(11) DEFAULT NULL
  ) 
engine=innodb 
DEFAULT charset=latin1; 


 LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/coupon_recommendation/in-vehicle-coupon-recommendation.csv' 
 INTO table master_maria_db.coupons
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  */
 
/*
  select destination, passanger, weather, temperature, time_d, coupon, 
  expiration, gender, age, maritalStatus, has_children, education, 
  occupation, income, RestaurantLessThan20, Restaurant20To50, toCoupon_GEQ5min, toCoupon_GEQ15min, 
  toCoupon_GEQ25min, direction_same, direction_opp, Y 
  from master_maria_db.coupons 
  where coupon in ("Restaurant(<20)", "Restaurant(20-50)"); 
*/

insert into 
mindsdb.predictors(name, predict, select_data_query) 
values ('coupons_restaurant_model', 'Y', 
'select destination, passanger, weather, 
temperature, time_d, coupon, expiration, 
gender, age, maritalStatus, has_children, 
education, occupation, income, RestaurantLessThan20,
 Restaurant20To50, toCoupon_GEQ5min, 
 toCoupon_GEQ15min, toCoupon_GEQ25min, 
 direction_same, direction_opp, 
 Y from master_maria_db.coupons 
 where coupon in ("Restaurant(<20)", "Restaurant(20-50))"');
