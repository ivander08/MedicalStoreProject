/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalstoreproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ivand
 */
public class InvoiceButton extends JFrame{
    private JLabel headerLabel, headerLabel2, javaLogo, invoiceLabel, product, quantity, price, line, patientLabel, dateLabel, total;
    private JLabel headerLabel3, headerLabel4, javaLogo2, invoiceTab, patientTab, nameInvoice, dateInvoice;
    private JTextField patientName, currentDate;
    private JTextArea productArea, quantityArea, priceArea;
    private JButton calculate;
    private JList productJList, quantityJList, priceJList;
    private JComboBox gender;
    private String genderChoice, nameChoice, dateChoice, sumString;

    
    String genderList[] = {"Mr. ", "Mrs. "};
    
    InvoiceButton(){
        super("Invoice");
        setLayout(null);
        
        //Label and Imaging
        ImageIcon javaImage = new ImageIcon(getClass().getResource("java3.png"));
        javaLogo = new JLabel(javaImage);
        add(javaLogo);
        headerLabel = new JLabel("java hospital");
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        headerLabel.setForeground(Color.WHITE);
        add(headerLabel);
        headerLabel2 = new JLabel("Taking care of Jakarta.");
        headerLabel2.setFont(new Font("Helvetica", Font.ITALIC, 10));
        headerLabel2.setForeground(Color.WHITE);
        add(headerLabel2);
        
        invoiceLabel = new JLabel("invoice tab");
        invoiceLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        invoiceLabel.setForeground(Color.WHITE);
        add(invoiceLabel);
        
        product = new JLabel("PRODUCT");
        product.setFont(new Font("Helvetica", Font.PLAIN, 25));
        add(product);
        quantity = new JLabel("QUANTITY");
        quantity.setFont(new Font("Helvetica", Font.PLAIN, 25));
        add(quantity);
        price = new JLabel("PRICE");
        price.setFont(new Font("Helvetica", Font.PLAIN, 25));
        add(price);
        
        patientLabel = new JLabel("Patient Name");
        patientLabel.setFont(new Font("Helvetica",Font.PLAIN,15));
        patientLabel.setForeground(Color.WHITE);
        add(patientLabel);
        patientName = new JTextField();
        patientName.setFont(new Font("Helvetica",Font.PLAIN,25));
        add(patientName);
        gender = new JComboBox(genderList);
        gender.setFont(new Font("Helvetica",Font.PLAIN,10));
        add(gender);
        
        dateLabel = new JLabel("Current Date");
        dateLabel.setFont(new Font("Helvetica",Font.PLAIN,15));
        dateLabel.setForeground(Color.WHITE);
        add(dateLabel);
        currentDate = new JTextField();
        currentDate.setFont(new Font("Helvetica",Font.PLAIN,25));
        add(currentDate);
        
        productArea = new JTextArea();
        productArea.setFont(new Font("Helvetica",Font.PLAIN,15));
        JScrollPane productScroll = new JScrollPane(productArea);
        add(productScroll);
        quantityArea = new JTextArea();
        quantityArea.setFont(new Font("Helvetica",Font.PLAIN,15));
        JScrollPane quantityScroll = new JScrollPane(quantityArea);
        add(quantityScroll);
        priceArea = new JTextArea();
        priceArea.setFont(new Font("Helvetica",Font.PLAIN,15));
        JScrollPane priceScroll = new JScrollPane(priceArea);
        add(priceScroll);
        
        nameInvoice = new JLabel("");
        nameInvoice.setFont(new Font("Helvetica",Font.BOLD,10));
        dateInvoice = new JLabel("");
        dateInvoice.setFont(new Font("Helvetica",Font.PLAIN,10));
        
        add(dateInvoice);
        add(nameInvoice);
        nameInvoice.setBounds(1055, 8, 205, 50);
        dateInvoice.setBounds(1055,23,205,50);
        
        sumString = "";
        total = new JLabel("");
        add(total);
        total.setBounds(840,475,400,100);       
        total.setFont(new Font("Helvetica",Font.BOLD,30));
        
        calculate = new JButton("CALCULATE TOTAL");
        calculate.setFont(new Font("Helvetica",Font.BOLD,25));
        calculate.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                genderChoice = "";
                nameChoice = "";
                dateChoice = "";
                sumString = "";
                dateInvoice.setText("");
                nameInvoice.setText("");
                total.setText("");
                
                genderChoice = gender.getSelectedItem().toString();
                nameChoice= patientName.getText();
                dateChoice= currentDate.getText();
                
                nameInvoice.setText("Dear " + genderChoice + nameChoice);
                dateInvoice.setText(dateChoice);
                String[] productList = productArea.getText().split("\\n");
                boolean quantityCorrect = true;
                boolean priceCorrect = true;
                
                String[] quantityListSTRING = quantityArea.getText().split("\\n");
                int[] quantityList = new int[quantityListSTRING.length];
                for(int i = 0; i < quantityListSTRING.length; i++){
                    for(int j = 0; j < quantityListSTRING[i].length(); j++){
                        if(quantityListSTRING[i].charAt(j) < '0' || quantityListSTRING[i].charAt(j) > '9'){
                            quantityCorrect = false;
                            quantityList[i] = 0;
                            quantityListSTRING[i] = "-";
                        }
                    }
                    if(quantityCorrect == false){
                        JOptionPane.showMessageDialog(InvoiceButton.this, "Invalid Data: Quantity number " + (i+1) + " does not contain number");
                }
                    else{
                        quantityList[i] = Integer.parseInt(quantityListSTRING[i]); 
                    }
                    quantityCorrect = true;
                }
                
                String[] priceListSTRING = priceArea.getText().split("\\n");
                int[] priceList = new int[priceListSTRING.length];
                for(int i = 0; i < priceListSTRING.length; i++){
                    for(int j = 0; j < priceListSTRING[i].length(); j++){
                        if(priceListSTRING[i].charAt(j) < '0' || priceListSTRING[i].charAt(j) > '9'){
                            priceCorrect = false;
                            priceList[i] = 0;
                            priceListSTRING[i] = "-";
                        }
                    }
                    if(priceCorrect == false){
                        JOptionPane.showMessageDialog(InvoiceButton.this, "Invalid Data: Price number " + (i+1) + " does not contain number");
                    }
                    else{
                        priceList[i] = Integer.parseInt(priceListSTRING[i]); 
                    }
                    priceCorrect = true;
                }     
                
                int[] priceListTOTAL = new int[priceList.length];
                for(int i = 0; i < priceList.length; i++){
                    priceListTOTAL[i] = priceList[i] * quantityList[i]; 
                }     
                
                String[] priceListTOTALString = new String[priceListTOTAL.length];
                for(int i = 0; i <priceListTOTAL.length; i++){
                    priceListTOTALString[i] = String.valueOf(priceListTOTAL[i]);
                }
                
                JList productJListREAL = new JList(productList);
                productJListREAL.setFont(new Font("Helvetica",Font.PLAIN,15));
                add(productJListREAL);
                
                JList quantityJListREAL = new JList(quantityListSTRING);
                quantityJListREAL.setFont(new Font("Helvetica",Font.PLAIN,15));
                add(quantityJListREAL);
                
                JList priceJListREAL = new JList(priceListTOTALString);
                priceJListREAL.setFont(new Font("Helvetica",Font.PLAIN,15));
                add(priceJListREAL);
                
                productJListREAL.setBounds(830,125,180,350);
                quantityJListREAL.setBounds(1025,125,50,350);
                priceJListREAL.setBounds(1090,125,80,350);
                
                int sum = 0;
                
                for(int i = 0; i < priceListTOTAL.length; i++){
                    sum += priceListTOTAL[i];
                }
                
                sumString = String.valueOf(sum);
                total.setText("Your total is: $" + sumString);
                //alculate.setEnabled(false);
                //JOptionPane.showMessageDialog(InvoiceButton.this, "In order to generate a new invoice, please reopen the window.");
            }
        });
        add(calculate);
        
        ImageIcon javaImage2 = new ImageIcon(getClass().getResource("java2.png"));
        javaLogo2 = new JLabel(javaImage2);
        add(javaLogo2);
        headerLabel3 = new JLabel("java hospital");
        headerLabel3.setFont(new Font("Helvetica", Font.BOLD, 20));
        add(headerLabel3);
        headerLabel4 = new JLabel("Taking care of Jakarta.");
        headerLabel4.setFont(new Font("Helvetica", Font.ITALIC,8));
        add(headerLabel4);
        invoiceTab = new JLabel("MEDICAL INVOICE");
        invoiceTab.setFont(new Font("Helvetica", Font.BOLD, 30));
        add(invoiceTab);
        
        productJList = new JList();
        add(productJList);
        quantityJList = new JList();
        add(quantityJList);
        priceJList = new JList();
        add(priceJList);

        
        //Bounding
        headerLabel.setBounds(35, 25, 200, 50);
        headerLabel2.setBounds(105, 47, 200, 50); 
        javaLogo.setBounds(220,15,50,68);
        invoiceLabel.setBounds(600,30, 200, 50);

        product.setBounds(65,120,150,50);
        quantity.setBounds(325,120,150,50);
        price.setBounds(605,120,150,50);
        
        productScroll.setBounds(55,170,150,240);
        quantityScroll.setBounds(315,170,150,240);
        priceScroll.setBounds(575,170,150,240);
        
        patientLabel.setBounds(80,445,120,50);
        patientName.setBounds(65,485,120,50);
        dateLabel.setBounds(233,445,120,50);
        currentDate.setBounds(215,485,120,50);
        gender.setBounds(10,500,50,20);
        
        calculate.setBounds(455,475,300,60);
        
        javaLogo2.setBounds(960,8,38,52);
        headerLabel3.setBounds(835, 8, 125, 50);
        headerLabel4.setBounds(878, 26, 125, 50); 
        invoiceTab.setBounds(870, 70, 300, 50);
        
        productJList.setBounds(830,125,180,350);
        quantityJList.setBounds(1025,125,50,350);
        priceJList.setBounds(1090,125,80,350);
        
        ImageIcon lineImage = new ImageIcon(getClass().getResource("invoicelayout.png"));
        line = new JLabel(lineImage);
        add(line);
        
        line.setBounds(0,-30,1200,600);
        
    }
}
