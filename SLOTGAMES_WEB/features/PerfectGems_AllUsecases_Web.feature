Feature: Test all the functionalities of PerfectGems Slot Game


#1 Auto Spin feature

#    Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
#    Then System should keep performing the spins in Perfect Gems slot game

#    Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
#    When Open the Perfect Gems  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 Perfect Gems slot game
    
#    Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
#    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Perfect Gems slot game


 #2 Bet values dropdown   
    
#	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 0.25,0.5,0.75,1 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems  slot game, bet type as 0.01 and bet value as 0.25,0.5,0.75,1
#    When Open the Perfect Gems  slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value
#    Then Bet value should get changed 0.25,0.5,0.75,1 if the bet type selected as 0.01 from the drop down one in Perfect Gems slot game
#	
#	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 0.75,1.5,2.25,3 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems  game, bet type as 0.03 and bet value as 0.75,1.5,2.25,3
#    When Open the Perfect Gems  slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 and check the bet value should be 0.75,1.5,2.25,3
#    Then Bet value should get changed 0.75,1.5,2.25,3 if the bet type selected as 0.03 from the drop down two in Perfect Gems slot game
	
#	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 1.25,2.5,3.75,5 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems  slot game, bet type as 0.05 from down 2 and bet value as 1.25,2.5,3.75,5
#    When Open the Perfect Gems  slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from down  and check the bet value should be 1.25,2.5,3.75,5
#    Then Bet value should get changed to 1.25,2.5,3.75,5 if the bet type selected as 0.05 from the drop down three in Perfect Gems slot game
	
	Scenario: Select the bet type as 0.4 from the drop down and check the bet value should be 10,20,30,40 in Perfect Gems slot game
    Given Chrome browser, valid URL, valid login details, Perfect Gems  slot game, bet type as 0.4 from drop down and bet value as 10,20,30,40
    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 from drop down and check the bet value should be 10,20,30,40
    Then Bet value should get changed to 10,20,30,40 if the bet type selected as 0.4 from the drop down four in Perfect Gems slot game
  
  
   #3   Balance to credit form validation
   
#    Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, credits and denomination as 0.01
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
#    Then Balance amount should be same as denomination 0.01 multiplies by credit in Perfect Gems slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in Perfect Gems game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, credits, denomination drop down and denomination as 0.03
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.03 and check the balance
#    Then Balance amount should be same as denomination 0.03 multiplies by credit in Perfect Gems game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game window, balance, credits, denomination drop down and denomination as 0.05
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.05 and compare the balance
#    Then Balance amount should be same as denomination 0.05 multiplies by credit balance in Perfect Gems slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.4 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, credits and denomination drop down & value as 0.4 
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.4 manually with and check the balance
#    Then Balance amount should be same after multiplying denomination 0.4 by credit in Perfect Gems slot game
    
    
      #4    Win amount is added to the main balance when clicked on collect 
	
#	 Scenario: Check whether winning amount is getting added to the balance
#    Given Chrome browser, valid URL, valid login details, Perfect Gems game, balance, transfer button, spin button and win amount
#    When Open the Perfect Gems Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win
#    Then Win amount should get added to the balance after win and balance should get added with win amount
#   
#	 Scenario: Check whether winning amount is getting added to the main balance in credits
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, transfer button, credit balance form, spin button and win amount
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits
#    Then Win amount should get added to the credit field after win and credit should get increased with win amount
    
    
    
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, win amount in currency, credits and win amount in credits
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Perfect Gems slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
#    Then Win amount in credit multiplied by denomination is equal to win amount in currency in Perfect Gems slot game	
	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Perfect Gems slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Perfect Gems slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
#    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Perfect Gems slot game
    
    
    
     #6  Balance deduction scenario   
   
