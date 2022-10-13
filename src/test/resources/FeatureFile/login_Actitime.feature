Feature: Test Login
  
  Scenario Outline: Check login is successful for actitime
    Given open browser and navigate to url actitime
    When enter valid <username> and <password> actitime
    Then click on login button actitime
  
    
    Example:
       | username | password |
       | admin    | manager  |
       | trainee  | trainee  |
       | test     | test     |
