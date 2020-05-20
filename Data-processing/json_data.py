#!/usr/bin/python3

import json
from datetime import datetime,timedelta

#print the elements to console
arr = ["Corners","Fouls","GoalKicks","ThrowIns","Goals"]

with open("./data.json") as json_file:
	datas = json.load(json_file)

for item in arr:
	print(item+"\nHome: " + str(datas[item]['Score']['Home']) + " Away: " + str(datas[item]['Score']['Away']))
	print()

#change the elements values
first = datetime.now() - timedelta(minutes=90)
second = datetime.now() - timedelta(minutes=30)

first_half = first.strftime("%Y-%m-%dT%H:%M:%S.%f")[:-3]+"Z" 
second_half = second.strftime("%Y-%m-%dT%H:%M:%S.%f")[:-3]+"Z" 

datas['FixtureId'] = 1000
datas['CustomerId'] = 1
datas['StartTimes']['FirstHalf'] = first_half
datas['StartTimes']['SecondHalf'] = second_half

#print to file
with open('data_output.json', 'w') as json_file:
	json.dump(datas, json_file, ensure_ascii=False, indent=2)
print("data_output.json was created! Please check the file.")
