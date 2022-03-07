Feature: Hotel Booking app

Scenario: User want to login the application
 Given User want to launch the apllication
 When User enter the valid username and password
 |sreeravindhar|Sree@8144|
 |AbC|123|
 And  User want to click the login button
 Then user want to validate the credintials

 
Scenario: User want to search the required hotel

Given User need to move to search hotel page
When User need to select the loaction
And User need to select the Hotel
And User need to select the RoomType
And User need to select the No of rooms
And User need to Fill the Check in date
And User need to Fill the Check out date
And User need to select the No of Adults
And User need to select the Children per room
And User want to click the search button
Then User need to validate the the functions are worked properly


Scenario: User want to select the hotels
Given User need to move to select hotel page
And User need to select the required Hotels
And User nee to click the continue button
Then User need to validate the the Hotels are selecte properly

Scenario: User want to fill the personal details for Booking
Given User want to enter the First and Last name
And User want to enter the Billing address
And User want to fill the credit card details
And User want to select the card type
And User want to select the Month & Year
And User want the enter the cvv Number
And User want to click the Book now button





