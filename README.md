# WordFrequency


WordFrequency is a simple API developed using Java / Maven / Spring Boot. API counts the number of occurrences of each word in a given text input and returns 10 most frequent words and their frequency. 

## Building the project - How to Run 
You will need:

*	Java JDK 17.x 
*	Maven 3.8.1 or higher
*	Git

Clone this repository and use Maven to build the server.
Once successfully built, you can run the service.

Once the application runs you should see something like this

```
2023-01-08T23:51:33.777+01:00  INFO 23472 --- [           main] c.e.w.WordFrequencyApplication           : Starting WordFrequencyApplication using Java 17.0.2 
2023-01-08T23:51:34.480+01:00  INFO 23472 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-01-08T23:51:34.488+01:00  INFO 23472 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
```
## REST API
Connect to the API using Postman on port 8080 (or port Tomcat initialized).

REST endpoint to query for frequency of words -> "/count"

### Get word frequency of a given (posted) text

#### Request

`POST /count`

    curl -L -X POST "http://localhost:8080/count" -H "Content-type: text/plain" --data-raw "Banan Äpple Katt Hund Banan Hund Katt Hund"

#### Response

    HTTP/1.1 200 OK
    Date: Sun, 08 Jan 2023 22:26:41 GMT
    Status: 200 OK
    Content-Type: application/json
    
    { "hund": 3, "katt": 2, "banan": 2, "äpple": 1 }

### Author
* [Martina Curl] (https://github.com/martinacurl)
