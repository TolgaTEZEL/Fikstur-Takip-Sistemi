/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proje;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class TakimOlusturma extends javax.swing.JFrame {

    Connection con;
    static DefaultTableModel dtm = new DefaultTableModel();

    /**
     * Creates new form TakimOlusturma
     */
    public TakimOlusturma() {
        initComponents();

        dtm.setRowCount(0);
        dtm.setColumnIdentifiers(new String[]{"Takım Id", "Takım Adı"});
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement s = con.createStatement();
            String sql = "SELECT * FROM takimlar";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt("takim_id"), (rs.getString("takim_adi"))});
            }
        } catch (SQLException ex) {
            Logger.getLogger(TakimOlusturma.class.getName()).log(Level.SEVERE, null, ex);

        }

        tbl_takimlar.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_adi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_takimlar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Takım ID:");

        jLabel2.setText("Takım Adı:");

        tbl_takimlar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_takimlar);

        jButton1.setText("Takım Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Takım Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Takım Düzelt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Takım Yazdırma");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Fikstüre Git");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ana Menüye dön");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel3.setText("Kayıt Adı");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_adi, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton4))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(71, 71, 71))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String takimAdi = null;
        int takimID1 = Integer.parseInt(String.valueOf(dtm.getValueAt(tbl_takimlar.getSelectedRow(), 0)));

        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            PreparedStatement prepStateSorgu = con.prepareStatement("SELECT * FROM TAKIMLAR WHERE TAKIM_ID=? ");
            prepStateSorgu.setInt(1, takimID1);
            ResultSet result = prepStateSorgu.executeQuery();
            if (result.next()) {
                takimAdi = result.getString("TAKIM_ADI");

            }

            PreparedStatement prepState = con.prepareStatement("DELETE FROM PUANTABLO WHERE TAKIM_ADI=?");
            prepState.setString(1, takimAdi);

            prepState.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TakimOlusturma.class.getName()).log(Level.SEVERE, null, ex);
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BP2_PROJEMPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("DELETE FROM Takimlar t WHERE t.takimId=:tid");
        q.setParameter("tid", takimID1);

        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();
        dtm.removeRow(tbl_takimlar.getSelectedRow());
        em.close();
        emf.close();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String takimAd = String.valueOf(dtm.getValueAt(tbl_takimlar.getSelectedRow(), 1));
        int takimID1 = Integer.parseInt(String.valueOf(dtm.getValueAt(tbl_takimlar.getSelectedRow(), 0)));
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BP2_PROJEMPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("UPDATE Takimlar t SET  t.takimAdi=:tAd, t.takimId=:tyeniid WHERE t.takimId=:teskiid");
        q.setParameter("teskiid", takimID1);
        q.setParameter("tAd", txt_adi.getText());
        q.setParameter("tyeniid", Integer.parseInt(txt_id.getText()));
        dtm.setValueAt(txt_id.getText().toString(), tbl_takimlar.getSelectedRow(), 0);
        dtm.setValueAt(txt_adi.getText().toString(), tbl_takimlar.getSelectedRow(), 1);
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();

        em.close();
        emf.close();
        
         Connection con;
        try {
            String takimAd1=null;
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

        

            PreparedStatement prepState = con.prepareStatement("UPDATE PUANTABLO SET TAKIM_ADI=? WHERE TAKIM_ADI=?");
            prepState.setString(1, txt_adi.getText());
            prepState.setString(2, takimAd);

            prepState.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TakimOlusturma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {

            File file = new File("C:\\FutbolFederasyonu\\" + jTextField1.getText() + ".txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < tbl_takimlar.getRowCount(); i++) {

                for (int j = 0; j < tbl_takimlar.getColumnCount(); j++) {
                    bw.write(tbl_takimlar.getModel().getValueAt(i, j) + " ");
                }

                bw.write("\n");
                bw.newLine();
            }

            bw.close();

            fw.close();
            JOptionPane.showMessageDialog(null, "Takımlar başarıyla yazıldı. ");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Fikstur f = new Fikstur();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("BP2_PROJEMPU");
            EntityManager em = emf.createEntityManager();

            Takimlar h = new Takimlar();
            h.setTakimId(Integer.parseInt(txt_id.getText()));
            h.setTakimAdi(txt_adi.getText());
            em.getTransaction().begin();
            em.persist(h);
            em.getTransaction().commit();

            dtm.addRow(new String[]{txt_id.getText(), txt_adi.getText()});
            txt_id.setText(null);
            txt_adi.setText(null);

            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            PreparedStatement prep = con.prepareStatement("INSERT INTO PUANTABLO  (TAKIM_ADI,PUAN) VALUES (?,?)");
            prep.setString(1, h.getTakimAdi());
            prep.setInt(2, 0);

            prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TakimOlusturma.class.getName()).log(Level.SEVERE, null, ex);

        } catch (RollbackException ex1) {
            JOptionPane.showMessageDialog(null, "AYNI ID ILE ESLESEN TAKIM ZATEN MEVCUT LUTFEN ID DEGISTIRIN");

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AnaMenu mn1 = new AnaMenu();
        mn1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(TakimOlusturma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakimOlusturma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakimOlusturma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakimOlusturma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakimOlusturma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_takimlar;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
