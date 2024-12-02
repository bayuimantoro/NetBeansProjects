/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akim;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class BP1_M2_Tugas1_Nama_AppletPerhitungan extends Applet implements ActionListener {
    TextField angka1, angka2, hasil;
    Button tambah, kurang, kali, bagi;

    public void init() {
        // Atur layout menjadi GridLayout dengan 4 baris dan 2 kolom
        setLayout(new GridLayout(5, 2, 5, 5));

        // Inisialisasi teks dan tombol
        angka1 = new TextField(5);
        angka2 = new TextField(5);
        hasil = new TextField(10);
        hasil.setEditable(false);

        tambah = new Button("+");
        kurang = new Button("-");
        kali = new Button("*");
        bagi = new Button("/");

        // Tambahkan komponen ke applet dengan layout yang diatur
        add(new Label("Angka 1:"));
        add(angka1);
        add(new Label("Angka 2:"));
        add(angka2);
        add(new Label("Hasil:"));
        add(hasil);

        add(tambah);
        add(kurang);
        add(kali);
        add(bagi);

        // Daftarkan event listener
        tambah.addActionListener(this);
        kurang.addActionListener(this);
        kali.addActionListener(this);
        bagi.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(angka1.getText());
            double num2 = Double.parseDouble(angka2.getText());
            double result = 0;

            if (e.getSource() == tambah) {
                result = num1 + num2;
            } else if (e.getSource() == kurang) {
                result = num1 - num2;
            } else if (e.getSource() == kali) {
                result = num1 * num2;
            } else if (e.getSource() == bagi) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    hasil.setText("Error: Bagi 0");
                    return;
                }
            }
            hasil.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            hasil.setText("Input tidak valid");
        }
    }
}