#    Scenario: Change the bet value as 0.25, do the spin and check whether balance is deducting according to the changed bet type in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.01, bet value as 0.25, balance and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 0.25, click on spin button and check the balance
#    Then Balance should get deducted by 0.25 as bet type is selected as 0.01 and bet value as 0.25 in Perfect Gems  game
#
#	Scenario: Change the bet value as 0.5, do the spin and check whether balance is deducting according to the changed bet type in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems Hot game, bet type as 0.01, bet value as 0.5, balance and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, click on spin button and check the balance
#    Then Balance should get deducted by 0.5 as bet type is selected as 0.01 in Perfect Gems game
#
#	
#	Scenario: Change the bet value to 0.75, click on spin button and check whether current balance is deducting according to changed bet type in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.01, bet value as 0.75, balance, spin button and win amount
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 0.75, click on spin button, check the win amount and check the balance
#    Then Current Balance should get deducted by 0.75 as bet type is selected as 0.01 and bet value as 0.75 in Perfect Gems slot game
#	
#	
#	Scenario: Change the bet value as ONE, do the spin and check whether balance is deducting according to changed bet type in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.01, bet value as ONE, balance and spin button
#    When Open the Perfect Gems game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as ONE, click on spin button and check the balance
#    Then Current Balance should get deducted by ONE as bet type is selected as 0.01 and bet value as ONE in Perfect Gems game
	
    
    
    
#	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.4 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.4, bet value as TEN, balance and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as TEN, click on spin button and check the balance
#    Then Balance should get deducted by TEN as bet type is selected as 0.4 in Perfect Gems game
#	
#	
#	Scenario: Change the bet value as TWENTY, do the spin and check whether balance is deducting according to the changed bet type 0.4 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.4, bet value as TWENTY, balance and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as TWENTY, click on spin button and check the balance
#    Then Balance should get deducted by TWENTY as bet type is selected as 0.4 in Perfect Gems game
#	
#	
#	Scenario: Change the bet value as THIRTY, do the spin and check whether balance is deducting according to the changed bet type 0.4 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.4, bet value as THIRTY, balance and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as THIRTY, click on spin button and check the balance
#    Then Balance should get deducted by THIRTY as bet type is selected as 0.4 in Perfect Gems game
#	
#	Scenario: Change the bet value as FORTY, do the spin and check whether balance is deducting according to the changed bet type 0.4 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.4, bet value as FORTY, balance and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as FORTY, click on spin button and check the balance
#    Then Balance should get deducted by FORTY as bet type is selected as 0.4 in Perfect Gems game




#   	Scenario: Change the bet value as 25 do the spin and check whether balance in credits is deducting according to the changed bet type in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems game, bet type as 0.01, bet value as 25, balance in credits and spin button
#    When Open the Perfect Gems game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 25, click on spin button and check the balance in credits
#    Then Balance should get deducted by 25 as bet type is selected as 0.01 and bet value as 25 in Perfect Gems slot game
#    
#   	Scenario: Change the bet value as FIFTY, do the spin and check whether balance in credits is deducting according to the changed bet type in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.01, bet value as FIFTY, balance in credits and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FIFTY, click on spin button and check the balance in credits
#    Then Balance should get deducted by FIFTY as bet type is selected as 0.01 and bet value as FIFTY in Perfect Gems game
#	
#	 Scenario: Change the bet value as 75, do the spin and check whether balance in credits is deducting according to the changed bet type in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.01, bet value as 75, balance in credits and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as 75, click on spin button and check the balance in credits
#    Then Balance should get deducted by 75, as bet type is selected as 0.01 and bet value as 75 in Perfect Gems game
#	
#	 Scenario: Change the bet value as ONE HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.01, bet value as ONE HUNDRED, balance in credits and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as ONE HUNDRED, click on spin button and check the balance in credits
#    Then Balance should get deducted by ONE HUNDRED, as bet type is selected as 0.01 and bet value as 100 in Perfect Gems slot game

    
    
#    Scenario: To check the transferred amount is added to Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, text field to transfer balance and Ok button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok button
#    Then The exact amount entered in the transfer page should transfer to Perfect Gems slot game and same amount should get displayed on the balance section
    
#    Scenario: Check whether the player is able to transfer the amount more than the available balance
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot  game, balance greater than available balance, text field to transfer balance, Ok button and validation message
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok button
#    Then Player should be blocked from loading the Perfect Gems slot game when the amount entered in the transfer page is more than the available balance
#    
#    Scenario: Check whether balance field is accepting null values in the transfer page of Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details,Perfect Gems slot game, empty balance, text field to transfer balance, Ok button and validation message
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, do not enter the amount in the balance field and click on Ok button
#    Then An error should be displayed if the balance field is empty and player should be blocked from loading the Perfect Gems slot game
#	
#	Scenario: Check whether balance field is accepting amount as Zero SRD in the transfer amount page of Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, zero balance, text field to transfer balance, Ok button and validation message
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok button
#    Then An error should be displayed if balance entered was zero and player should be blocked from loading the Perfect Gems slot game
    
  
  
