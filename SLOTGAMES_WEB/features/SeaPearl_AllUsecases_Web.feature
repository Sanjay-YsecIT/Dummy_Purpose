Feature: Test all the functionalities of Sea Pearl SLOT Game



#                      Auto Spin option feature testing.


#	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
#    Then System should keep performing the spins in Sea Pearl slot game

    
    
#                       Auto spin option with 10spin feature testing

#    Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
#    When Open the Sea Pearl  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 Sea Pearl slot game
    
    
#                     Auto spin option with 20spin feature testing
    
#    Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Sea Pearl slot game

    
      #                      Amount transfer to the game balance
    
#    Scenario: To check the transferred amount is added to Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, balance, text field to transfer balance and Ok button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
#    Then The exact amount entered in the transfer page should transfer to Sea Pearl game and same amount should get displayed on the balance section
   
#                      Amount transfer greater than the Available balance
    
#    Scenario: Check whether the player is able to transfer the amount more than the available balance
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, balance greater than available balance, text field to transfer balance, Ok button and validation message
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn
#    Then Player should be blocked from loading the Sea Pearl game when the amount entered in the transfer page is more than the available balance
    
#                       Null  value and check for valid result

#    Scenario: Check whether balance field is accepting null valuess in the transfer page of Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, empty balance, text field to transfer balance, Ok button and validation message
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details,  do not enter the amount in the balance field and click on Ok butotn
#    Then An error should be displayed if the balance field is empty and player should be blocked from loading the Sea Pearl game
	
	
#	                         Check whether accepts zero amount input

#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, zero balance, text field to transfer balance, Ok button and validation message
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok button
#    Then An error should be displayed if balance entered was zero and player should be blocked from loading the Sea Pearl game


      #           Bet value validation for 0.02 credit with different bet values, within the transferred balance range.

#    Scenario: Change the bet value as 0.2, do the spin and check whether balance is deducting according to the changed bet type in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.02, bet value as 0.2, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as 0.2, click on spin button and check the balance
#    Then Balance should get deducted by 0.2 as bet type is selected as 0.02 and bet value as 0.2 in Sea Pearl game
#	
#	
#	Scenario: Change the bet value as 0.4, do the spin and check whether balance is deducting according to the changed bet type in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, bet type as 0.02, bet value as 0.4, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, click on spin button and check the balance
#    Then Balance should get deducted by 0.4 as bet type is selected as 0.02 in Sea Pearl game
#	
#	
#	Scenario: Change the bet value to ONE, click on spin button and check whether current balance is deducting according to changed bet type in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.02, bet value as ONE, balance, spin button and win amount
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as ONE, click on spin button, check the win amount and check the balance
#    Then Current Balance should get deducted by ONE as bet type is selected as 0.02 and bet value as ONE in Sea Pearl game
#	
#	
#	Scenario: Change the bet value as TWO, do the spin and check whether balance is deducting according to changed bet type in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.02, bet value as TWO, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as TWO, click on spin button and check the balance
#    Then Current Balance should get deducted by TWO as bet type is selected as 0.02 and bet value as 2 in Sea Pearl game
#	
#	
#	Scenario: Change the bet value as FOUR, click on spin and check whether existing balance is deducting according to changed bet type in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, bet type as 0.02, bet value as FOUR, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value to FOUR, click on spin button and check the slot game balance
#    Then Existing Balance should get deducted by FOUR as bet type is selected as 0.02 and bet value as FOUR in Sea Pearl slot game
    
    
        #	  Bet value validation for 0.05 credit with different bet values, within the transferred balance range.
	
	
