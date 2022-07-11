# Contents of this file

* Introduction
* Requirements
* Installation
* How I built my application
* Test
* Troubleshooting
* FAQ


 # Introduction
------------

Before you  start the main project, there are two similar reimbursement application. 
One of them is without UI. Without UI package basically included all project requirements. You can check control the program with console.
Another package is demo1 has UI for all users but application is not working properly.

Reimbursement application is basically focusing user and admin experience and their control mechanism both user has control basic properties.
It is designed for Trip Companies and their needs.

# Requirements
------------

This project requires JAVA 11,JAVAFX and JUNIT 5:

* [JAVA 11](https://www.oracle.com/pl/java/technologies/javase/jdk11-archive-downloads.html)
* [JUNIT](https://junit.org/junit5/docs/current/user-guide/)
* [JAVAFX](https://openjfx.io/)


# Installation

JavaFX builds on top of JDK and is a standalone component. There are 2 different options for developing JavaFX applications:

* Use the JavaFX SDK (choosing between 11 LTS, the latest release 17.0.1 or an early access build).
* Use a build system (e.g. maven/gradle) to download the required modules from Maven Central (choosing as well between the same mentioned versions).

In any case, for both options, it is required to have a recent version of JDK 17, or at least JDK 11.

# How I built my application

At the beginning, I started to prepare an activity chart after when I planned the all processes of application. I prepared 
a flow chart for helping the coding algorithm. 
In the first package (Without UI) has two different Java classes. I started to work on first Receipts class and basically
this class is designed for basic calculations.
First step of user side to implement basic variables such as; Receipt Types, rates, instant variables... After that part
I follow my flowchart, and I continued to develop step by step. After the variables I started to plan which calculations
do ı need? because of this reason, ı added calculation methods for user side. In this way, ı could test the methods 
properly.

After the Receipts class, ı started to design main class of application. I implement basic instructions to users 
for example:  enter the user panel please press one... With few if conditions, ı completed the basic controls for users.

For admin panel was not easy like user panel, because you have to implement new rates, and you have got all these
variables any time to console. For this ı created setter and getter methods. In this way ı could change receipt types 
and rates for users. Application has two different rate for end-user, one of them is 15$/per day for ordinary 
receipts("Taxi","Hotel"Train","Air Ticket") other one is 0.3$/km/per day for who has car from end users. With setter 
getter methods admin can change the these rates.


Designing of main class was depend on receipt class' needs. For this reason first started to develop calculation side 
of application.

* Run only ApplicationStart Class for program. 


When ı finish all application without UI. Time to start for UI-classes connection. Basically application has 3 scenes
for users. When you launch the application with HelloApplication class you have log-in page for your choice. If you want
to use User page, you will see page for add receipt type, number of days. Basically I added all features from Receipts 
class. After the design visual part of program. I started to develop HelloController class. In this class ı created to 
same methods with Receipts class. Only differences from Receipt class, JAVAFX's methods.

For first scene of application ı used HelloController Class when I finished the first scene of program, ı created two 
different Controller class for End-user and Admin side. These two class have almost same methods with Receipts Class.
Unfortunately, ı had some difficult problems with JAVAFX's methods. Because of these reasons. UI is not working properly 
You can check the all methods and implementations from classes.


# Testing 

I added test folder to check application is working properly or not.

    * Test is only for Receipts Class but you can check the UI test folder, if you want.



# Troubleshooting & FAQ

* If the menu does not display, check the following:

    - Try to control JAVAFX version and restart the application

    - Control Maven and Java versions.
