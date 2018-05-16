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
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Fikstur extends javax.swing.JFrame {

    static DefaultTableModel dtm = new DefaultTableModel();

    /**
     * Creates new form Fikstur
     */
    public Fikstur() {
        initComponents();
dtm.setRowCount(0);
        dtm.setColumnIdentifiers(new String[]{"Maç Kodu", "Kaçıncı Hafta", "Takım1", "vs", "Takım2"});
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement s = con.createStatement();
            String sql = "SELECT * FROM takimlar";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {

                cb1.addItem((String) rs.getString("takim_adi"));
                cb2.addItem((String) rs.getString("takim_adi"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fikstur.class.getName()).log(Level.SEVERE, null, ex);

        }
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement s = con.createStatement();
            String sql = "SELECT * FROM Fikstur";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt("mackod"), rs.getInt("hafta"), (rs.getString("takimbir")), (rs.getString("vs")), (rs.getString("takimiki"))});
            }
        } catch (SQLException ex) {
            Logger.getLogger(TakimOlusturma.class.getName()).log(Level.SEVERE, null, ex);

        }
        tbl_fikstur.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_fikstur = new javax.swing.JTable();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_kod = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txt_kayit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_hafta = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        txt_takim = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_fikstur.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_fikstur);

        jLabel1.setText("vs");

        jButton1.setText("Maç Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Fikstur Yazdır");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Maç Kodu");

        jButton5.setText("Maclara Git");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Kayıt Adı");

        jButton6.setText("Maç Koda göre Sorgula");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Haftaya göre Sorgula");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setText("Kaçıncı Hafta");

        jButton8.setText("Takıma Göre Sorgula");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Takımlara Dön");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Ana Menuye Dön");

        jLabel5.setText("Sorgulanacak Takım");

        jButton11.setText("Tümünü Listele");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel6.setText("Takım 1");

        jLabel7.setText("Takım 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(txt_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel3)))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_kod, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(txt_hafta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jButton11)
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_takim, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9)
                                    .addComponent(jButton5))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(47, 47, 47)
                                .addComponent(jButton8))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_kod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(txt_hafta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton4))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_takim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(jButton10)
                        .addGap(26, 26, 26)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(180, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        try {

            String[] veri = {txt_kod.getText(), txt_hafta.getText(), cb1.getSelectedItem().toString(), "vs", cb2.getSelectedItem().toString()};
            dtm.addRow(veri);
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            con.setAutoCommit(false);

            String sql = "INSERT INTO FIKSTUR (mackod,hafta,takimbir,vs,takimiki,OYNANDIMI) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txt_kod.getText()));
            ps.setInt(2, Integer.parseInt(txt_hafta.getText()));
            ps.setString(3, cb1.getSelectedItem().toString());
            ps.setString(4, jLabel1.getText());
            ps.setString(5, cb2.getSelectedItem().toString());
            ps.setInt(6, 0);

            ps.executeUpdate();

            con.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Fikstur.class.getName()).log(Level.SEVERE, null, ex);

        }
        catch (RollbackException ex1){
              JOptionPane.showMessageDialog(null,"AYNI MACKODU ILE ESLESEN MAC ZATEN MEVCUT LUTFEN ID DEGISTIRIN");
              
         } 

        try {

            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            conn.setAutoCommit(false);

            String sql1 = "INSERT INTO MACLAR (MACKOD,TAKIMBIR,VS,TAKIMIKI) VALUES (?,?,?,?)";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setInt(1, Integer.parseInt(txt_kod.getText()));

            ps1.setString(2, cb1.getSelectedItem().toString());
            ps1.setString(3, jLabel1.getText());
            ps1.setString(4, cb2.getSelectedItem().toString());

            ps1.executeUpdate();

            conn.commit();

        } catch (SQLException ex) {
            Logger.getLogger(Fikstur.class.getName()).log(Level.SEVERE, null, ex);

        }
        catch (RollbackException ex1){
              JOptionPane.showMessageDialog(null,"AYNI MACKODU ILE ESLESEN MAC ZATEN MEVCUT LUTFEN ID DEGISTIRIN");
              
           
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {

            File file = new File("C:\\FutbolFederasyonu\\" + txt_kayit.getText() + ".txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < tbl_fikstur.getRowCount(); i++) {

                for (int j = 0; j < tbl_fikstur.getColumnCount(); j++) {
                    bw.write(tbl_fikstur.getModel().getValueAt(i, j) + " ");
                }

                bw.write("\n");
                bw.newLine();
            }

            bw.close();

            fw.close();
            JOptionPane.showMessageDialog(null, "Fikstur başarıyla yazdırıldı.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Maclar m1 = new Maclar();
        m1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        dtm.setRowCount(0);

        try {

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            String sql = "SELECT * FROM FIKSTUR WHERE MACKOD=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txt_kod.getText()));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int mackod = rs.getInt("mackod");
                int hafta = rs.getInt("hafta");
                String takimbir = rs.getString("TAKIMBIR");
                String vs = rs.getString("VS");
                String takimiki = rs.getString("TAKIMIKI");

                dtm.addRow(new Object[]{mackod, hafta, takimbir, vs, takimiki});

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dtm.setRowCount(0);

        try {

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            String sql = "SELECT * FROM FIKSTUR WHERE HAFTA=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txt_hafta.getText()));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int mackod = rs.getInt("mackod");
                int hafta = rs.getInt("hafta");
                String takimbir = rs.getString("TAKIMBIR");
                String vs = rs.getString("VS");
                String takimiki = rs.getString("TAKIMIKI");

                dtm.addRow(new Object[]{mackod, hafta, takimbir, vs, takimiki});

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      TakimOlusturma to = new TakimOlusturma();
      to.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       dtm.setRowCount(0);

        try {

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            String sql = "SELECT * FROM FIKSTUR WHERE TAKIMBIR=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,txt_takim.getText());

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int mackod = rs.getInt("mackod");
                int hafta = rs.getInt("hafta");
                String takimbir = rs.getString("TAKIMBIR");
                String vs = rs.getString("VS");
                String takimiki = rs.getString("TAKIMIKI");

                dtm.addRow(new Object[]{mackod, hafta, takimbir, vs, takimiki});

            }

        } catch (Exception e) {
        }
        try {

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            String sql = "SELECT * FROM FIKSTUR WHERE TAKIMIKI=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,txt_takim.getText());

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int mackod = rs.getInt("mackod");
                int hafta = rs.getInt("hafta");
                String takimbir = rs.getString("TAKIMBIR");
                String vs = rs.getString("VS");
                String takimiki = rs.getString("TAKIMIKI");

                dtm.addRow(new Object[]{mackod, hafta, takimbir, vs, takimiki});

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
dtm.setRowCount(0);
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement s = con.createStatement();
            String sql = "SELECT * FROM Fikstur";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt("mackod"), rs.getInt("hafta"), (rs.getString("takimbir")), (rs.getString("vs")), (rs.getString("takimiki"))});
            }
        } catch (SQLException ex) {
            Logger.getLogger(TakimOlusturma.class.getName()).log(Level.SEVERE, null, ex);

        }
        tbl_fikstur.setModel(dtm);
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Fikstur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fikstur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fikstur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fikstur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fikstur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cb1;
    public javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_fikstur;
    private javax.swing.JTextField txt_hafta;
    private javax.swing.JTextField txt_kayit;
    private javax.swing.JTextField txt_kod;
    private javax.swing.JTextField txt_takim;
    // End of variables declaration//GEN-END:variables
}