#	Scenario: Set the bet value as 0.5, do the spin and check whether balance is deducting according to the changed bet type in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, 0.05 as bet type , 0.5 as bet value, balance, spin button , win amount and balance amount
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet value to 0.5, click on spin button and check the balance
#    Then Balance should get deducted by 0.5 as bet type is selected as 0.05 in Sea Pearl slot game
#	
#	
#	Scenario: Set the bet type as 0.05 from drop down & bet value to ONE do the spin and check whether balance is deducting according to the changed bet type in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type drop down, bet type as 0.05, bet value as ONE balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from drop down, bet value to ONE click on spin button and check the balance
#    Then Balance should get deducted by ONE if the bet type is selected as 0.05 in Sea Pearl slot game
#	
#	
#	Scenario: Set the bet value as 2.5, click on spin and check whether balance is deducting according to changed bet type in Sea Pearl slot game
#    Given Chrome Browser, valid URL, valid login details, Sea Pearl game, bet type as 0.05, bet value as 2.5, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value as 2.5, click on spin button and check the win amount and balance
#    Then Current Balance should get deducted by 2.5 as bet type is selected as 0.05 & bet value as 2.5 in Sea Pearl game
#	
#	
#	Scenario: Set the bet value to FIVE, click on spin button and check whether current balance is deducting according to changed bet type in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.05, bet value as FIVE, bet type & bet values drop down, balance, spin button and win amount
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to FIVE, click on spin button, check the win amount and check the balance
#    Then Current Balance should get deducted by FIVE as bet type is selected as 0.05 & bet type as FIVE, in Sea Pearl game
#	
#	Scenario: Change the bet value as TEN, click on spin and check whether existing balance is deducting according to changed bet type in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, bet type as 0.05, bet value as TEN, bet value drop down, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to TEN, click on spin button and check the Sea Pearl slot game balance
#    Then Existing Balance should get deducted by TEN as bet type is selected as 0.05 & bet value as TEN in Sea Pearl slot game
	
    
    
#      Bet value validation for 0.1 credit with different bet values, within the transferred balance range.


#    Scenario: Change the bet value as ONE, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.1 from drop down, bet value as ONE, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE from bet type drop down, click on spin button and check the balance
#    Then Balance should get deducted by ONE if bet type is selected as 0.1 in Sea Pearl game
#	
#	
#	Scenario: Change the bet value as TWO, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.1 from drop down, bet value as TWO, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from drop down, select the bet vale as TWO click on spin button and check the balance
#    Then Balance should get deducted by TWO if bet type is selected as 0.1 & bet value as TWO in Sea Pearl game
#	
#	
#	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.1 from drop down, bet value as FIVE from drop down, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from drop down, select the bet vale as FIVE from down, click on spin button and check the balance
#    Then Balance should get deducted by FIVE if bet type is selected as 0.1 & bet value as 5 in Sea Pearl game
#	
#	
#	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.1 from drop down, bet value as TEN, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet value as TEN from bet type drop down, click on spin button and check the balance
#    Then Balance should get deducted by TEN if bet type is selected as 0.1 & bet value as TEN in Sea Pearl game
#	
#	
#	Scenario: Change the bet value as twenty, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.1 from drop down, bet value as twenty, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet value as twenty from bet type drop down, click on spin button and check the balance
#    Then Balance should get deducted by twenty if bet type is selected as 0.1 & bet value as twenty in Sea Pearl game
	
	
	
#	    Bet value validation for 0.5 credit with different bet values, within the transferred balance range.
	
	
#	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.5, bet value as FIVE, balance and spin buttone
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as FIVE, click on spin button and check the balance
#    Then Balance should get deducted by FIVE, as bet type is selected as 0.5 in Sea Pearl game
#	
#	
#	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.5, bet value as TEN, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as TEN, click on spin button and check the balance
#    Then Balance should get deducted by TEN, as bet type is selected as 0.5 in Sea Pearl game
#	
#	
#	Scenario: Change the bet value as TwentyFive do the spin and check whether balance is deducting according to the changed bet type 0.5 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.5, bet value as TwentyFive balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as TwentyFive click on spin button and check the balance
#    Then Balance should get deducted by TwentyFive as bet type is selected as 0.5 in Sea Pearl game
#	
#	Scenario: Change the bet value as FIFTY do the spin and check whether balance is deducting according to the changed bet type 0.5 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.5, bet value as FIFTY balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as FIFTY click on spin button and check the balance
#    Then Balance should get deducted by FIFTY as bet type is selected as 0.5 in Sea Pearl game
#	
#	Scenario: Change the bet value as hundred, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.5, bet value as hundred, balance and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as hundred, click on spin button and check the balance
#    Then Balance should get deducted by hundred as bet type is selected as 0.5 in Sea Pearl game

    
      #                  Validation on win amount is added to the main balance when clicked on collect 
	
