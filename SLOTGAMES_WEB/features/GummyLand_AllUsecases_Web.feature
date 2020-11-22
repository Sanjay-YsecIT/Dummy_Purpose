Feature: Test all the functionalities of GummyLand Slot Game


#1 Auto Spin feature

#    Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
#    Then System should keep performing the spins in Gummy Land slot game

#    Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
#    When Open the Gummy Land  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 Gummy Land slot game
    
#    Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Gummy Land slot game

    
    
   
 #2 Bet values dropdown   
    
#	Scenario: Select the bet type as 0.02 from the drop down and check the bet value should be 0.2,0.4,1,2,4 in Gummy Land Hot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land Hot slot game, bet type as 0.02 and bet value as 0.2,0.4,1,2,4
#    When Open the Gummy Land Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02 and check the bet value
#    Then Bet value should get changed 0.2,0.4,1,2,4 if the bet type selected as 0.02 from the drop down one in Gummy Land Hot slot game
	
#	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 0.5,1,2.5,5,10 in Gummy Land Hot slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land Hot game, bet type as 0.05 and bet value as 0.5,1,2.5,5,10
#    When Open the Gummy Land Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 and check the bet value should be 0.5,1,2.5,5,10
#    Then Bet value should get changed 0.5,1,2.5,5,10 if the bet type selected as 0.05 from the drop down two in Gummy Land Hot slot game
	
#	Scenario: Select the bet type as 0.1 from the drop down and check the bet value should be 1,2,5,10,20 in Gummy Land Hot slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land Hot slot game, bet type as 0.1 from down 2 and bet value as 1,2,5,10,20
#    When Open the Gummy Land Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from down  and check the bet value should be 1,2,5,10,20
#    Then Bet value should get changed to 1,2,5,10,20 if the bet type selected as 0.1 from the drop down three in Gummy Land Hot slot game
	
#	Scenario: Select the bet type as 0.5 from the drop down and check the bet value should be 5,10,25,50,100 in Gummy Land Hot slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land Hot slot game, bet type as 0.5 from drop down and bet value as 5,10,25,50,100
#    When Open the Gummy Land Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 from drop down and check the bet value should be 5,10,25,50,100
#    Then Bet value should get changed to 5,10,25,50,100 if the bet type selected as 0.5 from the drop down four in Gummy Land Hot slot game
   
   
 #3   Balance to credit form validation
   
#    Scenario: Check whether balance is equals to credit multiplies by denomination 0.02 in Gummy Land Hot slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land Hot slot game, balance, credits and denomination as 0.02
#    When Open the Gummy Land Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.02 and check the balance
#    Then Balance amount should be same as denomination 0.02 multiplies by credit in Gummy Land Hot slot game
	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Gummy Land Hot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land Hot slot game, balance, credits, denomination drop down and denomination as 0.05
#    When Open the Gummy Land Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.05 and check the balance
#    Then Balance amount should be same as denomination 0.05 multiplies by credit in Gummy Land Hot game
	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.1 in Gummy Land Hot slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land Hot slot game window, balance, credits, denomination drop down and denomination as 0.1
#    When Open the Gummy Land Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.1 and compare the balance
#    Then Balance amount should be same as denomination 0.1 multiplies by credit balance in Gummy Land Hot slot game
	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.1 in Gummy Land Hot slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land Hot slot game, balance, credits and denomination drop down & value as 0.1 
#    When Open the Gummy Land Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.1 manually with and check the balance
#    Then Balance amount should be same after multiplying denomination 0.1 by credit in Gummy Land Hot slot game
   
   
  #4    Win amount is added to the main balance when clicked on collect 
	
#	 Scenario: Check whether winning amount is getting added to the balance
#    Given Chrome browser, valid URL, valid login details, Gummy Land game, balance, transfer button, spin button and win amount
#    When Open the Gummy Land Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win
#    Then Win amount should get added to the balance after win and balance should get added with win amount
   
#	 Scenario: Check whether winning amount is getting added to the main balance in credits
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, transfer button, credit balance form, spin button and win amount
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits
#    Then Win amount should get added to the credit field after win and credit should get increased with win amount



#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, win amount in currency, credits and win amount in credits
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Gummy Land slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
#    Then Win amount in credit multiplied by denomination is equal to win amount in currency in Gummy Land slot game	
	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Gummy Land slot game
	
	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Gummy Land slot game
	
	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Gummy Land slot game


  #6  Balance deduction scenario   
   