#	Scenario: Verify the bet values for incremental and decremental denomination in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, betvalues, credit increment and decremental 
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click credit incremental and decrement
#    Then Verify the bet values are in assigned fields in ascending order in Perfect Gems slot game	
	
	
#	Scenario: Check whether incrementing and decrementing the creditvalue, balance is equal to balance in credit form multplies by denomination respectively in Perfect Gems slot game 
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, increment, decrement and balance, balance in credit form, creditvalues
#    When Open the Perfect Gems slot game by entering the  valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance
#    Then Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Perfect Gems slot game 
    
  
          	#	        VALIDATION ON GAMBLE WIN 2X AMOUNT IS ADDED TO MAIN BALANCE (black btn)
		
#	Scenario: check whether gamble win double amount is getting added to the balance after win in Perfect Gems slot game 
#    Given chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, win amount, gamble button, gamble amount, black button, black button and gamble status
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black  gamble button and check the balance after win
#    Then Gamble double Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Perfect Gems slot game 
#    Then  After 1st win gamble amount is doubled and available for next gamble in Perfect Gems slot game
 
  	#	           Validation on Gamble to win amount is double than win amount

#	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Perfect Gems game 
#    Given Chrome browser, valid URL, valid login details, Perfect Gems game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
#    When Open the Perfect Gems game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Perfect Gems slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
#    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Perfect Gems game
	
	
	#	             Whether Gamble win amount is getting added to the main balance (red btn)
	
#	Scenario: Check whether gamble win amount is getting added to the balance after win in Perfect Gems slot game 
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, win amount, gamble button, gamble amount, red button and gamble status
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red button and check the balance after win
#    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Perfect Gems slot game 
	
	
		#	        VALIDATION OF WIN AMOUNT AND GAMBLE AMOUNT FOR THE SAME VALUE DISPLAYED
	
#	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Perfect Gems slot game on web
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, win amount, gamble button, gamble page and gamble amount
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web
#    Then Win amount should be displayed as Gamble amount in the gamble page of the Perfect Gems slot game on web
	
        
#	Scenario: Checking whether suit win amount is getting added to balance if it is win else it should not get added in Perfect Gems slot game 
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, win amount, gamble button, card to click for suit win and suit win amount
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and click on suit win card in gamble page
#    Then Suit Win amount(4x) should get added to the main balance after win else it should not get added to main balance in the Perfect Gems slot game
	
	
#	Scenario: Checking Suit win to Win amount should be quadruple than gamble amount in gamble page of Perfect Gems game 
#    Given Chrome browser, valid URL, valid login details, Perfect Gems game, balance, spin button, win amount, Suit win dice options, gamble amount and suit to win amount
#    When Open the Perfect Gems game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Perfect Gems slot game, click on spin button till player wins, click on suit win dice button and check the suit to win amount
#    Then suit To Win amount should be quadruple than win amount in the gamble page of the Perfect Gems game
#    Then Verify the suit win options and gamble page color, alignment and text fonts in Perfect Gems slot game
  
  
#    Scenario: Check whether gamble credit win amount is getting added to the balance after win in Perfect Gems game 
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
#    Then verify the credit form of currency in gamble page on all fields in Perfect Gems slot game
#    Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Perfect Gems slot game 
 
#	Scenario: Check whether Gamble link is active after changing the bet and credit values
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, spin, gamble link, gamble page, credit and bet values
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click onPerfect Gems slot game, spin the reels and access to gamble link and change the bet and credit values
#    Then Verify the gamble link active and inactive state as changed bet and credit values in Perfect Gems slot game


#	Scenario: Check whether multiple login sessions results in termination of older session
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, spin, Multiple login windows, multiple login alert pop up
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Perfect Gems slot game, spin the reels and open another session and play the game and return back to older session and play
#    Then Verify the 'Multiple Login' alert message on the screen in Perfect Gems slot game
#    Then Move to new session and play without interruption in Perfect Gems slot game   
 
 
#	 Scenario: Check whether Session expired message displayed for long duration inactive game state in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, transfer button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, idle the game session for about 22mins
#    Then Session Expired message should display and user has to start new session for game play in Perfect Gems slot game
    
    
#    Scenario: Check whether user able to play the game when there is insufficient balance in account in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details,Perfect Gems slot game, balance, spin button and insufficient alert message
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance less than bet value and check the validation message
#    Then Player should be blocked from playing the game when there is less balance in the account in Perfect Gems slot game
#    Then Decrease the credit and bet value and again start the spin in Perfect Gems slot game
 
 
#	Scenario: Check bet & credit value buttons behavior after navigating from gamble page during autoplay and check win amount getting added to balance in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page
#    Then Bet value & Credit value buttons should be clickable after navigating from gamble page when autospin is stopped in Perfect Gems slot game
#	And Win amount should get added to the balance during autoplay
 
 
#	Scenario: Check whether multiple tabs switching and reload is allowed in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, transfer button, spin button, multiple tabs and reload option
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on autospin and switch between tabs and again reload the game
#    Then Switching between tabs should be allowed and reloading the game resulting in ending game session and shouldn't resume the Perfect Gems slot game
  
  
  
