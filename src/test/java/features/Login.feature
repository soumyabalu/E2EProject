Feature: Login into Application

Scenario Outline: login using credentials
Given initialize chromeDriver
And hit the url "http://www.qaclickacademy.com"
Then click on the login button to land on the homepage
When the user login using <username> and <password>
Then do the validation
And close the browser after action

Examples:

|username	       |password	|
|test99@gmail.com  |123456      |
|test98@gmail.com  |1234        |