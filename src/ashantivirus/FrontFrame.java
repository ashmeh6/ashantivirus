/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 2, June 1991
*/
 
 /*
  * This is the front GUI frame which intracts with user.
  */

package ashantivirus;

/**
 *
 * @author Ashish
 */
public class FrontFrame extends javax.swing.JFrame {

    /**
     * Creates form FrontFrame
     */
    GuiPanel panel;
    public FrontFrame() {
        //Change Look and Feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        initComponents();
        panel = new GuiPanel();
        this.setLayout(null);
        this.setSize(640, 427);
        panel.setBounds(0, 0, this.getWidth(), this.getHeight());
        panel.setOpaque(true); 
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JButton();
        about = new javax.swing.JButton();
        quickScan = new javax.swing.JButton();
        penDrive = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(640, 427));
        setResizable(false);
        getContentPane().setLayout(null);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ashantivirus/close.png"))); // NOI18N
        close.setToolTipText("EXIT");
        close.setBorderPainted(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setOpaque(false);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(610, 10, 20, 22);

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ashantivirus/About.png"))); // NOI18N
        about.setToolTipText("ABOUT");
        about.setBorderPainted(false);
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.setOpaque(false);
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aboutMouseReleased(evt);
            }
        });
        getContentPane().add(about);
        about.setBounds(580, 10, 20, 20);

        quickScan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ashantivirus/scan.png"))); // NOI18N
        quickScan.setToolTipText("HARDDRIVE SCAN");
        quickScan.setBorderPainted(false);
        quickScan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quickScan.setOpaque(false);
        quickScan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quickScanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quickScanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quickScanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                quickScanMouseReleased(evt);
            }
        });
        quickScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickScanActionPerformed(evt);
            }
        });
        getContentPane().add(quickScan);
        quickScan.setBounds(102, 220, 129, 101);

        penDrive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ashantivirus/pendriv.jpg"))); // NOI18N
        penDrive.setToolTipText("REMOVABLE MEDIA SCAN");
        penDrive.setBorderPainted(false);
        penDrive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        penDrive.setOpaque(false);
        penDrive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                penDriveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                penDriveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                penDriveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                penDriveMouseReleased(evt);
            }
        });
        penDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penDriveActionPerformed(evt);
            }
        });
        getContentPane().add(penDrive);
        penDrive.setBounds(310, 220, 217, 101);

        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Removable Media Scan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 330, 160, 20);

        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("HardDrive Scan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 330, 90, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBounds(608, 8, 22, 24);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBounds(610, 10, 20, 22);
    }//GEN-LAST:event_closeMouseExited

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        close.setBounds(610, 10, 20, 22);
    }//GEN-LAST:event_closeMousePressed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void aboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseEntered
        about.setBounds(579, 9, 20, 20);
    }//GEN-LAST:event_aboutMouseEntered

    private void aboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseExited
        about.setBounds(580, 10, 20, 20);
    }//GEN-LAST:event_aboutMouseExited

    private void aboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMousePressed
        about.setBounds(580, 10, 20, 20);
    }//GEN-LAST:event_aboutMousePressed

    private void aboutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseReleased
        about.setBounds(579, 9, 20, 20);
    }//GEN-LAST:event_aboutMouseReleased

    private void quickScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickScanActionPerformed
        try
        {
             new SelectRemovable("ocal").setVisible(true);
        }
        catch(Exception  e){}
    }//GEN-LAST:event_quickScanActionPerformed

    private void quickScanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quickScanMouseExited
        quickScan.setBounds(102, 220, 129, 101);
    }//GEN-LAST:event_quickScanMouseExited

    private void quickScanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quickScanMousePressed
         quickScan.setBounds(102, 220, 129, 101);
    }//GEN-LAST:event_quickScanMousePressed

    private void quickScanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quickScanMouseEntered
        quickScan.setBounds(100, 218, 129, 101);
    }//GEN-LAST:event_quickScanMouseEntered

    private void quickScanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quickScanMouseReleased
        quickScan.setBounds(100, 218, 129, 101);
    }//GEN-LAST:event_quickScanMouseReleased

    private void penDriveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penDriveMouseExited
        penDrive.setBounds(310,220,217,101);
    }//GEN-LAST:event_penDriveMouseExited

    private void penDriveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penDriveMousePressed
        penDrive.setBounds(310,220,217,101);
    }//GEN-LAST:event_penDriveMousePressed

    private void penDriveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penDriveMouseEntered
        penDrive.setBounds(308,218,217,101);
    }//GEN-LAST:event_penDriveMouseEntered

    private void penDriveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penDriveMouseReleased
        penDrive.setBounds(308,218,217,101);
    }//GEN-LAST:event_penDriveMouseReleased

    private void penDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penDriveActionPerformed
        new SelectRemovable("emovable").setVisible(true);
    }//GEN-LAST:event_penDriveActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton penDrive;
    private javax.swing.JButton quickScan;
    // End of variables declaration//GEN-END:variables
}
