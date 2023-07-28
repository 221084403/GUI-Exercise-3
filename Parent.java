/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.parent;

/**
 *
 * @author MNCEDISI
 */
public class Parent 
{
    private String name;
    private String emailAddress;
    private String cellphoneNum;

    public Parent(String name, String emailAddress, String cellphoneNum)
    {
        this.name = name;
        this.emailAddress = emailAddress;
        this.cellphoneNum = cellphoneNum;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getCellphoneNum() {
        return cellphoneNum;
    }

    @Override
    public String toString() 
    {
        String output = "Parent\nName                    :"+ getName() +"\n" +
                        "Email Address       :" + getEmailAddress() + "\n"+
                        "Cellphone No        :" + getCellphoneNum();
        return output;
    }
    
}