#	 Scenario: Check whether winning amount is getting added to the balance
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, transfer button, spin button and win amount
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win
#    Then Win amount should get added to the balance after win and balance should get increased with win amount
  


    #      _Balance_Credits_Calculations_Validation

#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.02 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, credits and denomination as 0.02 
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.02 and check the balance
#    Then Balance amount should be same as denomination 0.02 multiplies by credit in Sea Pearl slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, credits, denomination drop down and denomination as 0.05 
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.05 and check the balance
#    Then Balance amount should be same as denomination 0.05 multiplies by credit in Sea Pearl game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.1 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game window, balance, credits, denomination drop down and denomination as 0.1 
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.1 and compare the balance
#    Then Balance amount should be same as denomination 0.1 multiplies by credit balance in Sea Pearl slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.5 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, credits and denomination drop down & value as 0.5 
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.5 manually with and check the balance
#    Then Balance amount should be same after multiplying denomination 0.5 by credit in Sea Pearl slot game
  
  
         #	              WIN AMT TO CREDIT FORM AND VICE VERSA VALIDATION	            

#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button, win amount in currency, credits and win amount in credits
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
#    Then Win amount in credit multiplied by denomination is equal to win amount in currency in Sea Pearl slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Sea Pearl slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Sea Pearl slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Sea Pearl slot game
  
  
  
 	   #	        According to bet type, bet values has to be generated respectively
	
#	Scenario: Select the bet type as 0.02 from the drop down and check the bet value should be 0.2,0.4,1,2,4 in Sea Pearl game
#    Given  Chrome Browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.02 and bet value as 0.2,0.4,1,2,4
#    When  Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 and check the bet values
#    Then  Bet value should get changed 0.2,0.4,1,2,4 if the bet type selected as 0.02 from the drop down one in Sea Pearl slot game
#	
#	
#	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 0.5,1,2.5,5,10 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, bet type as 0.05 and bet value as 0.5,1,2.5,5,10
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 and check the bet value should be 0.5,1,2.5,5,10
#    Then Bet value should get changed 0.5,1,2.5,5,10 if the bet type selected as 0.05 from the drop down two in Sea Pearl slot game
#	
#	Scenario: Select the bet type as 0.1 from the drop down and check the bet value should be 1,2,5,10,20 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.1 and bet value as 1,2,5,10,20
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from down  and check the bet value should be 1,2,5,10,20
#    Then Bet value should get changed to 1,2,5,10,20 if the bet type selected as 0.1 from the drop down three in Sea Pearl slot game
#	
#	Scenario: Select the bet type as 0.5 from the drop down and check the bet value should be 5,10,25,50,100 in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.5 from drop down and bet value as 5,10,25,50,100
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 from drop down and check the bet value should be 5,10,25,50,100
#    Then Bet value should get changed to 5,10,25,50,100 if the bet type selected as 0.5 from the drop down four in Sea Pearl slot game
    
  
      #        Insufficent balance validation

#    Scenario: Check whether user able to play the game when there is insufficiant balance in account in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button and validation message
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message
#    Then Player should be blocked from playing the game when there is no balance in the account in Sea Pearl game
	
        	#     Maximize and Minimize Button Validation
    
#    Scenario: Check the functionality of maximize and minimize button in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, maximize button and minimize button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
#    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Sea Pearl slot game
 
    	#   User Instruction Validation displayed when landed on Sea Pearl Slot game

#    Scenario: Check user instruction messages before and after spin in Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button and user instruction message
#	When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
#	Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
#	Then User instruction message 'Good Luck' should be displayed after spin button is clicked in Sea Pearl slot game
 
    
     #	 Home Screen Navigate icon Validation
	
