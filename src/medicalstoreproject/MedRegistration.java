/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalstoreproject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Willsen Yogi P
 */
public class MedRegistration extends JFrame{
    private JLabel title, medNameLabel, producedByLabel, expLabel, medIngLabel, sideEffectLabel, batchLabel, ageLabel, deleteLabel;
    private JButton addButton, deleteButton;
    private JTextField nameTF, brandTF, expTF, medIngTF, sideEffectTF, batchTF, deleteTF;
    private JTable table;
    private JComboBox ageBox;
   
    Object[] ageList = {"", "Children Only", "Adult Only", "Both"};
    
    MedRegistration(){
        super("Medicine Registration");
        setLayout(null);
        
        title = new JLabel("Medicine Registration");
        title.setFont(new Font("Helvetica",Font.BOLD,40));
        add(title);
        
        medNameLabel = new JLabel("Medicine Name : ");
        medNameLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        medNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        add(medNameLabel);
        
        producedByLabel = new JLabel("Produced By : ");
        producedByLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        producedByLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        add(producedByLabel);
        
        expLabel = new JLabel("Exp. Date : ");
        expLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        expLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        add(expLabel);
        
        medIngLabel = new JLabel("Medicinal Ingredients : ");
        medIngLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        medIngLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        add(medIngLabel);
        
        sideEffectLabel = new JLabel("Side Effects : ");
        sideEffectLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        sideEffectLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        add(sideEffectLabel);
        
        batchLabel = new JLabel("Batch ID : ");
        batchLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        batchLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        add(batchLabel);
        
        ageLabel = new JLabel("Age : ");
        ageLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        ageLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        add(ageLabel);
        
        ageBox = new JComboBox(ageList);
        add(ageBox);
        
        
        nameTF = new JTextField();
        add(nameTF);
        
        brandTF = new JTextField();
        add(brandTF);
        
        expTF = new JTextField();
        add(expTF);
        
        medIngTF = new JTextField();
        add(medIngTF);
        
        sideEffectTF = new JTextField();
        add(sideEffectTF);
        
        batchTF = new JTextField();
        add(batchTF);
        
        DefaultTableModel tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(table);
        tableModel.addColumn("Medicine Name");
        tableModel.addColumn("Produced By");
        tableModel.addColumn("Exp. Date");
        tableModel.addColumn("Ingredients");
        tableModel.addColumn("Side Effect");
        tableModel.addColumn("BatchID");
        tableModel.addColumn("Adult/Children");
        add(tableScroll);
        
        addButton = new JButton("Register Medicine");
        addButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
        add(addButton);
        
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String newName = nameTF.getText();
                String newProduce = brandTF.getText();
                String newExp = expTF.getText();
                String newIng = medIngTF.getText();
                String newSE = sideEffectTF.getText();
                String newBatch = batchTF.getText();
                String newAge = String.valueOf(ageBox.getSelectedItem());
                
                nameTF.setText("");
                brandTF.setText("");
                expTF.setText("");
                medIngTF.setText("");
                sideEffectTF.setText("");
                batchTF.setText("");
                
                int i = 0;
                tableModel.insertRow(i, new Object[]{newName,newProduce,newExp,newIng,newSE,newBatch,newAge});
               
                if(newName.equals("") || newProduce.equals("") || newExp.equals("") || newIng.equals("") || newSE.equals("") || newBatch.equals("")
                        || newAge.equals("")){
                    JOptionPane.showMessageDialog(MedRegistration.this, "Please enter valid information!");
                    tableModel.removeRow(i);
                }
                 i++;
            }
            
        });
        
        
        deleteLabel = new JLabel("Delete Row :");
        add(deleteLabel);
        deleteTF = new JTextField();
        add(deleteTF);
        deleteButton = new JButton("OK");
        add(deleteButton);
            
            //deleteButton Function
            deleteButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectRow = Integer.valueOf(deleteTF.getText()) - 1; 
                deleteTF.setText("");
                tableModel.removeRow(selectRow);
            }
                
            });
        
        //Bounds Setting
        title.setBounds(190,10,500,50);
        medNameLabel.setBounds(5,70,300,50);
        producedByLabel.setBounds(5,120,300,50);
        expLabel.setBounds(5,170,300,50);
        medIngLabel.setBounds(5,220,300,50);
        sideEffectLabel.setBounds(5,270,300,50);
        batchLabel.setBounds(5,320,300,50);
        ageLabel.setBounds(5,370,300,50);
        ageBox.setBounds(325, 370, 130, 50);
        
        nameTF.setBounds(325,70,400,50);
        brandTF.setBounds(325,120,400,50);
        expTF.setBounds(325,170,400,50);
        medIngTF.setBounds(325,220,400,50);
        sideEffectTF.setBounds(325,270,400,50);
        batchTF.setBounds(325,320,400,50);
        
        addButton.setBounds(150,425,500,50);
        
        tableScroll.setBounds(40,485,700,400);
        
        deleteLabel.setBounds(40, 860, 90, 70);
        deleteTF.setBounds(115,887,40,20);
        deleteButton.setBounds(155,887,80,20);
        
        
    }
}
