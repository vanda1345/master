-- queries for hotel_booking_resort H1 and hotel_booking_city H2

create table public.hotel_booking_city(
	IsCanceled integer,
	LeadTime integer,
	ArrivalDateYear integer,
	ArrivalDateMonth varchar(15),
	ArrivalDateWeekNumber integer,
	ArrivalDateDayOfMonth integer,
	StaysInWeekendNights integer,
	StaysInWeekNights integer,
	Adults integer,
	Children numeric,
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
	ADR numeric,
	RequiredCarParkingSpaces integer,
	TotalOfSpecialRequests integer,
	ReservationStatus varchar(15),
	ReservationStatusDate date
); 


COPY hotel_booking_city
FROM '/home/vanda_1345/Projects/postgresql/dbs/hotel_booking/H2.csv'
WITH(FORMAT CSV, DELIMITER ',', NULL  'NA', HEADER);  
