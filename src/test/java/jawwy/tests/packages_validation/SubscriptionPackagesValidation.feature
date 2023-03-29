Feature: Subscription Packages Validations

  Scenario Outline: Validate the subscription packages type & price and currency

    Given user is on the home page
    When change the language to english
    And select the country "<country>"
    And check the package typ "<type>"
    Then check the package price and currency from "<type>" equal "<value>"

    Examples: UAE country subscription packages
    |type      |value          |country       |
    |LITE      |5.4 USD/month  |UAE           |
    |CLASSIC   |10.9 USD/month |UAE           |
    |PREMIUM   |16.3 USD/month |UAE           |

    Examples: Algeria country subscription packages
      |type      |value          |country       |
      |LITE      |2.7 USD/month  |Algeria       |
      |CLASSIC   |5.3 USD/month  |Algeria       |
      |PREMIUM   |8 USD/month    |Algeria       |

    Examples: Palestine country subscription packages
      |type      |value          |country       |
      |LITE      |2.4 USD/month  |Palestine     |
      |CLASSIC   |4.8 USD/month  |Palestine     |
      |PREMIUM   |7.2 USD/month  |Palestine     |