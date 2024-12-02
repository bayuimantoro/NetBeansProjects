/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package BP1_M1_P1_Bayu;

import java.applet.Applet;
import java.awt.*;


/**
 *
 * @author bayui
 */
public class BP1_M1_P1_Bayu extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void paint(Graphics g){
        Font f = new Font ("Comic Sans MS",Font.BOLD,20);
        g.setFont(f);
        g.setColor(Color.red);
        int xPusat = this.getSize().width/2;
        int yPusat = this.getSize().width/2;
        String s = "Ayooo Belajar Java Applet!!!";
        FontMetrics fm = this.getFontMetrics (f);
        int posisiX = xPusat - (fm.stringWidth(s)/2);
        g.drawString("Ayooo Belajar Java Applet", posisiX, yPusat);
    }
}
