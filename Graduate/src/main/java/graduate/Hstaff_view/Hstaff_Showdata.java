package graduate.Hstaff_view;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Hstaff_Showdata extends javax.swing.JFrame {
    public Hstaff_Showdata() {   
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Search = new javax.swing.JButton();
        numfield = new javax.swing.JTextField();
        namefield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        DeleteData_Button = new javax.swing.JButton();
        UpdateData_Button = new javax.swing.JButton();
        NewData_Button = new javax.swing.JButton();
        SearchData_Button = new javax.swing.JButton();
        NumField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        ClassBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ReadFile_Button = new javax.swing.JButton();
        GoBack_Button = new javax.swing.JButton();
        SaveFile_Button = new javax.swing.JButton();
        BornNumberField = new javax.swing.JFormattedTextField();

        jDialog1.setMinimumSize(new java.awt.Dimension(500, 150));

        Search.setText("검  색");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel7.setText("이 름 : ");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numfield, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Search)
                        .addComponent(jLabel7)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTabbedPane1.addTab("학 생", jScrollPane2);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jTabbedPane1.addTab("교 수", jScrollPane3);

        DeleteData_Button.setText("삭  제");
        DeleteData_Button.setEnabled(false);
        DeleteData_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteData_ButtonActionPerformed(evt);
            }
        });

        UpdateData_Button.setText("수  정");
        UpdateData_Button.setEnabled(false);
        UpdateData_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateData_ButtonActionPerformed(evt);
            }
        });

        NewData_Button.setText("등  록");
        NewData_Button.setEnabled(false);
        NewData_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewData_ButtonActionPerformed(evt);
            }
        });

        SearchData_Button.setText("검  색");
        SearchData_Button.setEnabled(false);
        SearchData_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchData_ButtonActionPerformed(evt);
            }
        });

        NumField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NumFieldFocusLost(evt);
            }
        });

        ClassBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택 없음", "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과" }));

        jLabel1.setText("학 번 / 교 번");

        jLabel2.setText("이 름");

        jLabel3.setText("주민등록번호");

        jLabel4.setText("학 과");

        ReadFile_Button.setText("불러오기");
        ReadFile_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadFile_ButtonActionPerformed(evt);
            }
        });

        GoBack_Button.setText("이  전");
        GoBack_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBack_ButtonActionPerformed(evt);
            }
        });

        SaveFile_Button.setText("저  장");
        SaveFile_Button.setEnabled(false);
        SaveFile_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFile_ButtonActionPerformed(evt);
            }
        });

        try {
            BornNumberField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NumField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel2)
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel3)
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(BornNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(ClassBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewData_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteData_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateData_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchData_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReadFile_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GoBack_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveFile_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SaveFile_Button)
                        .addGap(18, 18, 18)
                        .addComponent(GoBack_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BornNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ClassBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchData_Button)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(ReadFile_Button)
                                .addGap(33, 33, 33)
                                .addComponent(NewData_Button)
                                .addGap(33, 33, 33)
                                .addComponent(UpdateData_Button)
                                .addGap(33, 33, 33)
                                .addComponent(DeleteData_Button)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void NewData_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewData_ButtonActionPerformed
       
            if(jScrollPane2.isShowing()==true){
            Object[] row = new Object[5];    
            String BornNumber = BornNumberField.getText();
            String []lastNumber = BornNumber.split("-");

            if(NumField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "학번을 입력하세요.");    
            }
            else if(NameField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "이름을 입력하세요.");     
            }
            else if(BornNumberField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "주민등록번호를 입력하세요.");   
            }
            else if(ClassBox.getSelectedItem().equals("선택 없음")){
                JOptionPane.showMessageDialog(null, "학과를 선택하세요."); 
            }
            else{
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                boolean result = true;
                for(int i=0;i<model.getRowCount();i++){
                   String a = model.getValueAt(i, 1).toString();
                   String b = model.getValueAt(i, 3).toString();
                   if(NumField.getText().equals(a)){
                    JOptionPane.showMessageDialog(null, "이미 존재하는 학번입니다. \n 새로운 학번을 부여하세요.");
                     result = false;
                    break;
                }else if(BornNumberField.getText().equals(b)){
                    JOptionPane.showMessageDialog(null, "이미 존재하는 주민등록번호입니다. \n 다시 확인하세요.");
                     result = false;
                }
                } 
                if(result){
                row[0] = lastNumber[1];
                row[1] = NumField.getText();
                row[2] = NameField.getText();
                row[3] = BornNumberField.getText();
                row[4] = ClassBox.getSelectedItem();
            model.addRow(row);}
            NumField.setText("");
            NameField.setText("");
            BornNumberField.setText("");
            ClassBox.setSelectedItem("선택 없음");
            }
           } 
           if(jScrollPane3.isShowing()==true){
            Object[] row = new Object[5];    
            String BornNumber = BornNumberField.getText();
            String []lastNumber = BornNumber.split("-"); 
            if(NumField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "교번을 입력하세요."); 
            }
            else if(NameField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "이름을 입력하세요.");    
            }
            else if(BornNumberField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "주민등록번호를 입력하세요.");    
            }
            else if(ClassBox.getSelectedItem().equals("선택 없음")){
                JOptionPane.showMessageDialog(null, "학과를 선택하세요.");   
            }
            else{
                 DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
                boolean result = true;
                for(int i=0;i<model.getRowCount();i++){
                   String a = model.getValueAt(i, 1).toString();
                   String b = model.getValueAt(i, 3).toString();
                   if(NumField.getText().equals(a)){
                    JOptionPane.showMessageDialog(null, "이미 존재하는 교번입니다. \n 새로운 학번을 부여하세요.");
                     result = false;
                    break;
                }else if(BornNumberField.getText().equals(b)){
                    JOptionPane.showMessageDialog(null, "이미 존재하는 주민등록번호입니다. \n 다시 확인하세요.");
                     result = false;
                }
                }
                if(result){
            row[0] = lastNumber[1];
            row[1] = NumField.getText();
            row[2] = NameField.getText();
            row[3] = BornNumberField.getText();
            row[4] = ClassBox.getSelectedItem();
            model.addRow(row);}
            NumField.setText("");
            NameField.setText("");
            BornNumberField.setText("");
            ClassBox.setSelectedItem("선택 없음"); 
            }
           }
    }//GEN-LAST:event_NewData_ButtonActionPerformed

    private void ReadFile_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadFile_ButtonActionPerformed
        SearchData_Button.setEnabled(true);
        NewData_Button.setEnabled(true);
        UpdateData_Button.setEnabled(true);
        DeleteData_Button.setEnabled(true);
        SaveFile_Button.setEnabled(true);
        if(jScrollPane2.isShowing()==true){
           try{
               File file = new File("C:\\DB\\login_data\\student_table.txt");
               FileReader filereader = new FileReader(file);
               try (BufferedReader bufReader = new BufferedReader(filereader)) {
                    String firstline = bufReader.readLine().trim();
                    String[] columsName = firstline.split("\t");
                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                    model.setNumRows(0);
                    model.setColumnIdentifiers(columsName);  
                    Object[] tableLines = bufReader.lines().toArray(); 
                    for(int i=0; i< tableLines.length -1;i++){
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
        //////////////////////////////////////////////////////////////
        if(jScrollPane3.isShowing()==true){
        try{
                File file = new File("C:\\DB\\login_data\\professor_table.txt");
                FileReader filereader = new FileReader(file);
                try (BufferedReader bufReader = new BufferedReader(filereader)) {
                    String firstline = bufReader.readLine().trim();
                    String[] columsName = firstline.split("\t");
                    DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
                    model.setNumRows(0);
                    model.setColumnIdentifiers(columsName);
                    Object[] tableLines = bufReader.lines().toArray(); 
                    for(int i=0; i< tableLines.length -1;i++){
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
    }//GEN-LAST:event_ReadFile_ButtonActionPerformed

    private void DeleteData_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteData_ButtonActionPerformed
        if(jScrollPane2.isShowing()==true){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();
        if(i >=0 ){
            model.removeRow(i);
            NumField.setText("");
            NameField.setText("");
            BornNumberField.setText("");
            ClassBox.setSelectedItem("선택 없음");
        }
        else{
            JOptionPane.showMessageDialog(null, "삭제할 데이터가 없습니다.");
        }
        }
        if(jScrollPane3.isShowing()==true){
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int i = jTable2.getSelectedRow();
        if(i >=0 ){
            model.removeRow(i);
            NumField.setText("");
            NameField.setText("");
            BornNumberField.setText("");
            ClassBox.setSelectedItem("선택 없음");
        }
        else{
            JOptionPane.showMessageDialog(null, "삭제할 데이터가 없습니다.");
        }
        }
    }//GEN-LAST:event_DeleteData_ButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();
        NumField.setText(model.getValueAt(i, 1).toString());
        NameField.setText(model.getValueAt(i, 2).toString());
        BornNumberField.setText(model.getValueAt(i, 3).toString());
        ClassBox.setSelectedItem(model.getValueAt(i, 4));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int i = jTable2.getSelectedRow();
        NumField.setText(model.getValueAt(i, 1).toString());
        NameField.setText(model.getValueAt(i, 2).toString());
        BornNumberField.setText(model.getValueAt(i, 3).toString());
        ClassBox.setSelectedItem(model.getValueAt(i, 4));
    }//GEN-LAST:event_jTable2MouseClicked

    private void UpdateData_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateData_ButtonActionPerformed
        if(jScrollPane2.isShowing()==true){
        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        if(i>=0){
            model.setValueAt(NumField.getText(), i, 1);
            model.setValueAt(NameField.getText(), i, 2);
            model.setValueAt(BornNumberField.getText(), i, 3);
            model.setValueAt(ClassBox.getSelectedItem(), i, 4);
            NumField.setText("");
            NameField.setText("");
            BornNumberField.setText("");
            ClassBox.setSelectedItem("선택 없음");
        }
        else{
            JOptionPane.showMessageDialog(null, "수정하실 행을 선택하세요.");
        }
        }
        if(jScrollPane3.isShowing()==true){
            int i = jTable2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        if(i>=0){
            model.setValueAt(NumField.getText(), i, 1);
            model.setValueAt(NameField.getText(), i, 2);
            model.setValueAt(BornNumberField.getText(), i, 3);
            model.setValueAt(ClassBox.getSelectedItem(), i, 4);
            NumField.setText("");
            NameField.setText("");
            BornNumberField.setText("");
            ClassBox.setSelectedItem("선택 없음");
        }
        else{
            JOptionPane.showMessageDialog(null, "수정하실 행을 선택하세요.");
        }
        }
    }//GEN-LAST:event_UpdateData_ButtonActionPerformed

    private void SaveFile_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFile_ButtonActionPerformed
        if(jScrollPane2.isShowing()==true){
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            try{
            File file = new File("C:\\DB\\login_data\\student_table.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            String ob;
            for(int m=0;m<jTable1.getColumnCount();m++)
            { 
               ob = model.getColumnName(m);
               bw.write(ob+"\t");  
            }
            bw.write("\n");
            for(int i = 0; i<jTable1.getRowCount();i++){
                for(int j = 0;j<jTable1.getColumnCount();j++){
                    bw.write(jTable1.getModel().getValueAt(i, j)+"\t");
                }
                bw.write("\n");
            }
            bw.write("****");
            bw.close();
            fw.close(); 
            JOptionPane.showMessageDialog(null, "데이터가 저장되었습니다.");
            NumField.setText("");
            NameField.setText("");
            BornNumberField.setText("");
            ClassBox.setSelectedItem("선택 없음");
        }catch(IOException ex){
            System.out.println(ex);
        }
        }
        if(jScrollPane3.isShowing()==true){
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            try{
            File file = new File("C:\\DB\\login_data\\professor_table.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            String ob;
            for(int m=0;m<jTable2.getColumnCount();m++)
            { 
               ob = model.getColumnName(m);
               bw.write(ob+"\t");  
            }
            bw.write("\n");
            for(int i = 0; i<jTable2.getRowCount();i++){
                for(int j = 0;j<jTable2.getColumnCount();j++){
                    bw.write(jTable2.getModel().getValueAt(i, j)+"\t");
                }
                bw.write("\n");
            }
            bw.write("****");
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null, "데이터가 저장되었습니다.");
            NumField.setText("");
            NameField.setText("");
            BornNumberField.setText("");
            ClassBox.setSelectedItem("선택 없음");
        }catch(IOException ex){
            System.out.println(ex);
        }
        }
    }//GEN-LAST:event_SaveFile_ButtonActionPerformed

    private void GoBack_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBack_ButtonActionPerformed
        Hstaff_firstview s = new Hstaff_firstview();
            s.setVisible(true);
            dispose();
    }//GEN-LAST:event_GoBack_ButtonActionPerformed

    private void SearchData_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchData_ButtonActionPerformed
            if(jScrollPane2.isShowing()==true){
                jLabel6.setText("학 번 : ");
                jLabel5.setText("검색하실 학번이나 이름을 입력하세요.");
            }
            else{
                jLabel6.setText("교 번 : ");
                jLabel5.setText("검색하실 교번이나 이름을 입력하세요.");
            }
        
            numfield.setText("");
            namefield.setText("");
            jDialog1.setVisible(true);
    }//GEN-LAST:event_SearchData_ButtonActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
         if(jScrollPane2.isShowing()==true){ 
             boolean status = false;
            if(namefield.getText().equals("")&&numfield.getText().equals("")){
                JOptionPane.showMessageDialog(null, "학번이나 이름을 입력하세요.");
            }
            else if(!namefield.getText().equals("")&&!numfield.getText().equals("")){
                for(int i=0;i<jTable1.getRowCount();i++){
                    String str = jTable1.getValueAt(i, 1).toString();
                    String strn = jTable1.getValueAt(i, 2).toString();
                    if(numfield.getText().equals(str)&&namefield.getText().equals(strn)){
                        jTable1.changeSelection(i, 1, false, false);
                        status = true;
                                jDialog1.setVisible(false);
                        break;
                    }
                }
                 if(!status){
                        JOptionPane.showMessageDialog(null, "일치하는 항목이 없습니다.");
                    }
            }
            else if(!numfield.getText().equals("")){
                    for(int i=0;i<jTable1.getRowCount();i++){
                    String str = jTable1.getValueAt(i, 1).toString();
                    if(numfield.getText().equals(str)){
                        jTable1.changeSelection(i, 1, false, false);
                        status = true;
                                jDialog1.setVisible(false);
                        break;
                    }
                }
                    if(!status){
                        JOptionPane.showMessageDialog(null, "일치하는 항목이 없습니다.");
                    }
                    
            }else if(!namefield.getText().equals("")){
                    for(int i=0;i<jTable1.getRowCount();i++){
                        String str = jTable1.getValueAt(i, 2).toString();
                    
                        if(namefield.getText().equals(str)){
                            jTable1.changeSelection(i, 2, false, false);
                            status = true;
                            jDialog1.setVisible(false);
                            break;
                        }
                    }
                    if(!status){
                        JOptionPane.showMessageDialog(null, "일치하는 항목이 없습니다.");
                    }
                }

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int j = jTable1.getSelectedRow();
        if(j>=0){
        NumField.setText(model.getValueAt(j, 1).toString());
        NameField.setText(model.getValueAt(j, 2).toString());
        BornNumberField.setText(model.getValueAt(j, 3).toString());
        ClassBox.setSelectedItem(model.getValueAt(j, 4));
        }
        }
         else{
             boolean status = false;
             
            if(namefield.getText().equals("")&&numfield.getText().equals("")){
                JOptionPane.showMessageDialog(null, "교번이나 이름을 입력하세요.");
            }
            else if(!namefield.getText().equals("")&&!numfield.getText().equals("")){
                for(int i=0;i<jTable2.getRowCount();i++){
                    String str = jTable2.getValueAt(i, 1).toString();
                    String strn = jTable2.getValueAt(i, 2).toString();
                    if(numfield.getText().equals(str)&&namefield.getText().equals(strn)){
                        jTable2.changeSelection(i, 1, false, false);
                        status = true;
                                jDialog1.setVisible(false);
                        break;
                    }
                }
                 if(!status){
                        JOptionPane.showMessageDialog(null, "일치하는 항목이 없습니다.");
                    }
            }
            else if(!numfield.getText().equals("")){
                    for(int i=0;i<jTable2.getRowCount();i++){
                    String str = jTable2.getValueAt(i, 1).toString();
                    if(numfield.getText().equals(str)){
                        jTable2.changeSelection(i, 1, false, false);
                        status = true;
                                jDialog1.setVisible(false);
                        break;
                    }
                }
                    if(!status){
                        JOptionPane.showMessageDialog(null, "일치하는 항목이 없습니다.");
                    }
                    
            }else if(!namefield.getText().equals("")){
                    for(int i=0;i<jTable2.getRowCount();i++){
                        String str = jTable2.getValueAt(i, 2).toString();
                    
                        if(namefield.getText().equals(str)){
                            jTable2.changeSelection(i, 2, false, false);
                            status = true;
                            jDialog1.setVisible(false);
                            break;
                        }
                    }
                    if(!status){
                        JOptionPane.showMessageDialog(null, "일치하는 항목이 없습니다.");
                    }
                }

        DefaultTableModel modeln = (DefaultTableModel)jTable2.getModel();
        int j = jTable2.getSelectedRow();
        if(j>=0){
        NumField.setText(modeln.getValueAt(j, 1).toString());
        NameField.setText(modeln.getValueAt(j, 2).toString());
        BornNumberField.setText(modeln.getValueAt(j, 3).toString());
        ClassBox.setSelectedItem(modeln.getValueAt(j, 4));
        }
         }
    }//GEN-LAST:event_SearchActionPerformed

    private void NumFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumFieldFocusLost
        if(jScrollPane2.isShowing()==true){
            if(!NumField.getText().contains("S")){
                JOptionPane.showMessageDialog(null, "학번은 S를 포함한 숫자 3자리 입니다.");
                NumField.setText("");
            }
            else if(NumField.getText().length() != 4){
                JOptionPane.showMessageDialog(null, "학번은 S를 포함한 숫자 3자리 입니다.");
                NumField.setText("");
            }
        }
        else if(jScrollPane3.isShowing()==true){
            if(!NumField.getText().contains("P")){
                JOptionPane.showMessageDialog(null, "교번은 P를 포함한 숫자 3자리 입니다.");
                NumField.setText("");
            }
            else if(NumField.getText().length() != 4){
                JOptionPane.showMessageDialog(null, "교번은 P를 포함한 숫자 3자리 입니다.");
                NumField.setText("");
            }
        }
    }//GEN-LAST:event_NumFieldFocusLost
  
    
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
            java.util.logging.Logger.getLogger(Hstaff_Showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hstaff_Showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hstaff_Showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hstaff_Showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField BornNumberField;
    private javax.swing.JComboBox<String> ClassBox;
    private javax.swing.JButton DeleteData_Button;
    private javax.swing.JButton GoBack_Button;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton NewData_Button;
    public javax.swing.JTextField NumField;
    public javax.swing.JButton ReadFile_Button;
    private javax.swing.JButton SaveFile_Button;
    private javax.swing.JButton Search;
    private javax.swing.JButton SearchData_Button;
    private javax.swing.JButton UpdateData_Button;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField numfield;
    // End of variables declaration//GEN-END:variables
}
