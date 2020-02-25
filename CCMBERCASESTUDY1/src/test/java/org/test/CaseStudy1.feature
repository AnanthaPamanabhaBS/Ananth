Feature: To register to the testme app

Scenario Outline:
Given User Enters the UserName 
When enters "<userName>", "<firstName>", "<lastName>" , "<password>" , "<confirmPassword>"  , "<emailAddress>" , "<mobileNumber>" , "<dob>" , "<address>"  ,  "<Answer>" 
Then user navigates to login page

Examples: 
|userName|firstName|lastName  |password|confirmPassword|gender|emailAddress|mobileNumber|dob       |address|SecurityQuestion             |Answer|registerbutton|
|ananaa  |Anantha  |padmanabha|ananth12|ananth12       |male  |an@gmail.com|8217353049  |21/04/2018|chennai|Which is your favourite color|blue  |click         |