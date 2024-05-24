
package guicollection;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;


public class GUI_JList3 extends javax.swing.JFrame {
    
    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    String[] datas = {"Buku", "Meja", "Kursi", "Tas", "Pintu"};

    public GUI_JList3() {
        initComponents();
        setTitle("JList3");
        dlm = new DefaultListModel<>();
        jListItem.setModel(dlm);
        
        for(String data : datas){
            dlm.addElement(data);
            updateJumDataTersimpan();
        }
    }
    
    private void addItem(String namaItem){
        dlm.addElement(namaItem);
    }
    
    private void updateJumDataTersimpan(){
        jLabelJumlahData.setText("Data Tersimpan = " + items.size());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldNamaItem = new javax.swing.JTextField();
        jLabelJumlahData = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jButtonClearAll = new javax.swing.JButton();
        jButtonInsertData = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonAddItem = new javax.swing.JButton();
        jButtonSaveData = new javax.swing.JButton();
        jLabelNamaItem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNamaItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldNamaItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 170, 30));

        jLabelJumlahData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(jLabelJumlahData, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 140, 30));

        jScrollPane2.setViewportView(jListItem);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 350));

        jButtonClearAll.setBackground(new java.awt.Color(255, 0, 0));
        jButtonClearAll.setText("Clear");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 100, 30));

        jButtonInsertData.setBackground(new java.awt.Color(153, 255, 153));
        jButtonInsertData.setText("Insert Data");
        jButtonInsertData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonInsertData, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 100, 30));

        jButtonUpdate.setBackground(new java.awt.Color(204, 255, 153));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 100, 30));

        jButtonDelete.setBackground(new java.awt.Color(255, 0, 51));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 100, 30));

        jButtonAddItem.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAddItem.setText("Add");
        jButtonAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddItemActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 100, 30));

        jButtonSaveData.setBackground(new java.awt.Color(102, 153, 255));
        jButtonSaveData.setText("Save Data");
        jButtonSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveDataActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSaveData, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 100, 30));

        jLabelNamaItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNamaItem.setText("Nama Item : ");
        jPanel2.add(jLabelNamaItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonInsertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataActionPerformed
        for(String item : items){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldNamaItem.getText();
        dlm.setElementAt(selected, index);
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt (index);
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddItemActionPerformed
        addItem(jTextFieldNamaItem.getText());
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonAddItemActionPerformed

    private void jButtonSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveDataActionPerformed
        if(!items.isEmpty()){
            items.clear();
        }
        
        for(int i = 0; i < dlm.getSize(); i++){
            items.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonSaveDataActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_JList3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_JList3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_JList3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_JList3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_JList3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddItem;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertData;
    private javax.swing.JButton jButtonSaveData;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelJumlahData;
    private javax.swing.JLabel jLabelNamaItem;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldNamaItem;
    // End of variables declaration//GEN-END:variables
}
