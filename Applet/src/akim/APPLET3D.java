/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akim;



import java.applet.Applet;
import java.awt.*;

public class APPLET3D extends Applet {

    public void paint(Graphics g) {
        // Gambar persegi utama
        g.setColor(Color.blue);
        g.fillRect(50, 50, 100, 100);

        // Gambar bayangan untuk memberikan efek 3D
        g.setColor(Color.white);
        g.fillRect(60, 60, 100, 100);
        
        // Gambar garis kontur untuk memperjelas kotak
        g.setColor(Color.black);
        g.drawRect(50, 50, 100, 100);
        g.drawRect(60, 60, 100, 100);
    }
}