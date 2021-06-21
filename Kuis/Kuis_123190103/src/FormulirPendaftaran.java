 

import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class FormulirPendaftaran extends javax.swing.JFrame {
    
    String email, username, password, nama, ttl, jk, domisili, deskripsi;
    Connector connector = new Connector();
    /**
     * Creates new form FormulirPendaftaran
     */
    public FormulirPendaftaran() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        judulll = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        femail = new javax.swing.JTextField();
        fusername = new javax.swing.JTextField();
        fnamaLengkap = new javax.swing.JTextField();
        fdomisili = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        laki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        fpassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        fdeskripsi = new javax.swing.JTextArea();
        daftar = new javax.swing.JButton();
        fttl = new javax.swing.JTextField();
        lihatdata = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judulll.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        judulll.setText("Formulir Pendaftaran");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Nama Lengkap");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Domisili");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("TTL");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Deskripsi Singkat Tentang Diri Sendiri :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText(":");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText(":");

        femail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        femail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femailActionPerformed(evt);
            }
        });
        femail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                femailKeyTyped(evt);
            }
        });

        fusername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fusernameActionPerformed(evt);
            }
        });
        fusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fusernameKeyTyped(evt);
            }
        });

        fnamaLengkap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fnamaLengkap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnamaLengkapActionPerformed(evt);
            }
        });

        fdomisili.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fdomisili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdomisiliActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Jenis Kelamin");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText(":");

        buttonGroup1.add(laki);
        laki.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        laki.setText("Laki - Laki");
        laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiActionPerformed(evt);
            }
        });

        buttonGroup1.add(perempuan);
        perempuan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        perempuan.setText("Perenpuan");
        perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanActionPerformed(evt);
            }
        });

        fpassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpasswordActionPerformed(evt);
            }
        });
        fpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fpasswordKeyTyped(evt);
            }
        });

        fdeskripsi.setColumns(20);
        fdeskripsi.setRows(5);
        fdeskripsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fdeskripsiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fdeskripsiKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(fdeskripsi);

        daftar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        daftar.setText("Daftar");
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });

        fttl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fttl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fttlActionPerformed(evt);
            }
        });

        lihatdata.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lihatdata.setText("Lihat Data");
        lihatdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(judulll))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fpassword))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fusername, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(femail, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fttl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fnamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(laki)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(perempuan))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(daftar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lihatdata)
                                .addGap(41, 41, 41)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(judulll)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(femail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(fusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(fpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(fnamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(fttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(laki)
                    .addComponent(perempuan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(fdomisili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daftar)
                    .addComponent(lihatdata))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void femailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femailActionPerformed

    private void fusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fusernameActionPerformed

    private void fnamaLengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnamaLengkapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnamaLengkapActionPerformed

    private void fdomisiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdomisiliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fdomisiliActionPerformed

    private void fttlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fttlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fttlActionPerformed

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed
        // TODO add your handling code here:
        
        username = fusername.getText();
        password = Arrays.toString(fpassword.getPassword());
        nama = fnamaLengkap.getText();
        ttl = fttl.getText();
        domisili = fdomisili.getText();
        deskripsi = fdeskripsi.getText();
        
        //Jenis Kelamin
        if(laki.isSelected()){
            jk = "Laki-laki";
        }else{
            jk = "Perempuan";
        }
        
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", femail.getText()))) 
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        } else
            {
                email = femail.getText();
            }
        
//        Data tampilkan = new Data(email,username, password, nama, ttl, jk, domisili, deskripsi);
//        tampilkan.setVisible(true);
//        dispose();
        
         try {
            String query = "INSERT INTO `prakpbo_database_pendaftar`(`email`, `username`,`password`,`namal`, `ttl`, `jk`, `alamat`, `deskripsi`) VALUES ('"+email+"','"+username+"','"+password+"','"+nama+"','"+ttl+"','"+jk+"','"+domisili+"','"+deskripsi+"')";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Insert Berhasil");
            JOptionPane.showMessageDialog(null,"Insert Berhasil !!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
        //toFile
//       try {
//         File data = new File("Data.txt");
//            if (data.createNewFile()) {
//              System.out.println("File created: " + data.getName());
//            } else {
//              System.out.println("File already exists.");
//            }
//            try (FileWriter Data = new FileWriter("Data.txt")) {
//                Data.write(email + "\n");
//                Data.write(username+ "\n");
//                Data.write(password+ "\n");
//                Data.write(nama+ "\n");
//                Data.write(ttl+ "\n");
//                Data.write(jk+ "\n");
//                Data.write(domisili+ "\n");
//                Data.write(deskripsi+ "\n");
//            }
//
//         } catch (IOException e) {
//         System.out.println("Terjadi kesalahan. Data gagal di Input");
//        
//       }       
        
    }//GEN-LAST:event_daftarActionPerformed

    private void lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiActionPerformed

    private void perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanActionPerformed

    private void fusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fusernameKeyTyped
        // TODO add your handling code here:
        if(!Character.isLetterOrDigit(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Username Hanya Bisa Memasukan Huruf atau Angka");
            }
    }//GEN-LAST:event_fusernameKeyTyped

    private void femailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_femailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_femailKeyTyped

    private void fpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fpasswordKeyTyped
        // TODO add your handling code here:
//        if(Character.isLetterOrDigit(evt.getKeyChar())){
//            evt.consume();
//            JOptionPane.showMessageDialog(null,"Pada Kolom Password Wajib Menggunakan Huruf, Angka, dan Simbol");
//            }
    }//GEN-LAST:event_fpasswordKeyTyped

    private void fpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fpasswordActionPerformed

    private void fdeskripsiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fdeskripsiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fdeskripsiKeyReleased

    private void fdeskripsiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fdeskripsiKeyTyped
        // TODO add your handling code here:
        if( fdeskripsi.getText().trim().length() > 200){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Maksimal 200 karakter");
        }
    }//GEN-LAST:event_fdeskripsiKeyTyped

    private void lihatdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatdataActionPerformed
        // TODO add your handling code here:
        TampilkanData tampilkan = new TampilkanData();
        tampilkan.setVisible(true);
        dispose();
    }//GEN-LAST:event_lihatdataActionPerformed

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
            java.util.logging.Logger.getLogger(FormulirPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormulirPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormulirPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormulirPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulirPendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton daftar;
    private javax.swing.JTextArea fdeskripsi;
    private javax.swing.JTextField fdomisili;
    private javax.swing.JTextField femail;
    private javax.swing.JTextField fnamaLengkap;
    private javax.swing.JPasswordField fpassword;
    private javax.swing.JTextField fttl;
    private javax.swing.JTextField fusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judulll;
    private javax.swing.JRadioButton laki;
    private javax.swing.JButton lihatdata;
    private javax.swing.JRadioButton perempuan;
    // End of variables declaration//GEN-END:variables
}
