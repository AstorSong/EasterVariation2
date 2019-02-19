/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eastervariation2;

import javax.swing.JOptionPane;

/**
 *
 * @author asson2417
 */
public class EasterVariation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d, q, f, g, h, j, k, n, p;
        int month;
        int day;
        int year;
        String monthStr;
        String yearStr = JOptionPane.showInputDialog("Easter" + "Date Calculator\nPlease enter a year");
        year = Integer.parseInt(yearStr);
        a = year / 100;
        b = year % 100;
        c = 3*(a+25) / 4;
        d = 3*(a+25) % 4;
        q = 8*(a+11) / 25;
        f = 5*a+b % 19;
        g = 19*f+c-q / 30;
        h = f+11*g / 319;
        j = 60*(5-d+b) / 4;
        k = 60*(5-d+b) % 4;
        n = 2*j-k-g+h / 7;
        month = g-h+n+114 / 31;
        p = g-h+n+114 % 31;
        day = p+1 / 1;
        if(month == 3){
            monthStr = "March";
        } else {
            monthStr = "April";
        JOptionPane.showMessageDialog(null, "Easter will fall"+" on Sunday, "+monthStr+" "+day+", "+year);
        }
    }
    
}
