create table public.coupons(
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


COPY coupons
FROM '/home/vanda_1345/Projects/postgresql/dbs/coupon_recommendation/in-vehicle-coupon-recommendation.csv'
DELIMITER ','
CSV HEADER;

