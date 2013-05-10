
package homework;
import java.util.Random;


public class GameRunner {

	private static boolean running; //game running bool

	public static void main(String[] args) 
        {
		Game aGame = new Game();
		
		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");
		
                Random rand = new Random();
                
                while (running)
                {
                    aGame.roll(rand.nextInt(5) + 1);
                    
                    if (rand.nextInt(9) == 7) 
                    {
                            //notAWinner = aGame.wrongAnswer();
                    } 
                    else 
                    {
                            //end the game
                            //notAWinner = aGame.wasCorrectlyAnswered();
                            running = false;
                    }

                }
	}
}
