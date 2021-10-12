import time
import mariadb
import sys

try:
    conn = mariadb.connect(
	user="root",
	password="02051996",
    host="localhost",
    port=3306)
    print("conn success")
except mariadb.Error as e:
   print(f"Error connecting to MariaDB Platform: {e}")
   sys.exit(1)

cur = conn.cursor()

model_name = 'stroke_predict_model'
predict_value = 'stroke'
query_prediction = 'select * from master_maria_db.stroke'

#def insert_predictor():
#    cur.execute(
#        "INSERT INTO mindsdb.predictors(name, predict, select_data_query) VALUES (?, ?, ?);", 
#        (model_name, predict_value, query_prediction))

def check_status():
    cur.execute("SELECT status FROM mindsdb.predictors WHERE name=?", (model_name,)) 
    if(cur.fetchone()[0] == 'complete'):
        return True
    elif (cur.fetchone()[0] == 'training'):
        return False

time.sleep(10);

#insert_predictor()02
flag = False
start_time_predictions = time.time()
while (not flag):
    flag = check_status()

elapsed_time_predictions= time.time() - start_time_predictions + 10
print(elapsed_time_predictions)