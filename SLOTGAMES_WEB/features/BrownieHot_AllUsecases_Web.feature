Feature: Test all the functionalities of Brownie Hot SLOT Game


#                      Auto Spin option feature testing.

#	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
#    Then System should keep performing the spins in Brownie Hot slot game

    
    
#                       Auto spin option with 10spin feature testing

#    Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
#    When Open the Brownie Hot  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 Brownie Hot slot game
    
    
#                     Auto spin option with 20spin feature testing
    
#    Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Brownie Hot slot game
	
	
	   #	        According to bet type, bet values has to be generated respectively
	
#	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.3,0.6,1.5,3,6 in Brownie Hot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01 and bet value as 0.3,0.6,1.5,3,6
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value
#    Then Bet value should get changed 0.3,0.6,1.5,3,6 if the bet type selected as 0.01 from the drop down one in Brownie Hot slot game
	
	
#	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 0.9,1.8,4.5,9,18 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot game, bet type as 0.03 and bet value as 0.9,1.8,4.5,9,18
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 and check the bet value should be 0.9,1.8,4.5,9,18
#    Then Bet value should get changed 0.9,1.8,4.5,9,18 if the bet type selected as 0.03 from the drop down two in Brownie Hot slot game
	
#	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 1.5,3,7.5,15,30 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.05 from down and bet value as 1.5,3,7.5,15,30
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from down  and check the bet value should be 1.5,3,7.5,15,30
#    Then Bet value should get changed to 1.5,3,7.5,15,30 if the bet type selected as 0.05 from the drop down three in Brownie Hot slot game
	
#	Scenario: Select the bet type as 0.2 from the drop down and check the bet value should be 6,12,30,60,120 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.2 from drop down and bet value as 6,12,30,60,120
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 from drop down and check the bet value should be 6,12,30,60,120
#    Then Bet value should get changed to 6,12,30,60,120 if the bet type selected as 0.2 from the drop down four in Brownie Hot slot game
   
#                      Amount transfer to the game balance
    
#    Scenario: To check the transferred amount is added to Brownie Hot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot game, balance, text field to transfer balance and Ok button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok button
#    Then The exact amount entered in the transfer page should transfer to Brownie Hot game and same amount should get displayed on the balance section
   
#                      Amount transfer greater than the Available balance
    
#    Scenario: Check whether the player is able to transfer the amount more than the available balance
#    Given Chrome browser, valid URL, valid login details, Brownie Hot game, balance greater than available balance, text field to transfer balance, Ok button and validation message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok button
#    Then Player should be blocked from loading the Brownie Hot game when the amount entered in the transfer page is more than the available balance
    
#                       Null  value and check for valid result

#    Scenario: Check whether balance field is accepting null valuess in the transfer page of Brownie Hot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot game, empty balance, text field to transfer balance, Ok button and validation message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, do not enter the amount in the balance field and click on Ok button
#    Then An error should be displayed if the balance field is empty and player should be blocked from loading the Brownie Hot game
	
	
#	                         Check whether accepts zero amount input

#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of Brownie Hot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot game, zero balance, text field to transfer balance, Ok button and validation message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok button
#    Then An error should be displayed if balance entered was zero and player should be blocked from loading the Brownie Hot game


        #      _Balance_Credits_Calculations_Validation

#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, credits and denomination as 0.01 
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
#    Then Balance amount should be same as denomination 0.01 multiplies by credit in Brownie Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in Brownie Hot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, credits, denomination drop down and denomination as 0.03
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.03 and check the balance
#    Then Balance amount should be same as denomination 0.03 multiplies by credit in Brownie Hot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game window, balance, credits, denomination drop down and denomination as 0.05
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.05 and compare the balance
#    Then Balance amount should be same as denomination 0.05 multiplies by credit balance in Brownie Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.2 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, credits and denomination drop down & value as 0.2
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.2 manually with and check the balance
#    Then Balance amount should be same after multiplying denomination 0.2 by credit in Brownie Hot slot game
   
   
   #                 Validation on win amount is added to the main balance when clicked on collect 
	
#	 Scenario: Check whether winning amount is getting added to the balance
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, transfer button, spin button and win amount
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win
#    Then Win amount should get added to the balance after win and balance should get added with win amount
  
  
    #	              WIN AMT TO CREDIT FORM AND VICE VERSA VALIDATION	            

