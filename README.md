# Spring Boot + GraphQL + Postgresql example



## Run Spring Boot application
```
mvn spring-boot:run


## Test:

Go to postman 
Choose GraphQL

{
    findAllTutorials{
        id
        title
        description
        author {
            id
            name
        }
    }
}


```
