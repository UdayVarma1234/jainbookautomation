Feature: Placingorder

Background: open browser
Given  I have browser with jain book agency

Scenario: Selecting payment method 
When  I should select book and I should add to cart and I should select location 'Andhra Pradesh' and I should login 'karanammahesh321@gmail.com','Mahesh1234' and I should select payment method  
Then Assert on presence of element 'PayPal/ Credit / Debit / ATM Card'


Scenario: Select book in Hot bargin 
When  I should click on hotbargin and I should click on search and enter the book title 'architectural graphics'
Then Assert on presence of book '0'


Scenario: Check user is able to subscribe to news letter 
When  I should click on subscription and I should enter my mail 'mubv1234@gmail.com' 
Then I should check subscriber mail is present or not 'mubv1234@gmail.com'

Scenario: Add to cart
When I should select book and add to cart
Then I should remove book from cart  

Scenario: Click on logout 
When  I enter wrong login details from Excel "src/test/resources/Excel/jainbook.xlsx" with SheetName "validcrediential"
Then I should logout from the page 