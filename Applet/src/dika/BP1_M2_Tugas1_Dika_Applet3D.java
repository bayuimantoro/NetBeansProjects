/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dika;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.Path2D;

public class BP1_M2_Tugas1_Dika_Applet3D extends Applet {

    @Override
    public void init() {
        setSize(400, 400);
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Warna untuk persegi panjang dan bayangannya
        Color rectangleColor = new Color(100, 149, 237);
        Color shadowColor = new Color(70, 130, 180);

        // Koordinat untuk persegi panjang depan
        int[] frontX = {100, 250, 250, 100}; // Koordinat X
        int[] frontY = {100, 100, 200, 200}; // Koordinat Y

        // Koordinat untuk persegi panjang bayangan (bagian belakang untuk efek 3D)
        int[] backX = {130, 280, 280, 130}; // Koordinat X
        int[] backY = {130, 130, 230, 230}; // Koordinat Y

        // Membuat persegi panjang depan
        Path2D frontRectangle = new Path2D.Double();
        frontRectangle.moveTo(frontX[0], frontY[0]);
        for (int i = 1; i < frontX.length; i++) {
            frontRectangle.lineTo(frontX[i], frontY[i]);
        }
        frontRectangle.closePath();

        // Membuat persegi panjang belakang (bayangan)
        Path2D backRectangle = new Path2D.Double();
        backRectangle.moveTo(backX[0], backY[0]);
        for (int i = 1; i < backX.length; i++) {
            backRectangle.lineTo(backX[i], backY[i]);
        }
        backRectangle.closePath();

        // Membuat sisi-sisi yang menghubungkan persegi panjang depan dan belakang
        Path2D side1 = new Path2D.Double();
        side1.moveTo(frontX[0], frontY[0]);
        side1.lineTo(backX[0], backY[0]);
        side1.lineTo(backX[3], backY[3]);
        side1.lineTo(frontX[3], frontY[3]);
        side1.closePath();

        Path2D side2 = new Path2D.Double();
        side2.moveTo(frontX[1], frontY[1]);
        side2.lineTo(backX[1], backY[1]);
        side2.lineTo(backX[2], backY[2]);
        side2.lineTo(frontX[2], frontY[2]);
        side2.closePath();

        // Menggambar persegi panjang belakang (bayangan)
        g2d.setColor(shadowColor);
        g2d.fill(backRectangle);

        // Menggambar sisi-sisi 3D
        g2d.fill(side1);
        g2d.fill(side2);

        // Menggambar persegi panjang depan
        g2d.setColor(rectangleColor);
        g2d.fill(frontRectangle);

        // Menggambar garis luar untuk efek 3D
        g2d.setColor(Color.BLACK);
        g2d.draw(frontRectangle);
        g2d.draw(backRectangle);
        g2d.draw(side1);
        g2d.draw(side2);
    }
}