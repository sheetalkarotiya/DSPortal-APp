Feature: QueuePage

  Background: user Registered and logged In into HomePage
    Given user Launch the Browser
    When user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password
    And user click the login button
    Given user successfully logged into Homepage


  @queuePage

  Scenario: Open the Queue page from the Data-Structures Dropdown

    Given user navigate to dropdown of data-structures
    When user click the queue button
    Then User should redirected to Queue page


  @queueTryHerePage

  Scenario: Redirect to try editor on Implementation of Queue in Python page

    Then User should redirected to Queue page

    When user click on Implementation of Queue in Python link

    When user click the try here button

    Then user should be redirected to the try editor page

  @queuePythonTryEditorValidSyntax

  Scenario Outline: Open the Implementation of Queue in Python page

    Then User should redirected to Queue page

    When user click on Implementation of Queue in Python link

    Then user should land on Implementation of Queue in Python page

    When user click the try here button

    Then user will land on TryEditor page

    When user enters the "<input>" in the test page

    When user clicks on Run button

    Then user should see output

    Examples:

      | input          |

      | print('hello') |


  @queuePythonTryEditorInvalidSyntax

  Scenario Outline: Display Syntx Error Message

    Then User should redirected to Queue page

    When user click on Implementation of Queue in Python link

    When user click the try here button

    When user enters the "<input>" in the test page

    And user clicks on Run button

    Then user should get an Syntx error message

    Then user clicks ok Button

    Examples:

      | input |

      | int O |

      | int n |

  @deQueueImplementation

  Scenario: Open the Implementation of collections.deque

    Then User should redirected to Queue page

    When user click on Implementation using collections.deque

    Then user should land on Implementation using collections.deque

  @deQueueTryEditor

  Scenario:User add input in the try editor box on collection.deque page
    Then User should redirected to Queue page

    When user click on Implementation using collections.deque

    Then user should land on Implementation using collections.deque

    When user click the try here button

    When user enters the "print('hello')" in the test page

    When user clicks on Run button

    Then user should see output

  @queueArrayImplementationPage

  Scenario: Open the Implementation using Array

    Then User should redirected to Queue page

    When user click on Implementation using Array

    Then user should land on Implementation using Array


  @queueArrayImplementationPageTryEditor

  Scenario: Open the Implementation using Array, click on try editor and run the code.

    Then User should redirected to Queue page

    When user click on Implementation using Array

    Then user should land on Implementation using Array

    When user click the try here button

    Then user will land on TryEditor page

    When user enters the "print('hello')" in the test page

    When user clicks on Run button

    Then user should see output

  @queueOperationTryEditor

  Scenario: User opens editor on Queue operations page and get output

    Then User should redirected to Queue page

    When user clicks on Queue Operations

    Then user should land on Queue Operations

    When user click the try here button

    Then user will land on TryEditor page

    When user enters the "print('hello')" in the test page

    When user clicks on Run button

    Then user should see output

  @queuepracticeHere
  Scenario: Open the practice here page

    Then User should redirected to Queue page

    When user click on Implementation of Queue in Python link

    When user clicks to the Practice Questions Button

    Then user redirected to the practice questions page


  @queuePageSignOut
  Scenario: Open the practice here page and sign out

    Then User should redirected to Queue page

    When user click on Implementation of Queue in Python link

    When user clicks to the Practice Questions Button

    Then user redirected to the practice questions page

    Then user will Sign out

  @queuePageSignOutMsg
  Scenario: Open the practice here page, sign out and get logged out message

    Then User should redirected to Queue page

    When user click on Implementation of Queue in Python link

    When user clicks to the Practice Questions Button

    Then user redirected to the practice questions page

    Then user will Sign out
    Then user will see logout message