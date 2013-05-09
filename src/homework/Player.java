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
    
}
