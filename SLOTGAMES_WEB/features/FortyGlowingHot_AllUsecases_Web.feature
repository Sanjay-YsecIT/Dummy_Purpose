       Feature: Test all the functionalities of FortyGlowing Hot SLOT Game


	   #	        According to bet type, bet values has to be generated respectively
	
#	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.4,0.8,2,4,8 in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.01 and bet value as 0.4,0.8,2,4,8
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value
#    Then Bet value should get changed 0.4,0.8,2,4,8 if the bet type selected as 0.01 from the drop down one in FortyGlowing Hot slot game
#	
#	Scenario: Select the bet type as 0.02 from the drop down and check the bet value should be 0.8,1.6,4,8,16 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, bet type as 0.02 and bet value as 0.8,1.6,4,8,16
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 and check the bet value should be 0.8,1.6,4,8,16
#    Then Bet value should get changed 0.8,1.6,4,8,16 if the bet type selected as 0.02 from the drop down two in FortyGlowing Hot slot game
#	
#	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 1.2,2.4,6,12,24 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.03 from down two and bet value as 1.2,2.4,6,12,24
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 from down  and check the bet value should be 1.2,2.4,6,12,24
#    Then Bet value should get changed to 1.2,2.4,6,12,24 if the bet type selected as 0.03 from the drop down three in FortyGlowing Hot slot game
#	
#	Scenario: Select the bet type as 0.2 from the drop down and check the bet value should be 8,6,40,80,160 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.2 from drop down and bet value as 8,6,40,80,160
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 from drop down and check the bet value should be 8,6,40,80,160
#    Then Bet value should get changed to 8,6,40,80,160 if the bet type selected as 0.2 from the drop down four in FortyGlowing Hot slot game
   
   
     #      _Balance_Credits_Calculations_Validation

#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, credits and denomination as 0.01 
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
#    Then Balance amount should be same as denomination 0.01 multiplies by credit in FortyGlowing Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.02 in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, credits, denomination drop down and denomination as 0.02 
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.02 and check the balance
#    Then Balance amount should be same as denomination 0.02 multiplies by credit in FortyGlowing Hot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game window, balance, credits, denomination drop down and denomination as 0.03 
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.03 and compare the balance
#    Then Balance amount should be same as denomination 0.03 multiplies by credit balance in FortyGlowing Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.2 in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, credits and denomination drop down & value as 0.2
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.2 manually with and check the balance
#    Then Balance amount should be same after multiplying denomination 0.2 by credit in FortyGlowing Hot slot game
   
   
   #                 Validation on win amount is added to the main balance when clicked on collect 
	
#	 Scenario: Check whether winning amount is getting added to the balance
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, transfer button, spin button and win amount
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win
#    Then Win amount should get added to the balance after win and balance should get added with win amount
  
  
    #	              WIN AMT TO CREDIT FORM AND VICE VERSA VALIDATION	            

#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
#    Then Win amount in credit multiplied by denomination is equal to win amount in currency in FortyGlowing Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in FortyGlowing Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in FortyGlowing Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in FortyGlowing Hot slot game


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


      	#	        VALIDATION ON GAMBLE WIN 2X AMOUNT IS ADDED TO MAIN BALANCE (black btn)
		
#	Scenario: check whether gamble win double amount is getting added to the balance after win in FortyGlowing Hot slot game 
#    Given chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, spin button, win amount, gamble button, gamble amount, black button, black button and gamble status
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black  gamble button and check the balance after win
#    Then Gamble double Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in FortyGlowing Hot slot game 
 
 
  	#	           Validation on Gamble to win amount is double than win amount

#	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of FortyGlowing Hot game 
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
#    When Open the FortyGlowing Hot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
#    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the FortyGlowing Hot game
	
	
	#	             Whether Gamble win amount is getting added to the main balance (red btn)
	
#	Scenario: Check whether gamble win amount is getting added to the balance after win in FortyGlowing Hot slot game 
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
#    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in FortyGlowing Hot slot game 
	
	
		#	        VALIDATION OF WIN AMOUNT AND GAMBLE AMOUNT FOR THE SAME VALUE DISPLAYED
	
#	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of FortyGlowing Hot slot game on web
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, spin button, win amount, gamble button and gamble amount
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web
#    Then Win amount should be displayed as Gamble amount in the gamble page of the FortyGlowing Hot slot game on web


   	 	#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.01 CREDIT   
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.4 in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.01, denomination as 0.4, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.01 & denomination as 0.4, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the info page for bet type 0.01 & denomination 0.4 in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination 0.8 in FortyGlowing Hot game
#    Given Chrome browser,valid URL, valid login details, FortyGlowing Hot game, transfer button, credit as 0.01, denomination as 0.8, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the FortyGlowing Hot slot game by entering the valid URL in chrome browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot slot game, transfer amount to slot game, select credit as 0.01 & denomination as 0.8, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.8 in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination TWO in FortyGlowing Hot game
#    Given FortyGlowing Hot slot game, bet type as 0.01, denomination as TWO balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.01 & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page of FortyGlowing Hot slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination TWO in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination FOUR in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, amount to transfer, transfer button, bet type as 0.01, denomination as FOUR, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortyGlowing Hot slot game, transfer the amount, select bet type as 0.01 & denomination as FOUR, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination FOUR in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination EIGHT in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.01, denomination as EIGHT, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.01 & denomination as EIGHT, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination EIGHT in FortyGlowing Hot game
	
	
		#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.02 CREDIT  	
	
