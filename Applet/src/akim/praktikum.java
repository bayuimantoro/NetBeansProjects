/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akim;

import java.applet.Applet;
import java.awt.*;


/**
 *
 * @author bayui
 */
public class praktikum extends Applet {

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
