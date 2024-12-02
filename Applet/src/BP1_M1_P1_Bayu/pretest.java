/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BP1_M1_P1_Bayu;

import java.awt.*;
import java.awt.event.*;

public class pretest extends Frame implements ActionListener {
    Button button;

    // Konstruktor
    public pretest() {
        // Mengatur judul jendela
        setTitle("Contoh Program AWT");

        // Membuat tombol dengan label "Klik Saya"
        button = new Button("Klik Saya");
        
        // Menambahkan listener untuk menangani klik tombol
        button.addActionListener(this);

        // Menambahkan tombol ke jendela
        add(button);

        // Mengatur ukuran jendela
        setSize(300, 200);

        // Menampilkan jendela
        setVisible(true);
    }

    // Metode yang akan dipanggil saat tombol diklik
    public void actionPerformed(ActionEvent e) {
        System.out.println("Tombol diklik!");
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        new SimpleAWTExample();
    }
}
