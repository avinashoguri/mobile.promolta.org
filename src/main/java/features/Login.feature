Feature: Promolta Web Applocation Login

Scenario Outline: Promolta login Test
Given : User is on promolta Login page
When : User login with "<username>" and "<password>"
Then : Video checkout page is populated

Examples:
 |	username		|	password	|
 |avinash 			|	123123		|
 |sdfgh@gmail.com	|	0987654		|
 |cnjnfvn	|funfmvkvmi/v	|


