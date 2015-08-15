/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 2, June 1991
 */
 
 /*
  *This is Main java source File.
  *The used .dll files represnts database is only for windows viruses. 
  */

package ashantivirus;

import java.io.File;

/**
 *
 * @author Ashish Lal
 */
public class AshAntivirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Terminate(new File("c:\\AshAntivirus\\terminate.dll"));
        new FrontFrame().setVisible(true);
        
    }    
}
