/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studentinfo;
import java.sql.ResultSet;
public class Student_info extends javax.swing.JFrame {
    Student obj = new Student();
    /**
     * Creates new form Student_info
     */
    public Student_info() {
        initComponents();
        obj.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        nm = new javax.swing.JTextField();
        db = new javax.swing.JTextField();
        fnm = new javax.swing.JTextField();
        emrk = new javax.swing.JTextField();
        smrk = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        mmrk = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        hmrk = new javax.swing.JTextField();
        ins = new javax.swing.JButton();
        dis = new javax.swing.JButton();
        oper = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("           STUDENT'S DATABSE");

        jTextField2.setText("Roll No.");

        jTextField3.setText("Name");

        jTextField4.setText("Date of birth");

        jTextField5.setText("Father's Name");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setText("English marks");

        jTextField7.setText("Science marks");

        jTextField15.setText("Maths marks");

        jTextField16.setText("Hindi marks");

        ins.setText("INSERT");
        ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insActionPerformed(evt);
            }
        });

        dis.setText("DISPLAY");
        dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disActionPerformed(evt);
            }
        });

        info.setColumns(20);
        info.setRows(5);
        jScrollPane1.setViewportView(info);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oper, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nm, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                        .addComponent(fnm)
                                        .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(db, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ins)
                                            .addComponent(smrk, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emrk, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                                .addComponent(jTextField16))
                                            .addComponent(dis, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mmrk, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                            .addComponent(hmrk))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roll, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nm, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(db, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextField4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fnm, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(emrk)
                    .addComponent(jTextField6)
                    .addComponent(mmrk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hmrk, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextField16)
                    .addComponent(smrk)
                    .addComponent(jTextField7))
                .addGap(18, 18, 18)
                .addComponent(oper, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ins)
                    .addComponent(dis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet rs = obj.display();
            if(rs != null){
                while(rs.next()) {
                    String roll = Integer.toString(rs.getInt(1));
                    String studentname = rs.getString(2);
                    String studentdob = rs.getString(3);
                    String fathername = rs.getString(4);
                    String engmarks = Double.toString(rs.getDouble(5));
                    String mathsmarks = Double.toString(rs.getDouble(6));
                    String scimarks = Double.toString(rs.getDouble(7));
                    String hinmarks = Double.toString(rs.getDouble(8));
                    String d = info.getText() + roll + "\t" + studentname + "\t" +
                        studentdob + "\t" + fathername + "\t" + engmarks + "\t" + 
                        mathsmarks + "\t" + scimarks + "\t" + hinmarks + "\n";
                    info.setText(d);
                }
            } else {
                info.setText("No information available!");
            }
            oper.setText("Displayed successfully!");
        } catch(Exception ex) {
            oper.setText(ex.getMessage());
        }
    }//GEN-LAST:event_disActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void insActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insActionPerformed
        // TODO add your handling code here:
        try {
            obj.insert(Integer.parseInt(roll.getText()),nm.getText(),db.getText(),fnm.getText(),Double.parseDouble(emrk.getText()),Double.parseDouble(mmrk.getText()),Double.parseDouble(smrk.getText()),Double.parseDouble(hmrk.getText()));
            nm.setText(nm.getText());
            db.setText(db.getText());
            fnm.setText(fnm.getText());
            emrk.setText(emrk.getText());
            mmrk.setText(mmrk.getText());
            smrk.setText(smrk.getText());
            hmrk.setText(hmrk.getText());
            oper.setText("Data inserted successfully!");
        }   catch(Exception ex) {
            oper.setText(ex.getMessage());
        }
    }//GEN-LAST:event_insActionPerformed

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
            java.util.logging.Logger.getLogger(Student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField db;
    private javax.swing.JButton dis;
    private javax.swing.JTextField emrk;
    private javax.swing.JTextField fnm;
    private javax.swing.JTextField hmrk;
    private javax.swing.JTextArea info;
    private javax.swing.JButton ins;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField mmrk;
    private javax.swing.JTextField nm;
    private javax.swing.JLabel oper;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField smrk;
    // End of variables declaration//GEN-END:variables
}
