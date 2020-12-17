Feature: Test all the functionalities of Brownie Hot slot Game


#                      Auto Spin option feature testing.

#	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the  Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
#    Then System should keep performing the spins in Brownie Hot slot game

    
    
#                       Auto spin option with 10spin feature testing

#    Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 Brownie Hot slot game
    
    
#                     Auto spin option with 20spin feature testing
    
#    Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Brownie Hot slot game
	
#	 		Scenario: Check bet value, credit value, home button, info button, play button behavior during autoplay in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios
#    Then Bet value & Credit value buttons should not be clickable
#		And Home & Info buttons should not be clickable
#		And Spin button should not visible & Stop button should be visible and clickable
#		And Spin button should be visble after clicking on stop button


#	Scenario: Check bet & credit value buttons behavior after navigating from gamble page during autoplay and check win amount getting added to balance in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page
#    Then Bet value & Credit value buttons should be clickable after navigating from gamble page when autospin is stopped
#	And Win amount should get added to the balance during autoplay
 
	
	   #	        According to bet type, bet values has to be generated respectively
	
#	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.3,0.6,1.5,3,6 in  game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01 and bet value as 0.3,0.6,1.5,3,6
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value
#    Then Bet value should get changed 0.3,0.6,1.5,3,6 if the bet type selected as 0.01 from the drop down one in Brownie Hot slot game
	
	
#	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 0.9,1.8,4.5,9,18 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details,  game, bet type as 0.03 and bet value as 0.9,1.8,4.5,9,18
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
    
#    Scenario: To check the transferred amount is added to  game
#    Given Chrome browser, valid URL, valid login details,  game, balance, text field to transfer balance and Ok button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok button
#    Then The exact amount entered in the transfer page should transfer to  game and same amount should get displayed on the balance section
   
#                      Amount transfer greater than the Available balance
    
#    Scenario: Check whether the player is able to transfer the amount more than the available balance
#    Given Chrome browser, valid URL, valid login details,  game, balance greater than available balance, text field to transfer balance, Ok button and validation message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok button
#    Then Player should be blocked from loading the  game when the amount entered in the transfer page is more than the available balance
    
#                       Null  value and check for valid result

#    Scenario: Check whether balance field is accepting null valuess in the transfer page of  game
#    Given Chrome browser, valid URL, valid login details,  game, empty balance, text field to transfer balance, Ok button and validation message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, do not enter the amount in the balance field and click on Ok button
#    Then An error should be displayed if the balance field is empty and player should be blocked from loading the  game
	
	
#	                         Check whether accepts zero amount input

#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of  game
#    Given Chrome browser, valid URL, valid login details,  game, zero balance, text field to transfer balance, Ok button and validation message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok button
#    Then An error should be displayed if balance entered was zero and player should be blocked from loading the  game


        #      _Balance_Credits_Calculations_Validation

#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, credits and denomination as 0.01 
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
#    Then Balance amount should be same as denomination 0.01 multiplies by credit in Brownie Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in  game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, credits, denomination drop down and denomination as 0.03
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.03 and check the balance
#    Then Balance amount should be same as denomination 0.03 multiplies by credit in  game
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
    
  
     #        Bet value validation for 0.01 credit with different bet values, within the transferred balance range.

#    Scenario: Change the bet value as 0.3, do the spin and check whether balance is deducting according to the changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, bet value as 0.3, balance and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 0.3, click on spin button and check the balance
#    Then Balance should get deducted by 0.3 as bet type is selected as 0.01 and bet value as 0.3 in Brownie Hot slot game
#	
#	
#	Scenario: Change the bet value as 0.6, do the spin and check whether balance is deducting according to the changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details,  game, bet type as 0.01, bet value as 0.6, balance field and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type 0.01, click on spin button and check the balance
#    Then Balance should get deducted by 0.6 as bet type is selected as 0.01 in Brownie Hot slot game
#	
#	
#	Scenario: Change the bet value to 1.5, click on spin button and check whether current balance is deducting according to changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, bet value as 1.5, balance field, spin button and win amount field
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 1.5, click on spin button, check the remaining balance
#    Then Current Balance should get deducted by 1.5 as bet type is selected as 0.01 and bet value as 1.5 in Brownie Hot slot game
#	
#	
#	Scenario: Change the bet value as Three, do the spin and check whether balance is deducting according to changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, bet value as Three, balance and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as Three, click on spin button and check the balance
#    Then Current Balance should get deducted by Three as bet type is selected as 0.01 and bet value as Three in  game
#	
#	
#	Scenario: Change the bet value as Six, click on spin and check whether existing balance is deducting according to changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details,  game, bet type as 0.01, bet value as Six, balance and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value to Six, click on spin button and check theBrownie Hot slot game balance
#    Then Existing Balance should get deducted by Six as bet type is selected as 0.01 and bet value as Six in Brownie Hot slot game
    
	
    #	    Bet value validation for 0.2 credit with different bet values, within the transferred balance range.
		
