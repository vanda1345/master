create table stroke(
	id number(10),
	gender varchar(10),
	age number(10),
	hypertension number(10),
	heart_disease number(10),
	ever_married varchar(3),
	work_type varchar(25),
	residence_type varchar(25),
	avg_glucose_level float(10),
	bmi varchar(10),
	smoking_status varchar(25),
	stroke number(10)
); 

drop table stroke;
 

drop table "hotel_satisfaction";

create table hotel_satisfaction (
	id number(10),
	gender varchar(10),
	age number(10),
	purpose_of_travel varchar(25),
	type_of_travel varchar(25),
	type_of_booking varchar(25),
	hotel_wifi_service number(10),
	departure_arrival_convenience number(10),
	ease_of_online_booking number(10),
	hotel_location number(10),
	food_and_drink number(10),
	stay_comfort number(10),
	common_room_entertainment number(10),
	checkin_checkout_service number(10),
	other_service number(10),
	cleanliness number(10),
	satisfaction varchar(50)
);

drop table hotel_booking_resort;

create table hotel_booking_city(
    id number(10) PRIMARY KEY, 
	IsCanceled integer,
	LeadTime integer,
	ArrivalDateYear integer,
	ArrivalDateMonth varchar(15),
	ArrivalDateWeekNumber integer,
	ArrivalDateDayOfMonth integer,
	StaysInWeekendNights integer,
	StaysInWeekNights integer,
	Adults integer,
	Children float(10),
	Babies float(10),
	Meal varchar(10),
	Country varchar(10),
	MarketSegment varchar(15),
	DistributionChannel varchar(15),
	IsRepeatedGuest integer,
	PreviousCancellations integer,
	PreviousBookingsNotCanceled integer,
	ReservedRoomType varchar(15),
	AssignedRoomType varchar(15),
	BookingChanges integer,
	DepositType varchar(20),
	Agent varchar(10),
	Company varchar(10),
	DaysInWaitingList integer,
	CustomerType varchar(15),
	ADR float(10),
	RequiredCarParkingSpaces integer,
	TotalOfSpecialRequests integer,
	ReservationStatus varchar(15),
	ReservationStatusDate date
); 

drop table "coupons";

create table hotel_booking_resort(
    id number(10) PRIMARY KEY, 
	IsCanceled integer,
	LeadTime integer,
	ArrivalDateYear integer,
	ArrivalDateMonth varchar(15),
	ArrivalDateWeekNumber integer,
	ArrivalDateDayOfMonth integer,
	StaysInWeekendNights integer,
	StaysInWeekNights integer,
	Adults integer,
	Children float(10),
	Babies integer,
	Meal varchar(10),
	Country varchar(10),
	MarketSegment varchar(15),
	DistributionChannel varchar(15),
	IsRepeatedGuest integer,
	PreviousCancellations integer,
	PreviousBookingsNotCanceled integer,
	ReservedRoomType varchar(15),
	AssignedRoomType varchar(15),
	BookingChanges integer,
	DepositType varchar(20),
	Agent varchar(10),
	Company varchar(10),
	DaysInWaitingList integer,
	CustomerType varchar(15),
	ADR float(10),
	RequiredCarParkingSpaces integer,
	TotalOfSpecialRequests integer,
	ReservationStatus varchar(15),
	ReservationStatusDate date
);

drop table "coupons";


create table coupons(
    id number(10) PRIMARY KEY, 
	destination varchar(50),
	passanger varchar(15),
	weather varchar(15),
	temperature integer,
	time varchar(10),
	coupon varchar(50),
	expiration varchar(5),
	gender varchar(10),
	age varchar(25),
	maritalStatus varchar(50),
	has_children integer,
	education varchar(50),
	occupation varchar(50),
	income varchar(50),
	car varchar(50),
	Bar varchar(15),
	CoffeeHouse varchar(15),
	CarryAway varchar(15),
	RestaurantLessThan20 varchar(15),
	Restaurant20To50 varchar(15),
	toCoupon_GEQ5min integer,
	toCoupon_GEQ15min integer,
	toCoupon_GEQ25min integer,
	direction_same integer,
	direction_opp integer,
	Y integer
); 

drop  table cali_housing;

create table cali_housing(
    id number(10) PRIMARY KEY, 
	MedInc float(10),
	HouseAge float (10),
	AveRooms float (10),
	AveBedrms float (10),
	Population float (10),
	AveOccup float (10),
	Latitude float (10),
	Longitude float (10),
	MedHouseVal float (10)
);

drop table developer_survey_cl2;

