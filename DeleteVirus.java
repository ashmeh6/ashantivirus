/*
* GNU GENERAL PUBLIC LICENSE
* Version 2, June 1991
*/

 /*
  * To Delete all of the viruses.
  */

package ashantivirus;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashish
 */
public class DeleteVirus extends javax.swing.JFrame {

    /**
     * Creates form DeleteVirus
     */
    ScanPanel panel;
    public DeleteVirus() {
        //Change Look and Feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteVirus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteVirus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteVirus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteVirus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        initComponents();
        panel = new ScanPanel();
        this.setLayout(null);
        this.setSize(400, 300);
        panel.setBounds(0, 0, this.getWidth(), this.getHeight());
        panel.setOpaque(true);
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.repaint();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        found.setText(String.valueOf(Loading.viruslist.size()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        found = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ashantivirus/Delete.jpg"))); // NOI18N
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteMouseReleased(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(35, 215, 118, 28);

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ashantivirus/cancel.jpg"))); // NOI18N
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelMouseReleased(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(230, 215, 118, 28);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total number of Virus found:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 100, 190, 40);

        found.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        found.setForeground(new java.awt.Color(255, 255, 255));
        found.setText("...");
        getContentPane().add(found);
        found.setBounds(230, 107, 60, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("To delete virus take action by pressing Delete button.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 130, 340, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBounds(37, 213, 120, 30);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBounds(35, 215, 118, 28);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        delete.setBounds(35, 215, 118, 28);
    }//GEN-LAST:event_deleteMousePressed

    private void deleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseReleased
        delete.setBounds(37, 213, 120, 30);
    }//GEN-LAST:event_deleteMouseReleased

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBounds(230, 215, 118, 28);
    }//GEN-LAST:event_cancelMouseExited

    private void cancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMousePressed
        cancel.setBounds(230, 215, 118, 28);
    }//GEN-LAST:event_cancelMousePressed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBounds(232, 213, 120, 30);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseReleased
        cancel.setBounds(232, 213, 120, 30);
    }//GEN-LAST:event_cancelMouseReleased
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        for (File viruslist : Loading.viruslist) {
            viruslist.delete();
        }
        if(SelectRemovable.typ=="emovable")
        {   
        String cmd = "attrib -h -r -s /s /d ";
        String cmdAllFile = "*.*";
        String completeCommand = cmd+SelectRemovable.path+cmdAllFile;
        try {
                   
               Process process = Runtime.getRuntime().exec(completeCommand);
                       try {
                           
                           process.waitFor();
                       } catch (InterruptedException ex) {
                           Logger.getLogger(DeleteVirus.class.getName()).log(Level.SEVERE, null, ex);
                       }
               System.out.println(completeCommand);
               
               } catch (IOException ex) {
                //Logger.getLogger(cmd.class.getName()).log(Level.SEVERE, null, ex);
                   JOptionPane.showMessageDialog(this, ex);
               }
    }
        this.dispose();
    }//GEN-LAST:event_deleteActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JLabel found;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