#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Brownie Hot slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
#    Then Win amount in credit multiplied by denomination is equal to win amount in currency in Brownie Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Brownie Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Brownie Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Brownie Hot slot game
    
  
       #           Bet value validation for 0.01 credit with different bet values, within the transferred balance range.

#    Scenario: Change the bet value as 0.4, do the spin and check whether balance is deducting according to the changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.01, bet value as 0.4, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 0.4, click on spin button and check the balance
#    Then Balance should get deducted by 0.4 as bet type is selected as 0.01 and bet value as 0.4 in FortyGlowing Hot game
#	
#	
#	Scenario: Change the bet value as 0.8, do the spin and check whether balance is deducting according to the changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, bet type as 0.01, bet value as 0.8, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, click on spin button and check the balance
#    Then Balance should get deducted by 0.8 as bet type is selected as 0.01 in FortyGlowing Hot game
#	
#	
#	Scenario: Change the bet value to TWO, click on spin button and check whether current balance is deducting according to changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.01, bet value as TWO, balance, spin button and win amount
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWO, click on spin button, check the win amount and check the balance
#    Then Current Balance should get deducted by TWO as bet type is selected as 0.01 and bet value as TWO in FortyGlowing Hot game
#	
#	
#	Scenario: Change the bet value as FOUR, do the spin and check whether balance is deducting according to changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.01, bet value as FOUR, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FOUR, click on spin button and check the balance
#    Then Current Balance should get deducted by FOUR as bet type is selected as 0.01 and bet value as FOUR in FortyGlowing Hot game
#	
#	
#	Scenario: Change the bet value as Eight, click on spin and check whether existing balance is deducting according to changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, bet type as 0.01, bet value as Eight, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value to Eight, click on spin button and check the slot game balance
#    Then Existing Balance should get deducted by Eight as bet type is selected as 0.01 and bet value as Eight in FortyGlowing Hot slot game
    
    
        #	  Bet value validation for 0.02 credit with different bet values, within the transferred balance range.
	
	
#	Scenario: Set the bet value as 0.8, do the spin and check whether balance is deducting according to the changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, 0.02 as bet type , 0.8 as bet value, balance, spin button , win amount and balance amount
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet value to 0.8, click on spin button and check the balance
#    Then Balance should get deducted by 0.8 as bet type is selected as 0.02 in FortyGlowing Hot slot game
#	
#	
#	Scenario: Set the bet type as 0.02 from drop down & bet value to 1.6 do the spin and check whether balance is deducting according to the changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type drop down, bet type as 0.02, bet value as 1.6, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 from drop down, bet value to 1.6 click on spin button and check the balance
#    Then Balance should get deducted by 1.6 if the bet type is selected as 0.02 in FortyGlowing Hot hot game
#	
#	
#	Scenario: Set the bet value as FOUR, click on spin and check whether balance is deducting according to changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, bet type as 0.02, bet value as FOUR, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as FOUR, click on spin button and check the win amount and balance
#    Then Current Balance should get deducted by FOUR as bet type is selected as 0.02 & bet value as FOUR in FortyGlowing Hot game
#	
#	
#	Scenario: Set the bet value to Eight, click on spin button and check whether current balance is deducting according to changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.02, bet value as Eight, bet type & bet values drop down, balance, spin button and win amount
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value to Eight, click on spin button, check the win amount and check the balance
#    Then Current Balance should get deducted by Eight as bet type is selected as 0.02 & bet type as Eight in FortyGlowing Hot game
#	
#	Scenario: Change the bet value as Sixteen, click on spin and check whether existing balance is deducting according to changed bet type in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, bet type as 0.02, bet value as Sixteen, bet value drop down, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value to Sixteen, click on spin button and check the FortyGlowing Hot slot game balance
#    Then Existing Balance should get deducted by Sixteen as bet type is selected as 0.02 & bet value as Sixteen in FortyGlowing Hot slot game
	
    
    
#      Bet value validation for 0.03 credit with different bet values, within the transferred balance range.


