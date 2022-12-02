/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalstoreproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
/**
 *
 * @author Willsen Yogi P
 */
public class MainMenu extends JFrame{
    private JLabel headerLabel, medRegLabel, docAppLabel, invoiceLabel, patientLabel, loginAs;
    private JLabel inputName, inputID;
    private JButton loginButton, signOut;
    private JButton medRegButton, docAppButton, invoiceButton, patientButton;
    private JComboBox titleBox, genderBox;
    private JTextField nameTF, staffID;
    
    private Object[] titleList = {"", "Nurse", "Doctor", "Receptionist", "Dentist", "Surgeon", "Pharmacist"};
    private Object[] genderList = {"", "Mr. ", "Mrs. "};
    
    
    public MainMenu(){
        super("Medical Store Application");
        JFrame frame = new JFrame();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(870,610);
        setVisible(true);
        
        Container container = getContentPane();
        container.setLayout(null);
        
       
        headerLabel = new JLabel("Java Hospital");
        headerLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        container.add(headerLabel);
        
        
        ImageIcon medIcon = new ImageIcon(getClass().getResource("medLogo2.png"));
        medRegButton = new JButton(medIcon);
        ImageIcon docIcon = new ImageIcon(getClass().getResource("doctor.png"));
        docAppButton = new JButton(docIcon);
        ImageIcon invoiceIcon = new ImageIcon(getClass().getResource("invoice.png"));
        invoiceButton = new JButton(invoiceIcon);
        ImageIcon patientIcon = new ImageIcon(getClass().getResource("patient.png"));
        patientButton = new JButton(patientIcon);
        
        container.add(medRegButton);
        container.add(docAppButton);
        container.add(invoiceButton);
        container.add(patientButton);
        
        medRegLabel = new JLabel("Medicine Registration");
        docAppLabel = new JLabel("Doctor Appointment List");
        invoiceLabel = new JLabel("Print Invoice");
        patientLabel = new JLabel("Patient Registration");
        
        container.add(medRegLabel);
        container.add(docAppLabel);
        container.add(invoiceLabel);
        container.add(patientLabel);
        
        ButtonListener buttonListen = new MainMenu.ButtonListener();
        
        loginAs = new JLabel("Input Login Details");
        titleBox = new JComboBox(titleList);
        genderBox = new JComboBox(genderList);
        nameTF = new JTextField();
        staffID = new JTextField();
        inputName = new JLabel();
        inputID = new JLabel("Staff ID :");
        loginButton = new JButton("Login");
        signOut = new JButton ("Sign Out");
        signOut.setVisible(false);
        
        add(signOut);
        container.add(loginAs);
        container.add(titleBox);
        container.add(genderBox);
        container.add(nameTF);
        container.add(staffID);
        container.add(inputName);
        container.add(inputID);
        add(loginButton);
        
        loginButton.addActionListener(buttonListen);
        signOut.addActionListener(buttonListen);
        
        //Bounds Setting
        headerLabel.setBounds(350, 0, 200, 50);
        
        medRegButton.setBounds(50, 100, 100, 100);
        medRegLabel.setBounds(40,170,150,100);
        
        docAppButton.setBounds(270, 100, 100, 100);
        docAppLabel.setBounds(250,170,150,100);
                
        invoiceButton.setBounds(50,270,100,100);
        invoiceLabel.setBounds(63,340,150,100);
        
        patientButton.setBounds(270,270,100,100);
        patientLabel.setBounds(265,340,150,100);
        
        loginAs.setBounds(735,10,115,30);
        titleBox.setBounds(580,50,90,30);
        genderBox.setBounds(680,50,50,30);
        nameTF.setBounds(735,50,100,30);
        staffID.setBounds(735,80,100,30);
        inputName.setBounds(680,60,200,30);
        inputID.setBounds(680,80,200,30);
        loginButton.setBounds(750,110,70,20);
        signOut.setBounds(750,110,100,20);
        
        
        
        
        
            
        }
    
    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == loginButton){
                String getGender = String.valueOf(genderBox.getSelectedItem());
                String getTitle = String.valueOf(titleBox.getSelectedItem());

                titleBox.setVisible(false);
                genderBox.setVisible(false);
                nameTF.setVisible(false);
                staffID.setVisible(false);
                loginButton.setVisible(false);

                loginAs.setText("");
                inputID.setText("");
                inputName.setText( getGender + nameTF.getText() + " (" + getTitle + ")" );
                inputID.setText("Staff ID : " + staffID.getText());
                
                signOut.setVisible(true);
                 
        } else{
            if(e.getSource() == signOut){
                loginAs.setText("Input Login Details");
                inputID.setText("Staff ID : ");
                inputName.setText("");

                signOut.setVisible(false);
                titleBox.setVisible(true);
                genderBox.setVisible(true);
                nameTF.setVisible(true);
                staffID.setVisible(true);
                loginButton.setVisible(true);
                
                nameTF.setText("");
                staffID.setText("");
                }
        }
        
    }
    }
}
    
    

