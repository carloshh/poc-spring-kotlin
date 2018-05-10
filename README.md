## springboot-kotlin

#### Latest build status [![Build Status](https://travis-ci.org/carloshh/springboot-kotlin.svg?branch=master)](https://travis-ci.org/carloshh/springboot-kotlin)

A Proof of concept of an API built with Spring Boot 2 and Kotlin that reverses any text and tracks a history of reversed texts.

Runing the service will requiere a Java 8 JVM:
```./gradlew bootRun```
The API call for reversing texts:
```curl -X POST http://localhost:8080/texts -H 'Content-Type: application/json' -d '{ "text" : "!dlroW olleH" }'```
The API call for querying the history of reversed texts:
```curl -X GET http://localhost:8080/texts```