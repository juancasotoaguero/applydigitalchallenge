# Java Backend Technical Test

Welcome to the Java Backend Technical Test! This test is designed to assess your knowledge and skills in backend development.

The detailed instructions and requirements for this test are defined in the file `CHALLENGE.md` file. Please read it carefully before starting.

Good luck!

# Project Name

retriveArticles.

## Prerequisites
- Java 17
- Docker
- Docker Compose

## Installation and Usage
-1. Clone the repository
-2. Open git bash an go to **/juan-aguero-java-be-/retriveArticlesApi
- ![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/874d5d99-8268-4561-9a1c-77be8752c6ba)

-3. Generate the jar. Execute: ./mvnw clean package -DskipTests
- ![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/ed0f2807-aa40-4503-a458-9bbbed87d7bc)

-4.Build the docker images with the application and the database postgres: docker-compose build java_app
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/f65a2722-10cb-413e-b939-3dc8f2028cfe)

5- Execut the docker-compose: docker-compose up
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/d3244dfd-7909-4697-bb02-d76bbec156be)

6- Test the aplication with postman 
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/c03e221f-7b0f-4e8c-94dd-fdd06befd719)
You have to import this collection with these 4 endpoints
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/b1a95cfc-b9f9-4248-b5fc-4e6eebed35fb)

7- You have to create a new user with ypur name, email and password
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/a0aedfab-2886-47c4-9cd3-1d08444c6a63)

8- Then you have to sign in with your email and password
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/57ae6ba6-cf84-4dc3-a8ca-7fd9269fa069)

9- To test the getArticles endpoint , you have to copy the token of the sign in response here
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/0356a9e4-5c5a-4902-9038-e2bba6568e8c)

10- You have the filter to get the articles
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/b502a905-b4b4-41ec-8afb-67369ab75a08)

10- To Delete articles. 1. Copy the token in the authorization part, and add the objectId
 in the path ![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/ce8d34b9-a61f-4bf3-b982-5fe76e601c07)
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/064ae044-8b8b-4182-8444-32246babd386)
![image](https://github.com/reigncl/juan-aguero-java-be-/assets/18018252/3bd09fc7-a9fb-43d4-bf13-b7b6d3bfb1c7)











