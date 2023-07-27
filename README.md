# My Yatra App

This is "master" branch(main) of this repo; And presenting latest version (i.e, version no. 2) of the app. Old version is in "previous_version" branch of this repo.

It is the basic Android Application demonstrating how to use Create, Upload, Read operations & also simply how to deal with Database.


## Acknowledgements

We would like to express our sincere gratitude towards our guide Prof. Kirti Suryawanshi, 
Mini Project Coordinators Prof. Dr. Shaveta Malik for their help, guidance and 
encouragement, they provided during the project development. This work would have not been 
possible without their valuable time, patience and motivation. We thank them for making our 
stint thoroughly pleasant and enriching. It was great learning and an honor being their student. 
 
We are deeply thankful to Dr. Seema Bidey (H.O.D Computer Department) and entire team 
in the Computer Department. They supported us with scientific guidance, advice and 
encouragement, they were always helpful and enthusiastic and this inspired us in our work. 
 
We take the privilege to express our sincere thanks to Dr. L. K. Ragha our Principal for 
providing the encouragement and much support throughout our work.


## Abstract

“One of the important step for improvement is knowing what needs to be improved !”, this 
is why insights are one of the most important features of a good ticket managing system. 
The Project objective is to book and resell the tickets online. The Ticket Booking and 
Reselling System is an application based system. 
 
It can be accessed by anyone who has an Internet connection. User is required to login to 
the system and needs to search required tickets. For ticket reselling purpose the user needs 
to provide essential credentials of the ticket. Our ticket booking and reselling system 
provides an option to cancel the tickets done using credit card. People can book as well as 
resell the tickets  online at any time of day or night. The fair price ticketing curse occurs 
when an event organizer sells tickets at prices that do not correspond to underlying demand 
conditions, and does not want resellers to profit from resale opportunities.  
 
The curse has been exacerbated with the advent of online ticketing. Challenge is to facilitate 
genuine ticket exchange while eliminating resale for profit. None of the attempted public 
or private solutions solve the problem. We propose a simple project based on different 
ideas, information & facts. 
 
Let’s identify a key set of necessary conditions for it to work. And by analyzing, discuss 
recent technological innovations that facilitate its implementation.

##   List of Figures

-       1)  1.1 Idea Of Project  
-       2)  4.1 Algorithm 
-       3)  4.2 Architecture Diagram Of System 
-       4)  4.3 Working Flow Of System 
-       5)  5.1 Demo On Real Device 
-       6)  5.2 Demo On Virtual Device  
-       7)  5.3 User Database File 
-       8)  5.4 User data 
-       9)  5.5 Activity Database File 
-       10) 5.6 User Activity Data 


## Chapter 1: Introduction

### 1.1 Motivation : 
The goal of our project is to develop a full-stack database android application that 
provides users a service – reselling service free of convenience fees for both ticket buyers 
as well as sellers . 
 Ticket reselling is a huge market as many ticket holders are unable to directly refund 
their tickets and instead turn to online ticket reselling platforms to easily manage the 
chaos. 
 
### 1.1.1 Need Of The Problem : 
The traditional way of booking and canceling a ticket costs a lot , so why to cancel a 
ticket if you can resell it, that to from anywhere and at any desired time. It becomes 
inconvenient for the passenger to cancel the ticket and he or she faces the loss of 
money which can be easily recovered by reselling the ticket to someone who needs it 
 
### 1.2 Scope Of The Project : 
- We think that our system still has much more potential to grow & update as well.  
- Updated Mobile App versions, resolving bugs (if any).  
- Thinking about Book Bus Tickets, web view for platforms besides. 
- We will include more functions and introduce more widgets to the system.  
- We also plan to enhance the interface so it will looks more attractive and interactive.


![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/demo.png?raw=true)


## Chapter 2: Problem Statement 
 
### 2.1 Problem Statement : 
The traditional way of booking and canceling a ticket costs a lot ; so why to cancel a 
ticket if you can resell it, that to from anywhere and at any desired time. 

