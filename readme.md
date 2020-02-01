# Kalamba Games Task

## Prerequisites
 - maven
 - java jdk
 - mysql server somewhere
## Configuration
in application.properties we can set:

server.port - the application http port
spring.datasource.url - proper jdbc url to access MySql database
spring.datasource.username - user name in mysql
spring.datasource.password - user password

## Building
mvn clean install

## Starting
java -jar target/SampleRest-0.0.1-SNAPSHOT.jar

## Testing - example of curl command
curl --location --request POST 'localhost:8081/action' \
--header 'Content-Type: application/json' \
--data-raw '{"userId": "Ala", "gameId": "Joker Max", "action": "Start"}'

