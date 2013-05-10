/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Noel
 */
public class Player 
{
    private int purse;
    private String name;
    private boolean inPenaltyBox = false;//true for is in box
    
    //constructors NOEL!!! lol
    public Player(String Name)
    {
        name = Name;
        purse = 0;
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
}
