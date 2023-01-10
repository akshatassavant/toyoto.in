#Author: Akshata Savant
#creation date: 09 jan 2023
Feature: Visit Toyoto

@toyoto
  Scenario Outline: Purchase Toyoto car
    Given user navigates to toyoto car website
    Then click on Moduls menu
    And click on Buy Online from list of cars
    And click on Configure & Buy button
    And click Choose and available now button
    And click on Buy now button and add to cart
    Then validate the product is added to the cart
    And click on Make your choices button and choose "<area>" and "<showroom>"
    And click on select finance
    And click on pay deposit
    And click on register now

    Examples: 
      | area  | showroom             |
      | Dubai | Toyoto Dubai Airport |
