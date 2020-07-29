 Feature: Test all the functionalities of Ultra Hot SLOT Game


#                      Auto Spin option feature testing.


#	 Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
#    Then System should keep performing the spins in Ultra Hot slot game

    
    
#                       Auto spin option with 10spin feature testing

#    Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
#    When Open the Ultra Hot  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 Ultra Hot slot game
    
    
#                     Auto spin option with 20spin feature testing
    
#    Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Ultra Hot slot game

    	
    		   #	  According to bet type, bet values has to be generated respectively
	
#	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 0.15,0.3,0.75,1.5,3 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.03 and bet value as 0.15,0.3,0.75,1.5,3 
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 and check the bet value 0.15,0.3,0.75,1.5,3
#    Then Bet value should get changed 0.15,0.3,0.75,1.5,3  if the bet type selected as 0.03 from the drop down One in Ultra Hot slot game
#	
#	
#	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 0.25,0.5,1.25,2.5,5 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, bet type as 0.05 and bet value as 0.25,0.5,1.25,2.5,5
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 and check the bet value should be 0.25,0.5,1.25,2.5,5
#    Then Bet value should get changed 0.25,0.5,1.25,2.5,5 if the bet type selected as 0.05 from the drop down Two in Ultra Hot slot game
#	
#	Scenario: Select the bet type as 0.1 from the drop down and check the bet value should be 0.5,1,2.5,5,10 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.1 from down three and bet value as 0.5,1,2.5,5,10
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from down  and check the bet value should be 0.5,1,2.5,5,10
#    Then Bet value should get changed to 0.5,1,2.5,5,10 if the bet type selected as 0.1 from the drop down THree in Ultra Hot slot game
#	
#	Scenario: Select the bet type as 1 from the drop down and check the bet value should be 5,10,25,50,100 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 1 from drop down and bet value as 5,10,25,50,100
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 from drop down and check the bet value should be 5,10,25,50,100
#    Then Bet value should get changed to 5,10,25,50,100 if the bet type selected as 1 from the drop down Four in Ultra Hot slot game
  
  
   #                      Amount transfer to the game balance
    
#    Scenario: To check the transferred amount is added to Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, balance, text field to transfer balance and Ok button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
#    Then The exact amount entered in the transfer page should transfer to Ultra Hot game and same amount should get displayed on the balance section
   
#                      Amount transfer greater than the Available balance
    
#    Scenario: Check whether the player is able to transfer the amount more than the available balance
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, balance greater than available balance, text field to transfer balance, Ok button and validation message
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn
#    Then Player should be blocked from loading the Ultra Hot game when the amount entered in the transfer page is more than the available balance
    
#                       Null  value and check for valid result

#    Scenario: Check whether balance field is accepting null values in the transfer page of Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, empty balance, text field to transfer balance, Ok button and validation message
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, do not enter the amount in the balance field and click on Ok button
#    Then An error should be displayed if the balance field is empty and player should be blocked from loading the Ultra Hot game
	
	
#	                    Check whether accepts zero amount input

#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, zero balance, text field to transfer balance, Ok button and validation message
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok butotn
#    Then An error should be displayed if balance entered was zero and player should be blocked from loading the Ultra Hot game
    
    
         #      _Balance_Credits_Calculations_Validation

#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, credits and denomination as 0.03 
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.03 and check the balance
#    Then Balance amount should be same as denomination 0.03 multiplies by credit in Ultra Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, credits, denomination drop down and denomination as 0.05 
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.05 and check the balance
#    Then Balance amount should be same as denomination 0.05 multiplies by credit in Ultra Hot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game window, balance, credits, denomination drop down and denomination as 0.1 
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.1 and compare the balance
#    Then Balance amount should be same as denomination 0.1 multiplies by credit balance in Ultra Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, credits and denomination drop down & value as 1 
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 1 manually with and check the balance
#    Then Balance amount should be same after multiplying denomination 1 by credit in Ultra Hot slot game
   
   
   #	              WIN AMT TO CREDIT FORM AND VICE VERSA VALIDATION	            

#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
#    Then Win amount in credit multiplied by denomination is equal to win amount in currency in Ultra Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Ultra Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Ultra Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Ultra Hot slot game
    
    
    #                  Validation on win amount is added to the main balance when clicked on collect 
	
#	Scenario: Check whether winning amount is getting added to the balance
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, transfer button, spin button and win amount
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win
#    Then Win amount should get added to the balance after win and balance should get increased with win amount
 
    
      #           Bet value validation for 0.03 credit with different bet values, within the transferred balance range.