# 	Scenario: Check whether error messages is displayed on network interruptions and upon good network connection Autospin is continued in Perfect Gems slot game 
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, Autospin button, netwok turnOFF and ON, network messages 
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, and launch the game, Autospin is turned ON and turn OFF netwok and check for valid message. and turn on netwok for Auto spin is continued
#    Then User is addressed with valid error message 'No Internet' for network interruptions during Autospin in Perfect Gems slot game 
#    Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interruptions during Autospin feature in Perfect Gems slot game 
  
  
  
#    Scenario: Check whether user able to play Autospin feature game when there is insufficient balance in account in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, AutoSpin button, validation message, maxbet button, credit decrement button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select maxbet, click on Autospin button till balance turns to zero and check the validation message and decrement the denomination and again spin the reels
#    Then Check for the game buttons during the insufficient alert message in the Perfect Gems slot game
#    Then Player should be blocked from playing the game when there is no balance in the account and after decrementing credit and trigger autospin in Perfect Gems slot game
	
	
#	Scenario: Check bet value, credit value, home button, info button, play button behavior during autoplay in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios
#    Then Bet value & Credit value buttons should not be clickable
#		And Home & Info buttons should not be clickable
#		And Spin button should not visible & Stop button should be visible and clickable
#		And Spin button should be visble after clicking on stop button
 
 
 
 
#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and all the denominations in Perfect Gems slot game on Web
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.01 and all denomination values 
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.01 & all denomination  values and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination values in Perfect Gems slot game on Web
	
#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and all the denominations in Perfect Gems slot game on Web
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type 0.03 and denomination values like 0.75, 1.5, 2.25 & 3
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as 0.03 & denomination  values like 0.75, 1.5, 2.25 & 3 and check payout amount
#    Then System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination values like 0.75, 1.5, 2.25 & 3 in Perfect Gems slot game on Web
	
#	 Scenario: Check whether the max payout amount for each symbol like diamond, pearl as per the bet type 0.05 and all denomination values in Perfect Gems slot game on Web
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, icon to open payout table, all symbols, max amount on each symbol like diamond, pearl n etc, back button, bet type 0.05 and all denomination values on web
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like diamond, pearl n etc, click on back button, select bet type as 0.05 & all denomination values and check payout amount on web
#    Then System should display the Payout max amount on each symbol like diamond, pearl etc and payout max amount should get changed whenever player changes the bet type to 0.05 and all denomination values in Perfect Gems slot game on web
#	
#	Scenario: Check whether the max payout amount for each symbol like 'K' ,'A' as per the bet type 0.4 and all denomination values in Perfect Gems slot game on Web
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, icon to open payout table, all symbols, max amount on each symbol like 'K' ,'A' n etc, back button, bet type 0.4 and denomination values like 10, 20, 30 & 40 on web
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like 'K' ,'A' n etc, click on back button, select bet type as 0.4 & denomination  values like 10, 20, 30 & 40 and check payout amount on web
#    Then System should display the Payout max amount on each symbol like 'K' ,'A' n etc and payout max amount should get changed whenever player changes the bet type to 0.4 and denomination values like 10, 20, 30 & 40 in Perfect Gems slot game on web
   
 
 
