Feature:
  login feature for librarian and student
@test
  Scenario: user login as librarian
    When user login as librarian
    Then librarian homepage is displayed

    When user login as student
    Then student homepage is displayed