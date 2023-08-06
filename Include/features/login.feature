@Login
Feature: Login feature
  As a user i want to login to presensi.com
  so i can see presensi homepage

  @2.1
  Scenario Outline: Verify user login feature
    Given user navigate to presensi.com
  	And user enter username as <username> and password as <password>
  	When user click sign in button
  	Then user verify the <condition> in step

    Examples: 
      | username  | password        | condition           |
      | 220102    | iGDxf8hSRT4=    | loginSuccess        |
      | 220102    | FiS47qEJyp0=    | passwordNotValid    |
      | 22010     | FiS47qEJyp0=    | usernameNotValid    |
      