#    Scenario: Change the bet value as 0.2, do the spin and check whether balance is deducting according to the changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.02, bet value as 0.2, balance and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as 0.2, click on spin button and check the balance
#    Then Balance should get deducted by 0.2 as bet type is selected as 0.02 and bet value as 0.2 in Gummy Land  game
#
#	Scenario: Change the bet value as 0.4, do the spin and check whether balance is deducting according to the changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land Hot game, bet type as 0.02, bet value as 0.4, balance and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, click on spin button and check the balance
#    Then Balance should get deducted by 0.4 as bet type is selected as 0.02 in Gummy Land game

	
#	Scenario: Change the bet value to ONE, click on spin button and check whether current balance is deducting according to changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.02, bet value as ONE, balance, spin button and win amount
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as ONE, click on spin button, check the win amount and check the balance
#    Then Current Balance should get deducted by ONE as bet type is selected as 0.02 and bet value as ONE in Gummy Land  game
	
	
#	Scenario: Change the bet value as TWO, do the spin and check whether balance is deducting according to changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.02, bet value as TWO, balance and spin button
#    When Open the Gummy Land game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as TWO, click on spin button and check the balance
#    Then Current Balance should get deducted by TWO as bet type is selected as 0.02 and bet value as 2 in Gummy Land game
	
	
#	Scenario: Change the bet value as FOUR, click on spin and check whether existing balance is deducting according to changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land game, bet type as 0.02, bet value as FOUR, balance and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value to FOUR, click on spin button and check the slot game balance
#    Then Existing Balance should get deducted by FOUR as bet type is selected as 0.02 and bet value as FOUR in Gummy Land slot game
    
    
    
#	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.5, bet value as FIVE, balance and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as FIVE, click on spin button and check the balance
#    Then Balance should get deducted by FIVE as bet type is selected as 0.5 in Gummy Land game
	
	
#	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.5, bet value as TEN, balance and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as TEN, click on spin button and check the balance
#    Then Balance should get deducted by TEN as bet type is selected as 0.5 in Gummy Land game
#	
#	
#	Scenario: Change the bet value as 25, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.5, bet value as 25, balance and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as 25, click on spin button and check the balance
#    Then Balance should get deducted by 25 as bet type is selected as 0.5 in Gummy Land game
#	
#	Scenario: Change the bet value as FIFTY, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.5, bet value as FIFTY, balance and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as FIFTY, click on spin button and check the balance
#    Then Balance should get deducted by FIFTY as bet type is selected as 0.5 in Gummy Land game
#	
#	Scenario: Change the bet value as hundred, do the spin and check whether balance is deducting according to the changed bet type 0.5 in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.5, bet value as hundred, balance and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.5 & bet value as hundred, click on spin button and check the balance
#    Then Balance should get deducted by hundred as bet type is selected as 0.5 in Gummy Land game



#   	Scenario: Change the bet value as TEN do the spin and check whether balance in credits is deducting according to the changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land game, bet type as 0.02, bet value as TEN, balance in credits and spin button
#    When Open the Gummy Land game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as TEN, click on spin button and check the balance in credits
#    Then Balance should get deducted by TEN as bet type is selected as 0.02 and bet value as 10 in Gummy Land slot game
#    
#   	Scenario: Change the bet value as TWENTY, do the spin and check whether balance in credits is deducting according to the changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.02, bet value as TWENTY, balance in credits and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as TWENTY, click on spin button and check the balance in credits
#    Then Balance should get deducted by TWENTY as bet type is selected as 0.02 and bet value as 20 in Gummy Land game
#	
#	 Scenario: Change the bet value as FIFTY, do the spin and check whether balance in credits is deducting according to the changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.02, bet value as FIFTY, balance in credits and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as FIFTY, click on spin button and check the balance in credits
#    Then Balance should get deducted by FIFTY, as bet type is selected as 0.01 and bet value as 100 in Gummy Land game
#	
#	 Scenario: Change the bet value as ONE HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, bet type as 0.02, bet value as ONE HUNDRED, balance in credits and spin button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as ONE HUNDRED, click on spin button and check the balance in credits
#    Then Balance should get deducted by ONE HUNDRED, as bet type is selected as 0.02 and bet value as 100 in Gummy Land slot game
#	
#	 Scenario: Change the bet value as TWO HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land game, bet type as 0.02, bet value as TWO HUNDRED, balance in credits and spin button
#    When Open the Gummy Land game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.02, select the bet value as TWO HUNDRED, click on spin button and check the balance in credits
#    Then Balance should get deducted by TWO HUNDRED, as bet type is selected as 0.02 and bet value as 200 in Gummy Land slot game
 
 
 
         	#	        VALIDATION ON GAMBLE WIN 2X AMOUNT IS ADDED TO MAIN BALANCE (black btn)
		
