@tag::header[]
Feature: Validate Login in the page NewTours.com
  I want to validate the user and the password in the login newtours

  Background: I am going to validate the steps to correct login in the page newtours

  @end::header[] @tag::wrong_scenario[]
  Scenario Outline: Title of your scenario
    Given the user open the browser in the login page of newtours.com
    When this user write the username <user> in User Name: and the password <password> in Password:
    And the user presses click on the submit button
    Then the user should see the option <option>

    @end::wrong_scenario[]
    Examples: 
      | user    | password | option   |
      | johan   |     1234 | SIGN-OFF |
      | johanes | dfad     | SIGN-OFF |
      | johanes |    12345 | SIGN-OFF |
