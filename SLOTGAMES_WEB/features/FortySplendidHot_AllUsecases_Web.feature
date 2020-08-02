       Feature: Test all the functionalities of FortySplendidHot SLOT Game


	   #	        According to bet type, bet values has to be generated respectively
	
#	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.4,0.8,2,4,8 in FortySplendidHot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, bet type as 0.01 and bet value as 0.4,0.8,2,4,8
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value
#    Then Bet value should get changed 0.4,0.8,2,4,8 if the bet type selected as 0.01 from the drop down one in FortySplendidHot slot game
	
#	Scenario: Select the bet type as 0.02 from the drop down and check the bet value should be 0.8,1.6,4,8,16 in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot game, bet type as 0.02 and bet value as 0.8,1.6,4,8,16
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 and check the bet value should be 0.8,1.6,4,8,16
#    Then Bet value should get changed 0.8,1.6,4,8,16 if the bet type selected as 0.02 from the drop down two in FortySplendidHot slot game
	
#	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 1.2,2.4,6,12,24 in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, bet type as 0.03 from down two and bet value as 1.2,2.4,6,12,24
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 from down  and check the bet value should be 1.2,2.4,6,12,24
#    Then Bet value should get changed to 1.2,2.4,6,12,24 if the bet type selected as 0.03 from the drop down three in FortySplendidHot slot game
#	
#	Scenario: Select the bet type as 0.2 from the drop down and check the bet value should be 8,6,40,80,160 in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, bet type as 0.2 from drop down and bet value as 8,6,40,80,160
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.2 from drop down and check the bet value should be 8,6,40,80,160
#    Then Bet value should get changed to 8,6,40,80,160 if the bet type selected as 0.2 from the drop down four in FortySplendidHot slot game
   
   
     #      _Balance_Credits_Calculations_Validation

#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, credits and denomination as 0.01 
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
#    Then Balance amount should be same as denomination 0.01 multiplies by credit in FortySplendidHot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.02 in FortySplendidHot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, credits, denomination drop down and denomination as 0.02 
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.02 and check the balance
#    Then Balance amount should be same as denomination 0.02 multiplies by credit in FortySplendidHot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game window, balance, credits, denomination drop down and denomination as 0.03 
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.03 and compare the balance
#    Then Balance amount should be same as denomination 0.03 multiplies by credit balance in FortySplendidHot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.2 in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, credits and denomination drop down & value as 0.2
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.2 manually with and check the balance
#    Then Balance amount should be same after multiplying denomination 0.2 by credit in FortySplendidHot slot game


  #                 Validation on win amount is added to the main balance when clicked on collect 
	
#	 Scenario: Check whether winning amount is getting added to the balance
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, transfer button, spin button and win amount
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win
#    Then Win amount should get added to the balance after win and balance should get added with win amount
  
  
    #	              WIN AMT TO CREDIT FORM AND VICE VERSA VALIDATION	            

#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button, win amount in currency, credits and win amount in credits
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortySplendidHot slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
#    Then Win amount in credit multiplied by denomination is equal to win amount in currency in FortySplendidHot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in FortySplendidHot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in FortySplendidHot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in FortySplendidHot slot game


      #           Bet value validation for 0.01 credit with different bet values, within the transferred balance range.

