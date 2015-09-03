 /*
 * GNU GENERAL PUBLIC LICENSE
 * Version 2, June 1991
 */
 
 /*
  * To Stop if any virus running. 
  */

package ashantivirus;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ashish
 */
public class Terminate 
{
    int stop;
    BufferedReader reader;
    public Terminate(File file) 
    {
        try {
            reader = new BufferedReader(new FileReader(file));
            stop = reader.read();
        } catch (Exception ex) {
            Logger.getLogger(Terminate.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<stop;i++)
        {
            try {
                Process process = Runtime.getRuntime().exec("taskkill /f /t /im "+reader.readLine());
            } catch (IOException ex) {
            Logger.getLogger(Terminate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args)
    {
        new Terminate(new File("src\\ashantivirus\\terminate.ash"));
    }
}
