Feature: Test all the functionalities of HappyFruits SLOT Game


#1 Auto Spin feature

#    Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
#    Then System should keep performing the spins in Happy Fruits slot game

#    Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
#    When Open the Happy Fruits  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 Happy Fruits slot game
    
#    Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Happy Fruits slot game

    
    
   
 #2 Bet values dropdown   
    
#	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 0.15,0.3,0.75,1.5,3 in Happy Fruits Hot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits Hot slot game, bet type as 0.03 and bet value as 0.15,0.3,0.75,1.5,3
#    When Open the Happy Fruits Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 and check the bet value
#    Then Bet value should get changed 0.15,0.3,0.75,1.5,3 if the bet type selected as 0.03 from the drop down one in Happy Fruits Hot slot game
	
#	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 0.25,0.5,1.25,2.5,5 in Happy Fruits Hot slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits Hot game, bet type as 0.05 and bet value as 0.25,0.5,1.25,2.5,5
#    When Open the Happy Fruits Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 and check the bet value should be 0.25,0.5,1.25,2.5,5
#    Then Bet value should get changed 0.25,0.5,1.25,2.5,5 if the bet type selected as 0.05 from the drop down two in Happy Fruits Hot slot game
#	
#	Scenario: Select the bet type as 0.1 from the drop down and check the bet value should be 0.5,1,2.5,5,10 in Happy Fruits Hot slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits Hot slot game, bet type as 0.1 from down 2 and bet value as 0.5,1,2.5,5,10
#    When Open the Happy Fruits Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from down  and check the bet value should be 0.5,1,2.5,5,10
#    Then Bet value should get changed to 0.5,1,2.5,5,10 if the bet type selected as 0.1 from the drop down three in Happy Fruits Hot slot game
#	
#	Scenario: Select the bet type as 1 from the drop down and check the bet value should be 5,10,25,50,100 in Happy Fruits Hot slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits Hot slot game, bet type as 1 from drop down and bet value as 5,10,25,50,100
#    When Open the Happy Fruits Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 from drop down and check the bet value should be 5,10,25,50,100
#    Then Bet value should get changed to 5,10,25,50,100 if the bet type selected as 1 from the drop down four in Happy Fruits Hot slot game
   
   
 #3   Balance to credit form validation
   
#    Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in Happy Fruits Hot slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits Hot slot game, balance, credits and denomination as 0.03
#    When Open the Happy Fruits Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.03 and check the balance
#    Then Balance amount should be same as denomination 0.03 multiplies by credit in Happy Fruits Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Happy Fruits Hot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits Hot slot game, balance, credits, denomination drop down and denomination as 0.05 
#    When Open the Happy Fruits Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.05 and check the balance
#    Then Balance amount should be same as denomination 0.05 multiplies by credit in Happy Fruits Hot game
	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.1 in Happy Fruits Hot slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits Hot slot game window, balance, credits, denomination drop down and denomination as 0.1 
#    When Open the Happy Fruits Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.1 and compare the balance
#    Then Balance amount should be same as denomination 0.1 multiplies by credit balance in Happy Fruits Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 1 in Happy Fruits Hot slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits Hot slot game, balance, credits and denomination drop down & value as 1  
#    When Open the Happy Fruits Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 1 manually with and check the balance
#    Then Balance amount should be same after multiplying denomination 1 by credit in Happy Fruits Hot slot game
   
   
  #4    Win amount is added to the main balance when clicked on collect 
	
#	 Scenario: Check whether winning amount is getting added to the balance
#    Given Chrome browser, valid URL, valid login details, Happy Fruits Hot slot game, balance, transfer button, spin button and win amount
#    When Open the Happy Fruits Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win
#    Then Win amount should get added to the balance after win and balance should get added with win amount
#   
#	 Scenario: Check whether winning amount is getting added to the main balance in credits
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, transfer button, credit balance form, spin button and win amount
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits
#    Then Win amount should get added to the credit field after win and credit should get increased with win amount
  	  
   
   
   
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, balance, spin button, win amount in currency, credits and win amount in credits
#    When Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
#    Then Win amount in credits multiplied by denomination is equal to win amount in currency in Happy Fruits slot game	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credits multiplied by denomination drop down value two is equal to win amount in currency in Happy Fruits slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credits multiplied by denomination drop down value three is equal to win amount in currency in Happy Fruits slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credits multiplied by denomination drop down value four is equal to win amount in currency in Happy Fruits slot game




   #6  Balance deduction scenario   
   
