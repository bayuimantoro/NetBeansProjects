/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dika;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class BP1_M2_Tugas1_Nama_AppletPerhitungan extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button add, subtract, multiply, divide;

    public void init() {
        setLayout(new GridLayout(5, 2, 5, 5));

        // Input angka pertama dan kedua
        num1 = new TextField();
        num2 = new TextField();
        result = new TextField();
        result.setEditable(false);  // Tidak bisa diedit

        // Tombol operasi
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");

        // Menambahkan ActionListener
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        // Menambahkan komponen ke Applet
        add(new Label("Angka 1:"));
        add(num1);
        add(new Label("Angka 2:"));
        add(num2);
        add(new Label("Hasil:"));
        add(result);
        
        add(add);
        add(subtract);
        add(multiply);
        add(divide);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double number1 = Double.parseDouble(num1.getText());
            double number2 = Double.parseDouble(num2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = number1 + number2;
            } else if (e.getSource() == subtract) {
                res = number1 - number2;
            } else if (e.getSource() == multiply) {
                res = number1 * number2;
            } else if (e.getSource() == divide) {
                res = number1 / number2;
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Input tidak valid");
        }
    }
}