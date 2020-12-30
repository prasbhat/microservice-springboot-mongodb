# microservice-springboot-mongodb
I have created a simple ***microservice application* using Java Spring Boot framework**, which will act as backend and expose the REST APIs, mentioned in the table below:
| CRUD Operation | HTTP Method | REST API Endpoint |
|----------------|-------------|-------------------|
| CREATE | POST	| `/create` |
| READ	| GET	| `/findAll` & `/find/{id}` |
| UPDATE | PUT	| `/update` |
| DELETE | DELETE | `/deleteById/{id}` |

I have used NOSQL database ***MongoDB***, to store the data. 
Database related settings are placed in _/src/main/resources/application.properties_ file.

## Requirements
- [JDK 1.8+](https://www.oracle.com/java/technologies/javase-downloads.html) - Java™ Platform, Standard Edition Development Kit
- [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
- [Maven](https://maven.apache.org/) - Dependency Management
- [Tomcat](http://tomcat.apache.org/) - The Apache Tomcat® is a Java Servlet container used as web server for running the application
- [MongoDB](https://www.mongodb.com/try/download/community) - MongoDB is a document-oriented database. It is a key feature of MongoDB. It is very simple you can program it easily.

## Differences between two Spring Boot Projects
This project is based on previous **[microservice-springboot-h2](/microservice-springboot-h2)** project. Both are very similar with specific changes related to database configuration. Given below are the changes:
- _pom.xml_
```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```
- _model=com.myzonesoft.microservice.todo.model.Todo_
```
 - instead of @Entity mark this model class with @Document, because everything is stored as Documents in MongoDB.
 - We don’t need @GeneratedValue on the primary key, as MongoDB would generate the primary key automatically. 
 - Primary key will be of type String, as it is a hexadecimal alphanumeric value.
```
- _repository interface = com.myzonesoft.microservice.todo.repository.TodoRepository_
```
 - Repository would extend the MongoRepository (instead of JPARepository earlier)
```
- _/src/main/resources/application.properties_ - We have to change the data source in this file and map the MongoDB related settings.
```
spring.data.mongodb.database=todoApp_db
spring.data.mongodb.port=27017
spring.data.mongodb.host=localhost
```

If we don’t specify _spring.data.mongodb.database=todoApp_db_, MongoDB server will create a default database called ***“test”***, when inserting first set of document.

Other than the above mentioned changes, no other changes are required to run this project.

URL to access the Microservice REST APIs, remains same (unless we decide to change the port): [http://localhost:8080/Todo/](http://localhost:8080/Todo/)