**EmbeddedH2Database** is the sample project to know how to connect to the H2 Database. 

We need to include the below dependency of need to select the H2 support while creating the Spring project from initializer.
```xml
<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>
```
We have to add the below property in the application.properties file to enable the H2-Console.
```properties
    spring.h2.console.enabled=true
```
So you can access the h2-console with the below url after your application started successfully.
```
    http://<host>:<port>/h2-console
```
Database Queries to create table:
```sql
CREATE TABLE SAMPLE(id int primary key,name varchar(50),location varchar(100));
```
You have to configure the H2 Database properties in application.properties to get connection with database. 
Here are the list of properties which I have placed to created Hibernate SessionFactory.
```properties
spring.datasource.url=jdbc:h2:~/test
spring.datasource.username=sa
spring.datasource.password=sa
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.show-sql=true
spring.jpa.format_sql=true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.current_session_context_class=org.springframework.orm.hibernate5.SpringSessionContext
```
I have used the JpaRepository to interact with the Database and using predefined methods in JpaRepository.

You can use Postman to test this application and use the below api for CRUD operations.
```
Created : /api/save
Update  : /api/update
Delete By Id  : /api/deletebyid/<id>
Select  : /api/getalldata
Select By Id  : /api/getalldata/<id>
```
