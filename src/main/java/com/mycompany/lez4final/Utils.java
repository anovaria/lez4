/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez4final;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Utils {
    static String toUpp(String parola){
        String ris="";
        String first=parola.substring(0, 1).toUpperCase();
        String others=parola.substring(1, parola.length()).toLowerCase();
        ris = first + others;
        return ris;
        
    }
        
    
    static int AskInt(String ask) {
        String strInt;
        int ris = 0;
        boolean skif = true;
        while (skif) {
            strInt = JOptionPane.showInputDialog(ask);
            try {
                ris = Integer.parseInt(strInt);
                skif = false;

            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, err);

            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, err);

            }

        }
        return ris;
    }

    static int AskInt(String ask, int min, int max) {
        String strInt;
        int ris = 0;
        boolean skif = true;
        while (skif) {
            strInt = JOptionPane.showInputDialog(ask + "minimo" + min + "masimo" + max);
            try {
                ris = Integer.parseInt(strInt);
                if (ris >= min && ris <= max) {
                    skif = false;
                } else {
                    JOptionPane.showMessageDialog(null, "numero non corretto!!");
                }

            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, err);

            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, err);

            }

        }
        return ris;
    }

    static float AskFloat(String ask, int min, int max) {
        String strFloat;
        float ris = 0;
        boolean skif = true;
        while (skif) {
            strFloat = JOptionPane.showInputDialog(ask + "minimo" + min + "masimo" + max);
            try {
                ris = Float.parseFloat(strFloat);
                if (ris >= min && ris <= max) {
                    skif = false;
                } else {
                    JOptionPane.showMessageDialog(null, "numero non corretto!!");
                }

            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, err);

            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, err);

            }

        }
        return ris;
    }
}
