package homework;

import junit.framework.TestCase;

/**
 *
 * @author Allen
 */
public class PlayerTest extends TestCase {
    
    public PlayerTest(String testName) {
        super(testName);
    }

    /**
     * Test of setPurse method, of class Player.
     */
    public void testSetPurse() {
        System.out.println("setPurse");
        int set = 0;
        Player instance = new Player("Player");
        boolean expResult = true;
        boolean result = instance.setPurse(set);
        assertEquals(expResult, result);
    }

    /**
     * Test of incrementPurse method, of class Player.
     */
    public void testIncrementPurse() {
        System.out.println("incrementPurse");
        Player instance = new Player("Player");
        boolean expResult = true;
        boolean result = instance.incrementPurse();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPurse method, of class Player.
     */
    public void testGetPurse() {
        System.out.println("getPurse");
        Player instance = new Player("Player");
        int expResult = 0;
        int result = instance.getPurse();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Player.
     */
    public void testSetName() {
        System.out.println("setName");
        String input = "New Name";
        Player instance = new Player("Player");
        boolean expResult = true;
        boolean result = instance.setName(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Player.
     */
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player("Player");
        String expResult = "Player";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of moveToPenaltyBox method, of class Player.
     */
    public void testMoveToPenaltyBox() {
        System.out.println("moveToPenaltyBox");
        Player instance = new Player("Player");
        boolean expResult = true;
        boolean result = instance.moveToPenaltyBox();
        assertEquals(expResult, result);
    }

    /**
     * Test of leavePenaltyBox method, of class Player.
     */
    public void testLeavePenaltyBox() {
        System.out.println("leavePenaltyBox");
        Player instance = new Player("Player");
        boolean expResult = true;
        boolean result = instance.leavePenaltyBox();
        assertEquals(expResult, result);
    }

    /**
     * Test of isInPenaltyBox method, of class Player.
     */
    public void testIsInPenaltyBox() {
        System.out.println("isInPenaltyBox");
        Player instance = new Player("Player");
        boolean expResult = false;
        boolean result = instance.isInPenaltyBox();
        assertEquals(expResult, result);
    }
}
