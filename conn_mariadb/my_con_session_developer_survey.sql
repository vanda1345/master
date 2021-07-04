 /*
 CREATE OR REPLACE TABLE developer_survey_cl2 
  (
     MainBranch         VARCHAR(77) NOT NULL, 
     Hobbyist           VARCHAR(3) DEFAULT NULL, 
     Age                FLOAT DEFAULT NULL, 
     Age1stCode         FLOAT DEFAULT NULL, 
     ConvertedComp      FLOAT DEFAULT NULL, 
     DevType            VARCHAR(550) DEFAULT NULL,
     EdLevel            VARCHAR(82) DEFAULT NULL,
     Employment         VARCHAR(52) DEFAULT NULL, 
     Gender             VARCHAR(65) DEFAULT NULL, 
     JobFactors         VARCHAR(463) DEFAULT NULL, 
     JobSat             VARCHAR(34) DEFAULT NULL, 
     JobSeek            VARCHAR(60) DEFAULT NULL,
     NEWDevOps          VARCHAR(8) DEFAULT NULL,  
     NEWDevOpsImpt      VARCHAR(18) DEFAULT NULL,  
     NEWEdImpt          VARCHAR(34) DEFAULT NULL,  
     NEWJobHunt         VARCHAR(380) DEFAULT NULL,  
     NEWJobHuntResearch VARCHAR(365) DEFAULT NULL,  
     NEWLearn           VARCHAR(16) DEFAULT NULL,  
     NEWOnboardGood     VARCHAR(28) DEFAULT NULL,  
     NEWOvertime        VARCHAR(56) DEFAULT NULL,  
     OpSys              VARCHAR(11) DEFAULT NULL,  
     OrgSize            VARCHAR(50) DEFAULT NULL,  
     PurchaseWhat       VARCHAR(32) DEFAULT NULL,  
     UndergradMajor     VARCHAR(78) DEFAULT NULL,  
     WorkWeekHrs        FLOAT DEFAULT NULL,
     YearsCode          FLOAT DEFAULT NULL,  
     YearsCodePro       FLOAT DEFAULT NULL 
  ) 
engine=innodb 
DEFAULT charset=latin1; 


LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/developer_survey/developer_survey_cl2.csv' 
 INTO table master_maria_db.developer_survey_cl2 
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  
 */


  CREATE OR REPLACE TABLE developer_survey_cl3 
  (
     MainBranch         VARCHAR(77) NOT NULL, 
     Hobbyist           VARCHAR(3) DEFAULT NULL, 
     Age                FLOAT DEFAULT NULL, 
     Age1stCode         FLOAT DEFAULT NULL, 
     ConvertedComp      FLOAT DEFAULT NULL, 
     EdLevel            VARCHAR(82) DEFAULT NULL,
     Employment         VARCHAR(52) DEFAULT NULL, 
     Gender             VARCHAR(65) DEFAULT NULL, 
     JobSat             VARCHAR(34) DEFAULT NULL, 
     JobSeek            VARCHAR(60) DEFAULT NULL,
     NEWDevOps          VARCHAR(8) DEFAULT NULL,  
     NEWDevOpsImpt      VARCHAR(18) DEFAULT NULL,  
     NEWEdImpt          VARCHAR(34) DEFAULT NULL,   
     NEWLearn           VARCHAR(16) DEFAULT NULL,  
     NEWOnboardGood     VARCHAR(28) DEFAULT NULL,  
     NEWOvertime        VARCHAR(56) DEFAULT NULL,  
     OpSys              VARCHAR(11) DEFAULT NULL,  
     OrgSize            VARCHAR(50) DEFAULT NULL,  
     PurchaseWhat       VARCHAR(32) DEFAULT NULL,  
     UndergradMajor     VARCHAR(78) DEFAULT NULL,  
     WorkWeekHrs        FLOAT DEFAULT NULL,
     YearsCode          FLOAT DEFAULT NULL,  
     YearsCodePro       FLOAT DEFAULT NULL 
  ) 
engine=innodb 
DEFAULT charset=latin1; 


LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/developer_survey/developer_survey_cl3.csv' 
 INTO table master_maria_db.developer_survey_cl3 
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  


