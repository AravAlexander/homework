
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
                    aGame.roll(rand.nextInt(5) + 1);
                    
                    //They roll a 10 sided dice here and if they get a 7 it runs
                    // them into the penalty box
                    if (rand.nextInt(9) == 7) 
                    {
                            //notAWinner = aGame.wrongAnswer();
                    } 
                    else 
                    {
                        //if they got a 7 on the 10 sided die and they have the
                        //correct answer they seem to win
                            //end the game
                            //notAWinner = aGame.wasCorrectlyAnswered();
                            running = false;
                    }

                }
	}
}
