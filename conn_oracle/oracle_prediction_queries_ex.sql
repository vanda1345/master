drop table predict_stroke_result;

DECLARE
start_time pls_integer;
p_model_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_accuracy,
       data_table_name      => 'STROKE', 
       case_id_column_name     =>'id',
       target_column_name     => 'stroke', 
       result_table_name       =>'predict_stroke_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds STROKE');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy Stroke: ' || p_model_accuracy);
END;
/
--output first 9 rows from resulting table mining_predict_result
select * from predict_stroke_result where rownum < 10;

--HOTEL_SATISFACTION
DECLARE
start_time pls_integer;
p_model_hs_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_hs_accuracy,
       data_table_name      => 'hotel_satisfaction', 
       case_id_column_name     =>'id',
       target_column_name     => 'satisfaction', 
       result_table_name       =>'predict_hs_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds Hotel_Satisfaction');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy Hotel_Satisfaction: ' || p_model_hs_accuracy);
END;
/
select * from predict_hs_result where rownum < 10;

--HOTEL_BOOKING_CITY
DECLARE
start_time pls_integer;
p_model_hb_city_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_hb_city_accuracy,
       data_table_name      => 'hotel_booking_city', 
       case_id_column_name     =>'id',
       target_column_name     => 'isCanceled', 
       result_table_name       =>'predict_hb_city_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds Hotel_Booking_CITY');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy Hotel_Booking_CITY: ' || p_model_hb_city_accuracy);
END;
/
select * from predict_hb_city_result where rownum < 10;

--HOTEL_BOOKING_RESORT
DECLARE
start_time pls_integer;
p_model_hb_resort_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_hb_resort_accuracy,
       data_table_name      => 'hotel_booking_resort', 
       case_id_column_name     =>'id',
       target_column_name     => 'isCanceled', 
       result_table_name       =>'predict_hb_resort_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds Hotel_Booking_RESORT');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy Hotel_Booking_RESORT: ' || p_model_hb_resort_accuracy);
END;
/
select * from predict_hb_resort_result where rownum < 10;

--COUPONS
DECLARE
start_time pls_integer;
p_model_coupons_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_coupons_accuracy,
       data_table_name      => 'coupons', 
       case_id_column_name     =>'id',
       target_column_name     => 'Y', 
       result_table_name       =>'predict_coupons_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds COUPONS');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy COUPONS: ' || p_model_coupons_accuracy);
END;
/
select * from predict_coupons_result where rownum < 10;

drop table predict_cali_housing_result;

--CALI_HOUSING
DECLARE
start_time pls_integer;
p_model_cali_housing_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_cali_housing_accuracy,
       data_table_name      => 'cali_housing', 
       case_id_column_name     =>'id',
       target_column_name     => 'MedHouseVal', 
       result_table_name       =>'predict_cali_housing_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds CALI_HOUSING');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy CALI_HOUSING: ' || p_model_cali_housing_accuracy);
END;
/
select * from predict_cali_housing_result where rownum < 10;

--DEVELOPER_SURVEY_CL2
DECLARE
start_time pls_integer;
p_model_ds_cl2_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_ds_cl2_accuracy,
       data_table_name      => 'DEVELOPER_SURVEY_CL2', 
       case_id_column_name     =>'id',
       target_column_name     => 'JobSat', 
       result_table_name       =>'predict_ds_cl2_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds DEVELOPER_SURVEY_CL2');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy DEVELOPER_SURVEY_CL2: ' || p_model_ds_cl2_accuracy);
END;
/
select * from predict_ds_cl2_result where rownum < 10;

--DEVELOPER_SURVEY_CL3
DECLARE
start_time pls_integer;
p_model_ds_cl3_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_ds_cl3_accuracy,
       data_table_name      => 'DEVELOPER_SURVEY_CL3', 
       case_id_column_name     =>'id',
       target_column_name     => 'JobSat', 
       result_table_name       =>'predict_ds_cl3_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds DEVELOPER_SURVEY_CL3');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy DEVELOPER_SURVEY_CL3: ' || p_model_ds_cl3_accuracy);
END;
/
select * from predict_ds_cl3_result where rownum < 10;

