Feature: Login Action

Scenario Outline: Successful login with Valid Credentials
Given User opens the application
When Users click on the signin link
And User enters "<username>" and "<password>"
Then Message displayed Login Successfully

Examples:
|username | password     |
|lalitha  | Password123  |
|admin    | Password456  |