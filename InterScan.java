/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 2, June 1991
 */
 
 /*
  * This java source not used.
  */

package ashantivirus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashish
 */

public class InterScan 
{
    BufferedReader reader;
  public InterScan() throws IOException
  {
      int stop=0;
      try {
          reader = new BufferedReader(new FileReader("c:\\AshAntivirus\\interscan.dll"));
            stop = reader.read();
            for(int i=0;i<stop;i++)
            {
                File tmpFile = new File(reader.readLine());
                if(tmpFile.exists())
                {
                    System.out.println(tmpFile);
                  //  Process process = Runtime.getRuntime().exec("del taskkill /f /t /im ");
                    //Loading.files.add(tmpFile);
                }
                else{
                    System.out.println(tmpFile+"Not Exists");
                }
            }
            } catch (FileNotFoundException ex) {
          Logger.getLogger(InterScan.class.getName()).log(Level.SEVERE, null, ex);
      }
      if(Loading.files.size()>0)//If at certain location Virus Found Then Scan Only
      {
          new Scanner();
      }
      {
          JOptionPane.showMessageDialog(new Sample(),"Not Virus Found !!!");
      }
  }
  public static void main(String arg[])
  {
        try {
            new InterScan();
        } catch (IOException ex) {
            Logger.getLogger(InterScan.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
}
