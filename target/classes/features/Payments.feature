Feature: Promolta Web Applocation Test

Scenario: Promolta Log-in Test
Given : User is on promolta Login page
When : User login with "Tss99@gmail.com" and "123456"
Then : Video checkout page is populated search "trump" and select the video 

Scenario: Promolta Payment Test 
When : appearance will displayed fill details and next
And : enter budget ammount "20" and print views
When : startcampaign payment popup page will displayed
Then :enter the card details "testcard" click on pay
And : check the payment is successful