#	 Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 & denomination 0.8 in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.02, denomination as 0.8, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.02 & denomination as 0.8, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed on gamble page of FortyGlowing Hot slot game based on win amount and gamble max amount configured on the info page for bet type 0.02 & denomination 0.8 in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 and denomination 1.6 in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, transfer button, bet type as 0.02, denomination as 1.6, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page in gamble page of slot game
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortyGlowing Hot slot game, transfer amount to slot game, select bet type as 0.02 & denomination as 1.6, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed on gamble page of FortyGlowing Hot slot game based on winning amount and gamble max amount configured on the game info page for bet type 0.02 & denomination 1.6 in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 & denomination FOUR in FortyGlowing Hot game
#    Given Chrome browser, Valid URL, valid Login credentials, FortyGlowing Hot slot game, bet type as 0.02, denomination as FOUR balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.02 & denomination as FOUR, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page of FortyGlowing Hot slot game based on win amount and gamble max amount configured on the game info page for bet type 0.02 & denomination FOUR in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 & denomination EIGHT in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, amount to transfer, transfer button, bet type as 0.02, denomination as EIGHT, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortyGlowing Hot slot game, transfer the amount, select bet type as 0.02 & denomination as EIGHT, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.02 and denomination EIGHT in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.02 & denomination SIXTEEN in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.02, denomination as SIXTEEN, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.02 & denomination as SIXTEEN click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.02 & denomination SIXTEEN in FortyGlowing Hot game
		
	
	
		#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.03 CREDIT 
	
#	 Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 1.2 in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.03, denomination as 1.2, balance, transfer button, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter amount & transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.03 & denomination as 1.2, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the info page for bet type 0.03 & denomination 1.2 in FortyGlowing Hot game
#	
#	
#	Scenario: Check Whether Gamble count is displaying as per the max amount configured on the info page for bet type 0.03 and betvalue 2.4 in FortyGlowing Hot game
#    Given chrome Browser, valid URL, valid login details, FortyGlowing Hot game, transfer amount button, bet type as 0.03, betvalue as 2.4, balance, spin button, win amount, gamble button, gamble amount, gamble to win amount game info page and gamble count in gamble page
#    When open the fortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot game, transfer amount to slot game, select bet type as 0.03 & betvalue as 2.4, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble Count ranging from 5-1 should be displayed based on winning amount and gamble max amount configured on the game info page for credit 0.03 & betvalue 2.4 in FortyGlowing Hot slot game	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination SIX in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, transfer button, bet type as 0.03, denomination as SIX, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on FortyGlowing Hot slot game, select bet type as 0.03 & denomination as SIX, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination SIX in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination TWELVE in FortyGlowing Hot game
#    Given chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, amount to transfer, transfer button, bet type as 0.03, denomination as TWELVE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortyGlowing Hot slot game, transfer the amount, select bet type as 0.03 & denomination as TWELVE, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.03 and denomination TWELVE in FortyGlowing Hot game
#	
#	
#	Scenario: Check Whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination Twenty Four in FortyGlowing Hot slot game
#    Given Chrome Browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.03, denomination as Twenty Four, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.03 & denomination as Twenty Four, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination Twenty Four in FortyGlowing Hot slot game
	
	
	       #	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.2 CREDIT 
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.2 & denomination EIGHT in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.2, denomination as EIGHT, balance, transfer button, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter amount & transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.2 & denomination as EIGHT, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the info page for bet type 0.2 & denomination EIGHT in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.2 and denomination SIXTEEN in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, transfer button, bet type as 0.2, denomination as SIXTEEN, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot slot game, transfer amount to slot game, select bet type as 0.2 & denomination as SIXTEEN, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.2 & denomination SIXTEEN in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.2 & denomination FORTY in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, transfer button, bet type as 0.2, denomination as FORTY, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on FortyGlowing Hot slot game, select bet type as 0.2 & denomination as FORTY, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.2 & denomination FORTY in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.2 & denomination EIGHTY in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, amount to transfer, transfer button, bet type as 0.2, denomination as EIGHTY, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortyGlowing Hot slot game, transfer the amount, select bet type as 0.2 & denomination as EIGHTY, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.2 and denomination EIGHTY in FortyGlowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.2 & denomination ONE SIXTY in FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type as 0.2, denomination as ONE SIXTY, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortyGlowing Hot slot game, select bet type as 0.2 & denomination as ONE SIXTY, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.2 & denomination ONE SIXTY in FortyGlowing Hot game


    	        #      PAYOUT TABLE TYPE WIN AMOUNT VALIDATION FOR ALL THE SYMBOLS WITH ALL DENOMINATIONS

