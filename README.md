# boot-rest-api
## Overview
A simple sample to implement a RESTful Web Service during [Forage Virtual Experience with Hewlett Packard](https://www.theforage.com/simulations/hewlett-packard-enterprise/software-engineering-pcij).
Simulatedly working as a software engineering, step by step, I used Java Spring Boot to build a RESTful web service that manages a list of employees. After that, I implemented a controller that supports HTTP GET, POST, and further PUT and DELETE by myself. Moreover, a set of tests were built to ensure the performance.
## ## Tools & Setup
- Spring Boot
- Gradle
- Lombok
- JUnit 5
- Mockito
- MockMVC  
Quick start with [Spring Initializr](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.3.2&packaging=jar&jvmVersion=22&groupId=com.example&artifactId=boot-rest-api&name=boot-rest-api&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.boot-rest-api&dependencies=web,lombok,devtools) as following.  
![spring-intializr-restful](https://github.com/wencanp/private-support-materials/blob/main/boot-rest-api/spring-intializr-restful.png)  
Other dependencies with Gradle: 
```
testImplementation 'org.junit.jupiter:junit-jupiter-engine'
testImplementation 'org.mockito:mockito-core'
implementation 'jakarta.persistence:jakarta.persistence-api'
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation 'org.springframework.boot:spring-boot-starter-validation'
```
Verifying with [postman](https://www.postman.com/)
## Commmand
`./gradlew build` to build the project
`./gradlew bootRun` to start the application
## Thanks
- [Forage simulation - hp software engineering](https://www.theforage.com/simulations/hewlett-packard-enterprise/software-engineering-pcij)
- [How to create a REST API using Java Spring Boot](https://www.geeksforgeeks.org/how-to-create-a-rest-api-using-java-spring-boot/)
- [Guide to Unit Testing Spring Boot REST APIs](https://stackabuse.com/guide-to-unit-testing-spring-boot-rest-apis/)