#    Scenario: Change the bet value as 0.15, do the spin and check whether balance is deducting according to the changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.03, bet value as 0.15, balance and spin button
#    When Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.15, click on spin button and check the deduct balance
#    Then Balance should be deducted by 0.15 as bet type is selected as 0.03 and bet value as 0.15 in Happy Fruits slot game
#
#	Scenario: Change the bet value as 0.3, do the spin and check whether balance is deducting according to the changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.03, bet value as 0.3, balance field and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, click on spin button and check the balance fields
#    Then Balance should get deducted by 0.3 as bet type is selected as 0.03 in Happy Fruits slot game
#	
#	
#	Scenario: Change the bet value to 0.75, click on spin button and check whether current balance is deducting according to changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.03, bet value as 0.75, balance, spin button and balance field
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.75, click on spin button, check the win amount and check the balance after spin
#    Then Current Balance should get deducted by 0.75 as bet type is selected as 0.03 and bet value as 0.75 in Happy Fruits slot game
#	
#	
#	Scenario: Change the bet value as 1.5, do the spin and check whether balance is deducting according to changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, bet value as 1.5, balance and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 1.5, click on spin button and check the spin balance
#    Then Balance should get deducted by 1.5 as bet type is selected as 0.03 and bet value as 1.5 in Happy Fruits slot game
	
	
#	Scenario: Change the bet value as THREE, click on spin and check whether existing balance is deducting according to changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.03, bet value as 3, balance and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value to THREE, click on spin button and check the slot game deducted balance
#    Then Existing Balance should get deducted by THREE as bet type is selected as 0.03 and bet value as THREE in Happy Fruits game
    
    
    
#	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 1 in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 1, bet value as FIVE, balance and spin buttone
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as FIVE, click on spin button and check the balance
#    Then Balance should get deducted by FIVE as bet type is selected as 1 in Happy Fruits game
#	
#	
#	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 1 in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 1, bet value as TEN, balance and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as TEN, click on spin button and check the balance
#    Then Balance should get deducted by TEN as bet type is selected as 1 in Happy Fruits game
#	
#	
#	Scenario: Change the bet value as 25, do the spin and check whether balance is deducting according to the changed bet type 1 in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 1, bet value as 25, balance and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as 25, click on spin button and check the balance
#    Then Balance should get deducted by 25 as bet type is selected as 1 in Happy Fruits game
#	
#	Scenario: Change the bet value as FIFTY, do the spin and check whether balance is deducting according to the changed bet type 1 in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 1, bet value as FIFTY, balance and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as FIFTY, click on spin button and check the balance
#    Then Balance should get deducted by FIFTY as bet type is selected as 1 in Happy Fruits game
#	
#	Scenario: Change the bet value as hundred, do the spin and check whether balance is deducting according to the changed bet type 1 in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 1, bet value as hundred, balance and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 1 & bet value as hundred, click on spin button and check the balance
#    Then Balance should get deducted by hundred as bet type is selected as 1 in Happy Fruits game



	#Balance Deduction in credits
	
#   	Scenario: Change the bet value as Five do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.03, bet value as five, balance in credits and spin button
#    When Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as Five, click on spin button and check the balance in credits
#    Then Balance should get deducted by Five as bet type is selected as 0.03 and bet value as 5 in Happy Fruits slot game
#    
#   	Scenario: Change the bet value as Ten do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, bet value as Ten, balance in credits and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as Ten, click on spin button and check the balance in credits
#    Then Balance should get deducted by Ten as bet type is selected as 0.03 and bet value as Ten in Happy Fruits game
#	
#	 Scenario: Change the bet value as 25, do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, bet value as 25, balance in credits and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 25, click on spin button and check the balance in credits
#    Then Balance should get deducted by 25, as bet type is selected as 0.03 and bet value as 25 in Happy Fruits game
	
