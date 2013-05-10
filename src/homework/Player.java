/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Random;

/**
 *
 * @author Noel
 */
public class Player 
{
    private int purse;
    private String name;
    private boolean inPenaltyBox;//true for is in box
    Random rand = new Random();
    
    //constructors NOEL!!! lol
    public Player(String Name)
    {
        name = Name;
        purse = 0;
        inPenaltyBox = false;
    }
    
    public boolean setPurse(int set)
    {
        this.purse = set;
        return true;
    }
    
    public boolean incrementPurse()
    {
        this.purse++;
        return true;
    }
    
    public int getPurse()
    {
        return this.purse;
    }
    
    public boolean setName(String input)
    {
        this.name = input;
        return true;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public boolean moveToPenaltyBox()
    {
        if(!inPenaltyBox) this.inPenaltyBox = true;
        return true;
    }
    
    public boolean leavePenaltyBox()
    {
        if(inPenaltyBox) this.inPenaltyBox = false;   
        return true;
    }
    
    public boolean isInPenaltyBox()
    {//true = is in box
        return this.inPenaltyBox;
    }
    
    public int rollDice(int dieSize)
    {
        return rand.nextInt(dieSize-1) + 1;
    }
}
