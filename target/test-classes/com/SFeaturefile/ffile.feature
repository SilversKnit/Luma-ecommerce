@Purchase
Feature: LUMA website Item Purchase Functionality

	@Item1
	Scenario: Select an Item and Add to cart 
	Given user Enter "https://magento.softwaretestingboard.com/" To Launch The Website  
	When user Choose The Size Of The Item1
	And user Choose The Color Of The Item1
	And user Add To Cart To Add Item1
	Then Hover and Click Mens Hoodies In Mens Dropdown List To Naviagte To The Hoodies Section
	
	@Item2
	Scenario: Select Another Item and Add to cart
	When user Choose The Size Of The Item2
	And user Choose The Color Of The Item2
	And user Add To Cart To Add Item2
	Then user Click My Cart 
	And user Click Proceed To Shiping Page 
	
	@Shipping
	Scenario: Enter Shiping Details To Purchase
	When user Enter "mail123@mail.com" In The Email 
	And user Enter "Jon" In The Firstname
	And user Enter "Wick" In The Lastname 
	And user Enter "Apple Inc" In The Company 
	And user Enter "1/18, london street" In The First Address
	And user Enter "Middle Area" In The Second Address
	And user Enter "Chelsea" In The Third Address
	And user Enter "London" In The City
	And user Select "Georgia" In The State
	And user Enter "12345-6789" In The Zipcode
	And user Select "United States" In The Country
	And user Enter "033 8974526" In The Phone
	And user Click Radiobutton for Delivery Charge	
	Then user Click Nextbutton To Navigate To Purchase Confirmation Page
	
	@Order
	Scenario: Palce The Order 
	Then user Click Place The Order To Purchase Completion
	And user Click Continue To Resume Shoping   
	
	
	