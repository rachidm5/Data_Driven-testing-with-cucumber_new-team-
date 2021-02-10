
Feature: Home page
  Background:
    Given the user Lands in Stat farm home page

#  Scenario: S-01 get to the home page
#    When user enter the state farm url on the browser
#    Then  user should see the state farm home page lunched
#
#    Scenario:S-02 Zip code verification
#      Given the user Lands in Stat farm home page
#      When user enter valid "Zip code" in the zip code text box
#      And user click on the Start quote button
#      Then new page appears to file up the information needed for the quot
#
#      Scenario: S-03 search box verification
#        When user click on search link search field should appears
#        And  user enter "text" in the search box And click on search button
#        Then new Result page should appears

  Scenario Outline:S-04 Search multiple services
    When I click on search link search field should appears
    And I Enter "<service>" in search input field
    When I click search button
    Then I should see "<ExpectedResult>"

    Examples:
      |service|ExpectedResult|
      |Auto|Auto|
#     |Life Insurance|Life Insurance|
     |Banking|yyyanking|

#  Scenario Outline:S-05 Search multiple services
#    When User click on search link search field should appears
#    And  User Enter "<ActualResult>" in search input field
#    When User click search button
#    Then User should see "<ExpectedResult>"
#
#    Examples:
#      |ActualResult|ExpectedResult|
#      |ActualResult1|ExpectedResult1|