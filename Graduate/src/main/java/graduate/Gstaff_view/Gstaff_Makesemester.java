/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduate.Gstaff_view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rlarl
 */
public class Gstaff_Makesemester extends javax.swing.JFrame {

    /**
     * Creates new form Gstaff_MakeSemester
     */
    public Gstaff_Makesemester() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Make_Button = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        Add_Button = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Make_Button.setText("?????? ??????");
        Make_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Make_ButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "1 ??????", "2 ??????" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setName(""); // NOI18N
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "?????? ??????", "????????????", "???????????????", "???????????????", "???????????????", "?????????????????????" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel1.setText("??????");

        jTextField1.setEditable(false);

        jLabel2.setText("?????? ?????? : ");

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jLabel3.setText("?????? : ");

        jLabel4.setText("?????? ?????? : ");

        jTextField5.setEditable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setText("?????? ?????? : ");

        jLabel6.setText("?????? ?????? : ");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----" }));

        jLabel7.setText("?????? ?????? ?????? : ");

        Add_Button.setText("???  ???");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });

        jButton3.setText("???  ???");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("???  ???");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Make_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Add_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Make_Button)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add_Button)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void Make_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Make_ButtonActionPerformed
       String year = jTextField2.getText();
       String hacgi = jComboBox1.getSelectedItem().toString();
       String Class = jComboBox2.getSelectedItem().toString();
        
        
        try{
               File file = new File("C:\\DB\\Class\\AllClass.txt");
               FileReader filereader = new FileReader(file);
               try (BufferedReader bufReader = new BufferedReader(filereader)) {
                    String firstline = bufReader.readLine().trim();
                    String[] columsName = firstline.split("\t");
                    
                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                    model.setNumRows(0);
                    model.setColumnIdentifiers(columsName);

                    Object[] tableLines = bufReader.lines().toArray(); 
                    for(int i=0; i< tableLines.length;i++){
                        String line=tableLines[i].toString().trim();
                        if(line.contains(jComboBox2.getSelectedItem().toString())){
                            String[] dataRow = line.split("\t");
                            model.addRow(dataRow);
                    }
                    }
                    filereader.close();
                  bufReader.close();
                }
            }catch (FileNotFoundException e){
                System.out.println(e);
            }catch(IOException e){
                System.out.println(e);
            }
        
        if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "?????? ????????? ????????? ?????????.");
        }
        else if(jComboBox1.getSelectedItem().equals("----")){
            JOptionPane.showMessageDialog(null, "?????? ????????? ????????? ?????????.");
        }
        else if(jComboBox2.getSelectedItem().equals("?????? ??????")){
            JOptionPane.showMessageDialog(null, "?????? ????????? ????????? ?????????.");
        }
        else{
        File newfile = new File("C:\\DB\\Class\\"+Class+" "+year+"??????"+" "+hacgi);
      
    if (newfile.mkdir()){

      JOptionPane.showMessageDialog(null, "????????? ?????? ???????????????.");
      File file1 = new File("C:\\DB\\Class\\"+Class+" "+year+"??????"+" "+hacgi+"\\allclass.txt");
            if(!file1.exists()){
                try {
                    file1.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Gstaff_Makesemester.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

    }else{

      JOptionPane.showMessageDialog(null, "?????? ????????? ???????????????.");
    }
    
    
        }
        
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
         String ob = "????????????;????????????;?????????;????????????;??????????????????;????????????;";
         
         for(int m=0;m<6;m++)
            { 
                String[] str = ob.split(";");
               model.setColumnIdentifiers(str);
                
            }
         ReadFile();
         jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
         
         
    }//GEN-LAST:event_Make_ButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();
        jTextField5.setText(model.getValueAt(i, 3).toString());
        jTextArea1.setText(model.getValueAt(i, 5).toString());
        jTextField4.setText(model.getValueAt(i, 4).toString());
        String m = model.getValueAt(i, 2).toString();
        String n = m.substring(1);
        jTextField3.setText(n);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        jComboBox3.removeAllItems();
        jComboBox3.addItem("----");
        if(jComboBox2.getSelectedItem().equals("?????? ??????")){
            jTextField1.setText("");
        }
        else if(jComboBox2.getSelectedItem().equals("????????????")){
            jTextField1.setText("A");
        }
        else if(jComboBox2.getSelectedItem().equals("???????????????")){
            jTextField1.setText("B");
        }
        else if(jComboBox2.getSelectedItem().equals("???????????????")){
            jTextField1.setText("C");
        }
        else if(jComboBox2.getSelectedItem().equals("???????????????")){
            jTextField1.setText("D");
        }
        else{
            jTextField1.setText("E");
        }
        try{
               File file = new File("C:\\DB\\login_data\\professor_table.txt");
               FileReader filereader = new FileReader(file);
               try (BufferedReader bufReader = new BufferedReader(filereader)) {
                    Object[] tableLines = bufReader.lines().toArray(); 
                    for(int i=0; i< tableLines.length;i++){
                        String line=tableLines[i].toString().trim();
                        if(line.contains(jComboBox2.getSelectedItem().toString())){
                            String[] dataRow = line.split("\t");
                            jComboBox3.insertItemAt(dataRow[2], jComboBox3.getItemCount());       
                        }
                    }
                    filereader.close();
                  bufReader.close();
                }
            }catch (FileNotFoundException e){
                System.out.println(e);
            }catch(IOException e){
                System.out.println(e);
            }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Gstaff_firstview g = new Gstaff_firstview();
        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
         DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
         String year = jTextField2.getText();
         String hacgi = jComboBox1.getSelectedItem().toString();
         String Class = jComboBox2.getSelectedItem().toString();
         String classname = jTextField5.getText();
         Object[] row = new Object[6];    
            if(jComboBox3.getSelectedItem().equals("----")){
                JOptionPane.showMessageDialog(null, "??????????????? ???????????????.");    
            }
            else if(jTextField6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "?????? ?????? ????????? ???????????????.");     
            }
            else{
                DefaultTableModel model1 = (DefaultTableModel)jTable2.getModel();
                boolean result = true;
                for(int i=0;i<model1.getRowCount();i++){
                   String a = model1.getValueAt(i, 0).toString();
                   System.out.println(a);
                   if(a.equals(jTextField1.getText()+jTextField3.getText())){
                    JOptionPane.showMessageDialog(null, "?????? ???????????? ???????????????.");
                     result = false;
                      break;
                   }
                   }
                if(result){
                    String a = jTextField6.getText();
                row[0] = jTextField1.getText()+jTextField3.getText();
                row[1] = jTextField5.getText();
                row[2] = jTextField4.getText();
                row[3] = jComboBox3.getSelectedItem();
                row[4] = a+"/"+a;
                row[5] = jTextArea1.getText();
            model.addRow(row);
            jTextField3.setText("");
            jTextField5.setText("");
            jTextField4.setText("");
            jComboBox3.setSelectedItem("---");
            jTextField6.setText("");
            jTextArea1.setText("");
            SaveFile();
            }
            
            int a = jTable1.getSelectedRow();
            String c = jTable1.getValueAt(a, 2).toString();
            File file = new File("C:\\DB\\Class\\AllClass.txt");		
		String dummy = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                        String line;
                        while(true){
                        line = br.readLine(); //????????? ??????
			
                        if(line.contains(c)){
                            break;
                        }
                        dummy += (line + "\r\n" );
                        }
                        dummy += ("O"+"\t");
                        for(int j =1; j<jTable1.getColumnCount();j++){
                            dummy += (jTable1.getValueAt(a, j)+"\t");
                        }
                        dummy += "\n";
                        while((line = br.readLine())!=null) {
				dummy += (line + "\r\n" ); 
			}
                        FileWriter fw = new FileWriter("C:\\DB\\Class\\AllClass.txt");

			fw.write(dummy);			
			fw.close();
			br.close();
		} catch (IOException e) {
		}
                }
            try{
            File file = new File("C:\\DB\\Class\\"+Class+" "+year+"??????"+" "+hacgi+"\\"+classname+".txt");
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(IOException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int i = jTable2.getSelectedRow();
        if(i >=0 ){
            model.removeRow(i);
            jTextField3.setText("");
            jTextField5.setText("");
            jTextField4.setText("");
            jComboBox3.setSelectedItem("---");
            jTextField6.setText("");
            jTextArea1.setText("");
            SaveFile();
        }
        else{
            JOptionPane.showMessageDialog(null, "????????? ???????????? ????????????.");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed
public void SaveFile(){
        String year = jTextField2.getText();
        String hacgi = jComboBox1.getSelectedItem().toString();
        String Class = jComboBox2.getSelectedItem().toString();
            try{
            File file = new File("C:\\DB\\Class\\"+Class+" "+year+"??????"+" "+hacgi+"\\allclass.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i<jTable2.getRowCount();i++){
                for(int j = 0;j<jTable2.getColumnCount();j++){
                    bw.write(jTable2.getModel().getValueAt(i, j)+"\t");
                }
                bw.write("\n");
            }
            bw.close();
            fw.close(); 
          
        }catch(IOException ex){
            System.out.println(ex);
        }
    }

public void ReadFile(){
        String year = jTextField2.getText();
        String hacgi = jComboBox1.getSelectedItem().toString();
        String Class = jComboBox2.getSelectedItem().toString();
     try{
               File file = new File("C:\\DB\\Class\\"+Class+" "+year+"??????"+" "+hacgi+"\\allclass.txt");
               FileReader filereader = new FileReader(file);
               try (BufferedReader bufReader = new BufferedReader(filereader)) {
                    DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
                    model.setNumRows(0);
                    Object[] tableLines = bufReader.lines().toArray(); 
                    for(int i=0; i< tableLines.length;i++){
                        String line=tableLines[i].toString().trim();
                        String[] dataRow = line.split("\t");
                        model.addRow(dataRow);
                    }
                    filereader.close();
                  bufReader.close();
                }
            }catch (FileNotFoundException e){
                System.out.println(e);
            }catch(IOException e){
                System.out.println(e);
            }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gstaff_Makesemester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gstaff_Makesemester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gstaff_Makesemester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gstaff_Makesemester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gstaff_Makesemester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Make_Button;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables


}
