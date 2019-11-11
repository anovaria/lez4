package com.mycompany.lez4final;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GestioneEsame {
//Attributi della classe

    static String nomeEsame;
    static int listaVoti[];
    static String[] listaCognomi;
    static String[] listaNomi;

    public static void main(String[] args) {
        // fase 1
        preparaEsame();
        // fase 2
        sessioneEsame();
        // fase 3
        correzioneEsami();

        // fase 4
        visTabellone();
    }

    static void preparaEsame() {
        //inizializza l' esame ovvero il registro
        nomeEsame = JOptionPane.showInputDialog("nome esame");
        int quanti = Utils.AskInt("Numero max alunni:", 1, 100);
        listaCognomi = new String[quanti];
        listaNomi = new String[quanti];
        listaVoti = new int[quanti];

    }

    private static void sessioneEsame() {
        //carico il registro
        for (int i = 0; i < listaCognomi.length; i++) {
            listaCognomi[i] = Utils.toUpp(JOptionPane.showInputDialog("cognome: " + (i + 1) + " di " + listaCognomi.length));
            listaNomi[i] = Utils.toUpp(JOptionPane.showInputDialog("nome:"));

        }

    }

    private static void correzioneEsami() {
//voti
        for (int i = 0; i < listaCognomi.length; i++) {
            String msg = "Inserisci voto di" + listaNomi[i] + listaCognomi[i];
            listaVoti[i] = Utils.AskInt(msg, 0, 100);

        }
    }

    private static void visTabellone() {
        String msg = "Nome Esame: "+nomeEsame+"\n";
        for (int i = 0; i < listaCognomi.length; i++) {
            msg = msg +  listaNomi[i] + " " + listaCognomi[i] + " voto: " + listaVoti[i]+"\n";
        }
        JOptionPane.showInternalMessageDialog(null, msg);

    }
}