#    Scenario: Change the bet value as 0.15, do the spin and check whether balance is deducting according to the changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.03, bet value as 0.15, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.15, click on spin button and check the balance
#    Then Balance should get deducted by 0.15 as bet type is selected as 0.03 and bet value as 0.15 in Ultra Hot game
#	
#	
#	Scenario: Change the bet value as 0.3, do the spin and check whether balance is deducting according to the changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, bet type as 0.03, bet value as 0.3, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, click on spin button and check the balance
#    Then Balance should get deducted by 0.3 as bet type is selected as 0.03 in Ultra Hot game
#	
#	
#	Scenario: Change the bet value to 0.75, click on spin button and check whether current balance is deducting according to changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.03, bet value as 0.75, balance, spin button and win amount
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.75, click on spin button, check the win amount and check the balance
#    Then Current Balance should get deducted by 0.75, as bet type is selected as 0.03 and bet value as 0.75, in Ultra Hot game
#	
#	
#	Scenario: Change the bet value as 1.5, do the spin and check whether balance is deducting according to changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.03, bet value as 1.5, balance and spin button and deducted balance
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 1.5, click on spin button and check the deducted balance
#    Then Current Balance should get deducted by 1.5, as bet type is selected as 0.03 and bet value as 1.5, in Ultra Hot slot game
#	
#	
#	Scenario: Change the bet value as THREE, click on spin and check whether existing balance is deducting according to changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, bet type as 0.03, bet value as THREE, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value to THREE, click on spin button and check the slot game balance
#    Then Existing Balance should get deducted by THREE, as bet type is selected as 0.03 and bet value as THREE, in Ultra Hot slot game	



        #	  Bet value validation for 0.05 credit with different bet values, within the transferred balance range.
	
	
#	Scenario: Set the bet value as 0.25, do the spin and check whether balance is deducting according to the changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, 0.05 as bet type , 0.25, as bet value, balance, spin button , win amount and balance amount
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet value to 0.25, click on spin button and check the balance
#    Then Balance should get deducted by 0.25, as bet type is selected as 0.05 in Ultra Hot slot game
#	
#	
#	Scenario: Set the bet type as 0.05 from drop down & bet value to 0.5 do the spin and check whether balance is deducting according to the changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type drop down, bet type as 0.05, bet value as 0.5 balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from drop down, bet value to 0.5 click on spin button and check the balance
#    Then Balance should get deducted by 0.5 if the bet type is selected as 0.05 in Ultra Hot hot game
#	
#	
#	Scenario: Set the bet value as 1.25, click on spin and check whether balance is deducting according to changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, bet type as 0.05, bet value as 1.25, balance, spin button and deducted balance
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value as 1.25, click on spin button and check the win amount and balance
#    Then Current Balance should get deducted by 1.25, as bet type is selected as 0.05 & bet value as 1.25, in Ultra Hot game
#	
#	
#	Scenario: Set the bet value to 2.5, click on spin button and check whether current balance is deducting according to changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.05, bet value as 2.5, bet type & bet values drop down, balance, spin button and win amount
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to 2.5, click on spin button, check the win amount and check the balance
#    Then Current Balance should get deducted by 2.5, as bet type is selected as 0.05 & bet type as 2.5, in Ultra Hot game
#	
#	Scenario: Change the bet value as FIVE, click on spin and check whether existing balance is deducting according to changed bet type in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, bet type as 0.05, bet value as FIVE, bet value drop down, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to FIVE, click on spin button and check the Ultra Hot slot game balance
#    Then Existing Balance should get deducted by FIVE, as bet type is selected as 0.05 & bet value as FIVE, in Ultra Hot slot game

       
#      Bet value validation for 0.1 credit with different bet values, within the transferred balance range.


