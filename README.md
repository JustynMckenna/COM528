# COM528
## The Application
So that we could begin working on this project all of the developers came together and decided which part everyone was going to do. We all communicated by meeting up in the libary, calls and messages this was so that we could all help and guide eachother when making improvements in the web application.

The developers involved in this project were:

Sheena Nayee

Chloe chase

Titus Mahendran

Justyn McKenna

The application is built by using enterprise Java technologies that has a multi-module Maven project structure. It has a Java Server Page for the front end with JavaScript to generate the user interface. The user interface communicates to the Java Server Page by using a simple HTML form. All the projects in the project have a comprehensive unit test.

## Using the Application
When running NetBeans the web application is deployed by default to the localhost
http://localhost:8080/

However, due to the login page not allowing the user into the bank application using there login detials because the login page isn't fully functional. So in order to load the bank application then the user is able to type in the web address http://localhost:8080/transaction.jsp

The numeric pad uses the numeric buttons to navigate through the menu for the user to add their card details.
Please note that this application is built and tested for 1 browser instance per device. Use cases for multiple browser instances open on the same machine have not been tested and may cause error.

## Configure Properties

The default properties file can be located at 
COM528-B6-BankApplicationWeb\src\main\webapp\properties.jsp
With the properties the user can edit the default properties when running the application. The edited properties that the user has updated will then become the priority properties.

Recipient name – This is the name on the card that the user must fill out.

Recipient ccnumber – This is the Card number that the user must fill out.

Recipient issue number- This is the issue number that the bank issues once the card details is filled out.

Recipient end date – This is the cards end date that must be filled out.

Recipient cvv – This is the CVV that is on the back of a card that must be filled out.

## System Requirements 

The system requirements for this application are:
•	A system running Windows 10 or newer.
•	Java JDK version 8 or newer.
•	Apache Maven 3.8 or newer
•	Apache Tomcat 9
•	One of the following web browsers: Google Chrome, Mozilla Firefox or Microsoft Edge. Internet Explorer is unsupported by this application.

## Building/testing the application

In order to build the project, the command line needs to be put into the root folder so that the project will build it with maven so that it will also run the tests for the project.
mvn clean install

## Use case
There is many differnet cases that a user is able to use this application. Here is a few examples below:
## User
![use cases user](https://user-images.githubusercontent.com/55873908/142461518-e5fb6978-28a0-4659-a23f-d30a7b71df44.PNG)
## Admin
![use cases admin](https://user-images.githubusercontent.com/55873908/142461528-fe7a1934-cf5f-409e-90dd-18f8f432b16a.PNG)



## Test case
![image](https://user-images.githubusercontent.com/55873908/142430731-405ab521-c468-45f9-9098-43eabb06d674.png)



## Error Notice

If you receive errors for unknown reasons, then please clear your tomcat\temp and your tomcat\logs directly and then try running the application again.
j
