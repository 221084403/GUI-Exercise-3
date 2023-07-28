/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import za.ac.tut.learner.Learner;
import za.ac.tut.parent.Parent;

/**
 *
 * @author MNCEDISI
 */
public class DesktopApplication extends JFrame
{
    private JPanel headingPNL;
    private JPanel parentContainerPNL;
    private JPanel headingAndParentContainerPNL;
    private JPanel parentGridPNL;
    private JPanel leanerContainerPNL;
    private JPanel leanerGridPNL;
    private JPanel learnerNamePNL;
    private JPanel mathPNL;
    private JPanel physicPNL;
    
    private JPanel buttonPNL;
    private JPanel leanerContainerAndButtonPNL;
    private JPanel txtAreaPNL;
    private JPanel mainPNL;
    
    private JLabel headingLBL;
    private JLabel parentNameLBL;
    private JLabel emailLBL;
    private JLabel cellNumLBL;
    private JLabel learnerNameLBL;
    private JLabel subHeadingLBL;
    private JLabel mathMarkLBL;
    private JLabel physicMarkLBL;
    
    private JTextField parentNameTxtFLD;
    private JTextField emailTxtFLD;
    private JTextField cellNumTxtFLD;
    private JTextField learnerNameTxtFLD;
    private JTextField mathMarkTxtFLD;
    private JTextField physicMarkTxtFLD;
    
    private JButton applyBTN;
    private JButton processBTN;
    private JButton exixtBTN;
    
    private JTextArea areaTxt;
    
    private JScrollPane scrollSLP;
    
  
    private ArrayList<String> list;

    private Parent parent;
    private Learner learner;
    
    public DesktopApplication()
    {
        setTitle("Grade 10 Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(510, 600);
        setResizable(false);
        
        //Creating a list
        list = new ArrayList<>();
        
        //Creating a panel
        headingPNL = new JPanel(new FlowLayout(FlowLayout.CENTER));
        parentContainerPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        parentContainerPNL.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 3), "Parent Details"));
        parentContainerPNL.setPreferredSize(new Dimension(500, 100));
        parentGridPNL = new JPanel(new GridLayout(3,1, 1, 1));
        headingAndParentContainerPNL = new JPanel(new GridLayout(2, 1 , 1, 1));
        
        leanerContainerPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leanerContainerPNL.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 3), "Learner Detials"));
        leanerContainerPNL.setPreferredSize(new Dimension(500, 160));

        leanerGridPNL = new JPanel(new GridLayout(4, 1 ,1, 1));
        learnerNamePNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mathPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        physicPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPNL = new JPanel(new FlowLayout(FlowLayout.LEFT ,5 , 3));
        leanerContainerAndButtonPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtAreaPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPNL = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPNL.setPreferredSize(new Dimension(300, 500));
        
        //Creating a label
        headingLBL = new JLabel("Grade 10 App");
        headingLBL.setFont(new Font(null, Font.BOLD, 30));
        headingLBL.setForeground(Color.GREEN);
        parentNameLBL = new JLabel("Name");
        emailLBL = new JLabel("Email Address");
        cellNumLBL = new JLabel("Cellphone No");
        
        learnerNameLBL = new JLabel("Name                         ");
        subHeadingLBL = new JLabel("* Grade 9 Subject Marks Required");
        mathMarkLBL = new JLabel("Mathematics           ");
        physicMarkLBL = new JLabel("Physical Science   ");
        
        //Creating a text field
        parentNameTxtFLD = new JTextField(10);
        emailTxtFLD = new JTextField(10);
        cellNumTxtFLD = new JTextField(10);
        
        learnerNameTxtFLD = new JTextField(10);
        mathMarkTxtFLD = new JTextField(10);
        physicMarkTxtFLD = new JTextField(10);
        
        //Creating a button
        applyBTN = new JButton("APPLY");
        applyBTN.addActionListener(new ApplyBTN());
        
        processBTN = new JButton("PROCESS");
        processBTN.addActionListener(new ProcessBTN());
        
        exixtBTN = new JButton("EXIT");
        exixtBTN.addActionListener(new ExitBTN());
        
        //Creating a text area
        areaTxt = new JTextArea(5, 30);
        areaTxt.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 3), "Display"));
        
        //Creating a scroll pane
        scrollSLP = new JScrollPane(areaTxt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
        scrollSLP.setPreferredSize(new Dimension(500, 150));

        //Adding   
        headingPNL.add(headingLBL);
        
        parentGridPNL.add(parentNameLBL);
        parentGridPNL.add(parentNameTxtFLD);
        parentGridPNL.add(emailLBL);
        parentGridPNL.add(emailTxtFLD);
        parentGridPNL.add(cellNumLBL);
        parentGridPNL.add(cellNumTxtFLD);
        
        learnerNamePNL.add(learnerNameLBL);
        learnerNamePNL.add(learnerNameTxtFLD);
        mathPNL.add(mathMarkLBL);
        mathPNL.add(mathMarkTxtFLD);
        physicPNL.add(physicMarkLBL);
        physicPNL.add(physicMarkTxtFLD);
        
        leanerGridPNL.add(learnerNamePNL);
        leanerGridPNL.add(subHeadingLBL);
        leanerGridPNL.add(mathPNL);
        leanerGridPNL.add(physicPNL);
        
        buttonPNL.add(applyBTN);
        buttonPNL.add(processBTN);
        buttonPNL.add(exixtBTN);
           
        parentContainerPNL.add(parentGridPNL);
        leanerContainerPNL.add(leanerGridPNL);
        
        headingAndParentContainerPNL.add(headingPNL );
        headingAndParentContainerPNL.add(parentContainerPNL );
        
        leanerContainerAndButtonPNL.add(leanerContainerPNL );
        leanerContainerAndButtonPNL.add(buttonPNL);
        
        txtAreaPNL.add(scrollSLP);
        
        add(headingAndParentContainerPNL , BorderLayout.NORTH);
        add(leanerContainerAndButtonPNL , BorderLayout.CENTER);
        add(txtAreaPNL , BorderLayout.SOUTH);

        setVisible(true);
    }

    private static class ExitBTN implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            System.exit(0);
        }
    }

    private class ProcessBTN implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String outcome = "";
            
            for (String display : list) 
                outcome +=display;
            
            areaTxt.setText(outcome);
        }
    }

    private  class ApplyBTN implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String parName = parentNameTxtFLD.getText();
            String emailAddres = emailTxtFLD.getText();
            String cellphoneNum = cellNumTxtFLD.getText();
            
            String learnerName = learnerNameTxtFLD.getText();
            int mathMarks = Integer.parseInt(mathMarkTxtFLD.getText());
            int physicalMarks = Integer.parseInt(physicMarkTxtFLD.getText());
            
            if(list.size() !=50)
            {
                parent = new Parent(parName, emailAddres, cellphoneNum);
                
                learner = new Learner(learnerName, mathMarks, physicalMarks);
                
                String applicationResult = parent.toString()+learner.toString();
                
                list.add(applicationResult);
                
                areaTxt.setText("Application for learner "+learner.getName()+" is recieved");
            }
            else
                areaTxt.setText("Application is closed");
        }
    }
}
