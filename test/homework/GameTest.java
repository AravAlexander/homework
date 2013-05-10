package homework;

import junit.framework.TestCase;

/**
 *
 * @author Allen
 */
public class GameTest extends TestCase {
    
    public GameTest(String testName) {
        super(testName);
    }

    /**
     * Test of isPlayable method, of class Game.
     */
    public void testIsPlayable() {
        System.out.println("isPlayable");
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.isPlayable();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Game.
     */
    public void testAdd() {
        System.out.println("add");
        String playerName = "Player";
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.add(playerName);
        assertEquals(expResult, result);
    }

    /**
     * Test of howManyPlayers method, of class Game.
     */
    public void testHowManyPlayers() {
        System.out.println("howManyPlayers");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.howManyPlayers();
        assertEquals(expResult, result);
    }

    /**
     * Test of roll method, of class Game.
     */
    public void testRoll() {
        System.out.println("roll");
        int roll = 1;
        Game instance = new Game();
        instance.add("Player");
        boolean expResult = true;
        boolean result = instance.roll(roll);
        assertEquals(expResult, result);
    }

    /**
     * Test of wasCorrectlyAnswered method, of class Game.
     */
    public void testWasCorrectlyAnswered() {
        System.out.println("wasCorrectlyAnswered");
        Game instance = new Game();
        instance.add("Player");
        boolean expResult = true;
        boolean result = instance.wasCorrectlyAnswered();
        assertEquals(expResult, result);
    }

    /**
     * Test of wrongAnswer method, of class Game.
     */
    public void testWrongAnswer() {
        System.out.println("wrongAnswer");
        Game instance = new Game();
        instance.add("Player");
        boolean expResult = true;
        boolean result = instance.wrongAnswer();
        assertEquals(expResult, result);
    }
}
