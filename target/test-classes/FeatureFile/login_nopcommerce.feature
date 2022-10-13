Feature: Login 
Scenario: successful login with login credentials to NopCommercedemo
Given Launch browser 
When user opens url "https://admin-demo.nopcommerce.com/login"
And enter email as "admin@yourstore.com" and password as "admin"
Then click on login 