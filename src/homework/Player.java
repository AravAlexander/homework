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
    
    public void setPurse(int set)
    {
        this.purse = set;
    }
    
    public void incrementPurse()
    {
        this.purse++;
    }
    
    public int getPurse()
    {
        return this.purse;
    }
    
    public void setName(String input)
    {
        this.name = input;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void moveToPenaltyBox()
    {
        if(!inPenaltyBox) this.inPenaltyBox = true;        
    }
    
    public void leavePenaltyBox()
    {
        if(inPenaltyBox) this.inPenaltyBox = false;        
    }
    
    public boolean isInPenaltyBox()
    {//true = is in box
        return this.inPenaltyBox;
    }
}