#	Scenario: Navigate to home screen from Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game and home button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
#    Then System should take the player to Home page after clicking on home button from Sea Pearl game	
	
	
     #	  Validate feature with the balance credited into the balance field in Try now game option
	
#	 Scenario: Check whether system is providing balance in try now feature of Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, try now button and balance to play
#    When Open the Sea Pearl slot game by entering the valid URL in browser, click on try now button
#    Then System should provide five thousand as balance on click on try now button in Sea Pearl slot game
		
	
	
#	        Validate feature for amount is deducted on spin button click try now game
	
#	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, try now button, balance to play and spin button
#    When Open the Sea Pearl slot game by entering the valid URL in browser, click on try now button and click on spin button
#    Then Amount should get deducted from balance on click on spin button in try now page of Sea Pearl slot game
	
	
	
	#	     VALIDATION ON GAMBLE WIN 2X AMOUNT IS ADDED TO MAIN BALANCE (black btn)
		
#	Scenario: check whether gamble win double amount is getting added to the balance after win in Sea Pearl slot game 
#    Given chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button, win amount, gamble button, gamble amount, black button, black button and gamble status
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black  gamble button and check the balance after win
#    Then Gamble double Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Sea Pearl slot game 
 
 
  	#	           Validation on Gamble to win amount is double than win amount

#	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Sea Pearl game 
#    Given Chrome browser, valid URL, valid login details, Sea Pearl game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
#    When Open the Sea Pearl game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
#    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Sea Pearl game
	
	
	#	             Whether Gamble win amount is getting added to the main balance (red btn)
	
#	Scenario: Check whether gamble win amount is getting added to the balance after win in Sea Pearl slot game 
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
#    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Sea Pearl slot game 
	
	
		#	        VALIDATION OF WIN AMOUNT AND GAMBLE AMOUNT FOR THE SAME VALUE DISPLAYED
	
#	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Sea Pearl slot game on web
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, spin button, win amount, gamble button and gamble amount
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web
#    Then Win amount should be displayed as Gamble amount in the gamble page of the Sea Pearl slot game on web
	

	    	 	#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.02 CREDIT   
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 & denomination 0.2 in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.02, denomination as 0.2, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, select bet type as 0.02 & denomination as 0.2, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the info page for bet type 0.02 & denomination 0.2 in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 and denomination 0.4 in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, transfer button, bet type as 0.02, denomination as 0.4, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, transfer amount to slot game, select bet type as 0.02 & denomination as 0.4, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.02 & denomination 0.4 in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 & denomination ONE in Sea Pearl game
#    Given Sea Pearl slot game, bet type as 0.02, denomination as ONE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Sea Pearl slot game, select bet type as 0.02 & denomination as ONE, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page of Sea Pearl slot game based on win amount and gamble max amount configured on the game info page for bet type 0.02 & denomination ONE in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 & denomination TWO in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, amount to transfer, transfer button, bet type as 0.02, denomination as TWO, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Sea Pearl slot game, transfer the amount, select bet type as 0.02 & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.02 and denomination TWO in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 & denomination FOUR in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.02, denomination as FOUR, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, select bet type as 0.02 & denomination as FOUR, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.02 & denomination FOUR in Sea Pearl game
	
	
		#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.05 CREDIT   
	
	
#	 Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination 0.5 in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.05, denomination as 0.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Sea Pearl slot game, select bet type as 0.02 & denomination as 0.5, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed on gamble page of Sea Pearl slot game based on win amount and gamble max amount configured on the info page for bet type 0.05 & denomination 0.5 in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 and denomination ONE in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, transfer button, bet type as 0.05, denomination as ONE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page in gamble page of slot game
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Sea Pearl slot game, transfer amount to slot game, select bet type as 0.05 & denomination as ONE, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed on gamble page of Sea Pearl slot game based on winning amount and gamble max amount configured on the game info page for bet type 0.05 & denomination ONE in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination 2.5 in Sea Pearl game
#    Given Chrome browser, Valid URL, valid Login credentials, Sea Pearl slot game, bet type as 0.05, denomination as 2.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Sea Pearl slot game, select bet type as 0.05 & denomination as 2.5, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page of Sea Pearl slot game based on win amount and gamble max amount configured on the game info page for bet type 0.05 & denomination 2.5 in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination FIVE in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, amount to transfer, transfer button, bet type as 0.05, denomination as FIVE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Sea Pearl slot game, transfer the amount, select bet type as 0.05 & denomination as FIVE, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.05 and denomination FIVE in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination TEN in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.05, denomination as TEN, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, select bet type as 0.05 & denomination as TEN, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.05 & denomination TEN in Sea Pearl game
		
	
	
		#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.1 CREDIT 
	
