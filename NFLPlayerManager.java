/** Program: Mile Stone 3: NFLPlayerManager
* File: NFLPlayerManager.java
* Summary: Class that stores and creates NFL players from the NFLPlayers class
* Author: Chris Hyde
* Date: November 17, 2017 
**/

import java.util.Random;

public class NFLPlayerManager {
	
	//Basic constructor with no args
	public NFLPlayerManager() {
		
	}
	
	// Constructor that sets how many players to create and create them. 
	public NFLPlayerManager(int arraySize) {
		//Set the size of the player list array. 
		this.playerList = new NFLPlayers[arraySize];
		// on instantiation of this class consturctor create and store an array of NFLPlayers. 
		createPlayers();
	}
	
	// An array to store 6 NFLPlayers object
	private NFLPlayers[] playerList = new NFLPlayers[6];
	
	
	// Method that randomly fills the playerList with NFLPlayers.
	public void createPlayers() {
		Random random = new Random();  //Random number for generating numerical stats
		String[] firstNameList = {"Stan", "Jim", "Bob", "George", "Henry", "Steve", "Troy", "Correy", "Conner" , "Harvey"}; // array of 10 first names 
		String[] lastNameList = {"Harvey", "Connors", "Smith", "Henley", "Lorance", "Manning", "Dent", "White", "Black", "Fard"}; // array of 10 last names
		String[] teamList = {"Ravens", "Raiders", "49ers", "Dolphins", "Bears", "Cardinals"}; // array of 6 teams
		String[] positionList = {"Quarterback", "Running Back", "Fullback", "Linebacker", "Safty", "Cornerback", "Offensive Line", "Tight End", "Wide Receiver", "Defensive Line"}; // array of all positions (not special)
		
		
		// Loop through each element of the playerList array and set it to a new NFLPlayer with random int stats. 
		for (int i = 0; i < playerList.length; i++ ) {
			int wieght = (random.nextInt(16) + 15) * 10; // Generate a random weight from 150lbs to 300lbs
			int heightFeet = random.nextInt(2) + 5; // Generate a random height in feet from 4 to 6
			int heightInches = random.nextInt(13); // Generate a random height in inches from 0 to 12
			int teamNumber = random.nextInt(99) + 1; // Generate a random team number from 1 to 100
			int seasonsPlayed = random.nextInt(19) +1; // Generate a random seasons played between 1 and 20
			int gamesMissed = random.nextInt(seasonsPlayed * 8); // Generate a random number of games missed based on half the number of games that could have been played.
			int gamesWon = random.nextInt((seasonsPlayed*16) - gamesMissed); // generate a random number based on total games played to find how many games won. 
			int age = (random.nextInt(7) + 18 + seasonsPlayed ); // generate a random age based on min of age 18 to 24 then add seasons played. 
		
			// Construct NFLPlayer(firstName, lastName, team, position, weight, age, heightFeet, heightInchs, yearsPlayed, teamNumber, gamesWon, gamesMissed, proBowls)
			playerList[i] = new NFLPlayers(firstNameList[random.nextInt(10)], lastNameList[random.nextInt(10)], teamList[random.nextInt(6)], positionList[random.nextInt(10)], wieght, age,  heightFeet, heightInches, seasonsPlayed, teamNumber, gamesWon, gamesMissed, random.nextInt(2));
		}
	}
	
	// Method to override default toString method when printing an object of this class. 
	public String toString() {
		String listOfPlayers = ""; // a string that will contain the list of all players
		
		// Loop through all the players in the playerList and add it to listOfPlayers
		for(int i = 0; i < playerList.length; i++) {
			listOfPlayers += i +": " +  playerList[i] + "\n";
		}
		return listOfPlayers;
	}
	
	//Getter for the playerList Array
	public NFLPlayers[] getPlayerList() {
		return this.playerList;
	}
	
	//Setter for changing an element of the playerList array
	public void setPlayerList(int index, NFLPlayers player) {
		playerList[index] = player; 
	}
	

}
