# Introduction
This project automate the wesite (https://www.tamanna.com/) main High level scenarios:
- As a guest user add two items from different categories (Women, Men, Kids, Beauty, Home, or
Harvey Nichols) to the cart
- Navigate to the order summary page/screen (Go to the shopping bag) and then create validations
for the total price and quantity of items.
- Now remove the items from the cart and validate that the total price is zero.
- Finally, navigate back to the home/screen page and validate that you are there. , it's developed using Selenium Cucumber BDD Framework with Java implemented with page object model framework.
# Pre-requists
JDK version 1.6 or higher, IntelliJ IDEA

# About My Framework

This framework mainly include 1- Base folder (main/java/Bases) including all the base classe which have the main setup of the webdriver and it's functionalities 2- Pages folder (main/java/pages) include all pages classes which have the webelements locating + the methods which handle test cases steps 3- Features folder (test/java/Features) including the features files and the scenarios written in Gherkin Language. 4- Runners folder (test/java/Runners) including the options interface which handle the test execution, reporting .etc. 5- Tests folder (test/java/Tests) including the step definition of each scenario and test cases implementation 6- target folder having the reports files.

Please Make sure you have the POM.XML file which have all needed libraries and Jar files for running the project.
