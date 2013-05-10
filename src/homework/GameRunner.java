
package homework;
import java.util.Random;


public class GameRunner {

	private static boolean running=true; //game running bool

	public static void main(String[] args) 
        {
		Game aGame = new Game();
		
		aGame.add("James");
		aGame.add("Noel");
		aGame.add("Sam");
		
                Random rand = new Random();
                
                if(!running)System.out.println("the game is off, fuckface");
                
                while (running)
                {
                    //do players turn and return 10 sided die roll
                    int roll10 = aGame.doPlayerTurn();

                    
                    //They roll a 10 sided dice here and if they get a 7 it runs
                    // them into the penalty box
                  if (roll10 == 7) 
                   {
                            aGame.wrongAnswer();
                   } 
                   else 
                   {
                        //if they got a 7 on the 10 sided die and they have the
                        //correct answer they seem to win
                            //end the game
                        aGame.correctAnswer();
                        if (aGame.didPlayerWin())
                        {    
                            running = false;
                        }
                  }

                }
	}
}
