Feature: As a user Login page of library

  Background: Open the login page
    Given open the login page

    @Student
  Scenario Outline: student user is login
    And enter the user name "<username>"
    And enter the password "<password>"
    And click the login button
    And user can see dashboard

    Examples: user credentials
      | username         | password    |
      | student5@library | libraryUser |
#      | student6@library  | libraryUser |
#      | student21@library | libraryUser |
#      | student31@library | libraryUser |
#      | student51@library | libraryUser |

    Scenario Outline: librarian user is login
      And enter the user name "<username>"
      And enter the password "<password>"
      And click the login button
      And user can see dashboard

      Examples: user credentials
        | username            | password    |
        | librarian5@library  | libraryUser |
        | librarian5@library  | libraryUser |
        | librarian32@library | libraryUser |
        | librarian53@library | libraryUser |
        | librarian25@library | libraryUser |
