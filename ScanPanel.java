 /*
 * GNU GENERAL PUBLIC LICENSE
 * Version 2, June 1991
 */
 
 /*
  * Setting Background of Scaning Frame.
  */

package ashantivirus;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Ashish
 */
public class ScanPanel extends JPanel {
Image i; 
    public ScanPanel()
    {
        try{
                i = ImageIO.read(new URL(this.getClass().getResource("cr.jpg"),"cr.jpg"));
            }catch(IOException e){}
    }
@Override
           protected void paintComponent(Graphics g)
            {
                g.drawImage(i,0,0,this.getWidth(),this.getHeight(),this);
            }
}
