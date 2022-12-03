/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalstoreproject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivand
 */
public class AppointmentButton extends JFrame {
    private JLabel name, doctor, date, reason, mobile, title, deleteLabel;
    private JTextField nameField, doctorField, dateField, reasonField, mobileField, deleteTF;
    private JButton add, deleteButton;
    String column[] = {"NAME", "DOCTOR", "DATE", "REASON", "MOBILE"};
    String data[][] = {{"Ivander", "Gavriel", "3 December 2022", "Pneumonia", "081377758897"}};
    private JTable table;
    int i = 8;
    
    AppointmentButton(){
        super("Doctor's Appointment List");
        setLayout(null);
        
        title = new JLabel("Appointment List");
        title.setFont(new Font("Helvetica",Font.BOLD,40));
        add(title);
        
        name = new JLabel("Enter Patient Name = ");
        name.setFont(new Font("Helvetica", Font.PLAIN, 20));
        name.setHorizontalAlignment(SwingConstants.RIGHT);
        add(name);
        doctor = new JLabel("Enter Doctor Name = ");
        doctor.setFont(new Font("Helvetica", Font.PLAIN, 20));
        doctor.setHorizontalAlignment(SwingConstants.RIGHT);
        add(doctor);
        date = new JLabel("Enter Date = ");
        date.setFont(new Font("Helvetica", Font.PLAIN, 20));
        date.setHorizontalAlignment(SwingConstants.RIGHT);
        add(date);
        reason = new JLabel("Enter Reason = ");
        reason.setFont(new Font("Helvetica", Font.PLAIN, 20));
        reason.setHorizontalAlignment(SwingConstants.RIGHT);
        add(reason);
        mobile = new JLabel("Enter Patient Mobile Number = ");
        mobile.setFont(new Font("Helvetica", Font.PLAIN, 20));
        mobile.setHorizontalAlignment(SwingConstants.RIGHT);
        add(mobile);
        
        nameField = new JTextField();
        add(nameField);
        doctorField = new JTextField();
        add(doctorField);
        dateField = new JTextField();
        add(dateField);
        reasonField = new JTextField();
        add(reasonField);
        mobileField = new JTextField();
        add(mobileField);
        
        /*
        table = new JTable(data,column);
        JScrollPane tableScroll = new JScrollPane(table);
        add(tableScroll);
*/
        DefaultTableModel tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(table);
        tableModel.addColumn("NAME");
        tableModel.addColumn("DOCTOR");
        tableModel.addColumn("DATE");
        tableModel.addColumn("REASON");
        tableModel.addColumn("MOBILE");
        tableModel.insertRow(0, new Object[] {"Ivander", "Dr. Gavriel Joseph Lim","3 December 2022","Pneumonia Concerns","081377758897"});
        tableModel.insertRow(1, new Object[] {"Gang Shih", "Dr. Willsen Yogi Prasetia","4 December 2022","Heart Problems","082175473478"});
        tableModel.insertRow(2, new Object[] {"Chung Teng", "Dr. Gavriel Joseph Lim","6 December 2022","Chronic Headache","081258327555"});
        tableModel.insertRow(3, new Object[] {"Heng Wu", "Dr. Ivander","7 December 2022","Back Problems","081327348234"});
        tableModel.insertRow(4, new Object[] {"Cui Hsu", "Dr. Da-Xia Tao","9 December 2022","Steroid Consultation","082234213446"});
        tableModel.insertRow(5, new Object[] {"Yue Ying Tseng", "Dr. Asep","13 December 2022","Unknown Knee Joint Pain","081300965904"});
        tableModel.insertRow(6, new Object[] {"Lin Ch'iu", "Dr. Chyou Kao","13 December 2022","Chronic Headache","081234343463"});
        tableModel.insertRow(7, new Object[] {"Lian Tai", "Dr. Tokek","15 December 2022","Psychological Consultation","085473829465"});
        add(tableScroll);
        
        
        add = new JButton("Add New Appointment");
        add.setFont(new Font("Helvetica", Font.PLAIN, 30));
        add(add);
        
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                String newName = nameField.getText();
                String newDoctor = doctorField.getText();
                String newDate = dateField.getText();
                String newReason = reasonField.getText();
                String newMobile = mobileField.getText();
                
                tableModel.insertRow(i, new Object[]{newName,newDoctor,newDate,newReason,newMobile});
                
                nameField.setText("");
                doctorField.setText("");
                dateField.setText("");
                reasonField.setText("");
                mobileField.setText("");
                
                if(newName.equals("") || newDoctor.equals("") || newDate.equals("") || newReason.equals("") || newMobile.equals("")){
                    JOptionPane.showMessageDialog(AppointmentButton.this, "Please enter valid information!");
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
        
        //Bounding
        title.setBounds(250,10,500,50);
        
        name.setBounds(5,70,300,50);
        doctor.setBounds(5,120,300,50);
        date.setBounds(5,170,300,50);
        reason.setBounds(5,220,300,50);
        mobile.setBounds(5,270,300,50);
        
        nameField.setBounds(325,70,400,50);
        doctorField.setBounds(325,120,400,50);
        dateField.setBounds(325,170,400,50);
        reasonField.setBounds(325,220,400,50);
        mobileField.setBounds(325,270,400,50);
        add.setBounds(150,335,500,50);
        tableScroll.setBounds(40,400,700,325);
        
        deleteLabel.setBounds(40, 705, 90, 70);
        deleteTF.setBounds(115,732,40,20);
        deleteButton.setBounds(155,732,80,20);
        
        
    }
    
}