#    Scenario: Check HUD Buttons color font and alignment in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, HUD buttons
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, launch the game
#	Then Verify all the text button letter case
#	Then Verify colors of bet and credit buttons
#    Then Verify the functionality of hide and unhide button
#    Then Verify the alignment of spin button
#    Then Verify the color of turbo button 'ON' and 'OFF' state
#    Then Verify the color of spin and stop button
   
 
#    Scenario: Check whether info page is navigating forward and backward, exit button for the Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, info icon, navigation icon, exit icon, payout, bet, wild, scatter, bonus, gamble and jackpot window
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on settings and info icon and validate the forward and backward button.
#    Then forward ,backward and exit button of info page should perform in Perfect Gems slot game
	
	
#     Scenario: Select the max bet option, do the spin and check whether balance is deducting according to the changed bet type in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, max bet option, balance and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, select the bet type as maxbet, click on spin button and check the balance
#    Then Balance should get deducted by max credit and betvalue combinationas per the game specification in Perfect Gems game
 
 
# 	Scenario: Check whether resume feature is enabled in Gamble screen of Perfect Gems slot game
#	Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, new browser.
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser
#	Then  Resume feature should be enabled and land on the gamble screen of Perfect Gems slot game
#	Then Verify the Gamble attempts, gamble amount and user is able to play left over attempts and collect the win amount in Perfect Gems slot game
  
#    Scenario: Check whether resume feature is enabled in Gamble screen just by navigating of Perfect Gems slot game
#	Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, new browser, gamble attempts.
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and close the browser and again login to the game with new browser
#	Then  Resume feature should not be enabled and land on the game screen in Perfect Gems slot game
  
#    Scenario: Check whether resume feature is enabled in Gamble screen and collect the win amount in Perfect Gems slot game
#	Given Chrome browser, valid URL, valid login details, Perfect Gems slotPerfect Gems slot game, bet type, denomination, balance, win symbols, spin button, Gamble screen, collect, new browser
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and close the browser and again login to the game with new browser window
#	Then  Resume feature should be enabled and land on the game screen and collect the win amount in Perfect Gems slot game
#    Then Verify the reload option after gamble win in Perfect Gems slot game
  

  
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.25 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.01, denomination as 0.25, balance , spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Perfect Gems slot game, select bet type as 0.01 & denomination as 0.25, click on spin button till user wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and gamble max amount configured on the info page for bet type 0.01 & denomination 0.25 in Perfect Gems game
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination 0.5 in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, transfer button, bet type as 0.01, denomination as 0.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Perfect Gems slot game, transfer amount to slot game, select bet type as 0.01 & denomination as 0.5, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
#    Then Gamble count should be displayed based on winning amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.5 in Perfect Gems slot game
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination 0.75 in Perfect Gems slot game
#    Given Perfect Gems slot game, bet type as 0.01, denomination as 0.75, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Perfect Gems slot game, select bet type as 0.01 & denomination as 0.75, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
#    Then Gamble count should be displayed on gamble page of Perfect Gems slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination 0.75 in Perfect Gems slot game
	
	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination ONE in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, amount to transfer, transfer button, bet type as 0.01, denomination as ONE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, enter the amount, transfer the balance, click on Perfect Gems slot game, transfer the amount, select bet type as 0.01 & denomination as ONE, click on spin button till player wins, click on gamble button and check the gamble count
#    Then Gamble count should be displayed based on win amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination ONE in Perfect Gems slot game
 
 
#	Scenario: Check whether on winning and losing the gamble on last gamble count in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type as 0.01, denomination as 0.2, balance, spin button, win amount, gamble button, gamble amount, red button, win amount field in main page
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Perfect Gems slot game, select bet type as 0.01 & denomination as 0.2, click on spin button till user wins, click on gamble button and pay gamble with last gamble count 
#    Then Gamble page should terminate and win amount should be added to main balance in Perfect Gems slot game
 
 
 
#	Scenario: Check whether system is providing balance in try now feature of Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, try now button and balance to play
#    When Open the Perfect Gems slot game by entering the valid URL in browser, click on try now button
#    Then System should provide five thousand as balance on click on try now button in Perfect Gems slot game
		
	
#	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, try now button, balance to play and spin button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, click on try now button and click on spin button
#    Then Amount should get deducted from balance on click on spin button in try now page of Perfect Gems slot game
 
 
 
 
#	Scenario: Navigate to home screen from Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, game screen and home button
#    When Open the Perfect Gems slot game by entering the valid URL in browser,enter the valid login details, transfer the balance and click on home button
#    Then System should take the player to Home page after clicking on home button from Perfect Gems slot game	
# 
# 
#    Scenario: Check the functionality of maximize and minimize button in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, maximize button and minimize button
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
#    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Perfect Gems slot game
# 
#
#    Scenario: Check user instruction messages before and after spin in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button and user instruction message
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
#	Then User instruction message 'Please place your bet' should be displayed before spin button is clicked
#	Then User instruction message 'Good Luck' should be displayed after spin button is clicked in Perfect Gems slot game
 
 
 
