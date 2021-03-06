 /*
 * GNU GENERAL PUBLIC LICENSE
 * Version 2, June 1991
 */
 
 /*
  * To generate the list of Found Viruses. 
  */

package ashantivirus;

import javax.swing.AbstractListModel;
import javax.swing.plaf.ListUI;
import javax.swing.plaf.multi.MultiListUI;

/**
 *
 * @author Ashish
 */
public class VirusDisplay extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form VirusDisplay
     */
    Thread t;
    public VirusDisplay() {
        this.setVisible(false);
        initComponents();
        ScanPanel panel = new ScanPanel();
        this.setLayout(null);
        this.setSize(400, 350);
        panel.setBounds(0, 0, this.getWidth(), this.getHeight());
        panel.setOpaque(true);
        this.add(panel);
        this.repaint();
               list.setModel(new AbstractListModel() {

            @Override
            public int getSize() {
                return Loading.viruslist.size();
            }

            @Override
            public Object getElementAt(int index) {
                return Loading.viruslist.get(index);
            }
        });
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VirusDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VirusDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VirusDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VirusDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        t = new Thread(VirusDisplay.this);
        t.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(list);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 46, 340, 243);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Virus List");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(147, 0, 111, 35);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VirusDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VirusDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VirusDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VirusDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VirusDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() 
    {
        while(Scanner.status)
        {
            list.setModel(new AbstractListModel() {

            @Override
            public int getSize() {
                return Loading.viruslist.size();
            }

            @Override
            public Object getElementAt(int index) {
                return Loading.viruslist.get(index);
            }
        });
        }
    }
}