#	Scenario: Change the bet value as Six, do the spin and check whether balance is deducting according to the changed bet type 0.2 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.2, bet value as Six, balance and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as Six, click on spin button and check the balance
#    Then Balance should get deducted by Six as bet type is selected as 0.2 in  game
#	
#	Scenario: Change the bet value as 12, do the spin and check whether balance is deducting according to the changed bet type 0.2 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.2, bet value as 12, balance and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as 12, click on spin button and check the balance
#    Then Balance should get deducted by 12 as bet type is selected as 0.2 in  game
#
#	Scenario: Change the bet value as thirty, do the spin and check whether balance is deducting according to the changed bet type 0.2 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.2, bet value as thirty, balance and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as thirty, click on spin button and check the balance
#    Then Balance should get deducted by thirty as bet type is selected as 0.2 in  game
#	
#	Scenario: Change the bet value as Sixty, do the spin and check whether balance is deducting according to the changed bet type 0.2 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.2, bet value as Sixty, balance and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as Sixty, click on spin button and check the balance
#    Then Balance should get deducted by Sixty as bet type is selected as 0.2 in  game
#	
#	Scenario: Change the bet value as 120, do the spin and check whether balance is deducting according to the changed bet type 0.2 in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.2 from credit drop down, bet value as 120, balance and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 & bet value as 120, click on spin button and verify the balance
#    Then Balance should get deducted by 120 as bet type is selected as 0.2 in Brownie Hot slot game
   
    
      #        Insufficent balance validation

#    Scenario: Check whether user able to play the game when there is insufficiant balance in account in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button and validation message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message
#    Then Player should be blocked from playing the game when there is no balance in the account in  game
	
        	#       Maximize and Minimize Button Validation
    
#    Scenario: Check the functionality of maximize and minimize button in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, maximize button and minimize button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
#    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Brownie Hot slot game
 
    	#	        User Instruction Validation displayed when landed on Brownie Hot slot game

#    Scenario: Check user instruction messages before and after spin in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button and user instruction message
#	When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
#	Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
#	Then User instruction message 'Good Luck' should be displayed after spin button is clicked in Brownie Hot slot game
 
          #	 Home Screen Navigate icon Validation
	
#	Scenario: Navigate to home screen from Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game and home button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
#    Then System should take the player to Home page after clicking on home button from  game	
	
          #	   Validate feature with the balance credited into the balance field in Try now game option
	
#	 Scenario: Check whether system is providing balance in try now feature of Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, try now button and balance to play
#    When Open the Brownie Hot slot game by entering the valid URL in browser, click on try now button
#    Then System should provide five thousand as balance on click on try now button in Brownie Hot slot game
		
	
#	      Validate feature for amount is deducted on spin button click try now game
	
#	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, try now button, balance to play and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, click on try now button and click on spin button
#    Then Amount should get deducted from balance on click on spin button in try now page of Brownie Hot slot game
    
    
#     Scenario: Check whether user able to play Autospin feature game when there is insufficient balance in account in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, AutoSpin button, validation message, maxbet button, credit decrement button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select maxbet, click on Autospin button till balance turns to zero and check the validation message and decrement the denomination and again spin the reels
#    Then Check for the game buttons during the insufficient alert message in the Brownie Hot slot game
#    Then Player should be blocked from playing the game when there is no balance in the account and after decrementing credit and trigger autospin in  game
	 
    
#	 Scenario: Check whether multiple tabs switching and reload is allowed in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, transfer button, spin button, multiple tabs and reload option
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on autospin and switch between tabs and again reload the game
#    Then Switching between tabs should be allowed and reloading the game resulting in ending game session and shouldn't resume the game
  