# 	Scenario: Check whether error messages is displayed on network interruptions and upon good network connection resume to game session in Perfect Gems slot game 
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, network turnOFF and ON, network messages 
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin and turn OFF network and check for valid message and turn on network for manual spin is continued
#    Then User is addressed with valid error message 'No Internet' for network interruptions in Perfect Gems slot game 
#    Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interruptions in Perfect Gems slot game 
  
  
#	Scenario: Check whether HUD buttons are active during gamble in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, spin, gamble link, gamble page, HUD buttons
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, spin the reels and access to gamble and click on HUD buttons present on the screen
#    Then All HUD buttons should be inactive upon click shoudn't perform any action in Perfect Gems slot game
  
  
#	Scenario: Check bet value, credit value, home button, info button, play button, gamble link (active/disable) behavior during manual spin in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, balance, spin button, spin button and check for buttons behavior & functionality
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin option and check behavior of different buttons in different scenarios
#    Then Bet value & Credit value buttons should not be clickable under spin condition in Perfect Gems slot game
#	And Home, Info and Turbo buttons should not be clickable on screen under spin condition in Perfect Gems slot game
#	And Spin button should be disabled during reel spin in Perfect Gems slot game
#	And Spin button should be visible after reel spin stops and if  win is triggered clicking on collect button in Perfect Gems slot game
#	And Gamble button behaviour under win triggered and disabled when next spin starts in Perfect Gems slot game
 
 
#	Scenario: Check whether Big win is triggering on, when 5 dollar scatter symbol appears on the screen in Perfect Gems slot game
#	Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, dollar scatter symbols, spin button, Big win window and win amount
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till the 5 dollar scatter symbol appears on all the five reels and big win screen appears and big win amount added to the balance
#	Then  Big Win screen should appear when five dollar scatter symbols appears on the screen in Perfect Gems slot game
  
 
 
#	Scenario: Check whether Bonus Game feature is triggering on when 3 or more than 3 scatters appears on the screen in Perfect Gems slot game
#    Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, scatter symbols, spin button, bonus game banner, bonus game screen and bonus win amount
#    When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till Three or more than three scatter symbols appears on the screen wins and bonus game activates, bonus game treasure boxes and treasure amount amount added to balance 
#    Then Bonus Game screen should appear when Three or more scatter symbols appears on the screen in Perfect Gems game
	
 
#   Scenario: Check whether resume feature is enabled in Bonus Game screen of Perfect Gems slot game
#	Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, win symbols, spin button, bonus game screen, new browser.
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and bonus game screen is switched and close the browser and again login to the game with new browser
#	Then  Resume feature should enabled and land on the bonus game screen of Perfect Gems slot game  



#   Scenario: Check whether Bonus Game is continued under various conditions during autospin state in Perfect Gems slot game
#	Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, win symbols, spin button, Bonus Game screen, new browser, new tab, network interruptions and reload 
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till scatter win appears and Bonus Game is activated and observe the Bonus Game continuity under various conditions
#	Then Bonus Game should be enabled and resumed and after reloading the game autoplay should be stopped in Perfect Gems slot game  
 

#   Scenario: Check whether Wild is triggered at 5th reels and shifts one reels to its left till 1st reel for each spin and wild wins are triggered in Perfect Gems slot game
#	Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, wild symbols, spin button, wild win, bet and denominations 
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild appears and for each spin it shifts its position from 5th reel to 1st reel and drops
#	Then Wild win should be activated as per game info page  
#    Then Change the denominations when wild is at 1st reel and observer the pop should not be generated in Perfect Gems slot Game


#   Scenario: Check whether Wild is triggered at 5th reels and while between successive iteration if bet and denomination change is permitted in Perfect Gems slot game
#	Given Chrome browser, valid URL, valid login details, Perfect Gems slot game, bet type, denomination, balance, wild symbols, spin button, wild win, bet and denominations, wild pop-up 
#	When Open the Perfect Gems slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild appears and for successive spin try change the bet and denominations
#	Then Upon change of bet and denominations wild pop-up to appear on screen   
#    And If the user selects 'No' wild iterations should be continued for further spins
#    And If the user selects 'Yes' wild iterations should be terminated for next spin

 