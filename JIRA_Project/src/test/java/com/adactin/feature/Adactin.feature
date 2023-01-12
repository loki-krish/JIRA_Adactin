Feature: Validate the functionality of Adactin Hotel Booking Website 

@Ad1
Scenario: Login Page
Given user Launch The Adactin URL
When user Enter The "krishloe" In The Username Field
And user Enter The "abcd1234" In The Password Field
Then user Click The Login button And It Navigates To The Search Hotel Page

@Ad2
Scenario: Search Hotel Page
When user Select The "Brisbane" From The Location Dropdown 
And user Select The "Hotel Creek" From The Hotels Dropdown
And user Select The "Super Deluxe" From The Room Type Dropdown
And user Select The "1 - One" From The Number Of Rooms Dropdown
And user Enter The "10/01/2023" In The Checkin Date Field
And user Enter The "13/01/2023" In The Checkout Date Field
And user Select The "2 - Two" From The Adults Per Room Dropdown
And user Select The "1 - One" From The Children Per Room Dropdown
Then user Click The Search button And It Navigates To The Select Hotel Page

@Ad3
Scenario: Select Hotel Page
When user Select The Radio button In The Select Field
And user Select The Continue button And It Navigates To The Book A Hotel Page

@Ad4
Scenario: Book A Hotel Page
When user Enter The "Krish" In The First Name Field
And user Enter The "Louis" In The Last Name Field
And user Enter The "Church Town Street, Paris" In The Billing Address Field
And user Enter The "1234567890123456" In The Credit Card No. FIeld
And user Select The "American Express" From The Credit card Type Dropdown
And user Select The "May" From The Expiry Month Dropdown
And user Select The "2022" From The Expiry Year Dropdown
And user Enter The "345" In The CVV Number Field
Then user Click The Book Now button And It Navigates To The Booking Confirmation Page 
 