### 2.2  Features : 
- Easy to use & handle the application. 
- Book or Resell from anywhere & at any desired time. 
- Direct contact to buyer, which actually saves the time. 
- No any brokerage charges or any other. 
- Full safety is provided. 
- Remove the offer anytime. 
 
### 2.3 Objectives : 
- First to overcome from loss of money. 
- To overcome from stress or tension about ticket. 
- To save the valuable time. 
- To seek the available service.  
- Resell a ticket before it expire & take benifit. 
- To connect the people. 
- To help the common people. 
 
### 2.4  Specifications Of The System : 
- Keep records of every & new user. 
- Registered user can manage his profile. 
- Provide security of user-data, passwords, activity, etc. 
- Deals with correct data only. 
- Deals with the user activity. 
- Get notified on resale ticket. 
- Gives the instant results in application of every activity.

## Chapter 3: Literature Review 
 
### Existing System & It Limitations :  
The present transportation system actually utilizes the brilliant card and token system. 
Additionally, individuals need to remain in lines for extended periods. 
 
Far more queues, If you book your train tickets urgently, you have to stand in a line or maybe a 
queue to wait the turn of yours, which also not confirmed. Due to waiting in que, rich out stations 
in right time causes the Wastage of time. Even though we’ve option to resell to get refund in 
some cases get the Loss of money. 
 
While looking for urgent tickets, the every common man thinks the risk of Unsecure 
transactions, it could be seller or buyer. There are numerous Unexpected frauds were 
happened on many fake websites. Also it’s very Hard access to ticket as many times there is 
Tricky terms & conditions. These whole things creates the unnecessary stress to buyer 
most of the times. And seller by facing Too much Penalty fees. And because of this the 
tremendous Unused slot wastage. 
 
### Solution To Overcome These Limitations Of Existing System : 
We are just an information platform connecting ticket holders vs seekers. My Yatra App is 
the best way for transferring the tickets. It is an open interaction platform that connects 
people with the right ticket sellers or buyers, quickly and cost effectively. You and He; Buy it 
or sell it ! Almost all the limitations are overcome by using a reselling concept.

## Chapter 4: Design & Implementation

### 1. Tech Stack

**Developer:** Java, Android Stdio SDK

**Server:** SQLite Database

**Client:** Smartphone with minimum 2GB RAM,  minimum API level of 21


### 2. Flowchart :  


![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_4.1.jpg?raw=true)

User need to first register while entering the app and can also get connected through Google, 
due to the Google connectivity available in the app.

As the user has logged in through app his data will be securely stored in database but if user 
has connected through Google account then data will be secured at Google end.

User can resell multiple tickets at same time. User need to mention the source that is the user’s current place and destination till where he wish to travel . So we thought of continuing with this interesting idea and created our project about ticket reselling.


### 3. Architecture Diagram Of System : 


![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_4.2.png?raw=true)


### 4. Working Flow Of System :

![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_4.3.png?raw=true)


## Chapter 5: Results & Discussions

![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_5.1.jpg?raw=true)



![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_5.2.1.png?raw=true)



![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_5.2.2.jpg?raw=true)



![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_5.2.3.jpg?raw=true)



![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_5.3.jpg?raw=true)



![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_5.4.png?raw=true)



![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_5.5.jpg?raw=true)



