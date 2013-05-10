package homework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Game {
    ArrayList players = new ArrayList();
    int[] places = new int[6];
    int[] purses  = new int[6];
    boolean[] inPenaltyBox  = new boolean[6];
    
    LinkedList popQuestions = new LinkedList();
    LinkedList scienceQuestions = new LinkedList();
    LinkedList sportsQuestions = new LinkedList();
    LinkedList rockQuestions = new LinkedList();
    
    int currentPlayer = 0;
    boolean isGettingOutOfPenaltyBox;
    
    public  Game()
    {
    	//This looks like it sets up the questions
        for (int i = 0; i < 50; i++) 
        {
			popQuestions.addLast("Pop Question " + i);
			scienceQuestions.addLast(("Science Question " + i));
			sportsQuestions.addLast(("Sports Question " + i));
			rockQuestions.addLast(createRockQuestion(i));
    	}
    }
        //This is a function to do the same thing the constructor is doing
        //needs to go
	public String createRockQuestion(int index){
		return "Rock Question " + index;
	}
	
        //This is apparently checking if there are enough players to play the game
        //probably not needed
	public boolean isPlayable() {
		return (howManyPlayers() >= 2);
	}
        
        //this is adding a player to the game
	public void add(String playerName) 
        {
            Player temp = new Player(playerName);
            
            players.add(temp);
            
	    places[howManyPlayers()] = 0;
	    
            System.out.println(temp.getName()+" was added to the game as player " + players.size());
	}
	
        //This is checking how many players are in the game also
	public int howManyPlayers() 
        {
		return players.size();
	}

	//This is doing almost all of the game logic while taking
        //a random number as the integer for the dice roll
        public void roll(int roll) 
        {
            //
            Player playerUp = (Player) players.get(currentPlayer);

            System.out.println(playerUp.getName() + " is the current player");		
            System.out.println(playerUp.getName()+" rolled a " + roll);
		
		if (playerUp.isInPenaltyBox()) 
                {
                    if (roll % 2 != 0) 
                    {
                            isGettingOutOfPenaltyBox = true;

                            System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
                            places[currentPlayer] = places[currentPlayer] + roll;
                            if (places[currentPlayer] > 11) places[currentPlayer] = places[currentPlayer] - 12;

                            System.out.println(players.get(currentPlayer) 
                                            + "'s new location is " 
                                            + places[currentPlayer]);
                            System.out.println("The category is " + currentCategory());
                            askQuestion();
                    } 
                    else 
                    {
                        System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
                        isGettingOutOfPenaltyBox = false;
                    }

		} 
                else 
                {
                    places[currentPlayer] = places[currentPlayer] + roll;
                    if (places[currentPlayer] > 11) places[currentPlayer] = places[currentPlayer] - 12;

                    System.out.println(players.get(currentPlayer) 
                                    + "'s new location is " 
                                    + places[currentPlayer]);
                    System.out.println("The category is " + currentCategory());
                    askQuestion();
		}
		
	}
        
        
        //this appears to be printing the first question in each category
	private void askQuestion() 
        {
            String category = currentCategory();
            
            switch(category)
            {
                case "Pop":
                    System.out.println(popQuestions.removeFirst());
                    break;
                case "Science":
                    System.out.println(scienceQuestions.removeFirst());
                    break;
                case "Sports":
                    System.out.println(sportsQuestions.removeFirst());
                    break;
                case "Rock":
                    System.out.println(rockQuestions.removeFirst());
                    break;
            }
        }
	
	//this is printing whatever category the player should be asked
        //based on their current position in the array
	private String currentCategory() 
        {    
            switch(places[currentPlayer])
            {
                case 0:
                case 4:
                case 8:
                    return "Pop";
                case 1:
                case 5:
                case 9:
                    return "Science";
                case 2:
                case 6:
                case 10:
                    return "Sports";
                default:
                    return "Rock";
            }
	}
        
        //this is apparently letting someone out of the penalty box
        //if they are in it and checking if they then win the game or something
	public boolean wasCorrectlyAnswered() 
        {
            if (inPenaltyBox[currentPlayer])
            {
                if (isGettingOutOfPenaltyBox) 
                {
                        System.out.println("Answer was correct!!!!");
                        purses[currentPlayer]++;
                        System.out.println(players.get(currentPlayer) 
                                        + " now has "
                                        + purses[currentPlayer]
                                        + " Gold Coins.");

                        boolean winner = didPlayerWin();
                        currentPlayer++;
                        if (currentPlayer == players.size()) currentPlayer = 0;

                        return winner;
                } 
                else 
                {
                        currentPlayer++;
                        if (currentPlayer == players.size()) currentPlayer = 0;
                        return true;
                }
            } 
            else 
            {
                System.out.println("Answer was corrent!!!!");
                purses[currentPlayer]++;
                System.out.println(players.get(currentPlayer) 
                                + " now has "
                                + purses[currentPlayer]
                                + " Gold Coins.");

                boolean winner = didPlayerWin();
                currentPlayer++;
                if (currentPlayer == players.size()) currentPlayer = 0;
                {
                    return winner;
                }
            }
	}
	
        //this is putting them in the penalty box if they get something wrong
	public boolean wrongAnswer()
        {
		System.out.println("Question was incorrectly answered");
		System.out.println(players.get(currentPlayer)+ " was sent to the penalty box");
		inPenaltyBox[currentPlayer] = true;
		
		currentPlayer++;
		if (currentPlayer == players.size()) currentPlayer = 0;
		return true;
	}

        //this is checking if the player has 6 coins
        //needs changed since we moved purse to player class
	private boolean didPlayerWin() 
        {
		return !(purses[currentPlayer] == 6);
	}
}