#	 Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and all the denominations in FortyGlowing Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.01 and all denomination values 
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.01 & all denomination values and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination values in FortyGlowing Hot slot game on Web
#	
#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.02 and all the denominations in FortyGlowing Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.02 and  denomination values like 0.8, 1.6, 4, 8 & 16
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.02 & denomination  values like 0.8, 1.6, 4, 8 & 16 and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination values like 0.8, 1.6, 4, 8 & 16 in FortyGlowing Hot slot game on Web
#	
#	 Scenario: Check whether the max payout amount for each symbol like bug, nine as per the bet type 0.03 and all denomination values in FortyGlowing Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like melon, cherry n etc, back button, bet type 0.03 and all denomination values  on web
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like melon, cherry n etc, click on back button, select bet type as 0.03 & all denomination  values and check payout amount on web
#    Then System should display the Payout max amount on each symbol like melon, cherry etc and payout max amount should get changed whenever player changes the bet type to 0.03 and all denomination values in FortyGlowing Hot slot game on web
#	
#	Scenario: Check whether the max payout amount for each symbol like lemon, bell as per the bet type 0.2 and all denomination values in FortyGlowing Hot slot game on Web
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like lemon, bell n etc, back button, bet type 0.2 and denomination values like 8, 16, 40, 80 & 160 on web
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like lemon, bell n etc, click on back button, select bet type as 0.2 & denomination  values like 8, 16, 40, 80 & 160 and check payout amount on web
#    Then System should display the Payout max amount on each symbol like lemon, bell n etc and payout max amount should get changed whenever player changes the bet type to 0.2 and denomination values like 8, 16, 40, 80 & 160in FortyGlowing Hot slot game on web
 
 
      #                      Amount transfer to the game balance
    
#    Scenario: To check the transferred amount is added to FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, balance, text field to transfer balance and Ok button
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok button
#    Then The exact amount entered in the transfer page should transfer to FortyGlowing Hot game and same amount should get displayed on the balance section
   
#                      Amount transfer greater than the Available balance
    
#    Scenario: Check whether the player is able to transfer the amount more than the available balance
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, balance greater than available balance, text field to transfer balance, Ok button and validation message
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok button
#    Then Player should be blocked from loading the FortyGlowing Hot game when the amount entered in the transfer page is more than the available balance
    
#                       Null  value and check for valid result

#    Scenario: Check whether balance field is accepting null valuess in the transfer page of FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, empty balance, text field to transfer balance, Ok button and validation message
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, do not enter the amount in the balance field and click on Ok button
#    Then An error should be displayed if the balance field is empty and player should be blocked from loading the FortyGlowing Hot game
	
	
#	                         Check whether accepts zero amount input

#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of FortyGlowing Hot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot game, zero balance, text field to transfer balance, Ok button and validation message
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok button
#    Then An error should be displayed if balance entered was zero and player should be blocked from loading the FortyGlowing Hot game


    	#	              Info Page Navigation and exit button validation
     
#    Scenario: Check whether info page is navigating forward and backward, exit button for the FortyGlowing Hot slot game
#    Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, balance, settings, info icon, navigation icon, exit icon, payout, paylines, scatter-dollar, scatter-star, wild, gamble and jackpot window
#    When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on settings and info icon and validate the forward and backward button.
#    Then forward ,backward and exit button of info page should perform in FortyGlowing Hot slot game


     	#	   Big Win validation on triggering scatter-dollar symbol on all the Reels, and the big win triggered

#	Scenario: Check whether Big win is triggering on, when 5 scatter-dollar  symbol appears on the screen in FortyGlowing Hot game
#	Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type, denomination, balance, scatter-dollar, spin button, Big win window and win amount
#	When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter-dollar appears on all the five reels and big win screen appears and big win amount added to the balance
#	Then  Big Win screen should appear when five scatter-dollar symbols appears on the screen in FortyGlowing Hot game
	
        #	     checking for scatter-dollar win is triggered when appeared on the reels                  

#	Scenario: Check whether Scatter-dollar win is triggering on, when 3 and above 3 dollar symbol appears on the screen in FortyGlowing Hot game
#	Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type, denomination, balance, dollar symbols, spin button, Big win window and win amount
#	When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till dollar appears on three and above three reels and win amount added to the balance
#	Then Scatter-dollar win amount should appear when three and above three, dollar symbols appears on the screen in FortyGlowing Hot game
	
	
           #	  checking for scatter-star win is triggered when appeared on the reels 

#	Scenario: Check whether Scatter-star win is triggering on, when 3 star symbols appears on 1,3,5th reels on the screen in FortyGlowing Hot game
#	Given Chrome browser, valid URL, valid login details, FortyGlowing Hot slot game, bet type, denomination, balance, star symbols, spin button and win amount
#	When Open the FortyGlowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till star appears on 1,3,5th reels and win amount added to the balance
#	Then Scatter-star win is triggered and win amount should appear when star symbol appears on 1,3,5th reels, in FortyGlowing Hot game