![](https://github.com/MrHAM17/My_Yatra_App/blob/master/Rough%20Work%20&%20Data/Used%20Images/Fig_5.6.jpg?raw=true)



## Chapter 6: Conclusion and Future Scope

### 6.1 Conclusion : 
Our resale platform solves these issues (as discussed above in report). We can verify that 
tickets being returned and resold are genuine. Therefore there is no risk of buying a 
fraudulent ticket. We also only allow resale at face value to prevent ticket touting for 
profit. You can also rest assured that refunds will be processed in an official, timely 
manner. We're gradually rolling this out with more events becoming applicable all the 
time  

So, concluding our project with the understanding of basic Android Studio, basic Java 
Programming Language, Teamwork & all, How to handle a real life project, And many 
more things; Also last but not the least i.e, solution for our aim of the project.  
 
### 6.2 Future Scope : 
Do it Yourself (DIY) booking tool on Web as well. Access to Special Fares with Free 
Rescheduling & more. Detailed, Real-time booking & cancellation Reports. 
100% GST compliant. Dedicated, On-Site Travel Desk with 24x7 Support. Multi
level Policies, Approvals & Configurations with ability of building customised solutions.
## Lessons Learned

Our resale platform solves these issues (as discussed above). 
We can verify that tickets being returned and resold are genuine. Therefore there is no risk of buying a fraudulent ticket. 
We also only allow resale at face value to prevent ticket touting for profit. 
You can also rest assured that refunds will be processed in an official, timely manner. 
We're gradually rolling this out with more events becoming applicable all the time  

So, concluding our project with the understanding of basic Android Studio, basic Java Programming Language, Teamwork & all, How to handle a real life project, And many more things; 

Also last but not the least i.e, solution for our aim of the project.  

## Documents

Project Report

![PDF](https://github.com/MrHAM17/My_Yatra_App/blob/master/Prject%20All%20IMP%20Docs/Mini%20Project%20Report.pdf)



For more details,
Kindly Check the 1st folder of this repo i.e, "Prject All IMP Docs"


App Logo

![Logo](https://raw.githubusercontent.com/MrHAM17/My_Yatra_App/master/Rough%20Work%20%26%20Data/Used%20Images/My%20Yatra%20App%20Logo.webp)


## Installation

Install my-project with:
- Android Stdio SDK

## Used By:

This project is can be use by :

- Persons who want to cancel their tickets(But non-refundable policy is there).
- Persons who are arjently looking for tickets(When directly not available from 1st services).
- Companies which closely deal with such facilities.


## Optimizations

Looking for further optimizations in code:  
- Searching Required Data
- Access to Special Fares with Free Rescheduling & more
- Do it Yourself (DIY) booking tool on Web as well 
- Detailed, Real-time booking & cancellation Reports 
- 100% GST compliant
- Dedicated, On-Site Travel Desk with 24x7 Support
-  Multi level Policies, Approvals & Configurations with ability of building customised solutions. 
- Performance Improvements

## Reference:

- Jianwen Wang,  
“An Evaluation of the Operation of the Railway E-Ticketing System”, April-2012 

- Dr.Gajraj Singh Ahirwar, 
“A Study of E-Ticketing System and Its Value in Indian Railways”, 2018


      ![PDF](https://github.com/MrHAM17/My_Yatra_App/blob/master/Prject%20All%20IMP%20Docs/Literature%20Review/A_Study_of_E_Ticketing_System_and_Its_Value_in_Indian_Railways_ijariie14794.pdf)

- Pascal Courty, 
“Ticket resale, bots, and the fair price ticketing “, 2019 
 

      ![PDF]([https://github.com/MrHAM17/My_Yatra_App/blob/master/Prject%20All%20IMP%20Docs/Literature%20Review/A_Study_of_E_Ticketing_System_and_Its_Value_in_Indian_Railways_ijariie14794.pdf](https://github.com/MrHAM17/My_Yatra_App/blob/master/Prject%20All%20IMP%20Docs/Literature%20Review/FPT0119JCEA.pdf))


- Ticket transfer Website
   - https://www.tickettransfer.in/ 
 
- Book Bus Yatra Website
   - https://www.yatra.com/bus-booking 

- Skiddle Website
   - https://www.skiddle.com/features/ticket-resell.php 

- Youtube
   - https://youtu.be/F_UemS493IM
   - https://youtu.be/j1K5GTDycfg
   - https://youtu.be/asguThv4vkE
   - https://youtu.be/58CM8e80XYw
   - https://youtu.be/mufbi0A6EuI
  
- LinkedIn 

- Github 
