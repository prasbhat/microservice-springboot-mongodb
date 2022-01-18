# microservice-springboot-mongodb
This project is based on **[microservice-springboot-h2](https://github.com/prasbhat/microservice-springboot-h2/blob/master/README.md)** project. 

Functionally both the projects work in a similar way, with changes related only to database configuration. The main differences in codes are shown [below](#differences-between-two-spring-boot-projects).

I will be using the No SQL database known as ***MongoDB***, to persist the data. MongoDB is a No SQL database. It is an open-source, cross-platform, document-oriented database.

Database related settings are placed in _/src/main/resources/application.properties_ file.

## Requirements
- [JDK 1.8+](https://www.oracle.com/java/technologies/javase-downloads.html) - Java™ Platform, Standard Edition Development Kit
- [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
- [Maven](https://maven.apache.org/) - Dependency Management
- [Tomcat](http://tomcat.apache.org/) - The Apache Tomcat® is a Java Servlet container used as web server for running the application
- [MongoDB](https://www.mongodb.com/try/download/community) - MongoDB is a document-oriented database. It is a key feature of MongoDB. It is very simple you can program it easily.
- [Intellij IDEA IDE](https://www.jetbrains.com/idea/download/#section=windows) - An IDE for developing the code. You can use any IDE, I have used Intellij IDEA IDE.

## Differences between two Spring Boot Projects
 Given below are the changes:
- _pom.xml_ - Add the following dependency
```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```

- _model=com.myzonesoft.microservice.todo.model.Todo_

```
- Replace @Entity with @Document, because everything is stored as Documents in MongoDB.
- We don’t need @GeneratedValue on the primary key, as MongoDB would generate the primary key automatically.  
- Primary key will be of type String, as it is a hexadecimal alphanumeric value.
```

- _repository interface = com.myzonesoft.microservice.todo.repository.TodoRepository_

`Repository would extend the MongoRepository (instead of JPARepository)`

- _/src/main/resources/application.properties_ - We have to change the data source in this file and map the MongoDB related settings.
```
spring.data.mongodb.database=todoApp_db
spring.data.mongodb.port=27017
spring.data.mongodb.host=localhost
```

If we don’t specify _spring.data.mongodb.database=todoApp_db_, MongoDB server will create a default database called ***“test”***, when inserting first set of document.

Other than the above mentioned changes, no other changes are required to run this project.

## Running the application locally
There are several ways to run a Spring Boot application on your local machine. 

### Using Main method
Clone the repository to your local drive.
```shell
git clone https://github.com/prasbhat/microservice-springboot-mongodb.git
```
Import the project as "Maven Project" into your favourite IDE and execute the `main` method in the `com.myzonesoft.microservice.todo.MicroserviceSpringbootMongodbApplication` class from your IDE.

`Right Click on the file and Run as Java Application`

### Running the application with Maven
Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:
```shell
git clone https://github.com/prasbhat/microservice-springboot-mongodb.git
cd microservice-springboot-mongodb
mvn spring-boot:run
```

### Running the application with Executable JAR
The code can also be built into a jar and then executed/run. Once the jar is built, run the jar by double clicking on it or by using the command: 
```shell
git clone https://github.com/prasbhat/microservice-springboot-mongodb.git
cd microservice-springboot-mongodb
mvn package -DskipTests
java -jar target/microservice-springboot-h2-0.0.1-SNAPSHOT.jar
```