#	 Scenario: Change the bet value as Fifty, do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, bet value as Fifty, balance in credits and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as Fifty, click on spin button and check the balance in credits
#    Then Balance should get deducted by Fifty, as bet type is selected as 0.03 and bet value as Fifty, in Happy Fruits slot game
	
#	 Scenario: Change the bet value as HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, bet type as 0.03, bet value as HUNDRED, balance in credits and spin button
#    When Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as HUNDRED, click on spin button and check the balance in credits
#    Then Balance should get deducted by HUNDRED, as bet type is selected as 0.03 and bet value as 100 in Happy Fruits slot game


       	#	        VALIDATION ON GAMBLE WIN 2X AMOUNT IS ADDED TO MAIN BALANCE (black btn)
		
#	Scenario: check whether gamble win double amount is getting added to the balance after win in Happy Fruits slot game 
#    Given chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount, gamble button, gamble amount, black button, black button and gamble status
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black  gamble button and check the balance after win
#    Then Gamble double Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Happy Fruits slot game 
#    Then  After 1st win gamble amount is doubled and available for next gamble in Happy Fruits slot game
 
  	#	           Validation on Gamble to win amount is double than win amount

#	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Happy Fruits game 
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
#    When Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
#    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Happy Fruits game
	
	
	#	             Whether Gamble win amount is getting added to the main balance (red btn)
	
#	Scenario: Check whether gamble win amount is getting added to the balance after win in Happy Fruits slot game 
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount, gamble button, gamble amount, red button and gamble status
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red button and check the balance after win
#    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should be closed in Happy Fruits slot game 
	
	
		#	        VALIDATION OF WIN AMOUNT AND GAMBLE AMOUNT FOR THE SAME VALUE DISPLAYED
	
#	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Happy Fruits slot game on web
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount, gamble button, gamble page and gamble amount
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web
#    Then Win amount should be displayed as Gamble amount in the gamble page of the Happy Fruits slot game on web
	
        
#	Scenario: Checking whether suit win amount is getting added to balance if it is win else it should not get added in Happy Fruits slot game 
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, win amount, gamble button, card to click for suit win and suit win amount
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and click on suit win card in gamble page
#    Then Suit Win amount(4x) should get added to the main balance after win else it should not get added to main balance in the Happy Fruits slot game
	
	
#	Scenario: Checking Suit win to Win amount should be quadruple than gamble amount in gamble page of Happy Fruits game 
#    Given Chrome browser, valid URL, valid login details, Happy Fruits game, balance, spin button, win amount, Suit win dice options, gamble amount and suit to win amount
#    When Open the Happy Fruits game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, click on spin button till player wins, click on suit win dice button and check the suit to win amount
#    Then suit To Win amount should be quadruple than win amount in the gamble page of the Happy Fruits game
#    Then Verify the suit win options and gamble page color, alignment and text fonts in Happy Fruits slot game
   
    	
#    Scenario: Check whether gamble credit win amount is getting added to the balance after win in Happy Fruits game 
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
#    Then verify the credit form of currency in gamble page on all fields in Happy Fruits slot game
#    Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Happy Fruits slot game 


#                      Amount transfer to the game balance
    
#    Scenario: To check the transferred amount is added to Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, text field to transfer balance and Ok button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok button
#    Then The exact amount entered in the transfer page should transfer to Happy Fruits slot game and same amount should get displayed on the balance section
   
#                      Amount transfer greater than the Available balance
    
#    Scenario: Check whether the player is able to transfer the amount more than the available balance
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot  game, balance greater than available balance, text field to transfer balance, Ok button and validation message
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok button
#    Then Player should be blocked from loading the Happy Fruits slot game when the amount entered in the transfer page is more than the available balance
    
#                       Null  value and check for valid result

#    Scenario: Check whether balance field is accepting null values in the transfer page of Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details,Happy Fruits slot game, empty balance, text field to transfer balance, Ok button and validation message
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, do not enter the amount in the balance field and click on Ok button
#    Then An error should be displayed if the balance field is empty and player should be blocked from loading the Happy Fruits slot game
	
	
#	                         Check whether accepts zero amount input

#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, zero balance, text field to transfer balance, Ok button and validation message
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok button
#    Then An error should be displayed if balance entered was zero and player should be blocked from loading the Happy Fruits slot game


 #	     Validate feature with the balance credited into the balance field in Try now game option
	
