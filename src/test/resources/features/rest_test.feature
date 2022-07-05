#Author: caaescof@gmail.com
Feature: Use REST API for a test

  @get1
  Scenario: Method GET all
    When I GET the result of the employee list
    Then the response has following response status success

  @get2
  Scenario: Method GET one
    When I GET the result one employee
    Then the response has following response status success

  @delete
  Scenario: Method DELETE employee
      When I DELETE one employee
      Then the response has following response status success

  @post
  Scenario: Method POST Create employee
    When I Create one employee
    Then the response has following response status success employee created