#    Scenario: Change the bet value as 1.2, do the spin and check whether balance is deducting according to the changed bet type 0.03 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.03 from drop down, bet value as 1.2, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1.2 from bet type drop down, click on spin button and check the balance
#    Then Balance should get deducted by 1.2 if bet type is selected as 0.03 in FortyGlowing Hot game
#	
#	
#	Scenario: Change the bet value as 2.4, do the spin and check whether balance is deducting according to the changed bet type 0.03 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.03 from credit drop down, bet value as 2.4, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 2.4 from drop down, click on spin button and check the balance
#    Then Balance should get deducted by 2.4 if bet type is selected as 0.03 & bet value as 2.4 in FortyGlowing Hot game
#	
#	
#	Scenario: Change the bet value as Six, do the spin and check whether balance is deducting according to the changed bet type 0.03 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.03 from drop down, bet value as Six from drop down, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 from drop down, select the bet value as Six from down, click on spin button and check the balance
#    Then Balance should get deducted by Six if bet type is selected as 0.03 & bet value as Six in FortyGlowing Hot game
#	
#	
#	Scenario: Change the bet value as Twelve, do the spin and check whether balance is deducting according to the changed bet type 0.03 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.03 from drop down, bet value as Twelve, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as Twelve from bet type drop down, click on spin button and check the balance
#    Then Balance should get deducted by Twelve if bet type is selected as 0.03 & bet value as Twelve in FortyGlowing Hot game
#	
#	
#	Scenario: Change the bet value as 24, do the spin and check whether balance is deducting according to the changed bet type 0.03 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.03 from drop down, bet value as 24, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 24 from bet type drop down, click on spin button and check the balance
#    Then Balance should get deducted by 24 if bet type is selected as 0.03 & bet value as 24 in FortyGlowing Hot game
	
	
	
#	    Bet value validation for 0.2 credit with different bet values, within the transferred balance range.
	
	
#	Scenario: Change the bet value as Eight, do the spin and check whether balance is deducting according to the changed bet type 0.2 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.2, bet value as Eight, balance and spin buttone
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as Eight, click on spin button and check the balance
#    Then Balance should get deducted by Eight as bet type is selected as 0.2 in FortyGlowing Hot game
#	
#	Scenario: Change the bet value as 16, do the spin and check whether balance is deducting according to the changed bet type 0.2 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.2, bet value as 16, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as 16, click on spin button and check the balance
#    Then Balance should get deducted by 16 as bet type is selected as 0.2 in FortyGlowing Hot game
#
#	Scenario: Change the bet value as forty, do the spin and check whether balance is deducting according to the changed bet type 0.2 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.2, bet value as forty, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as forty, click on spin button and check the balance
#    Then Balance should get deducted by forty as bet type is selected as 0.2 in FortyGlowing Hot game
#	
#	Scenario: Change the bet value as Eighty, do the spin and check whether balance is deducting according to the changed bet type 0.2 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.2, bet value as Eighty, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as Eighty, click on spin button and check the balance
#    Then Balance should get deducted by Eighty as bet type is selected as 0.2 in FortyGlowing Hot game
#	
#	Scenario: Change the bet value as 160, do the spin and check whether balance is deducting according to the changed bet type 0.2 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.2 from credit drop down, bet value as 160, balance and spin button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as 160, click on spin button and verify the balance
#    Then Balance should get deducted by 160 as bet type is selected as 0.2 in FortyGlowing Hot slot game
   
    
      #        Insufficent balance validation

#    Scenario: Check whether user able to play the game when there is insufficiant balance in account in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, spin button and validation message
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message
#    Then Player should be blocked from playing the game when there is no balance in the account in FortyGlowing Hot game
	
        	#       Maximize and Minimize Button Validation
    
#    Scenario: Check the functionality of maximize and minimize button in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, maximize button and minimize button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
#    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in FortyGlowing Hot slot game
 
    	#	        User Instruction Validation displayed when landed on FortyGlowing Hot Slot game

#    Scenario: Check user instruction messages before and after spin in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, spin button and user instruction message
#	When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
#	Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
#	Then User instruction message 'Good Luck' should be displayed after spin button is clicked in FortyGlowing Hot slot game
 
          #	 Home Screen Navigate icon Validation
	
#	Scenario: Navigate to home screen from FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game and home button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
#    Then System should take the player to Home page after clicking on home button from FortyGlowing Hot game	
	
          #	   Validate feature with the balance credited into the balance field in Try now game option
	
	 Scenario: Check whether system is providing balance in try now feature of FortyGlowing Hot slot game
    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, try now button and balance to play
    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in FortyGlowing Hot slot game
		
	
#	      Validate feature for amount is deducted on spin button click try now game
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of FortyGlowing Hot slot game
    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, try now button, balance to play and spin button
    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of FortyGlowing Hot slot game
    
    
    
    
    
    