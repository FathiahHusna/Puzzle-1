
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Gardens extends javax.swing.JFrame {

    /**
     * Creates new form Gardens
     */
    public Gardens() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
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
        MainMenu = new java.awt.Button();
        Close = new java.awt.Button();
        Hank = new java.awt.Button();
        Sam = new java.awt.Button();
        Paul = new java.awt.Button();
        Zick = new java.awt.Button();
        Luke = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        MainMenu.setLabel("Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });
        jPanel2.add(MainMenu);
        MainMenu.setBounds(440, 480, 57, 24);

        Close.setLabel("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel2.add(Close);
        Close.setBounds(520, 480, 49, 24);

        Hank.setLabel("Hank");
        Hank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HankActionPerformed(evt);
            }
        });
        jPanel2.add(Hank);
        Hank.setBounds(60, 190, 45, 24);

        Sam.setLabel("Sam");
        Sam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SamActionPerformed(evt);
            }
        });
        jPanel2.add(Sam);
        Sam.setBounds(70, 430, 42, 24);

        Paul.setLabel("Paul");
        Paul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaulActionPerformed(evt);
            }
        });
        jPanel2.add(Paul);
        Paul.setBounds(260, 330, 41, 24);

        Zick.setLabel("Zick");
        Zick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZickActionPerformed(evt);
            }
        });
        jPanel2.add(Zick);
        Zick.setBounds(460, 190, 38, 24);

        Luke.setLabel("Luke");
        Luke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LukeActionPerformed(evt);
            }
        });
        jPanel2.add(Luke);
        Luke.setBounds(460, 430, 43, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hank copy.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 30, 130, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/sam copy.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 270, 130, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/paul copy.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 170, 140, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/zick copy.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(400, 30, 140, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Luke copy.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(410, 260, 130, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        new MainMenu2().setVisible(true);
    }//GEN-LAST:event_MainMenuActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void HankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HankActionPerformed
        // TODO add your handling code here:
        new Garden_Hank().setVisible(true);
    }//GEN-LAST:event_HankActionPerformed

    private void SamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SamActionPerformed
        // TODO add your handling code here:
        new Garden_Sam().setVisible(true);
    }//GEN-LAST:event_SamActionPerformed

    private void PaulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaulActionPerformed
        // TODO add your handling code here:
        new Garden_Paul().setVisible(true);
    }//GEN-LAST:event_PaulActionPerformed

    private void ZickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZickActionPerformed
        // TODO add your handling code here:
        new Garden_Zick().setVisible(true);
    }//GEN-LAST:event_ZickActionPerformed

    private void LukeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LukeActionPerformed
        // TODO add your handling code here:
        new Garden_Luke().setVisible(true);
    }//GEN-LAST:event_LukeActionPerformed

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
            java.util.logging.Logger.getLogger(Gardens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gardens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gardens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gardens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gardens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Close;
    private java.awt.Button Hank;
    private java.awt.Button Luke;
    private java.awt.Button MainMenu;
    private java.awt.Button Paul;
    private java.awt.Button Sam;
    private java.awt.Button Zick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
