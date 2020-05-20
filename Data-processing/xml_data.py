#!/usr/bin/python3

import xml.etree.ElementTree as ET
import random
import string

tree = ET.parse('./data.xml')
root = tree.getroot()

#print to console
arr1 = ["sportsBookReference","transactionId","outcomeId","totalStake"]

for item in arr1:
	for data in root.iter(item):
		print(item + " : " + data.text)
		break
print()

#change values
bet_description = ''.join([random.choice(string.ascii_letters + string.digits) for n in range(100)])
total_stake = "10"
transaction_id = "1"

arr2 = ["betDescription","totalStake","transactionId"]

for item in arr2:
	for data in root.iter(item):
		if item == "betDescription":
			data.text = bet_description
		if item == "totalStake":
			data.text = total_stake
		if item == "transactionId":
			data.text = transaction_id

#print to file
tree.write('data_output.xml', xml_declaration=True, method='xml', encoding='UTF-8')
print("data_output.xml was created! Please check the file.")