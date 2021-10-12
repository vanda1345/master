create table public.developer_survey_cl2(
	MainBranch         VARCHAR(77), 
     Hobbyist           VARCHAR(3), 
     Age                numeric,
     Age1stCode         numeric, 
     ConvertedComp      numeric, 
     DevType            VARCHAR(550),
     EdLevel            VARCHAR(82),
     Employment         VARCHAR(52), 
     Gender             VARCHAR(65), 
     JobFactors         VARCHAR(463), 
     JobSat             VARCHAR(34), 
     JobSeek            VARCHAR(60),
     NEWDevOps          VARCHAR(8),  
     NEWDevOpsImpt      VARCHAR(25),  
     NEWEdImpt          VARCHAR(34),  
     NEWJobHunt         VARCHAR(380),  
     NEWJobHuntResearch VARCHAR(365),  
     NEWLearn           VARCHAR(25),  
     NEWOnboardGood     VARCHAR(28),  
     NEWOvertime        VARCHAR(56),  
     OpSys              VARCHAR(11),  
     OrgSize            VARCHAR(50),  
     PurchaseWhat       VARCHAR(32),  
     UndergradMajor     VARCHAR(78),  
     WorkWeekHrs        numeric,
     YearsCode          numeric,  
     YearsCodePro       numeric 
); 

COPY developer_survey_cl2
FROM '/home/vanda_1345/Projects/postgresql/dbs/developer_survey/developer_survey_cl2.csv'
DELIMITER ','
CSV HEADER; 

create table public.developer_survey_cl3(
	 MainBranch        VARCHAR(77), 
     Hobbyist           VARCHAR(3), 
     Age                numeric,
     Age1stCode         numeric, 
     ConvertedComp      numeric, 
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
     WorkWeekHrs        numeric,
     YearsCode          numeric,  
     YearsCodePro       numeric 
); 

COPY developer_survey_cl3
FROM '/home/vanda_1345/Projects/postgresql/dbs/developer_survey/developer_survey_cl3.csv'
DELIMITER ','
CSV HEADER;

create table public.developer_survey_cl_si(
	 MainBranch         VARCHAR(77), 
     Hobbyist           VARCHAR(3), 
     Age                numeric,
     Age1stCode         numeric, 
     ConvertedComp      numeric, 
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
     WorkWeekHrs        numeric,
     YearsCode          numeric,  
     YearsCodePro       numeric 
); 

COPY developer_survey_cl_si
FROM '/home/vanda_1345/Projects/postgresql/dbs/developer_survey/developer_survey_cl_si.csv'
DELIMITER ','
CSV HEADER; 

create table public.developer_survey_cl_si2(
	 MainBranch         VARCHAR(77), 
     Hobbyist           VARCHAR(3), 
     Age                numeric,
     Age1stCode         numeric, 
     ConvertedComp      numeric, 
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
     WorkWeekHrs        numeric,
     YearsCode          numeric,  
     YearsCodePro       numeric 
); 

COPY developer_survey_cl_si2
FROM '/home/vanda_1345/Projects/postgresql/dbs/developer_survey/developer_survey_cl_si2.csv'
DELIMITER ','
CSV HEADER;