#	 Scenario: Check whether system is providing balance in try now feature of Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, try now button and balance to play
#    When Open the Happy Fruits slot game by entering the valid URL in browser, click on try now button
#    Then System should provide five thousand as balance on click on try now button in Happy Fruits slot game
		
	
#	      Validate feature for amount is deducted on spin button click
	
#	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, try now button, balance to play and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, click on try now button and click on spin button
#    Then Amount should get deducted from balance on click on spin button in try now page of Happy Fruits slot game


#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and all the denominations in Happy Fruits slot game on Web
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.03 and all denomination values 
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.03 & all denomination  values and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination values in Happy Fruits slot game on Web
	
#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.05 and all the denominations in Happy Fruits slot game on Web
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.05 and  denomination values like 0.25, 0.5, 1.25, 2.5 & 5
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.05 & denomination  values like 0.25, 0.5, 1.25, 2.5 & 5 and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.02 and denomination values like 0.25, 0.5, 1.25, 2.5 & 5 in Happy Fruits slot game on Web
#	
#	 Scenario: Check whether the max payout amount for each symbol like lemon, grape as per the bet type 0.1 and all denomination values in Happy Fruits slot game on Web
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, icon to open payout table, all symbols, max amount on each symbol like lemon, grape n etc, back button, bet type 0.1 and all denomination values on web
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like lemon, grape n etc, click on back button, select bet type as 0.1 & all denomination values and check payout amount on web
#    Then System should display the Payout max amount on each symbol like lemon, grape etc and payout max amount should get changed whenever player changes the bet type to 0.1 and all denomination values in Happy Fruits slot game on web
#	
#	Scenario: Check whether the max payout amount for each symbol like pear, melon as per the bet type 1 and all denomination values in Happy Fruits slot game on Web
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, icon to open payout table, all symbols, max amount on each symbol like lemon, grape n etc, back button, bet type 1 and denomination values like 5, 10, 25, 50 & 100 on web
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like lemon, grape n etc, click on back button, select bet type as 1 & denomination  values like 5, 10, 25, 50 & 100 and check payout amount on web
#    Then System should display the Payout max amount on each symbol like lemon, grape n etc and payout max amount should get changed whenever player changes the bet type to 1 and denomination values like 5, 10, 25, 50 & 100 in Happy Fruits slot game on web



   	 	#	     GAMBLE COUNT AND AMOUNT VALIDATION FOR 0.01 CREDIT   
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.15 in Happy Fruits game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, denomination as 0.15, balance , spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, select bet type as 0.03 & denomination as 0.15, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the info page for bet type 0.03 & denomination 0.15 in Happy Fruits game
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 and denomination 0.3 in Happy Fruits game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, transfer button, bet type as 0.03, denomination as 0.3, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, transfer amount to slot game, select bet type as 0.03 & denomination as 0.3, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.3 in Happy Fruits game
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.75 in Happy Fruits game
#    Given Happy Fruits slot game, bet type as 0.03, denomination as 0.75, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Happy Fruits slot game, select bet type as 0.03 & denomination as 0.75, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed on gamble page of Happy Fruits slot game based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.75 in Happy Fruits game
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 1.5 in Happy Fruits game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, amount to transfer, transfer button, bet type as 0.03, denomination as 1.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Happy Fruits slot game, transfer the amount, select bet type as 0.03 & denomination as 1.5, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.03 and denomination 1.5 in Happy Fruits game
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination Three in Happy Fruits game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, denomination as Three, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, select bet type as 0.03 & denomination as Three, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination Three in Happy Fruits game

   
#	Scenario: Check whether on winning and losing the gamble on last gamble count in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type as 0.03, denomination as 0.15, balance, spin button, win amount, gamble button, gamble amount, red button, win amount field in main page
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, select bet type as 0.03 & denomination as 0.15, click on spin button till user wins, click on gamble button and pay gamble with last gamble count 
#    Then Gamble page should terminate and win amount should be added to main balance in Happy Fruits slot game



# 	Scenario: Check whether resume feature is enabled in Gamble screen of Happy Fruits slot game
#	Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, new browser.
#	When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser
#	Then  Resume feature should be enabled and land on the gamble screen of Happy Fruits slot game
#	Then Verify the Gamble attempts, gamble amount and user is able to play left over attempts and collect the win amount in Happy Fruits slot game
  