#	 Scenario: Check whether Session expired message displayed for long duration inactive game state in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, transfer button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, idle the game session for about 22mins
#    Then Session Expired message should display and user has to start new session for game play in 
  
  
   	#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.01 CREDIT   
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.2 in  game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, denomination as 0.3, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Brownie Hot slot game, select bet type as 0.01 & denomination as 0.3, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the info page for bet type 0.01 & denomination 0.3 in  game
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination 0.6 in  game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, transfer button, bet type as 0.01, denomination as 0.6, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Brownie Hot slot game, transfer amount toBrownie Hot slot game, select bet type as 0.01 & denomination as 0.6, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.6 in  game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 1.5 in  game
#    Given Brownie Hot slot game, bet type as 0.01, denomination as 1.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page ofBrownie Hot slot game
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Brownie Hot slot game, select bet type as 0.01 & denomination as 1.5, click on spin button till player wins, click on gamble button and check the gamble count in gamble page ofBrownie Hot slot game
#    Then Gamble count should be displayed on gamble page of Brownie Hot slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 1.5 in  game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination Three in  game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, amount to transfer, transfer button, bet type as 0.01, denomination as Three, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Brownie Hot slot game, transfer the amount, select bet type as 0.01 & denomination as Three, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination Three in  game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination Six in  game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, denomination as Six, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Brownie Hot slot game, select bet type as 0.01 & denomination as Six, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination Six in  game
	
		
    	#	   VALIDATION ON GAMBLE WIN 2X AMOUNT IS ADDED TO MAIN BALANCE (black btn), colour win class file
		
#	Scenario: check whether gamble win double amount is getting added to the balance after win in Brownie Hot slot game 
#    Given chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, win amount, gamble button, gamble amount, black button, black button and gamble status
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on black gamble button and check the balance after win
#    Then Gamble double Win amount should get added to main balance after status displayed as WIN and gamble page should get terminated in Brownie Hot slot game 
#    Then  After 1st win gamble amount is doubled and available for next gamble in Brownie Hot slot game
 
 	#	        Validation on Gamble to win amount is double than win amount

#	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of  game 
#    Given Chrome browser, valid URL, valid login details,  game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
#    When Open the  game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Brownie Hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
#    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the  game
    

     #	        Whether Gamble win amount is getting added to the main balance (red btn)
	
#	Scenario: Check whether gamble win amount is getting added to the balance after win in Brownie Hot slot game 
#    Given Chrome browser, valid URL, valid login details,  game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red button and check the balance after win in win field
#    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in  game 
	
	
	#	        VALIDATION OF WIN AMOUNT AND GAMBLE AMOUNT FOR THE SAME VALUE DISPLAYED 
	
#	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Brownie Hot slot game on web
#    Given Chrome browser, valid URL, valid login details,  game, balance, spin button, win amount, gamble button and gamble amount
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web
#    Then Win amount should be displayed as Gamble amount in the gamble page of the Brownie Hot slot game on web
	
	
	
#	 Scenario: Check whether winning amount is getting added to the main balance in credits
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, transfer button, credit balance form, spin button and win amount
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits
#    Then Win amount should get added to the credit field after win and credit should get increased with win amount
  	
    
    
    	       #      PAYOUT TABLE TYPE WIN AMOUNT VALIDATION FOR ALL THE SYMBOLS WITH ALL DENOMINATIONS

#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and all the denominations in Brownie Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.01 and all denomination values 
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.01 & all denomination  values and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination values in Brownie Hot slot game on Web
#	
#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and all the denominations in Brownie Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.03 and  denomination values like 0.9, 1.8, 4.5, 9 & 18
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.03 & denomination  values like 0.9, 1.8, 4.5, 9 & 18 and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination values like 0.9, 1.8, 4.5, 9 & 18 in Brownie Hot slot game on Web
#	
#	 Scenario: Check whether the max payout amount for each symbol like melon, apple as per the bet type 0.05 and all denomination values in Brownie Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, icon to open payout table, all symbols, max amount on each symbol like melon, apple n etc, back button, bet type 0.05 and all denomination values on web
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like melon, apple n etc, click on back button, select bet type as 0.05 & all denomination  values and check payout amount on web
#    Then System should display the Payout max amount on each symbol like melon, apple etc and payout max amount should get changed whenever player changes the bet type to 0.05 and all denomination values in Brownie Hot slot game on web
	
#	Scenario: Check whether the max payout amount for each symbol like orange, bell as per the bet type 0.2 and all denomination values in Brownie Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange, bell n etc, back button, bet type 0.2 and denomination values like 6, 12, 30, 60 & 120 on web
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange, bell n etc, click on back button, select bet type as 0.5 & denomination  values like 6, 12, 30, 60 & 120 and check payout amount on web
#    Then System should display the Payout max amount on each symbol like orange, bell n etc and payout max amount should get changed whenever player changes the bet type to 0.5 and denomination values like 6, 12, 30, 60 & 120 in Brownie Hot slot game on web
   
 
 
     # PAY LINES BUTTON FUNCTIONAITY WITH WIN PATTERNS AND PAYOUT TABLE
       
