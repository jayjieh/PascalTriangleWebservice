# Pascal Triangle Web Service
A web service for the Given an index k, return the kth row of the Pascal's triangle. For example, when k = 3, the row is [1,3,3,1].

## Prerequisites
Ensure you have Java 8 installed.. 
You can check the installed java version from terminal by running the following command:

----
    $ java -version
----
Making http request

----
    $http://localhost:8090/pascal?num=3
----
```
where num = kth value;
i.e num=3
reponds
 {"code": 200,"data": [1,3,3,1]}
```

After the application runs successfully you can access api documentation from http://localhost:8090/swagger-ui.html#/

## Build With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring Boot](http://spring.io/) - Java Enterprise Edition Framework

## Author
* Owori Juma.