#    Scenario: Change the bet value as 0.5, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.1 from drop down, bet value as 0.5, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5, from bet type drop down, click on spin button and check the balance
#    Then Balance should get deducted by 0.5, if bet type is selected as 0.1 in Ultra Hot game
#	
#	
#	 Scenario: Change the bet value as ONE, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.1 from drop down, bet value as ONE, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE, from drop down, click on spin button and check the balance
#    Then Balance should get deducted by ONE, if bet type is selected as 0.1 & bet value as ONE, in Ultra Hot game
#	
#	
#	 Scenario: Change the bet value as 2.5, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.1 from drop down, bet value as 2.5, from drop down, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from drop down, select the bet vale as 2.5, from down, click on spin button and check the balance
#    Then Balance should get deducted by 2.5, if bet type is selected as 0.1 & bet value as 2.5, in Ultra Hot game
#	
#	
#	 Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.05 from drop down, bet value as TEN, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as FIVE, from bet type drop down, click on spin button and check the balance
#    Then Balance should get deducted by FIVE if bet type is selected as 0.1 & bet value as FIVE in Ultra Hot game
#	
#	
#	 Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.1 from drop down, bet value as 10, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as TEN, from bet type drop down, click on spin button and check the balance
#    Then Balance should get deducted by TEN, if bet type is selected as 0.1 & bet value as TEN, in Ultra Hot slot game
	
	
	#	    Bet value validation for 1 credit with different bet values, within the transferred balance range.
	
	
#	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 1, bet value as FIVE, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as FIVE, click on spin button and check the balance
#    Then Balance should get deducted by FIVE, as bet type is selected as 1 in Ultra Hot game
#	
#	
#	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 1, bet value as TEN, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as TEN, click on spin button and check the balance
#    Then Balance should get deducted by TEN, as bet type is selected as 1 in Ultra Hot game
#	
#	
#	Scenario: Change the bet value as TWENTYFIFTY, do the spin and check whether balance is deducting according to the changed bet type 1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 1, bet value as TWENTYFIFTY, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as TWENTYFIFTY, click on spin button and check the balance
#    Then Balance should get deducted by TWENTYFIFTY, as bet type is selected as 1 in Ultra Hot game
#	
#	Scenario: Change the bet value as FIFTY, do the spin and check whether balance is deducting according to the changed bet type 1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 1, bet value as FIFTY, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as FIFTY, click on spin button and check the balance
#    Then Balance should get deducted by FIFTY, as bet type is selected as 1 in Ultra Hot game
#	
#	Scenario: Change the bet value as hundred, do the spin and check whether balance is deducting according to the changed bet type 1 in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 1, bet value as hundred, balance and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as hundred, click on spin button and check the balance
#    Then Balance should get deducted by hundred, as bet type is selected as 1, in Ultra Hot game
 
 
 
       	#                   Maximize and Minimize Button Validation
    
#    Scenario: Check the functionality of maximize and minimize button in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, maximize button and minimize button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
#    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Ultra Hot slot game
 
 
 
       #	               Home Screen Navigate icon Validation
	
#	Scenario: Navigate to home screen from Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game and home button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
#    Then System should take the player to Home page after clicking on home button from Ultra Hot game	
	
	
	#	        User Instruction Validation displayed when landed on Ultra Hot Slot game

#    Scenario: Check user instruction messages before and after spin in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button and user instruction message
#	When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
#	Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
#	Then User instruction message 'Good Luck' should be displayed after spin button is clicked in Ultra Hot slot game
 
 #        Insufficent balance validation

#    Scenario: Check whether user able to play the game when there is insufficiant balance in account in Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button and validation message
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message
#    Then Player should be blocked from playing the game when there is no balance in the account in Ultra Hot game
 
 
#	     Validate feature with the balance credited into the balance field in Try now game option
	
#	 Scenario: Check whether system is providing balance in try now feature of Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, try now button and balance to play
#    When Open the Ultra Hot slot game by entering the valid URL in browser, click on try now button
#    Then System should provide five thousand as balance on click on try now button in Ultra Hot slot game
		
	
#	      Validate feature for amount is deducted on spin button click
	
#	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, try now button, balance to play and spin button
#    When Open the Ultra Hot slot game by entering the valid URL in browser, click on try now button and click on spin button
#    Then Amount should get deducted from balance on click on spin button in try now page of Ultra Hot slot game
    
    
    #	        VALIDATION ON GAMBLE WIN 2X AMOUNT IS ADDED TO MAIN BALANCE (black btn), colour win class file
		
#	Scenario: check whether gamble win double amount is getting added to the balance after win in Ultra Hot slot game 
#    Given chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, win amount, gamble button, gamble amount, black button, black button and gamble status
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black  gamble button and check the balance after win
#    Then Gamble double Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Ultra Hot slot game 
 
 
 #	           Validation on Gamble to win amount is double than win amount

#	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Ultra Hot game 
#    Given Chrome browser, valid URL, valid login details, Ultra Hot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
#    When Open the Ultra Hot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
#    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Ultra Hot game


