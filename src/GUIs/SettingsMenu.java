package GUIs;

import Classes.Methods;
import java.util.ArrayList;

public class SettingsMenu extends javax.swing.JFrame {

    static String username;
    String[] keys = {"W", "S", "A", "D", "LMB", "RMB", "SHIFT", "SPACE", "R", "1", "2"};
    static ArrayList<String> userSettings = new ArrayList<>();
    String[] settingsToChange = new String[16];

    public SettingsMenu(ArrayList<String> userSettings1, String user) {
        username = user;
        userSettings = userSettings1;
        findSettings();
        initComponents();
        showSettings();
    }

    public void findSettings() {
        settingsToChange = userSettings.toString().split(",");
        settingsToChange[0] = settingsToChange[0].substring(1);
        settingsToChange[16] = settingsToChange[16].substring(0, settingsToChange[16].length() - 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        volumeSlider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        brightnessSlider = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        sensSlider = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        fullscreenButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        fovSlider = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        forwardLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        leftLabel = new javax.swing.JLabel();
        rightLabel = new javax.swing.JLabel();
        shootLabel = new javax.swing.JLabel();
        aimLabel = new javax.swing.JLabel();
        sprintLabel = new javax.swing.JLabel();
        jumpLabel = new javax.swing.JLabel();
        reloadLabel = new javax.swing.JLabel();
        weapon1Label = new javax.swing.JLabel();
        weapon2Label = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Settings");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 38, -1, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Game Settings");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 110, -1, 24));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Volume");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 154, 104, -1));

        jButton1.setText("Save Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, -1, -1));

        volumeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumeSliderStateChanged(evt);
            }
        });
        getContentPane().add(volumeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 154, 160, 17));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Brightness");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 200, 104, 23));

        brightnessSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                brightnessSliderStateChanged(evt);
            }
        });
        getContentPane().add(brightnessSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 208, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mouse Sensitivity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 265, -1, 24));

        sensSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sensSliderStateChanged(evt);
            }
        });
        getContentPane().add(sensSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 274, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fullscreen");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 331, -1, -1));

        fullscreenButton.setSelected(true);
        fullscreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullscreenButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fullscreenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Field Of View");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 394, -1, -1));

        fovSlider.setMaximum(120);
        fovSlider.setMinimum(60);
        fovSlider.setValue(90);
        fovSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fovSliderStateChanged(evt);
            }
        });
        getContentPane().add(fovSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 397, 160, -1));

        jLabel8.setText(Integer.toString(volumeSlider.getValue()));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 154, -1, -1));

        jLabel9.setText(Integer.toString(brightnessSlider.getValue()));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 208, -1, -1));

        jLabel10.setText(Integer.toString(sensSlider.getValue()));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 274, -1, -1));

        jLabel11.setText(Integer.toString(fovSlider.getValue()));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 397, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Keybinds");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Forward");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Back");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Left");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Right");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Shoot");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Aim ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Sprint");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Jump");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Reload");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Weapon 1");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Weapon 2");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));

        forwardLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        forwardLabel.setText(settingsToChange[6]);
        getContentPane().add(forwardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, -1));

        backLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backLabel.setText(settingsToChange[7]);
        getContentPane().add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 90, -1));

        leftLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leftLabel.setText(settingsToChange[8]);
        getContentPane().add(leftLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 90, -1));

        rightLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rightLabel.setText(settingsToChange[9]);
        getContentPane().add(rightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, -1, -1));

        shootLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        shootLabel.setText(settingsToChange[10]);
        getContentPane().add(shootLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        aimLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aimLabel.setText(settingsToChange[11]);
        getContentPane().add(aimLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        sprintLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sprintLabel.setText(settingsToChange[12]);
        getContentPane().add(sprintLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        jumpLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumpLabel.setText(settingsToChange[13]);
        getContentPane().add(jumpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        reloadLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reloadLabel.setText(settingsToChange[14]);
        getContentPane().add(reloadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, -1, -1));

        weapon1Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weapon1Label.setText(settingsToChange[15]);
        getContentPane().add(weapon1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, -1, -1));

        weapon2Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weapon2Label.setText(settingsToChange[16]);
        getContentPane().add(weapon2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, -1, -1));

        jButton2.setText("Update Keybinds");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 160, -1));
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 50, 40));
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 244, 50, 50));

        jButton3.setText("Restore To Default");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showSettings() {
        volumeSlider.setValue(Integer.parseInt(settingsToChange[1]));
        brightnessSlider.setValue(Integer.parseInt(settingsToChange[2]));
        sensSlider.setValue(Integer.parseInt(settingsToChange[3]));
        fullscreenButton.setSelected(Boolean.parseBoolean(settingsToChange[4]));
        fovSlider.setValue(Integer.parseInt(settingsToChange[5]));
    }

    public void saveChanges(){
        for (int i = 0; i < userSettings.size(); i++) {
            if (userSettings.get(i).startsWith(username)) {
                userSettings.remove(i);
            }
        }
        userSettings.add(username + "," + volumeSlider.getValue() + ","
                + brightnessSlider.getValue() + "," + sensSlider.getValue() + 
                "," + fullscreenButton.isSelected() + "," + fovSlider.getValue()
                + "," + settingsToChange[6] + "," + settingsToChange[7] + ","
                + settingsToChange[8] + "," + settingsToChange[9] + ","
                + settingsToChange[10] + "," + settingsToChange[11] + "," 
                + settingsToChange[12] + ","  + settingsToChange[13] + "," 
                + settingsToChange[14] + ","  + settingsToChange[15] + "," 
                + settingsToChange[16]);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userSettings = Methods.readFile(userSettings);
        saveChanges();
        Methods.writeFile(userSettings, (System.getProperty("user.dir") + "\\userSettings.txt"));
        GameMenu g = new GameMenu(username);
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fullscreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullscreenButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullscreenButtonActionPerformed

    private void volumeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumeSliderStateChanged
        jLabel8.setText(Integer.toString(volumeSlider.getValue()));
    }//GEN-LAST:event_volumeSliderStateChanged

    private void brightnessSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_brightnessSliderStateChanged
        jLabel9.setText(Integer.toString(brightnessSlider.getValue()));
    }//GEN-LAST:event_brightnessSliderStateChanged

    private void sensSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sensSliderStateChanged
        jLabel10.setText(Integer.toString(sensSlider.getValue()));
    }//GEN-LAST:event_sensSliderStateChanged

    private void fovSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fovSliderStateChanged
        jLabel11.setText(Integer.toString(fovSlider.getValue()));
    }//GEN-LAST:event_fovSliderStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        saveChanges();
        settingsToChange = userSettings.toString().split(",");
        settingsToChange[0] = settingsToChange[0].substring(1);
        settingsToChange[16] = settingsToChange[16].substring(0, settingsToChange[16].length() - 1);
        Keybinds k = new Keybinds(settingsToChange, username);
        k.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        volumeSlider.setValue(50);
        brightnessSlider.setValue(50);
        sensSlider.setValue(50);
        fovSlider.setValue(90);
        fullscreenButton.setSelected(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SettingsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsMenu(userSettings, username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aimLabel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JSlider brightnessSlider;
    private javax.swing.JLabel forwardLabel;
    private javax.swing.JSlider fovSlider;
    private javax.swing.JRadioButton fullscreenButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jumpLabel;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JLabel reloadLabel;
    private javax.swing.JLabel rightLabel;
    private javax.swing.JSlider sensSlider;
    private javax.swing.JLabel shootLabel;
    private javax.swing.JLabel sprintLabel;
    private javax.swing.JSlider volumeSlider;
    private javax.swing.JLabel weapon1Label;
    private javax.swing.JLabel weapon2Label;
    // End of variables declaration//GEN-END:variables
}
