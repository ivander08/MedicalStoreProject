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
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author Willsen Yogi P
 */
public class MainMenu extends JFrame{
    private JLabel headerLabel, headerLabel2, medRegLabel, docAppLabel, invoiceLabel, patientLabel, loginAs, imageLabel, javaLogo, versionLabel, usernameLabel, passwordLabel;
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
        setResizable(false);
        
        Container container = getContentPane();
        container.setLayout(null);
      
        
        ImageIcon javaImage = new ImageIcon(getClass().getResource("java3.png"));
        javaLogo = new JLabel(javaImage);
        container.add(javaLogo);
       
        headerLabel = new JLabel("java hospital");
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        headerLabel.setForeground(Color.WHITE);
        container.add(headerLabel);
        
        headerLabel2 = new JLabel("Taking care of Jakarta.");
        headerLabel2.setFont(new Font("Helvetica", Font.ITALIC, 10));
        headerLabel2.setForeground(Color.WHITE);
        container.add(headerLabel2);
        
        versionLabel = new JLabel("V1.0.0");
        container.add(versionLabel);
        
        
        
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
        docAppLabel = new JLabel("Doctor's Appointment List");
        invoiceLabel = new JLabel("Print Invoice");
        patientLabel = new JLabel("Patient Registration");
        
        container.add(medRegLabel);
        container.add(docAppLabel);
        container.add(invoiceLabel);
        container.add(patientLabel);
        
        LoginListener loginListen = new MainMenu.LoginListener();
        
        //login components
        loginAs = new JLabel("Input Login Details");
        loginAs.setFont(new Font("Helvetica", Font.BOLD, 20));
        loginAs.setForeground(Color.WHITE);
        titleBox = new JComboBox(titleList);
        genderBox = new JComboBox(genderList);
        
        ImageIcon userImage = new ImageIcon(getClass().getResource("username.png"));
        usernameLabel = new JLabel(userImage);
        container.add(usernameLabel);
        
        ImageIcon passImage = new ImageIcon(getClass().getResource("staffid.png"));
        passwordLabel = new JLabel(passImage);
        container.add(passwordLabel);
        
        nameTF = new JTextField();
        staffID = new JTextField();
        
        inputName = new JLabel();
        inputName.setFont(new Font("Helvetica", Font.BOLD, 15));
        inputName.setForeground(Color.WHITE);
        inputID = new JLabel("Staff ID :");
        inputID.setFont(new Font("Helvetica", Font.BOLD, 15));
        inputID.setForeground(Color.WHITE);
        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(236,151,6));
        loginButton.setForeground(Color.WHITE);
        signOut = new JButton ("Sign Out");
        signOut.setBackground(new Color(236,151,6));
        signOut.setForeground(Color.WHITE);
        signOut.setVisible(false);
        
        
        container.add(signOut);
        container.add(loginAs);
        container.add(titleBox);
        container.add(genderBox);
        container.add(nameTF);
        container.add(staffID);
        container.add(inputName);
        container.add(inputID);
        container.add(loginButton);
        
        loginButton.addActionListener(loginListen);
        signOut.addActionListener(loginListen);
        
        //Bounds Setting
        headerLabel.setBounds(35, 40, 200, 50);
        headerLabel2.setBounds(105, 62, 200, 50);
        
        medRegButton.setBounds(50, 200, 100, 100);
        medRegLabel.setBounds(40,270,150,100);
        
        docAppButton.setBounds(270, 200, 100, 100);
        docAppLabel.setBounds(250,270,150,100);
                
        invoiceButton.setBounds(50,370,100,100);
        invoiceLabel.setBounds(63,440,150,100);
        
        patientButton.setBounds(270,370,100,100);
        patientLabel.setBounds(265,440,150,100);
        
        loginAs.setBounds(625,5,200,30);
        titleBox.setBounds(605,40,70,30);
        genderBox.setBounds(605,75,70,30);
        nameTF.setBounds(680,40,100,30);
        staffID.setBounds(680,75,100,30);
        usernameLabel.setBounds(790,40,30,30);
        passwordLabel.setBounds(790,75,30,30);
        inputName.setBounds(680,60,200,30);
        inputID.setBounds(680,80,200,30);
        loginButton.setBounds(680,112,70,20);
        signOut.setBounds(680,112,100,20);
        
        javaLogo.setBounds(220,30,50,68);
        versionLabel.setBounds(0,550,100,30);
        
        //button functions
        invoiceButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                InvoiceButton invoice = new InvoiceButton();
                invoice.setVisible(true);
                invoice.setSize(1200,600);
                invoice.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                invoice.setResizable(false);
            }
            
        });
        
        docAppButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                AppointmentButton appointment = new AppointmentButton();
                appointment.setVisible(true);
                appointment.setSize(800,800);
                appointment.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                appointment.setResizable(false);
            }
            
        });
        
        patientButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                RegistrationForm rf = new RegistrationForm();
                rf.setVisible(true);
                rf.setSize(900,600);
                rf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                rf.setResizable(false);
            }
            
        });
        
        medRegButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                MedRegistration medr = new MedRegistration();
                medr.setVisible(true);
                medr.setSize(800,950);
                medr.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                medr.setResizable(false);
            }
            
        });
        
            ImageIcon hospitalImage = new ImageIcon(getClass().getResource("hopsital 4.png"));
            imageLabel = new JLabel(hospitalImage);
            container.add(imageLabel);
            imageLabel.setBounds(0,0,870,610);
            
            medRegButton.setEnabled(false);
            docAppButton.setEnabled(false);
            invoiceButton.setEnabled(false);
            patientButton.setEnabled(false);

        }
    
    private class LoginListener implements ActionListener{

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
                usernameLabel.setVisible(false);
                passwordLabel.setVisible(false);
                
                loginAs.setText("");
                inputID.setText("");
                inputName.setText( getGender + nameTF.getText() + " (" + getTitle + ")" );
                inputID.setText("Staff ID : " + staffID.getText());
                
                medRegButton.setEnabled(true);
                docAppButton.setEnabled(true);
                invoiceButton.setEnabled(true);
                patientButton.setEnabled(true);
                
                signOut.setVisible(true);
                 
        } 
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
                usernameLabel.setVisible(true);
                passwordLabel.setVisible(true);
                
                medRegButton.setEnabled(false);
                docAppButton.setEnabled(false);
                invoiceButton.setEnabled(false);
                patientButton.setEnabled(false);
                
                nameTF.setText("");
                staffID.setText("");
                }
            
            if(nameTF.getText().equals("") || staffID.getText().equals("") || genderBox.getSelectedItem().equals("")|| titleBox.getSelectedItem().equals("")){
                loginAs.setText("Input Login Details");
                inputID.setText("Staff ID : ");inputName.setText("");
                
                signOut.setVisible(false);
                titleBox.setVisible(true);
                genderBox.setVisible(true);
                nameTF.setVisible(true);
                staffID.setVisible(true);
                loginButton.setVisible(true);
                
                medRegButton.setEnabled(false);
                docAppButton.setEnabled(false);
                invoiceButton.setEnabled(false);
                patientButton.setEnabled(false);
                
                JOptionPane.showMessageDialog(MainMenu.this, "Please enter valid login details!");
            }
            
        
        
    }
    }
}
    
    

