create table public.hotel_satisfaction(
	id integer,
	gender varchar(10),
	age integer,
	purpose_of_travel varchar(25),
	type_of_travel varchar(25),
	type_of_booking varchar(25),
	hotel_wifi_service integer,
	departure_arrival_convenience integer,
	ease_of_online_booking integer,
	hotel_location integer,
	food_and_drink integer,
	stay_comfort integer,
	common_room_entertainment integer,
	checkin_checkout_service integer,
	other_service integer,
	cleanliness integer,
	satisfaction varchar(50)
); 

COPY hotel_satisfaction
FROM '/home/vanda_1345/Projects/postgresql/dbs/hotel_satisfaction/Hotel_Booking_Satisfaction_Score.csv'
WITH(FORMAT CSV, DELIMITER ',', NULL  'N/A', HEADER); 