#	Scenario: Check whether the paylines dropdown and reel side has functionality in Brownie Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, paylines and payline patterns
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on payline drop downs and reel side payline selector 
#    Then Verify the payline patterns on the reels and payline buttons having functionality 
  
  
    # Verify the gamble behavior on winning the last attempts
    
#	Scenario: Check whether on winning and losing the gamble on last gamble count in  game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, denomination as 0.3, balance, spin button, win amount, gamble button, gamble amount, red button, win amount field in main page
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Brownie Hot slot game, select bet type as 0.01 & denomination as 0.3, click on spin button till user wins, click on gamble button and pay gamble with last gamble count 
#    Then Gamble page should terminate and win amount should be added to main balance in  game
	
	
	
	  # Verify the HUD buttons are active or inactive during gamble 
	  
#	Scenario: Check whether HUD buttons are active during gamble in  game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, spin, gamble link, gamble page, HUD buttons
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Brownie Hot slot game, spin the reels and access to gamble and click on HUD buttons present on the screen
#    Then All HUD buttons should be inactive upon click shoudn't perform any action in  game
	  
   
#    Scenario: Check whether gamble credit win amount is getting added to the balance after win inBrownie Hot game 
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
#    Then verify the credit form of currency in gamble page on all fields in Brownie Hot slot game
#    Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Brownie Hot slot game 
	
	# Resume feature
	
# 	Scenario: Check whether resume feature is enabled in Gamble screen of Brownie Hot slot game
#	Given Chrome browser, valid URL, valid login details, Brownie Hot slotBrownie Hot slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, new browser.
#	When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser
#	Then  Resume feature should be enabled and land on the gamble screen of Brownie Hot slot game
#	Then Verify the Gamble attempts, gamble amount, gamble history and user is able to play left over attempts and collect the win amount in Brownie Hot slot game
#  
#    Scenario: Check whether resume feature is enabled in Gamble screen just by navigating of Brownie Hot slot game
#	Given Chrome browser, valid URL, valid login details, Brownie Hot slotBrownie Hot slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, new browser, gamble attempts.
#	When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and close the browser and again login to the game with new browser
#	Then  Resume feature should not be enabled and land on the game screen of Brownie Hot slot game
#  
#    Scenario: Check whether resume feature is enabled in Gamble screen and collect the win amount in Brownie Hot slot game
#	Given Chrome browser, valid URL, valid login details, Brownie Hot slotBrownie Hot slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, collect, new browser
#	When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and close the browser and again login to the game with new browser window
#	Then  Resume feature should be enabled and land on the game screen and collect the win amount in Brownie Hot slot game
#    Then Verify the reload option after gamble win in Brownie Hot slot game
  
    #Maxbet button
    
#     Scenario: Select the max bet option, do the spin and check whether balance is deducting according to the changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, max bet option, balance and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as maxbet, click on spin button and check the balance
#    Then Balance should get deducted by max credit and betvalue combinationas per the game specification inBrownie Hot game
    
    # Network Interruptions Scenario
    
# 	Scenario: Check whether error messages is displayed on network interruptions and upon good network connection resume to game session in Brownie Hot slot game 
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, netwok turnOFF and ON, network messages 
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin and turn OFF netwok and check for valid message. and turn on netwok for manual spin is continued
#    Then User is addressed with valid error message 'No Internet' for network interruptions in Brownie Hot slot game 
#    Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interruptions in Brownie Hot slot game 
  
    # Gamble link active and inactive state validation
  
#	Scenario: Check whether Gamble link is active after changing the bet and credit values
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, spin, gamble link, gamble page, credit and bet values
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click onBrownie Hot slot game, spin the reels and access to gamble link and change the bet and credit values
#    Then Verify the gamble link active and inactive state as changed bet and credit values in Brownie Hot slot game


   # Multiple login Sessions alert popup	
   
#	Scenario: Check whether multiple login sessions results in termination of older session
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, spin, Multiple login windows, multiple login alert pop up
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click onBrownie Hot slot game, spin the reels and open another session and play the game and return back to older session and play
#    Then Verify the 'Multiple Login' alert message on the screen in Brownie Hot slot game
#    Then Move to new session and play without interruption in Brownie Hot slot game   
  
  
  # Insufficient balance validation
  
#    Scenario: Check whether user able to play the game when there is insufficient balance in account in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button and insufficient alert message
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance less than bet value and check the validation message
#    Then Player should be blocked from playing the game when there is less balance in the account inBrownie Hot game
#    Then Decrease the credit and bet value and again start the spin in Brownie Hot slot game


   	#                   Maximize and Minimize Button Validation
    
