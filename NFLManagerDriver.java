/** Program: Mile Stone 3: NFLPlayerManager
* File: NFLManagerDriver.java
* Summary: Main class - contains method for testing the functionality of NFLPlayerManager.
* Author: Chris Hyde
* Date: November 18, 2017 
**/

public class NFLManagerDriver {

	public static void main(String[] args) {
		managerDriver();
	}
	
	// Method driver for testing the NFLPlayerManager class.
	public static void managerDriver() {
		
		
		//Instantiate the NFLPlayerManager class with the base constructor and print using toString()
		NFLPlayerManager playerManager = new NFLPlayerManager();
		System.out.println("toString() no-args constructor returns:\n" + playerManager + "\n");
		
		// Test the createPlayers() method and print new result. 
		playerManager.createPlayers();
		//output the players stored in playerManager using the custom toString() method.
		System.out.println("toString() no-args after createPlayers() returns:\n" + playerManager + "\n");
		
		
		//Test the constructor that allows you to set an array size and creates the players automatically
		NFLPlayerManager playerArray = new NFLPlayerManager(12); // Note: by default the playerList has 6 elements this changes it to 12
		
				
		//Test the getter for playerArray by printing its playerList
		System.out.println("Printed player list using the .getPlayerList() method: \n");
		//Loop through each element of the playerList array and print it on the screen.
		for(int i = 0; i < playerArray.getPlayerList().length; i++) {
			System.out.println(playerArray.getPlayerList()[i]);
		}
		
		//Create a new NFLPlayer so I can test adding it to my playerList
		NFLPlayers newPlayer = new NFLPlayers("Chris", "Hyde", "Ravens", "Linebacker", 300, 32, 6, 5, 1, 7, 14, 0, 0);
		
		// Test setPlayerList by adding newPlayer to index 0
		playerArray.setPlayerList(0, newPlayer);
		
		// Print the playerArray.playerList again to make sure the element at index 0 was changed. 
		System.out.println("\nCheck element at index 0:\n" + playerArray.toString());
		
	}

}