#	             Whether Gamble win amount is getting added to the main balance (red btn)
	
#	Scenario: Check whether gamble win amount is getting added to the balance after win in Ultra Hot slot game 
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
#    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Ultra Hot slot game 
	
	
	#	        VALIDATION OF WIN AMOUNT AND GAMBLE AMOUNT FOR THE SAME VALUE DISPLAYED 
	
#	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Ultra Hot slot game on web
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, win amount, gamble button and gamble amount
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web
#    Then Win amount should be displayed as Gamble amount in the gamble page of the Ultra Hot slot game on web
    
    
    
	#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.03 CREDIT   
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.15 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.03, denomination as 0.15, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, select bet type as 0.03 & denomination as 0.15, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the info page for bet type 0.03 & denomination 0.15 in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 and denomination 0.3 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, transfer button, bet type as 0.03, denomination as 0.3 balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, transfer amount to slot game, select bet type as 0.03 & denomination as 0.3, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.3 in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.75 in Ultra Hot game
#    Given Ultra Hot slot game, bet type as 0.03, denomination as 0.75, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Ultra Hot slot game, select bet type as 0.03 & denomination as 0.75, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page of Ultra Hot slot game based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.75, in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 1.5 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, amount to transfer, transfer button, bet type as 0.03, denomination as 1.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Ultra Hot slot game, transfer the amount, select bet type as 0.03 & denomination as 1.5, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.03 and denomination 1.5, in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination THREE in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.03, denomination as THREE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, select bet type as 0.03 & denomination as THREE, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination THREE in Ultra Hot game
	
	
		#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.05 CREDIT   
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination 0.25 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.05, denomination as 0.25, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Ultra Hot slot game, select bet type as 0.05 & denomination as 0.25, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed on gamble page of Ultra Hot slot game based on win amount and gamble max amount configured on the info page for bet type 0.05 & denomination 0.25 in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 and denomination 0.5 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, transfer button, bet type as 0.05, denomination as 0.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page in gamble page of slot game
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Ultra Hot slot game, transfer amount to slot game, select bet type as 0.05 & denomination as 0.5, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed on gamble page of Ultra Hot slot game based on winning amount and gamble max amount configured on the game info page for bet type 0.05 & denomination 0.5 in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination 1.25 in Ultra Hot game
#    Given Chrome browser, Valid URL, valid Login credentials, Ultra Hot slot game, bet type as 0.05, denomination as 1.25, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Ultra Hot game, select bet type as 0.05 & denomination as 1.25, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page of Ultra Hot slot game based on win amount and gamble max amount configured on the game info page for bet type 0.05 & denomination 1.25 in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination 2.5 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, amount to transfer, transfer button, bet type as 0.05, denomination as 2.5 balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Ultra Hot slot game, transfer the amount, select bet type as 0.05 & denomination as 2.5 click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.05 and denomination 2.5 in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.05 & denomination FIVE in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.05, denomination as FIVE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, select bet type as 0.05 & denomination as FIVE, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.05 & denomination FIVE in Ultra Hot game
		
	
	
		#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.1 CREDIT 
	
#		Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination 2.5 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.1, denomination as 2.5, balance, transfer button, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter amount & transfer the balance, click on Ultra Hot slot game, select bet type as 0.1 & denomination as 2.5 click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the info page for bet type 0.1 & denomination 2.5 in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 and denomination ONE in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, transfer button, bet type as 0.1, denomination as ONE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, transfer amount to slot game, select bet type as 0.1 & denomination as ONE, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.1 & denomination ONE in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination 2.5 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, transfer button, bet type as 0.1, denomination as 2.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on Ultra Hot slot game, select bet type as 0.1 & denomination as 2.5, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.1 & denomination 2.5 in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination FIVE in Ultra Hot game
#    Given chrome browser, valid URL, valid login details, Ultra Hot slot game, amount to transfer, transfer button, bet type as 0.1, denomination as FIVE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Ultra Hot slot game, transfer the amount, select bet type as 0.1 & denomination as FIVE, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.1 and denomination FIVE in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.1 & denomination TEN in Ultra Hot game
#    Given chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as 0.1, denomination as TEN balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, select bet type as 0.1 & denomination as TEN click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.1 & denomination TEN in Ultra Hot game
	
	
	       #	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 1 CREDIT 
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE & denomination FIVE in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as ONE, denomination as FIVE, balance, transfer button, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter amount & transfer the balance, click on Ultra Hot slot game, select bet type as ONE & denomination as FIVE, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the info page for bet type ONE & denomination FIVE in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE and denomination TEN in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, transfer button, bet type as ONE, denomination as TEN, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, transfer amount to slot game, select bet type as ONE & denomination as TEN, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type ONE & denomination TEN in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE & denomination 25 in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, transfer button, bet type as ONE, denomination as 25, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on Ultra Hot slot game, select bet type as ONE & denomination as 25, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page based on win amount and gamble max amount configured on the game info page for bet type ONE & denomination 25 in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE & denomination FIFTY in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, amount to transfer, transfer button, bet type as ONE, denomination as FIFTY, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Ultra Hot slot game, transfer the amount, select bet type as ONE & denomination as FIFTY, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type ONE and denomination FIFTY in Ultra Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type ONE & denomination HUNDRED in Ultra Hot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as ONE, denomination as HUNDRED, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Ultra Hot slot game, select bet type as ONE & denomination as HUNDRED, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type ONE & denomination HUNDRED in Ultra Hot game
 
    
        	#	   Big Win validation on triggering seven symbol on all the Reels,