#    Scenario: Change the bet value as 0.4, do the spin and check whether balance is deducting according to the changed bet type in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, bet type as 0.01, bet value as 0.4, balance and spin button
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 0.4, click on spin button and check the balance
#    Then Balance should get deducted by 0.4 as bet type is selected as 0.01 and bet value as 0.4 in FortySplendidHot game
#	
#	
#	Scenario: Change the bet value as 0.8, do the spin and check whether balance is deducting according to the changed bet type in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot game, bet type as 0.01, bet value as 0.8, balance and spin button
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, click on spin button and check the balance
#    Then Balance should get deducted by 0.8 as bet type is selected as 0.01 in FortySplendidHot game
#	
#	
#	Scenario: Change the bet value to TWO, click on spin button and check whether current balance is deducting according to changed bet type in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, bet type as 0.01, bet value as TWO, balance, spin button and win amount
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWO, click on spin button, check the win amount and check the balance
#    Then Current Balance should get deducted by TWO as bet type is selected as 0.01 and bet value as TWO in FortySplendidHot game
#	
#	
#	Scenario: Change the bet value as FOUR, do the spin and check whether balance is deducting according to changed bet type in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, bet type as 0.01, bet value as FOUR, balance and spin button
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FOUR, click on spin button and check the balance
#    Then Current Balance should get deducted by FOUR as bet type is selected as 0.01 and bet value as FOUR in FortySplendidHot game
#	
#	
#	Scenario: Change the bet value as Eight, click on spin and check whether existing balance is deducting according to changed bet type in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot game, bet type as 0.01, bet value as Eight, balance and spin button
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value to Eight, click on spin button and check the slot game balance
#    Then Existing Balance should get deducted by Eight as bet type is selected as 0.01 and bet value as Eight in FortySplendidHot slot game

    
       	 	#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.01 CREDIT   
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.4 in FortySplendidHot game
    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, bet type as 0.01, denomination as 0.4, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortySplendidHot slot game, select bet type as 0.01 & denomination as 0.4, click on spin button till user wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the info page for bet type 0.01 & denomination 0.4 in FortySplendidHot game
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination 0.8 in FortySplendidHot game
#    Given Chrome browser,valid URL, valid login details, FortySplendidHot game, transfer button, credit as 0.01, denomination as 0.8, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the FortySplendidHot slot game by entering the valid URL in chrome browser, enter the valid login details, transfer the balance, click on FortySplendidHot slot game, transfer amount to slot game, select credit as 0.01 & denomination as 0.8, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.8 in FortySplendidHot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination TWO in FortySplendidHot game
#    Given FortySplendidHot slot game, bet type as 0.01, denomination as TWO balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortySplendidHot slot game, select bet type as 0.01 & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed  on gamble page of FortySplendidHot slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination TWO in FortySplendidHot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination FOUR in FortySplendidHot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, amount to transfer, transfer button, bet type as 0.01, denomination as FOUR, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on FortySplendidHot slot game, transfer the amount, select bet type as 0.01 & denomination as FOUR, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination FOUR in FortySplendidHot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination EIGHT in FortySplendidHot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, bet type as 0.01, denomination as EIGHT, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortySplendidHot slot game, select bet type as 0.01 & denomination as EIGHT, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination EIGHT in FortySplendidHot game
    
    
    
      	#	        VALIDATION ON GAMBLE WIN 2X AMOUNT IS ADDED TO MAIN BALANCE (black btn)
		
#	Scenario: check whether gamble win double amount is getting added to the balance after win in FortySplendidHot slot game 
#    Given chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button, win amount, gamble button, gamble amount, black button, black button and gamble status
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black  gamble button and check the balance after win
#    Then Gamble double Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in FortySplendidHot slot game 
 
 
  	#	           Validation on Gamble to win amount is double than win amount

#	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of FortySplendidHot game 
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
#    When Open the FortySplendidHot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on FortySplendidHot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
#    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the FortySplendidHot game
	
	
	#	             Whether Gamble win amount is getting added to the main balance (red btn)
	
#	Scenario: Check whether gamble win amount is getting added to the balance after win in FortySplendidHot slot game 
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
#    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in FortySplendidHot slot game 
	
	
		#	        VALIDATION OF WIN AMOUNT AND GAMBLE AMOUNT FOR THE SAME VALUE DISPLAYED
	
#	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of FortySplendidHot slot game on web
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button, win amount, gamble button and gamble amount
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web
#    Then Win amount should be displayed as Gamble amount in the gamble page of the FortySplendidHot slot game on web
    
    
        	        #      PAYOUT TABLE TYPE WIN AMOUNT VALIDATION FOR ALL THE SYMBOLS WITH ALL DENOMINATIONS

#	 Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and all the denominations in FortySplendidHot slot game on Web
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.01 and all denomination values 
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.01 & all denomination values and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination values in FortySplendidHot slot game on Web
	