CREATE TABLE developer_survey_cl2 (
     id number(10) PRIMARY KEY, 
     MainBranch         VARCHAR(77), 
     Hobbyist           VARCHAR(3), 
     Age                FLOAT, 
     Age1stCode         FLOAT, 
     ConvertedComp      FLOAT, 
     DevType            VARCHAR(550),
     EdLevel            VARCHAR(82),
     Employment         VARCHAR(52), 
     Gender             VARCHAR(65), 
     JobFactors         VARCHAR(463), 
     JobSat             VARCHAR(34), 
     JobSeek            VARCHAR(60),
     NEWDevOps          VARCHAR(8),  
     NEWDevOpsImpt      VARCHAR(20),  
     NEWEdImpt          VARCHAR(34),  
     NEWJobHunt         VARCHAR(380),  
     NEWJobHuntResearch VARCHAR(365),  
     NEWLearn           VARCHAR(20),  
     NEWOnboardGood     VARCHAR(28),  
     NEWOvertime        VARCHAR(56),  
     OpSys              VARCHAR(11),  
     OrgSize            VARCHAR(50),  
     PurchaseWhat       VARCHAR(32),  
     UndergradMajor     VARCHAR(78),  
     WorkWeekHrs        FLOAT (10),
     YearsCode          FLOAT (10),  
     YearsCodePro       FLOAT (10) 
  ) 
  
  CREATE TABLE developer_survey_cl3 (
     id number(10) PRIMARY KEY, 
     MainBranch         VARCHAR(77), 
     Hobbyist           VARCHAR(3), 
     Age                FLOAT (10), 
     Age1stCode         FLOAT (10), 
     ConvertedComp      FLOAT (10), 
     EdLevel            VARCHAR(82),
     Employment         VARCHAR(52), 
     Gender             VARCHAR(65), 
     JobSat             VARCHAR(34), 
     JobSeek            VARCHAR(60),
     NEWDevOps          VARCHAR(8),  
     NEWDevOpsImpt      VARCHAR(20),  
     NEWEdImpt          VARCHAR(34),   
     NEWLearn           VARCHAR(20),  
     NEWOnboardGood     VARCHAR(28),  
     NEWOvertime        VARCHAR(56),  
     OpSys              VARCHAR(11),  
     OrgSize            VARCHAR(50),  
     PurchaseWhat       VARCHAR(32),  
     UndergradMajor     VARCHAR(78),  
     WorkWeekHrs        FLOAT (10),
     YearsCode          FLOAT (10),  
     YearsCodePro       FLOAT (10)
  ) 

CREATE TABLE developer_survey_cl_si (
     id number(10) PRIMARY KEY, 
     MainBranch         VARCHAR(77), 
     Hobbyist           VARCHAR(3), 
     Age                FLOAT (10), 
     Age1stCode         FLOAT (10), 
     ConvertedComp      FLOAT (10), 
     DevType            VARCHAR(550),
     EdLevel            VARCHAR(82),
     Employment         VARCHAR(52), 
     Gender             VARCHAR(65), 
     JobFactors         VARCHAR(463), 
     JobSat             VARCHAR(34), 
     JobSeek            VARCHAR(60),
     NEWDevOps          VARCHAR(8),  
     NEWDevOpsImpt      VARCHAR(20),  
     NEWEdImpt          VARCHAR(34),  
     NEWJobHunt         VARCHAR(380),  
     NEWJobHuntResearch VARCHAR(365),  
     NEWLearn           VARCHAR(20),  
     NEWOnboardGood     VARCHAR(28),  
     NEWOvertime        VARCHAR(56),  
     OpSys              VARCHAR(11),  
     OrgSize            VARCHAR(50),  
     PurchaseWhat       VARCHAR(32),  
     UndergradMajor     VARCHAR(78),  
     WorkWeekHrs        FLOAT (10),
     YearsCode          FLOAT (10),  
     YearsCodePro       FLOAT (10)   
  ) 


 CREATE TABLE developer_survey_cl_si2 (
     id number(10) PRIMARY KEY, 
     MainBranch         VARCHAR(77), 
     Hobbyist           VARCHAR(3), 
     Age                FLOAT (10), 
     Age1stCode         FLOAT (10), 
     ConvertedComp      FLOAT (10), 
     EdLevel            VARCHAR(82),
     Employment         VARCHAR(52), 
     Gender             VARCHAR(65), 
     JobSat             VARCHAR(34), 
     JobSeek            VARCHAR(60),
     NEWDevOps          VARCHAR(8),  
     NEWDevOpsImpt      VARCHAR(20),  
     NEWEdImpt          VARCHAR(34),   
     NEWLearn           VARCHAR(20),  
     NEWOnboardGood     VARCHAR(28),  
     NEWOvertime        VARCHAR(56),  
     OpSys              VARCHAR(11),  
     OrgSize            VARCHAR(50),  
     PurchaseWhat       VARCHAR(32),  
     UndergradMajor     VARCHAR(78),  
     WorkWeekHrs        FLOAT (10),
     YearsCode          FLOAT (10),  
     YearsCodePro       FLOAT (10) 
  ) 