#	 Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination ONE in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.1, denomination as ONE, balance, transfer button, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter amount & transfer the balance, click on Sea Pearl slot game, select bet type as 0.1 & denomination as ONE, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the info page for bet type 0.1 & denomination ONE in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 and denomination TWO in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, transfer button, bet type as 0.1, denomination as TWO, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, transfer amount to slot game, select bet type as 0.1 & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.1 & denomination TWO in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination FIVE in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, transfer button, bet type as 0.1, denomination as FIVE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, click on Sea Pearl slot game, select bet type as 0.1 & denomination as FIVE, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.1 & denomination FIVE in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination TEN in Sea Pearl game
#    Given chrome browser, valid URL, valid login details, Sea Pearl slot game, amount to transfer, transfer button, bet type as 0.1, denomination as TEN, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Sea Pearl slot game, transfer the amount, select bet type as 0.1 & denomination as TEN, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.1 and denomination TEN in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination TWENTY in Sea Pearl game
#    Given chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.1, denomination as TWENTY, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, select bet type as 0.1 & denomination as TWENTY, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.1 & denomination TWENTY in Sea Pearl game
	
	
	       #	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.5 CREDIT 
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.5 & denomination FIVE in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.5, denomination as FIVE, balance, transfer button, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter amount & transfer the balance, click on Sea Pearl slot game, select bet type as 0.5 & denomination as FIVE, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the info page for bet type 0.5 & denomination FIVE in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.5 and denomination TEN in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, transfer button, bet type as 0.5, denomination as TEN, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, transfer amount to slot game, select bet type as 0.5 & denomination as TEN, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.5 & denomination TEN in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.5 & denomination TWENTYFIFTY in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, transfer button, bet type as 0.5, denomination as TWENTYFIFTY, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, click on Sea Pearl slot game, select bet type as 0.5 & denomination as TWENTYFIFTY, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.5 & denomination TWENTYFIFTY in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.5 & denomination FIFTY in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, amount to transfer, transfer button, bet type as 0.5, denomination as FIFTY, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Sea Pearl slot game, transfer the amount, select bet type as 0.5 & denomination as FIFTY, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.5 and denomination FIFTY in Sea Pearl game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.5 & denomination HUNDRED in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type as 0.5, denomination as HUNDRED, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sea Pearl slot game, select bet type as 0.5 & denomination as 100, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.5 & denomination HUNDRED in Sea Pearl game
   
   
   
	        #      PAYOUT TABLE TYPE WIN AMOUNT VALIDATION FOR ALL THE SYMBOLS WITH ALL DENOMINATIONS

