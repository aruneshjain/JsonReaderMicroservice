# JsonReaderMicroservice
Parsing JSON Data to Database using microservices

#Bootstrap Service
Reading JSON file and sending data to API.
URL : http://localhost:8081/data/get

#Indexer Service
Communicate with Bootstrap service and parsing the data into PostgresSQL DB.
URL : http://localhost:8082/data/add

#Searcher Service
It can access the PostgreSQL DB and get the All data or Data By ID.
ALL Data URL : http://localhost:8083/Search/get/
Data By ID URL : http://localhost:8083/Search/get/{ID}


