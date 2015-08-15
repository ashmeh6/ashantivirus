
 /*
 * GNU GENERAL PUBLIC LICENSE
 * Version 2, June 1991
 */
 
  /*
  * Scan Files via GUI Frame intraction.
  */

package ashantivirus;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ashish
 */
public class Scanner extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form Scanner
     */
    
    BufferedReader totalSignature;
    FileWriter fout;            
    int noOfSigFiles;
    ArrayList<File> sigFiles;
    
    static boolean status=false;
    Thread thread;
    ScanPanel panel;
    VirusDisplay virusDisplayObj;
        int scan(File file,ArrayList<File> sigArr,int max) throws Exception
        {	
            boolean stop=false;
            int i = 0;
            int found=0;
            char fileArr[] = new char[2000000];
            BufferedReader fr=new BufferedReader(new FileReader(file));
            BufferedReader virusreader=new BufferedReader(new FileReader(sigArr.get(sigArr.size()-1)));//loaded name.dll in virusReader
            int x=0,index=0,maxSymbol,surity=0;
            char pat='a',c;
            for(int j =0;j<max;j++)//////////////////////LOAD FILE IN ARRAY
            {
                x=fr.read();
                c=(char)(x);
                fileArr[j] = c;
              //System.out.println(fileArr[j]+""+j);/////////////Helps in pattern Making
                x=fr.read();
            }
            String str = file.getName();//Which File to Scan Name of That FILE
            for(int sigIndex=0;sigIndex<(sigArr.size()-1);sigIndex++)//sigArr.size()-1  means total pattern available
            {
                int loop=virusreader.read();//1st element of name.dll
                for(int temp=0;temp<loop;temp++)
                {
                    if(str.equalsIgnoreCase(virusreader.readLine()))
                    {
                        Loading.viruslist.add(file);
                        found++;
                        stop=true;
                    }
                }
                if(stop)
                {
                    break;
                }
                BufferedReader dr=new BufferedReader(new FileReader(sigArr.get(sigIndex)));
                maxSymbol = Integer.parseInt(dr.readLine());
		for(i=0;i<=maxSymbol;i++)
		{
                    pat = (char)(dr.read());
                    index = Integer.parseInt(dr.readLine());
                    if(fileArr[index]==pat)     //Matching Pattern
                    {
                        surity++;
                    }
		}
                if(surity>=(maxSymbol-2))
                {
                    found++;
                    Loading.viruslist.add(file);
                    break;
                }
            }
            return found;
        }
    
    public Scanner() {
        status = false;
        Loading.viruslist = new ArrayList<File>();
        initComponents();
        panel = new ScanPanel();
        this.setLayout(null);
        this.setSize(450, 360);
        panel.setBounds(0, 0, this.getWidth(), this.getHeight());
        panel.setOpaque(true); 
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.repaint();
        this.setResizable(false);
        virusDisplayObj = new VirusDisplay();
        try {
            sigFiles = new ArrayList<File>();
            try{
        }catch(Exception e){}
            totalSignature = new BufferedReader(new FileReader(new File("c:\\AshAntivirus\\total.dll")));
            noOfSigFiles = totalSignature.read();
           System.out.println(noOfSigFiles);
           
            for(int i=0;i<noOfSigFiles;i++)
            {
                sigFiles.add(new File("c:\\AshAntivirus\\"+totalSignature.readLine()));
            }
            sigFiles.add(new File("c:\\AshAntivirus\\"+totalSignature.readLine()));
            //System.out.println("Size=="+sigFiles.get(4));
        } catch (Exception ex) {
            System.out.println("Exp=="+ex);
            Logger.getLogger(Scanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        thread = new Thread(Scanner.this);
        thread.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        scannedfiles = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        virusFound = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalFiles = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalFolders = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        path = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        scanning = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Ash = new javax.swing.JLabel();
        detail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setForeground(new java.awt.Color(0, 204, 0));
        bar.setBorderPainted(false);
        jPanel1.add(bar);
        bar.setBounds(0, 295, 433, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Scanned Files");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(25, 182, 88, 20);

        scannedfiles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        scannedfiles.setForeground(new java.awt.Color(240, 240, 240));
        scannedfiles.setText("...");
        jPanel1.add(scannedfiles);
        scannedfiles.setBounds(131, 182, 62, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Virus Found");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 182, 84, 20);

        virusFound.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        virusFound.setForeground(new java.awt.Color(255, 255, 255));
        virusFound.setText("...");
        jPanel1.add(virusFound);
        virusFound.setBounds(350, 182, 76, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Total Files");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(25, 242, 82, 20);

        totalFiles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalFiles.setForeground(new java.awt.Color(240, 240, 240));
        totalFiles.setText("...");
        jPanel1.add(totalFiles);
        totalFiles.setBounds(129, 240, 55, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Total Folders");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(25, 215, 82, 20);

        totalFolders.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalFolders.setForeground(new java.awt.Color(240, 240, 240));
        totalFolders.setText("...");
        jPanel1.add(totalFolders);
        totalFolders.setBounds(130, 215, 55, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Path");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(25, 153, 60, 20);

        path.setForeground(new java.awt.Color(255, 255, 255));
        path.setText("...");
        jPanel1.add(path);
        path.setBounds(90, 153, 330, 20);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Scanning");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(25, 125, 60, 20);

        scanning.setForeground(new java.awt.Color(255, 255, 255));
        scanning.setText("...");
        jPanel1.add(scanning);
        scanning.setBounds(90, 125, 100, 20);

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("AshAntivirus");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 50, 190, 60);

        Ash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ashantivirus/Ash_1.jpg"))); // NOI18N
        jPanel1.add(Ash);
        Ash.setBounds(290, 25, 114, 115);

        detail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        detail.setForeground(new java.awt.Color(255, 0, 0));
        detail.setText("Virus Detail");
        detail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailMouseClicked(evt);
            }
        });
        jPanel1.add(detail);
        detail.setBounds(330, 210, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailMouseClicked
       virusDisplayObj.setVisible(true);
    }//GEN-LAST:event_detailMouseClicked

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
            java.util.logging.Logger.getLogger(Scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scanner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ash;
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel detail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel path;
    private javax.swing.JLabel scannedfiles;
    private javax.swing.JLabel scanning;
    private javax.swing.JLabel totalFiles;
    private javax.swing.JLabel totalFolders;
    private javax.swing.JLabel virusFound;
    // End of variables declaration//GEN-END:variables

    @Override
    
    public void run() 
    {
        detail.setVisible(false);
        int len = Loading.files.size(),found=0,totalFolder=Loading.folder.size();
        //int aa=len/totalFolder,folder=0;
        bar.setMaximum(len);
        totalFiles.setText(String.valueOf(len));
        totalFolders.setText(String.valueOf(totalFolder));
        this.setVisible(true);
        for(int temp=0;temp<len;temp++)
        {
            try {
                path.setText(Loading.files.get(temp).toString());
                found+=scan(Loading.files.get(temp), sigFiles, 600);
                scanning.setText((Loading.files.get(temp)).getName());
                virusFound.setText(String.valueOf(found));
                bar.setValue(temp+1);
                scannedfiles.setText(String.valueOf(temp+1));
            } catch (Exception ex) {
                Logger.getLogger(Scanner.class.getName()).log(Level.SEVERE, null, ex);
            }
            status = true;
        }
        status = false;
        detail.setVisible(!status);
        if(Loading.viruslist.size()>0)              //If virus found only then show delete frame
        {
            new DeleteVirus().setVisible(true);
        }
    }
}