#	 Scenario: Check whether the max payout amount for each symbol as per the bet type 0.02 and all the denominations in Sea Pearl slot game on Web
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.02 and all denomination values 
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.02 & all denomination  values and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination values in Sea Pearl slot game on Web
#	
#	
#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.05 and all the denominations in Sea Pearl slot game on Web
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.05 and  denomination values like 0.5, 1, 2.5, 5 and 10
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.05 & denomination  values like 0.5, 1, 2.5, 5 and 10 and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.05 and denomination values like 0.5, 1, 2.5, 5 and 10 in Sea Pearl slot game on Web
#	
#	 Scenario: Check whether the max payout amount for each symbol like fish, crab as per the bet type 0.1 and all denomination values in Sea Pearl slot game on Web
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, icon to open payout table, all symbols, max amount on each symbol like fish, crab n etc, back button, bet type 0.1 and all denomination values  on web
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like fish, crab n etc, click on back button, select bet type as 0.1 & all denomination  values and check payout amount on web
#    Then System should display the Payout max amount on each symbol like fish, crab etc and payout max amount should get changed whenever player changes the bet type to 0.1 and all denomination values in Sea Pearl slot game on web
#	
#	Scenario: Check whether the max payout amount for each symbol like nine, seahorse as per the bet type 0.5 and all denomination values in Sea Pearl slot game on Web
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, icon to open payout table, all symbols, max amount on each symbol like nine, seahorse n etc, back button, bet type 0.5 and denomination values like 5, 10, 25, 50 and 100 on web
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like nine, seahorse n etc, click on back button, select bet type as 0.5 & denomination  values like 5, 10, 25, 50 and 100 and check payout amount on web
#    Then System should display the Payout max amount on each symbol like nine, seahorse n etc and payout max amount should get changed whenever player changes the bet type to 0.5 and denomination values like 5, 10, 25, 50 and 100 in Sea Pearl slot game on web
    
         
    	#	              Info Page Navigation and exit button validation
     
#    Scenario: Check whether info page is navigating forward and backward, exit button for the Sea Pearl slot game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, balance, settings, info icon, navigation icon, exit icon, payout, paylines, scatter, free spin,  wild, gamble and jackpot window
#    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on settings and info icon and validate the forward and backward button.
#    Then forward ,backward and exit button of info page should perform in Sea Pearl slot game
	
  	
      #	               Free spin Validation of triggering of Scatter in the Reels
	
	Scenario: Check whether Fifteen free spin feature is triggering on when 3 or more than 3 scatters appears on the screen in Sea Pearl game
    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type, denomination, balance, scatter symbols, spin button and free spin screen
    When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till Three or more than Three scatter symbols appears on the screen wins and Free Spin Activates and spin amount added to the win amount 
    Then Fifteen Free Spin screen should appear when Three or more than Three scatter symbols appears on the screen in Sea Pearl game
	
	
	
#             win symbols pattern validation has to match with paylines win patterns	
	
#	Scenario: check whether the win patterns combinations matches with the paylines and rules table of the Sea Pearl Slot game
#	Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type, denomination, balance, available symbols, spin button, win pattern combinations and line Combinations win amount
#	 When  Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till reels win appears on the screen and respective win combination lines with win amount appear on the goodluck frame
#    Then  Win pattern should highlight on the symbols and according to win patterns, line combinations with win amount should display for each pattern wins on the goodluck frame of Sea Pearl slot game
    
    
    	#	   Big Win validation on triggering wild symbol on all the Reels, as wild acts as joker all the reels are wild and the big win triggered

#	Scenario: Check whether Big win is triggering on, when 5 wild symbol appears on the screen in Sea Pearl game
#	Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type, denomination, balance, wild symbols, spin button, Big win window and win amount
#	When Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild appears on all the five reels and big win screen appears and big win amount added to the balance
#	Then  Big Win screen should appear when five wild symbols appears on the screen in Sea Pearl game	
    
#         wild symbols matching and and big win triggering.
    
#    Scenario: Check whether wild symbol is triggering on when wild symbol apperars on the reels and substitute for other all symbols expect scatter and 5 wild symbol triggers Big win in Sea Pearl game
#    Given Chrome browser, valid URL, valid login details, Sea Pearl slot game, bet type, denomination, balance, wild symbols, all symbols spin button, Big win window and win amount
#    When  Open the Sea Pearl slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild symbols appears and substitues for all other symbols expect scatter symbol and  triggers winamt*2 and on appear of 5 wild symbols on all reels big win is triggered and win amount added to balance
#    Then wild win amount with other symbol triggers win amount*2 and upon appearing of 5 wild symbols Big Win screen should appear when five wild symbols appears on the screen in Sea Pearl game
	
	
	
	
	
	
	
	