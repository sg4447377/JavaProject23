Feature: Test Login

  
  Scenario: Check login is successful for actitime100
	    Given open browser and navigate to url actitime100
	    When enter valid username and password actitime100
	    And click on login button actitime100     
	    Then click on logout actitime100
