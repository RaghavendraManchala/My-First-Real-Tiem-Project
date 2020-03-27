@MercuryTours
Feature: Mercury Tours Website
  
  @TC_01
  Scenario: To Register
    Given the user launch the application in the browser
    When the user open the MercuryTours Registration page 
    Then the user fills all the Details
    And click on the Register button
    Then I validate the outcomes

	@TC_02
  Scenario: Valid Login
    Given the user launch the application 
    When the user Enters the valid username password
    And click on signin
    Then I validate the outcomes of valid login
    
  @TC_03
  Scenario: Invalid Login
    Given the user launch the application in browser
    When the user Enters the Invalid username and password
    And click on signin button
    Then I validate the outcomes of invalid login
    
  @TC_04
  Scenario: To Retrive HomeTable
    Given user launches the application in browser
    Then Read the Hometable
    And write the table in ExcelSheey
    Then I validate the outcomes of Retrived Table
    
  @TC_05
  Scenario: To Retrive any data from Cruises table
    Given the user launches the application in browser
    Then click cruises
    And Retrive any data from the table
    Then I validate 
   
   
 