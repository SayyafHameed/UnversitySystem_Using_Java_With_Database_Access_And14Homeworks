/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myuniversty;

import java.awt.ComponentOrientation;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author SCC
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    int choose;
    Connection con=null;
    PreparedStatement com=null;
    ResultSet rst=null; 
    public Doctor() {
        initComponents();
        RightToLeft();
        choose=MainMenu.chD;
        
        if(choose==2){
        this.setTitle("تعديل دكتور");
//         addAndUpdateAndDelete.setaddAndUpdateAndDelete(new UpdateS("تعديل"));
                 name.setEnabled(false);
                 address.setEnabled(false);
                 mobile.setEnabled(false);
                 male.setEnabled(false);
                 fmale.setEnabled(false);    
        }else if(choose==3){
                this.setTitle("حذف دكتور");
//         addAndUpdateAndDelete.setaddAndUpdateAndDelete(new UpdateS("تعديل"));
                 name.setEnabled(false);
                 address.setEnabled(false);
                 mobile.setEnabled(false);
                 male.setEnabled(false);
                 fmale.setEnabled(false);      
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        fmale = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        addAndUpdateAndDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("أضافة دكتور");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("رقم التعريف ");

        id.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("اسم الدكتور");

        name.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("العنوان");

        address.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("رقم الجوال");

        mobile.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("الجنس");

        male.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 153));
        male.setText("ذكر");

        fmale.setBackground(new java.awt.Color(0, 51, 51));
        buttonGroup1.add(fmale);
        fmale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fmale.setForeground(new java.awt.Color(255, 255, 153));
        fmale.setText("أنثى");
        fmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmaleActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("خروج");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        addAndUpdateAndDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addAndUpdateAndDelete.setText("أضافة");
        addAndUpdateAndDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAndUpdateAndDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4)))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(male))
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fmale)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addAndUpdateAndDelete)
                        .addGap(72, 72, 72))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fmale)
                    .addComponent(male))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(addAndUpdateAndDelete))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(381, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmaleActionPerformed

    private void addAndUpdateAndDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAndUpdateAndDeleteActionPerformed
        // TODO add your handling code here:
        if(choose==1){
          Insert();
          
        }else if(choose==2){
            Update();
        }else{
            Delete();
        }
        
    }//GEN-LAST:event_addAndUpdateAndDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAndUpdateAndDelete;
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fmale;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables

    private void RightToLeft() {
    id.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
     name.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
      mobile.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       address.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        male.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         fmale.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }

    private void Insert() {
  String miss = "لقد نسيك ادخال البيانات التاليه"+"\n";
      if(id.getText().equals("")){
          miss+="رقم التعريف"+"\n";
      }
      if(name.getText().equals("")){
          miss+="اسم الدكتور"+"\n";
      }
      if(mobile.getText().equals("")){
          miss+="رقم الجوال"+"\n";
      }
      if(address.getText().equals("")){
          miss+="العنوان"+"\n";
      }
      
        if(!male.isSelected()&&!fmale.isSelected()){
          miss+="الجنس"+"\n";
      }
        String ge=male.getText();
        if(fmale.isSelected()){
            ge=fmale.getText();
        }
        if(!id.getText().equals("")&&!name.getText().equals("")&&!address.getText().equals("")&&!mobile.getText().equals("")&&(male.isSelected()||fmale.isSelected())){
      try {
          con = ConnectionDataBase.Connet();
          com=con.prepareStatement("select*from Doctor where id='"+Integer.parseInt(id.getText())+"'");
          rst=com.executeQuery();
          
          if(!rst.next()){ 
           com = con.prepareStatement("Insert into Doctor values('"+Integer.parseInt(id.getText())+"','"+name.getText()+"','123456','"+address.getText()+"','"+mobile.getText()+"''"+ge+"')"); 
           com.execute();
           JOptionPane.showMessageDialog(null, "تم اضافة الدكتور بنجاح","تمت الاضافة",JOptionPane.INFORMATION_MESSAGE);
           Clear();
          }else{
          JOptionPane.showMessageDialog(null, "رقم الدكتور موجود مسبقا","موجود",2);    
          }
      } catch (SQLException ex) {
          
      }finally{
          try {
              con.close();
          } catch (Exception e) {
          }
      }
    }else{
            JOptionPane.showMessageDialog(null,miss,"فقد بيانات ",2);
        }
    }

    private void Update() {
     String miss = "لقد نسيك ادخال البيانات التاليه"+"\n";
     
      if(name.getText().equals("")){
          miss+="اسم الدكتور"+"\n";
      }
      if(mobile.getText().equals("")){
          miss+="رقم الجوال"+"\n";
      }
      if(address.getText().equals("")){
          miss+="العنوان"+"\n";
      }
      
        if(!male.isSelected()&&!fmale.isSelected()){
          miss+="الجنس"+"\n";
      }
        if(!name.getText().equals("")&&!address.getText().equals("")&&!mobile.getText().equals("")&&(male.isSelected()||fmale.isSelected())){
        
    }else{
            JOptionPane.showMessageDialog(null,miss,"فقد بيانات ",2);
        }    
    }

    private void Delete() {
     String miss = "لقد نسيك ادخال البيانات التاليه"+"\n";
      if(id.getText().equals("")){
          miss+="رقم التعريف"+"\n";
      }
     
        if(!id.getText().equals("")){
         try {
          con = ConnectionDataBase.Connet();
          com=con.prepareStatement("select*from Doctor where id='"+Integer.parseInt(id.getText())+"'");
          rst=com.executeQuery();
          
          if(!rst.next()){ 
              
          }else{
          JOptionPane.showMessageDialog(null, "رقم الدكتور موجود مسبقا","موجود",2);    
          }
      } catch (SQLException ex) {
          
      }finally{
          try {
              con.close();
          } catch (Exception e) {
          }
      }
    }else{
            JOptionPane.showMessageDialog(null,miss,"فقد بيانات ",2);
        }  
    }

    private void Clear() {
    id.setText("");
    name.setText("");
    mobile.setText("");
    address.setText("");
    
    }
}
