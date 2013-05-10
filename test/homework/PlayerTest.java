/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.setPurse(set);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementPurse method, of class Player.
     */
    public void testIncrementPurse() {
        System.out.println("incrementPurse");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.incrementPurse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPurse method, of class Player.
     */
    public void testGetPurse() {
        System.out.println("getPurse");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPurse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    public void testSetName() {
        System.out.println("setName");
        String input = "";
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.setName(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveToPenaltyBox method, of class Player.
     */
    public void testMoveToPenaltyBox() {
        System.out.println("moveToPenaltyBox");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.moveToPenaltyBox();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leavePenaltyBox method, of class Player.
     */
    public void testLeavePenaltyBox() {
        System.out.println("leavePenaltyBox");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.leavePenaltyBox();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInPenaltyBox method, of class Player.
     */
    public void testIsInPenaltyBox() {
        System.out.println("isInPenaltyBox");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isInPenaltyBox();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
