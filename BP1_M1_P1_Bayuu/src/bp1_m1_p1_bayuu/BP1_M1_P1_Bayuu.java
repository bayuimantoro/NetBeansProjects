/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bp1_m1_p1_bayuu;

/**
 *
 * @author bayui
 */
import java.awt.*;

public class BP1_M1_P1_Bayuu extends Frame{
    public static void main (String[] args) {
        BP1_M1_P1_Bayuu test = new BP1_M1_P1_Bayuu();
    }

    public BP1_M1_P1_Bayuu() {
        super("BP1_M1_P1_Bayuu");
        setSize(300, 100);
        Panel panelTombol = new Panel();
        panelTombol.add (new Button ("Mulai"));
        panelTombol.add (new Button ("Selesai"));
        add ("South", panelTombol);

        show();
    }
}