#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.02 and all the denominations in FortySplendidHot slot game on Web
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.02 and  denomination values like 0.8, 1.6, 4, 8 & 16
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.02 & denomination  values like 0.8, 1.6, 4, 8 & 16 and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination values like 0.8, 1.6, 4, 8 & 16 in FortySplendidHot slot game on Web
#	
#	 Scenario: Check whether the max payout amount for each symbol like bug, nine as per the bet type 0.03 and all denomination values in FortySplendidHot slot game on Web
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, icon to open payout table, all symbols, max amount on each symbol like melon, cherry n etc, back button, bet type 0.03 and all denomination values  on web
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like melon, cherry n etc, click on back button, select bet type as 0.03 & all denomination  values and check payout amount on web
#    Then System should display the Payout max amount on each symbol like melon, cherry etc and payout max amount should get changed whenever player changes the bet type to 0.03 and all denomination values in FortySplendidHot slot game on web
#	
#	Scenario: Check whether the max payout amount for each symbol like lemon, bell as per the bet type 0.2 and all denomination values in FortySplendidHot slot game on Web
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, icon to open payout table, all symbols, max amount on each symbol like lemon, bell n etc, back button, bet type 0.2 and denomination values like 8, 16, 40, 80 & 160 on web
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like lemon, bell n etc, click on back button, select bet type as 0.2 & denomination  values like 8, 16, 40, 80 & 160 and check payout amount on web
#    Then System should display the Payout max amount on each symbol like lemon, bell n etc and payout max amount should get changed whenever player changes the bet type to 0.2 and denomination values like 8, 16, 40, 80 & 160in FortySplendidHot slot game on web
 
    
         #                      Amount transfer to the game balance
    
#    Scenario: To check the transferred amount is added to FortySplendidHot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot game, balance, text field to transfer balance and Ok button
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok button
#    Then The exact amount entered in the transfer page should transfer to FortySplendidHot game and same amount should get displayed on the balance section
   
#                      Amount transfer greater than the Available balance
    
#    Scenario: Check whether the player is able to transfer the amount more than the available balance
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot game, balance greater than available balance, text field to transfer balance, Ok button and validation message
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok button
#    Then Player should be blocked from loading the FortySplendidHot game when the amount entered in the transfer page is more than the available balance
    
#                       Null  value and check for valid result

#    Scenario: Check whether balance field is accepting null valuess in the transfer page of FortySplendidHot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot game, empty balance, text field to transfer balance, Ok button and validation message
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, do not enter the amount in the balance field and click on Ok button
#    Then An error should be displayed if the balance field is empty and player should be blocked from loading the FortySplendidHot game
	
	
#	                         Check whether accepts zero amount input

#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of FortySplendidHot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot game, zero balance, text field to transfer balance, Ok button and validation message
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok button
#    Then An error should be displayed if balance entered was zero and player should be blocked from loading the FortySplendidHot game
    
    
         #        Insufficent balance validation

#    Scenario: Check whether user able to play the game when there is insufficiant balance in account in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button and validation message
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message
#    Then Player should be blocked from playing the game when there is no balance in the account in FortySplendidHot game
	
        	#       Maximize and Minimize Button Validation
    
#    Scenario: Check the functionality of maximize and minimize button in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, maximize button and minimize button
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
#    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in FortySplendidHot slot game
 
 
    	#	        User Instruction Validation displayed when landed on FortySplendidHot Slot game

#    Scenario: Check user instruction messages before and after spin in FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, balance, spin button and user instruction message
#	When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
#	Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
#	Then User instruction message 'Good Luck' should be displayed after spin button is clicked in FortySplendidHot slot game
 
          #	 Home Screen Navigate icon Validation
	
#	Scenario: Navigate to home screen from FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game and home button
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
#    Then System should take the player to Home page after clicking on home button from FortySplendidHot game	
    
    
            #	   Validate feature with the balance credited into the balance field in Try now game option
	
#	 Scenario: Check whether system is providing balance in try now feature of FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, try now button and balance to play
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, click on try now button
#    Then System should provide five thousand as balance on click on try now button in FortySplendidHot slot game
		
	
#	      Validate feature for amount is deducted on spin button click try now game
	
#	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of FortySplendidHot slot game
#    Given Chrome browser, valid URL, valid login details, FortySplendidHot slot game, try now button, balance to play and spin button
#    When Open the FortySplendidHot slot game by entering the valid URL in browser, click on try now button and click on spin button
#    Then Amount should get deducted from balance on click on spin button in try now page of FortySplendidHot slot game
    
    