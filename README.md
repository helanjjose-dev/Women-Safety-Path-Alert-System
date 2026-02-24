## Women Safety Path Alert System

## Team Members

• Helan J Jose
•Nanditha S Kumar


## Project Title

Women Safety Path Alert System



## Problem Statement

Women may face dangerous situations where immediate help is needed. There is no quick and simple way to alert emergency contacts and share their location instantly using a desktop system.



## Objective

To develop a Java Swing based application that allows users to:

• Store emergency contacts
• Send emergency alert messages
• Share location
• Trigger emergency alert quickly


## Features

• Add emergency contacts
• View and delete contacts
• Emergency trigger button
• Share location
• Fake call feature



## Technologies Used

• Java Swing (GUI)
• MySQL Database
• JDBC Connectivity
• Java AWT


## Database Details

Database Name: safepath

Table Name: contacts

Fields:

• id
• name
• phone



## Steps to Run the Program

1. Install MySQL Server

2. Create database:

CREATE DATABASE safepath;

3. Create table:

CREATE TABLE contacts (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
phone VARCHAR(15)
);

4. Open project in NetBeans / Eclipse

5. Run:

WomenSafetyHome.java



## Screenshots of GUI

Screenshots are available in the screenshots folder:

• Home Page
• Add Contact Page
• View Contacts Page
• Emergency Trigger



## Sample Input

Name: Anu
Phone: 9876543210


## Sample Output

Contact Added Successfully

Emergency Alert Sent to All Contacts





## Conclusion

This system helps improve safety by providing quick emergency alert functionality and contact management.



## Author

Helan J Jose.