#    Scenario: Check the functionality of maximize and minimize button in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, maximize button and minimize button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
#    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Brownie Hot slot game
 
 #	 Home Screen Navigate icon Validation
	
#	Scenario: Navigate to home screen from Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game and home button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
#    Then System should take the player to Home page after clicking on home button fromBrownie Hot game	
	
	
	#	        User Instruction Validation displayed when landed on Brownie Hot slot game

#    Scenario: Check user instruction messages before and after spin in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button and user instruction message
#	When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
#	Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
#	Then User instruction message 'Good Luck' should be displayed after spin button is clicked in Brownie Hot slot game

    # Validate the HUD game buttons color, font, alignment

#    Scenario: Check HUD Buttons color font and alignment in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, HUD buttons
#	When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, launch the game
#	Then Verify all the text button letter case
#	Then Verify colors of bet and credit buttons
#    Then Verify the functionality of hide and unhide button
#    Then Verify the alignment of spin button
#    Then Verify the color of turbo button 'ON' and 'OFF' state
#    Then Verify the color of spin and stop button


#	Scenario: Verify the bet values for incremental and decremental denomination in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, betvalues, credit increment and decremental 
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click credit incremental and decrement
#    Then Verify the bet values are in assigned fields in ascending order in Brownie Hot slot game	
	
	
#	Scenario: Check whether incrementing and decrementing the creditvalue, balance is equal to balance in creditform multplies by denomination respectively in Brownie Hot slot game 
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, increment, decrement and balance, balance in credit form, creditvalues
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance
#    Then Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Brownie Hot slot game 
	


# 	Scenario: Check whether error messages is displayed on network interruptions and upon good network connection Autospin is continued in Brownie Hot slot game 
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, Autospin button, netwok turnOFF and ON, network messages 
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, and launch the game, Autospin is turned ON and turn OFF netwok and check for valid message. and turn on netwok for Auto spin is continued
#    Then User is addressed with valid error message 'No Internet' for network interruptions during Autospin in Brownie Hot slot game 
#    Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interruptions during Autospin feature in Brownie Hot slot game 
  


#    Scenario: Change the bet value as THIRTY do the spin and check whether balance in credits is deducting according to the changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot game, bet type as 0.01, bet value as THIRTY, balance in credits and spin button
#    When Open the Brownie Hot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as THIRTY, click on spin button and check the balance in credits
#    Then Balance should get deducted by THIRTY as bet type is selected as 0.01 and bet value as THIRTY in Brownie Hot slot game
    
#   	Scenario: Change the bet value as SIXTY, do the spin and check whether balance in credits is deducting according to the changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, bet value as 60 balance in credits and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 60, click on spin button and check the balance in credits
#    Then Balance should get deducted by SIXTY as bet type is selected as 0.01 and bet value as SIXTY in Brownie Hot game
#	
#	 Scenario: Change the bet value as ONE FIFTY, do the spin and check whether balance in credits is deducting according to the changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, bet value as 150, balance in credits and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as ONE FIFTY  click on spin button and check the balance in credits
#    Then Balance should get deducted by ONE FIFTY, as bet type is selected as 0.01 and bet value as ONE FIFTY in Brownie Hot game
#	
#	 Scenario: Change the bet value as THREE HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, bet type as 0.01, bet value as THREE HUNDRED, balance in credits and spin button
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as THREE HUNDRED, click on spin button and check the balance in credits
#    Then Balance should get deducted by THREE HUNDRED, as bet type is selected as 0.01 and bet value as THREE HUNDRED in Brownie Hot slot game
	
#	 Scenario: Change the bet value as SIX HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot game, bet type as 0.01, bet value as SIX HUNDRED, balance in credits and spin button
#    When Open the Brownie Hot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as SIX HUNDRED, click on spin button and check the balance in credits
#    Then Balance should get deducted by SIX HUNDRED, as bet type is selected as 0.01 and bet value as SIX HUNDRED in Brownie Hot slot game
 

#	Scenario: Check bet value, credit value, home button, info button, play button, gamble link (active/disable) behavior during manual spin in Brownie Hot slot game
#    Given Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, spin button and check for buttons behavior & functionality
#    When Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin option and check behavior of different buttons in different scenarios
#    Then Bet value & Credit value buttons should not be clickable under spin condition in Brownie Hot slot game
#	And Home, Info and Turbo buttons should not be clickable on screen under spin condition in Brownie Hot slot game
#	And Spin button should be disabled during reel spin in Brownie Hot slot game
#	And Spin button should be visible after reel spin stops and if  win is triggered clicking on collect button in Brownie Hot slot game
#	And Gamble button behaviour under win triggered and disabled when next spin starts in Brownie Hot slot game
 
  