#	Scenario: Check whether Big win is triggering on, when 3 seven symbol appears on the screen in Ultra Hot game
#	Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type, denomination, balance, seven symbols, spin button, Big win window and win amount
#	When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till seven appears on all the three reels and big win screen appears and big win amount added to the balance
#	Then  Big Win screen should appear when three seven symbols appears on the screen in Ultra Hot game
  
  
  	        #      PAYOUT TABLE TYPE WIN AMOUNT VALIDATION FOR ALL THE SYMBOLS WITH ALL DENOMINATIONS

#	 Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and all the denominations in Ultra Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.03 and all denomination values 
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.03 & all denomination  values and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination values in Ultra Hot slot game on Web
#	
#	
#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.05 and all the denominations in Ultra Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.05 and  denomination values like 0.25, 0.5, 1.25, 2.5 and 5
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.05 & denomination  values like 0.25, 0.5, 1.25, 2.5 and 5 and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.05 and denomination values like 0.25, 0.5, 1.25, 2.5 and 5 in Ultra Hot slot game on Web
#	
#	 Scenario: Check whether the max payout amount for each symbol like melon, lemon as per the bet type 0.1 and all denomination values in Ultra Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, icon to open payout table, all symbols, max amount on each symbol like melon, lemon n etc, back button, bet type 0.1 and all denomination values  on web
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like melon, lemon n etc, click on back button, select bet type as 0.1 & all denomination  values and check payout amount on web
#    Then System should display the Payout max amount on each symbol like melon, lemon etc and payout max amount should get changed whenever player changes the bet type to 0.1 and all denomination values in Ultra Hot slot game on web
#	
#	Scenario: Check whether the max payout amount for each symbol like star, berry as per the bet type 1 and all denomination values in Ultra Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, icon to open payout table, all symbols, max amount on each symbol like star, berry n etc, back button, bet type 1 and denomination values like 5, 10, 25, 50 and 100 on web
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like star, berry n etc, click on back button, select bet type as 1 & denomination  values like 5, 10, 25, 50 and 100 and check payout amount on web
#    Then System should display the Payout max amount on each symbol like star, berry n etc and payout max amount should get changed whenever player changes the bet type to 1 and denomination values like 5, 10, 25, 50 and 100 in Ultra Hot slot game on web
    
         
    	#	              Info Page Navigation and exit button validation
     
#    Scenario: Check whether info page is navigating forward and backward, exit button for the Ultra Hot slot game
#    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, settings, info icon, navigation icon, exit icon, payout, paylines, gamble and jackpot window
#    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on settings and info icon and validate the forward and backward button.
#    Then forward ,backward and exit button of info page should perform in Ultra Hot slot game
  
  
  #             win symbols pattern validation has to match with paylines win patterns	
	
	Scenario: check whether the win patterns combinations matches with the paylines and rules table of the Ultra_Hot Slot game
	Given Chrome browser, valid URL, valid login details, Ultra_Hot slot game, bet type, denomination, balance, available symbols, spin button, win pattern combinations and line Combinations win amount
	 When  Open the Ultra_Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till reels win appears on the screen and respective win combination lines with win amount appear on the goodluck frame
    Then  Win pattern should highlight on the symbols and according to win patterns, line combinations with win amount should display for each pattern wins on the goodluck frame of Ultra_Hot slot game
 
  
  
  
  
    