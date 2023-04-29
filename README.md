# UserManagmentValidation
<center>
<h1> 🏚️USER MANAGEMENT SYSTEM (Validation)</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is a User management system built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The user data model is defined in the UserModel class with validation anotation, which has the following attributes:

userId :  @NotNull and unique identifier for each user <br>
userName : @NotBlank @NotEmpty @Pattern type name of the user <br>
dateOfBirth : @Pattern type used <br>
emailId : @Email @NotEmpty type used <br>
phoneNumber : @Size(min = 10 , max = 12) @PatternPhone type number of the user <br>
date : @Pattern type used <br>
time : @Pattern type used <br>


---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Add User </b>

* PostMapping: /addUser

This endpoint makes a call to method in userService class which is connected to database. In database we add a new user given through API.


* GetMapping: /getAllUser

This endpoint makes a call to method in userService class which retrieves data of all users from database. This data is sent to controller which is then sent through the API to client.


* GetMapping: "getUser/{userid}"

This endpoint returns data of specific user based on userid through API


* PutMapping

This endpoint makes a call to method in userService class which is connected to database. In database we update a user by userid given through API.


* DeleteMapping

This endpoint makes a call to method in userService class which is connected to database. In database we delete a user by userid given through API.


---
