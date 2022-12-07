/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalstoreproject;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ivand
 */
public class InvoiceButton extends JFrame{
    private JLabel headerLabel, headerLabel2, javaLogo, invoiceLabel, product, quantity, price, line, patientLabel, dateLabel, total, invoiceBack, staffNameLabel;
    private JLabel headerLabel3, headerLabel4, javaLogo2, invoiceTab, patientTab, nameInvoice, dateInvoice;
    private JTextField patientName, currentDate;
    private JTextArea productArea, quantityArea, priceArea;
    private JButton calculate, print;
    private JList productJListREAL, quantityJListREAL, priceJListREAL;
    private JComboBox gender;
    private String genderChoice, nameChoice, dateChoice, sumString;
    private JPanel invoicePrint;
    
    String genderList[] = {"Mr. ", "Mrs. "};
    String staffName;

    public void setName(String staffName){
        this.staffName = staffName;
    }
    
    public static BufferedImage getScreenshot(Component component){
        BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
        component.paint(image.getGraphics());
        return image;
    }
    
    public static void SaveScreenShot(Component component, String filename) throws Exception{
        BufferedImage img = getScreenshot(component);
        ImageIO.write(img,"png", new File(filename));
    }
    
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
        
        invoicePrint = new JPanel();
        invoicePrint.setLayout(null);
        add(invoicePrint);
        
        nameInvoice = new JLabel("");
        nameInvoice.setFont(new Font("Helvetica",Font.BOLD,10));
        dateInvoice = new JLabel("");
        dateInvoice.setFont(new Font("Helvetica",Font.PLAIN,10));
        
        invoicePrint.add(dateInvoice);
        invoicePrint.add(nameInvoice);
        nameInvoice.setBounds(255, 12, 205, 50);
        dateInvoice.setBounds(255,24,205,50);
        
        sumString = "";
        total = new JLabel("");
        invoicePrint.add(total);
        total.setBounds(60,480,400,100);       
        total.setFont(new Font("Helvetica",Font.BOLD,20));
        
        print = new JButton("PRINT");
        print.setFont(new Font("Helvetica", Font.BOLD, 25));
        print.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                try{
                    SaveScreenShot(invoicePrint,"invoice.png");
                }
                catch(Exception b){}
            }
            
        });
        add(print);
        
        staffNameLabel = new JLabel("");
        staffNameLabel.setFont(new Font("Helvetica",Font.BOLD,10));
        invoicePrint.add(staffNameLabel);
        staffNameLabel.setBounds(255, 0, 205, 50);
        
        productJListREAL = new JList();
        quantityJListREAL = new JList();
        priceJListREAL = new JList();
        productJListREAL.setFont(new Font("Helvetica",Font.PLAIN,15));
        invoicePrint.add(productJListREAL);       
        quantityJListREAL.setFont(new Font("Helvetica",Font.PLAIN,15));
        invoicePrint.add(quantityJListREAL);  
        priceJListREAL.setFont(new Font("Helvetica",Font.PLAIN,15));
        invoicePrint.add(priceJListREAL);
        
        
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
                
                staffNameLabel.setText("By " + staffName);
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
                
                productJListREAL.setListData(productList);
                quantityJListREAL.setListData(quantityListSTRING);
                priceJListREAL.setListData(priceListTOTALString);
                
                int sum = 0;
                
                for(int i = 0; i < priceListTOTAL.length; i++){
                    sum += priceListTOTAL[i];
                }
                
                sumString = String.format("%,d", sum); 
                total.setText("Your total is: Rp" + sumString);
                //alculate.setEnabled(false);
                //JOptionPane.showMessageDialog(InvoiceButton.this, "In order to generate a new invoice, please reopen the window.");
            }
        });
        add(calculate);
        

                
        productJListREAL.setBounds(15,128,180,350);
        quantityJListREAL.setBounds(210,128,50,350);
        priceJListREAL.setBounds(275,128,80,350);
        
        
        ImageIcon javaImage2 = new ImageIcon(getClass().getResource("java2.png"));
        javaLogo2 = new JLabel(javaImage2);
        invoicePrint.add(javaLogo2);
        headerLabel3 = new JLabel("java hospital");
        headerLabel3.setFont(new Font("Helvetica", Font.BOLD, 20));
        invoicePrint.add(headerLabel3);
        headerLabel4 = new JLabel("Taking care of Jakarta.");
        headerLabel4.setFont(new Font("Helvetica", Font.ITALIC,8));
        invoicePrint.add(headerLabel4);
        invoiceTab = new JLabel("MEDICAL INVOICE");
        invoiceTab.setFont(new Font("Helvetica", Font.BOLD, 30));
        invoicePrint.add(invoiceTab);

        add(invoicePrint);

        
        //Bounding
        invoicePrint.setBounds(816,0,370,560);
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
        
        calculate.setBounds(500,475,300,60);
        print.setBounds(350,475,150,60);
        
        
        javaLogo2.setBounds(140,6,38,52);
        headerLabel3.setBounds(15, 6, 125, 50);
        headerLabel4.setBounds(58, 25, 125, 50); 
        invoiceTab.setBounds(50, 70, 300, 50);
        
        ImageIcon lineImage = new ImageIcon(getClass().getResource("invoicelayout.png"));
        line = new JLabel(lineImage);
        add(line);
        
        line.setBounds(0,-30,1200,600);
        
        ImageIcon invoiceIcon = new ImageIcon(getClass().getResource("invoicePrintbackground.png"));
        invoiceBack = new JLabel(invoiceIcon);
        invoicePrint.add(invoiceBack);
        invoiceBack.setBounds(0,-30,384,600);
        
    }
}
