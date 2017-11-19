/** Program: Mile Stone 3: NFLPlayerManager
* File: NFLPlayers.java
* Summary: Base Class of NFL Players - Contains stats that every NFL player shares without going into positional stats.
* Author: Chris Hyde
* Date: November 18, 2017 
**/

/* -- EDITS --
 * (November 18, 2017) Removed the "\n"'s from the toString() method to have the player stats print on one line. 
 */


public class NFLPlayers {

	// Constructors:
	// No argument constructor.
	public NFLPlayers(){
		
	}

	// All properties Constructor.
	public NFLPlayers(String firstName, String lastName, String team, String position, int weight, int age, int heightFeet, int heightInches, int seasonsPlayed, int teamNumber, int gamesWon, int gamesMissed, int proBowls) {
		// set all data fields to the value of the corresponding argument. 
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.position = position;
		this.weight = weight;
		this.age = age;
		this.heightFeet = heightFeet;
		this.heightInches = heightInches;
		this.seasonsPlayed = seasonsPlayed;
		this.teamNumber = teamNumber;
		this.gamesWon = gamesWon;
		this.gamesMissed = gamesMissed;
		this.proBowls = proBowls;
	}
	
	//Data Fields 
	private String firstName = "", lastName = "", team = "", position = "";
	private int weight = 0, age = 0, seasonsPlayed = 1, teamNumber = 0, gamesWon = 1, gamesMissed = 0, proBowls = 0, heightFeet = 0, heightInches = 0;
	
	//Data Fields set by other data fields. These have no direct setter method.  
	private int gamesPlayed; // Gotten by multiplying yearsPlayed by 16(games in a season) minus gamesMissed.
	private int gamesLost; //Gotten by subtracting games won from games played.
	
	
	// Method toString: Overrides java's default toString()
	public String toString() {
		// Return all data fields in a structured way whenever an object of this class is printed. 
		return "PLAYER INFO: Name: " + getFirstName() + " " + getLastName() + ", Age: " + getAge() + ", Height: "
				+ heightFeet + "'" + heightInches + "\" " + ", Weight: " + this.getWeight() + ", Team: " + getTeam()
				+ " #" + getTeamNumber() + ", Position: " + getPosition() + ", Seasons: "
				+ getSeasonsPlayed() + ", Games Played: " + getGamesPlayed() + ", Games Missed: " + getGamesMissed()
				+ ", Games Won: " + getGamesWon() + ", Games Lost: " + getGamesLost() + ", Number of Pro-Bowls: "
				+ getProBowls();
	}
	
	// --- Setters Start ---
	// Setters - set the value of data fields.
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSeasonsPlayed(int seasonsPlayed) {
		this.seasonsPlayed = seasonsPlayed;
	}

	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}

	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}
	
	public void setGamesMissed(int gamesMissed) {
		this.gamesMissed = gamesMissed;
	}

	public void setHeightFeet(int heightFeet) {
		this.heightFeet = heightFeet;
	}
	
	public void setHeightInches(int heightInches) {
		this.heightInches = heightInches;
	}
	
	public void setProBowls(int proBowls) {
		this.proBowls = proBowls;
	}
	// --- Setters End ---
	
	
	// --- Getters Start ---
	// Getters - to get the value of the data files.
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getTeam() {
		return this.team;
	}

	public String getPosition() {
		return this.position;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getAge() {
		return this.age;
	}

	public int getSeasonsPlayed() {
		return this.seasonsPlayed;
	}

	public int getTeamNumber() {
		return this.teamNumber;
	}

	public int getGamesPlayed() {
		// gamesPlayed equals seasonsPlayed * 16 (games per season) minus gamesMissed 
		this.gamesPlayed = (getSeasonsPlayed() * 16) - getGamesMissed();
		return this.gamesPlayed;
	}

	public int getGamesWon() {
		return this.gamesWon;
	}

	public int getGamesLost() {
		// Set gamesLost to what is left after winning games is subtracted from total games played. 
		this.gamesLost = getGamesPlayed() - getGamesWon(); 
		return this.gamesLost;
	}
	
	public int getGamesMissed() {
		return this.gamesMissed;
	}
	
	public int getProBowls() {
		return this.proBowls;
	}
	
	public int getHeightFeet() {
		return this.heightFeet;
	}
	
	public int getHeightInches() {
		return this.heightInches;
	}
	// --- Getters End ---	
}
