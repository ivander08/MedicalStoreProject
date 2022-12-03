/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalstoreproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Gavriel
 */
public class RegistrationForm extends JFrame {
    private Container container;
    private JLabel lbTitle;
    private JLabel lbName;
    private JLabel lbMobile;
    private JLabel lbGender;
    private JLabel lbDOB;
    private JLabel lbAddress;
    private JTextField tfName;
    private JTextField tfMobile;
    private JRadioButton rbMale;
    private JRadioButton rbFemale;
    private ButtonGroup btgGender;
    private JComboBox cobDate;
    private JComboBox cobMonth;
    private JComboBox cobYear;
    private JTextArea taAddress;
    private JCheckBox cbxTerms;
    private JButton btnSubmit;
    private JButton btnReset;
    private JTextArea taOutput;
    private JLabel lbConfirm, yangBuat;
    private String dtDate[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private String dtMonth[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    private String dtYear[]={"1960","1961","1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
    public RegistrationForm(){
    container= getContentPane();
    container.setLayout(null);
    
    
    lbTitle= new JLabel("Registration Form");
    lbTitle.setFont(new Font("Arial",Font.PLAIN,30));
    lbTitle.setSize(300,30);
    lbTitle.setLocation(300,30);
    container.add(lbTitle);
    
    lbName= new JLabel("Full Name");
    lbName.setFont(new Font("Arial",Font.PLAIN,20));
    lbName.setSize(100,20);
    lbName.setLocation(100,100);
    container.add(lbName);
    
    tfName= new JTextField();
    tfName.setFont(new Font("Arial", Font.PLAIN, 15));
    tfName.setSize(190,20);
    tfName.setLocation(200,100);
    container.add( tfName);
    
    lbMobile= new JLabel("Mobile");
    lbMobile.setFont(new Font("Arial",Font.PLAIN,20));
    lbMobile.setSize(100,20);
    lbMobile.setLocation(100,150);
    container.add(lbMobile);
    
    tfMobile = new JTextField();
    tfMobile.setFont(new Font("Arial", Font.PLAIN, 15));
    tfMobile.setSize(190,20);
    tfMobile.setLocation(200,150);
    container.add( tfMobile);
    
    lbGender= new JLabel("Sex");
    lbGender.setFont(new Font("Arial",Font.PLAIN,20));
    lbGender.setSize(100,20);
    lbGender.setLocation(100,200);
    container.add(lbGender);
    
    rbMale= new JRadioButton("Male");
    rbMale.setFont(new Font("Arial",Font.PLAIN,13));
    rbMale.setSelected(true);
    rbMale.setSize(75,20);
    rbMale.setLocation(200,200);
    container.add(rbMale);
    
    rbFemale= new JRadioButton("Female");
    rbFemale.setFont(new Font("Arial",Font.PLAIN,13));
    rbFemale.setSelected(false);
    rbFemale.setSize(75,20);
    rbFemale.setLocation(275,200);
    container.add(rbFemale);
    
    btgGender= new ButtonGroup();
    btgGender.add(rbMale);
    btgGender.add(rbFemale);
    
    lbDOB=new JLabel("DOB");
    lbDOB.setFont(new Font("Arial",Font.PLAIN,20));
    lbDOB.setSize(100,20);
    lbDOB.setLocation(100,250);
    container.add(lbDOB);
    
    cobDate= new JComboBox(dtDate);
    cobDate.setFont(new Font("Arial",Font.PLAIN,15));
    cobDate.setSize(50,20);
    cobDate.setLocation(185,250);
    container.add(cobDate);
            
    cobMonth= new JComboBox(dtMonth);
    cobMonth.setFont(new Font("Arial",Font.PLAIN,15));
    cobMonth.setSize(60,20);
    cobMonth.setLocation(255,250);
    container.add(cobMonth);
    
    cobYear= new JComboBox(dtYear);
    cobYear.setFont(new Font("Arial",Font.PLAIN,15));
    cobYear.setSize(60,20);
    cobYear.setLocation(330,250);
    container.add(cobYear);
    
    lbAddress=new JLabel("Address");
    lbAddress.setFont(new Font("Arial",Font.PLAIN,20));
    lbAddress.setSize(100,20);
    lbAddress.setLocation(100,300);
    container.add(lbAddress);
    
    taAddress= new JTextArea();
    taAddress.setFont(new Font("Arial",Font.PLAIN,15));
    taAddress.setSize(200,75);
    taAddress.setLocation(200,300);
    container.add(taAddress);
    
    cbxTerms = new JCheckBox("Accept Terms and Conditions");
    cbxTerms.setFont(new Font("Arial",Font.PLAIN,15));
    cbxTerms.setSize(250,20);
    cbxTerms.setLocation(150,400);
    container.add(cbxTerms);
    
    btnSubmit= new JButton("Submit");
    btnSubmit.setFont(new Font("Arial",Font.PLAIN,15));
    btnSubmit.setSize(100,20);
    btnSubmit.setLocation(150,450);
    container.add(btnSubmit);
    
    btnReset= new JButton("Reset");
    btnReset.setFont(new Font("Arial",Font.PLAIN,15));
    btnReset.setSize(100,20);
    btnReset.setLocation(270,450);
    container.add(btnReset);
    
    userEvents events= new userEvents();
    btnSubmit.addActionListener(events);
    btnReset.addActionListener(events);
    
    lbConfirm= new JLabel("");
    lbConfirm.setFont(new Font("Arial",Font.PLAIN,20));
    lbConfirm.setSize(500,25);
    lbConfirm.setLocation(100,500);
    container.add(lbConfirm);
    
    taOutput= new JTextArea();
    taOutput.setFont(new Font("Arial",Font.PLAIN,15));
    taOutput.setSize(200,200);
    taOutput.setLocation(500,100);
    taOutput.setLineWrap(true);
    taOutput.setEditable(false);
    container.add(taOutput);
    
    }
    
    private class userEvents
            implements ActionListener{     
    
        @Override
        public void actionPerformed(ActionEvent e){
            Object obj=e.getSource();
            
            if (obj== btnSubmit){
                if(cbxTerms.isSelected()){
                    String gend;
                    String data="Name: "+ tfName.getText()
                              + "\n" + "Mobile: "+ tfMobile.getText()
                              + "\n" ;
                if (rbMale.isSelected())gend="Gender : Male \n";
                else gend="Gender: Female\n";
                
                String dob= "DOB:"+
                      cobDate.getSelectedItem().toString()+  "-"+ 
                      cobMonth.getSelectedItem().toString()+ "-"+
                      cobYear.getSelectedItem().toString()+ "\n";
                      
                String address="Address:" +taAddress.getText();
                
        taOutput.setText(data+gend+dob+address);
        taOutput. setEditable(false);
        lbConfirm.setText("Registration Successful");
        }
                else{
        taOutput.setText("");
        lbConfirm.setText("please accept the" 
                          + "term and conditions");
                }
              }
                else if(obj==btnReset){
                String reset="";
                tfName.setText(reset);
                tfMobile.setText(reset);
                taOutput.setText(reset);
                taAddress.setText(reset);
                cbxTerms.setSelected(false);
                cobDate.setSelectedIndex(0);
                cobMonth.setSelectedIndex(0);
                cobYear.setSelectedIndex(0);
                lbConfirm.setText(reset);
                
                }
            }
        }
        
                
    
            
    }