--DEVELOPER_SURVEY_CL_SI
DECLARE
start_time pls_integer;
p_model_ds_cl_si_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_ds_cl_si_accuracy,
       data_table_name      => 'DEVELOPER_SURVEY_CL_SI', 
       case_id_column_name     =>'id',
       target_column_name     => 'JobSat', 
       result_table_name       =>'predict_ds_cl_si_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds DEVELOPER_SURVEY_CL_SI');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy DEVELOPER_SURVEY_CL_SI: ' || p_model_ds_cl_si_accuracy);
END;
/
select count(*) from predict_ds_cl_si_result where probability > 0.50;

--DEVELOPER_SURVEY_CL_SI2
DECLARE
start_time pls_integer;
p_model_ds_cl_si2_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_ds_cl_si2_accuracy,
       data_table_name      => 'DEVELOPER_SURVEY_CL_SI2', 
       case_id_column_name     =>'id',
       target_column_name     => 'JobSat', 
       result_table_name       =>'predict_ds_cl_si2_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds DEVELOPER_SURVEY_CL_SI2');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy DEVELOPER_SURVEY_CL_SI2: ' || p_model_ds_cl_si2_accuracy);
END;
/
select * from predict_ds_cl_si2_result where rownum < 10;

--JOBSEEK prediction

--DEVELOPER_SURVEY_CL2
DECLARE
start_time pls_integer;
p_model_ds_cl2_seek_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_ds_cl2_seek_accuracy,
       data_table_name      => 'DEVELOPER_SURVEY_CL2', 
       case_id_column_name     =>'id',
       target_column_name     => 'JobSeek', 
       result_table_name       =>'predict_ds_cl2_seek_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds DEVELOPER_SURVEY_CL2_seek');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy DEVELOPER_SURVEY_CL2_seek: ' || p_model_ds_cl2_seek_accuracy);
END;
/
select * from predict_ds_cl2_seek_result where rownum < 10;

--DEVELOPER_SURVEY_CL3
DECLARE
start_time pls_integer;
p_model_ds_cl3_seek_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_ds_cl3_seek_accuracy,
       data_table_name      => 'DEVELOPER_SURVEY_CL3', 
       case_id_column_name     =>'id',
       target_column_name     => 'JobSeek', 
       result_table_name       =>'predict_ds_cl3_seek_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds DEVELOPER_SURVEY_CL3_seek');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy DEVELOPER_SURVEY_CL3_seek: ' || p_model_ds_cl3_seek_accuracy);
END;
/
select * from predict_ds_cl3_seek_result where rownum < 10;

--DEVELOPER_SURVEY_CL_SI
DECLARE
start_time pls_integer;
p_model_ds_cl_si_seek_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_ds_cl_si_seek_accuracy,
       data_table_name      => 'DEVELOPER_SURVEY_CL_SI', 
       case_id_column_name     =>'id',
       target_column_name     => 'JobSeek', 
       result_table_name       =>'predict_ds_cl_si_seek_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds DEVELOPER_SURVEY_CL_SI_seek');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy DEVELOPER_SURVEY_CL_SI_seek: ' || p_model_ds_cl_si_seek_accuracy);
END;
/
select * from predict_ds_cl_si_seek_result where rownum < 10;

--DEVELOPER_SURVEY_CL_SI2
DECLARE
start_time pls_integer;
p_model_ds_cl_si2_seek_accuracy NUMBER(10,9);
BEGIN
    start_time := dbms_utility.get_time;
  DBMS_PREDICTIVE_ANALYTICS.PREDICT(
       accuracy                => p_model_ds_cl_si2_seek_accuracy,
       data_table_name      => 'DEVELOPER_SURVEY_CL_SI2', 
       case_id_column_name     =>'id',
       target_column_name     => 'JobSeek', 
       result_table_name       =>'predict_ds_cl_si2_seek_result'); 
dbms_output.put_line((dbms_utility.get_time - start_time)/100 || ' seconds DEVELOPER_SURVEY_CL_SI2_seek');
DBMS_OUTPUT.PUT_LINE('Overall Model Accuracy DEVELOPER_SURVEY_CL_SI2_seek: ' || p_model_ds_cl_si2_seek_accuracy);
END;
/
select * from predict_ds_cl_si2_seek_result where rownum < 10;



