Feature: Login Controller Test

  Scenario: Testing Get Endpoint
    Given url 'http://localhost:8080/users/123/login'
    When method GET
    Then status 302