CREATE OR REPLACE TABLE developer_survey_cl_si 
  (
     MainBranch         VARCHAR(77) NOT NULL, 
     Hobbyist           VARCHAR(3) DEFAULT NULL, 
     Age                FLOAT DEFAULT NULL, 
     Age1stCode         FLOAT DEFAULT NULL, 
     ConvertedComp      FLOAT DEFAULT NULL, 
     DevType            VARCHAR(550) DEFAULT NULL,
     EdLevel            VARCHAR(82) DEFAULT NULL,
     Employment         VARCHAR(52) DEFAULT NULL, 
     Gender             VARCHAR(65) DEFAULT NULL, 
     JobFactors         VARCHAR(463) DEFAULT NULL, 
     JobSat             VARCHAR(34) DEFAULT NULL, 
     JobSeek            VARCHAR(60) DEFAULT NULL,
     NEWDevOps          VARCHAR(8) DEFAULT NULL,  
     NEWDevOpsImpt      VARCHAR(18) DEFAULT NULL,  
     NEWEdImpt          VARCHAR(34) DEFAULT NULL,  
     NEWJobHunt         VARCHAR(380) DEFAULT NULL,  
     NEWJobHuntResearch VARCHAR(365) DEFAULT NULL,  
     NEWLearn           VARCHAR(16) DEFAULT NULL,  
     NEWOnboardGood     VARCHAR(28) DEFAULT NULL,  
     NEWOvertime        VARCHAR(56) DEFAULT NULL,  
     OpSys              VARCHAR(11) DEFAULT NULL,  
     OrgSize            VARCHAR(50) DEFAULT NULL,  
     PurchaseWhat       VARCHAR(32) DEFAULT NULL,  
     UndergradMajor     VARCHAR(78) DEFAULT NULL,  
     WorkWeekHrs        FLOAT DEFAULT NULL,
     YearsCode          FLOAT DEFAULT NULL,  
     YearsCodePro       FLOAT DEFAULT NULL  
  ) 
engine=innodb 
DEFAULT charset=latin1; 


LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/developer_survey/developer_survey_cl_si.csv' 
 INTO table master_maria_db.developer_survey_cl_si 
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  


 CREATE OR REPLACE TABLE developer_survey_cl_si2 
  (
     MainBranch         VARCHAR(77) NOT NULL, 
     Hobbyist           VARCHAR(3) DEFAULT NULL, 
     Age                FLOAT DEFAULT NULL, 
     Age1stCode         FLOAT DEFAULT NULL, 
     ConvertedComp      FLOAT DEFAULT NULL, 
     EdLevel            VARCHAR(82) DEFAULT NULL,
     Employment         VARCHAR(52) DEFAULT NULL, 
     Gender             VARCHAR(65) DEFAULT NULL, 
     JobSat             VARCHAR(34) DEFAULT NULL, 
     JobSeek            VARCHAR(60) DEFAULT NULL,
     NEWDevOps          VARCHAR(8) DEFAULT NULL,  
     NEWDevOpsImpt      VARCHAR(18) DEFAULT NULL,  
     NEWEdImpt          VARCHAR(34) DEFAULT NULL,   
     NEWLearn           VARCHAR(16) DEFAULT NULL,  
     NEWOnboardGood     VARCHAR(28) DEFAULT NULL,  
     NEWOvertime        VARCHAR(56) DEFAULT NULL,  
     OpSys              VARCHAR(11) DEFAULT NULL,  
     OrgSize            VARCHAR(50) DEFAULT NULL,  
     PurchaseWhat       VARCHAR(32) DEFAULT NULL,  
     UndergradMajor     VARCHAR(78) DEFAULT NULL,  
     WorkWeekHrs        FLOAT DEFAULT NULL,
     YearsCode          FLOAT DEFAULT NULL,  
     YearsCodePro       FLOAT DEFAULT NULL 
  ) 
engine=innodb 
DEFAULT charset=latin1; 


LOAD DATA LOCAL INFILE './Projects/maria_db/dbs/developer_survey/developer_survey_cl_si2.csv' 
 INTO table master_maria_db.developer_survey_cl_si2 
 FIELDS TERMINATED BY ',' 
 LINES TERMINATED BY '\n' 
 IGNORE 1 LINES;  