#    Scenario: Check whether resume feature is enabled in Gamble screen just by navigating of Happy Fruits slot game
#	Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, new browser, gamble attempts.
#	When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and close the browser and again login to the game with new browser
#	Then  Resume feature should not be enabled and land on the game screen in Happy Fruits slot game
  
#    Scenario: Check whether resume feature is enabled in Gamble screen and collect the win amount in Happy Fruits slot game
#	Given Chrome browser, valid URL, valid login details, Happy Fruits slotHappy Fruits slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, collect, new browser
#	When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and close the browser and again login to the game with new browser window
#	Then  Resume feature should be enabled and land on the game screen and collect the win amount in Happy Fruits slot game
#    Then Verify the reload option after gamble win in Happy Fruits slot game



#	Scenario: Verify the bet values for incremental and decremental denomination in  Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, betvalues, credit increment and decremental 
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click credit incremental and decrement
#    Then Verify the bet values are in assigned fields in ascending order in Happy Fruits slot game	
	
	
#	Scenario: Check whether incrementing and decrementing the creditvalue, balance is equal to balance in creditform multplies by denomination respectively in Happy Fruits slot game 
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, increment, decrement and balance, balance in credit form, creditvalues
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance
#    Then Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Happy Fruits slot game 
 
 
 
      	#       Maximize and Minimize Button Validation
    
#    Scenario: Check the functionality of maximize and minimize button in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, maximize and minimize button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
#    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Happy Fruits slot game
 
    	#	        User Instruction Validation displayed when landed on Happy Fruits slot game

#    Scenario: Check user instruction messages before and after spin in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button and user instruction message field
#	When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
#	Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
#	Then User instruction message 'Good Luck' should be displayed after spin button is clicked in Happy Fruits game
 
          #	 Home Screen Navigate icon Validation
	
#	Scenario: Navigate to home screen from Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game and home button
#    When Open the Happy Fruits slot game by entering the valid URL in browser,enter the valid login details, transfer the balance and click on home button
#    Then System should take the player to Home page after clicking on home button from Happy Fruits slot game	
 
 
 # Multiple login Sessions alert popup	
   
#	Scenario: Check whether multiple login sessions results in termination of older session
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, spin, Multiple login windows, multiple login alert pop up
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Happy Fruits slot game, spin the reels and open another session and play the game and return back to older session and play
#    Then Verify the 'Multiple Login' alert message on the screen in Happy Fruits slot game
#    Then Move to new session and play without interruption in Happy Fruits slot game   
    
    
#	 Scenario: Check whether Session expired message displayed for long duration inactive game state in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, transfer button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, idle the game session for about 22mins
#    Then Session Expired message should display and user has to start new session for game play in Happy Fruits slot game
    
  
#	 Scenario: Check whether multiple tabs switching and reload is allowed in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, transfer button, spin button, multiple tabs and reload option
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on autospin and switch between tabs and again reload the game
#    Then Switching between tabs should be allowed and reloading the game resulting in ending game session and shouldn't resume the Happy Fruits slot game
  
  
#	Scenario: Check bet & credit value buttons behavior after navigating from gamble page during autoplay and check win amount getting added to balance in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page
#    Then Bet value & Credit value buttons should be clickable after navigating from gamble page when autospin is stopped in Happy Fruits slot game
#	And Win amount should get added to the balance during autoplay
	
	
#    Scenario: Check whether user able to play Autospin feature game when there is insufficient balance in account in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, AutoSpin button, validation message, maxbet button, credit decrement button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select maxbet, click on Autospin button till balance turns to zero and check the validation message and decrement the denomination and again spin the reels
#    Then Check for the game buttons during the insufficient alert message in the Happy Fruits slot game
#    Then Player should be blocked from playing the game when there is no balance in the account and after decrementing credit and trigger autospin in Happy Fruits slot game
	
 
 
# 	Scenario: Check whether error messages is displayed on network interruptions and upon good network connection resume to game session in Happy Fruits slot game 
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, netwok turnOFF and ON, network messages 
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin and turn OFF netwok and check for valid message. and turn on netwok for manual spin is continued
#    Then User is addressed with valid error message 'No Internet' for network interruptions in Happy Fruits slot game 
#    Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interruptions in Happy Fruits slot game 
  
