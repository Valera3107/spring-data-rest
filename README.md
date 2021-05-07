## Posadki API
An application that helps in bank credit.

You can find detailed information about the deployment of the project at the link: 

#### Technologies
+ Java 11 OpenJDK
+ Spring Boot 2.4.3
+ Maven 5.x
+ Postgres 11.x

#### Installation
1\. Install PostgreSQL;

2\. Clone project:
```
git clone https://bitbucket.lan.ubrr.ru/scm/con/ubrr-credit-request-service.git
```
#### Build
You can build the application with by running:
```
mvn clean install
```

#### Run
You can launch the application with by running:
```
./mvnw spring-boot:run
java -jar ubrir-bank.jar --spring.profiles.active={profile} --server.port={port}  --spring.datasource.username={login} --spring.datasource
.password={password}
```

##### Parameters
The parameters that you must specify to run the application:
+ spring.profiles.active - active profile of the application. Use a local profile for the development;
+ server.port - server port;
+ spring.datasource.username - username for connection to DB;
+ spring.datasource.password - password for connection to DB;