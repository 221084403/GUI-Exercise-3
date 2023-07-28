/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.learner;

/**
 *
 * @author MNCEDISI
 */
public class Learner 
{
    private String name;
    private int mathMark;
    private int phyiscalMark;

    public Learner(String name, int mathMark, int phyiscalMark) 
    {
        this.name = name;
        this.mathMark = mathMark;
        this.phyiscalMark = phyiscalMark;
    }

    public String getName() {
        return name;
    }

    public int getMathMark() {
        return mathMark;
    }

    public int getPhyiscalMark() {
        return phyiscalMark;
    }
    
    public int getFinalScore()
    {
        return getMathMark() + getPhyiscalMark();
    }
    
    public String getOutcome()
    {
        String output = "Rejected";
        
        if((getMathMark()>=6 && getMathMark()<=7)  && (getPhyiscalMark()>=6 && getMathMark()<=7))
            output = "Accepted";
        
        return output;
    }

    @Override
    public String toString() 
    {
        String output =  "\nLearner\nName                  :"+ getName()+
                         "\nMath Marks          :"+ getMathMark()+
                         "\nPhysical Mark     :"+getPhyiscalMark()+
                         "\nFinal score         :"+getFinalScore()+
                         "\nOutcome             :"+getOutcome()+"\n\n";
        return output;
    } 
}