#	Scenario: check whether gamble win double amount is getting added to the balance after win in Gummy Land slot game 
#    Given chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, win amount, gamble button, gamble amount, black button, black button and gamble status
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black  gamble button and check the balance after win
#    Then Gamble double Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Gummy Land slot game 
#    Then  After 1st win gamble amount is doubled and available for next gamble in Gummy Land slot game
 
  	#	           Validation on Gamble to win amount is double than win amount

#	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Gummy Land game 
#    Given Chrome browser, valid URL, valid login details, Gummy Land game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
#    When Open the Gummy Land game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Gummy Land slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
#    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Gummy Land game
	
	
	#	             Whether Gamble win amount is getting added to the main balance (red btn)
	
#	Scenario: Check whether gamble win amount is getting added to the balance after win in Gummy Land slot game 
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, win amount, gamble button, gamble amount, red button and gamble status
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red button and check the balance after win
#    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Gummy Land slot game 
	
	
		#	        VALIDATION OF WIN AMOUNT AND GAMBLE AMOUNT FOR THE SAME VALUE DISPLAYED
	
#	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Gummy Land slot game on web
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, win amount, gamble button, gamble page and gamble amount
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web
#    Then Win amount should be displayed as Gamble amount in the gamble page of the Gummy Land slot game on web
	
        
#	Scenario: Checking whether suit win amount is getting added to balance if it is win else it should not get added in Gummy Land slot game 
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, spin button, win amount, gamble button, card to click for suit win and suit win amount
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and click on suit win card in gamble page
#    Then Suit Win amount(4x) should get added to the main balance after win else it should not get added to main balance in the Gummy Land slot game
	
	
#	Scenario: Checking Suit win to Win amount should be quadruple than gamble amount in gamble page of Gummy Land game 
#    Given Chrome browser, valid URL, valid login details, Gummy Land game, balance, spin button, win amount, Suit win dice options, gamble amount and suit to win amount
#    When Open the Gummy Land game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Gummy Land slot game, click on spin button till player wins, click on suit win dice button and check the suit to win amount
#    Then suit To Win amount should be quadruple than win amount in the gamble page of the Gummy Land game
#    Then Verify the suit win options and gamble page color, alignment and text fonts in Gummy Land slot game
   
    	
#    Scenario: Check whether gamble credit win amount is getting added to the balance after win in Gummy Land game 
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
#    Then verify the credit form of currency in gamble page on all fields in Gummy Land slot game
#    Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Gummy Land slot game 
 
#	Scenario: Check whether Gamble link is active after changing the bet and credit values
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, spin, gamble link, gamble page, credit and bet values
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click onGummy Land slot game, spin the reels and access to gamble link and change the bet and credit values
#    Then Verify the gamble link active and inactive state as changed bet and credit values in Gummy Land slot game


#	Scenario: Check whether multiple login sessions results in termination of older session
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, spin, Multiple login windows, multiple login alert pop up
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Gummy Land slot game, spin the reels and open another session and play the game and return back to older session and play
#    Then Verify the 'Multiple Login' alert message on the screen in Gummy Land slot game
#    Then Move to new session and play without interruption in Gummy Land slot game   
    
    
    
    
#    Scenario: To check the transferred amount is added to Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, balance, text field to transfer balance and Ok button
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok button
#    Then The exact amount entered in the transfer page should transfer to Gummy Land slot game and same amount should get displayed on the balance section
    
#    Scenario: Check whether the player is able to transfer the amount more than the available balance
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot  game, balance greater than available balance, text field to transfer balance, Ok button and validation message
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok button
#    Then Player should be blocked from loading the Gummy Land slot game when the amount entered in the transfer page is more than the available balance
    
#    Scenario: Check whether balance field is accepting null values in the transfer page of Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details,Gummy Land slot game, empty balance, text field to transfer balance, Ok button and validation message
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, do not enter the amount in the balance field and click on Ok button
#    Then An error should be displayed if the balance field is empty and player should be blocked from loading the Gummy Land slot game
	
#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, zero balance, text field to transfer balance, Ok button and validation message
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok button
#    Then An error should be displayed if balance entered was zero and player should be blocked from loading the Gummy Land slot game
    
  
  
#	Scenario: Verify the bet values for incremental and decremental denomination in  Gummy Land slot game
#    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, betvalues, credit increment and decremental 
#    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click credit incremental and decrement
#    Then Verify the bet values are in assigned fields in ascending order in Gummy Land slot game	
	
	
	Scenario: Check whether incrementing and decrementing the creditvalue, balance is equal to balance in creditform multplies by denomination respectively in Gummy Land slot game 
    Given Chrome browser, valid URL, valid login details, Gummy Land slot game, increment, decrement and balance, balance in credit form, creditvalues
    When Open the Gummy Land slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance
    Then Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Gummy Land slot game 
 
