/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalstoreproject;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ivand
 */
public class InvoiceButton extends JFrame{
    private JLabel headerLabel, headerLabel2, javaLogo, invoiceLabel, product, quantity, price, line, line2, patientLabel;
    private JTextField patientName;
    private JTextArea productArea, quantityArea, priceArea;
    
    InvoiceButton(){
        super("Invoice");
        setLayout(null);
        
        //Label and Imaging
        ImageIcon lineImage = new ImageIcon(getClass().getResource("line.png"));
        line = new JLabel(lineImage);
        add(line);
        line2 = new JLabel(lineImage);
        add(line2);
        
        ImageIcon javaImage = new ImageIcon(getClass().getResource("java.png"));
        javaLogo = new JLabel(javaImage);
        add(javaLogo);
        headerLabel = new JLabel("java hospital");
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
        add(headerLabel);
        headerLabel2 = new JLabel("Taking care of Jakarta.");
        headerLabel2.setFont(new Font("Helvetica", Font.ITALIC, 10));
        add(headerLabel2);
        
        invoiceLabel = new JLabel("invoice tab");
        invoiceLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
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
        add(patientLabel);
        patientName = new JTextField();
        patientName.setFont(new Font("Helvetica",Font.PLAIN,25));
        add(patientName);
        
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
        
        
        //Bounding
        line.setBounds(0,-30,800,600);
        line2.setBounds(0,300,800,600);
        headerLabel.setBounds(35, 20, 200, 50);
        headerLabel2.setBounds(105, 42, 200, 50); 
        javaLogo.setBounds(220,10,50,68);
        invoiceLabel.setBounds(600, 20, 200, 50);
        
        
        product.setBounds(65,120,150,50);
        quantity.setBounds(325,120,150,50);
        price.setBounds(605,120,150,50);
        
        productScroll.setBounds(55,170,150,240);
        quantityScroll.setBounds(315,170,150,240);
        priceScroll.setBounds(575,170,150,240);
        
        patientLabel.setBounds(80,450,120,50);
        patientName.setBounds(65,500,120,50);
        
        
        
        
    }
}
