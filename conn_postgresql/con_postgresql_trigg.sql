/* CREATE OR REPLACE FUNCTION insert_pred()
  RETURNS TRIGGER 
  LANGUAGE PLPGSQL
  AS
  $$
BEGIN
	insert into public.predictions_time values (old.name, new.status, now());
END;
$$ */


Create trigger trig_update 
after update on mindsdb.predictors 
for each row 
execute procedure insert_pred(); 