# 	Scenario: Check whether error messages is displayed on network interruptions and upon good network connection Autospin is continued in Happy Fruits slot game 
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, Autospin button, netwok turnOFF and ON, network messages 
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, and launch the game, Autospin is turned ON and turn OFF netwok and check for valid message. and turn on netwok for Auto spin is continued
#    Then User is addressed with valid error message 'No Internet' for network interruptions during Autospin in Happy Fruits slot game 
#    Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interruptions during Autospin feature in Happy Fruits slot game 
  
  
#	Scenario: Check bet value, credit value, home button, info button, play button behavior during autoplay in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios
#    Then Bet value & Credit value buttons should not be clickable
#		And Home & Info buttons should not be clickable
#		And Spin button should not visible & Stop button should be visible and clickable
#		And Spin button should be visble after clicking on stop button
 
 
#    Scenario: Check whether user able to play the game when there is insufficient balance in account in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button and insufficient alert message
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance less than bet value and check the validation message
#    Then Player should be blocked from playing the game when there is less balance in the account in Happy Fruits game
#    Then Decrease the credit and bet value and again start the spin in Happy Fruits slot game
	
	
#	Scenario: Check whether Gamble link is active after changing the bet and credit values
#    Given Chrome browser, valid URL, valid login details, Happy_Fruits slot game, spin, gamble link, gamble page, credit and bet values
#    When Open the Happy_Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click onHappy_Fruits slot game, spin the reels and access to gamble link and change the bet and credit values
#    Then Verify the gamble link active and inactive state as changed bet and credit values in Happy_Fruits slot game
	
	
#	Scenario: Check whether HUD buttons are active during gamble in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, spin, gamble link, gamble page, HUD buttons
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, spin the reels and access to gamble and click on HUD buttons present on the screen
#    Then All HUD buttons should be inactive upon click shoudn't perform any action in Happy Fruits game
	
	
#    Scenario: Select the max bet option, do the spin and check whether balance is deducting according to the changed bet type in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, max bet option, balance and spin button
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, select the bet type as maxbet, click on spin button and check the balance
#    Then Balance should get deducted by max credit and betvalue combinationas per the game specification in Happy Fruits game
    
    
#    Scenario: Check HUD Buttons color font and alignment in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, HUD buttons
#	When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, launch the game
#	Then Verify all the text button letter case
#	Then Verify colors of bet and credit buttons
#    Then Verify the functionality of hide and unhide button
#    Then Verify the alignment of spin button
#    Then Verify the color of turbo button 'ON' and 'OFF' state
#    Then Verify the color of spin and stop button
  
  
#	Scenario: Check bet value, credit value, home button, info button, play button, gamble link (active/disable) behavior during manual spin in Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, spin button, spin button and check for buttons behavior & functionality
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin option and check behavior of different buttons in different scenarios
#    Then Bet value & Credit value buttons should not be clickable under spin condition in Happy Fruits slot game
#	And Home, Info and Turbo buttons should not be clickable on screen under spin condition in Happy Fruits slot game
#	And Spin button should be disabled during reel spin in Happy Fruits slot game
#	And Spin button should be visible after reel spin stops and if  win is triggered clicking on collect button in Happy Fruits slot game
#	And Gamble button behaviour under win triggered and disabled when next spin starts in Happy Fruits slot game
  
  
#    Scenario: Check whether info page is navigating forward and backward, exit button for the Happy Fruits slot game
#    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, info icon, navigation icon, exit icon, payout, paylines, wild, scatter, wheelspin, freespin, gamble and jackpot window
#    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on settings and info icon and validate the forward and backward button.
#    Then forward ,backward and exit button of info page should perform in Happy Fruits slot game
	
	
    Scenario: Check whether multiplier option is triggering and 2X of the win amount is added to main balance in Happy Fruits slot game
    Given Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, same kind of symbols on all screens 
    When Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, spin the reel till all reels are triggered with same symbols like pear, melon, orange and strawberry
    Then multiplier win should triiger and win amount is added to main balance in Happy Fruits slot game
	
	