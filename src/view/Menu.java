package view;

import javax.swing.JOptionPane;

public class Menu {
    public static int show(Object[] opcoes){

        int escolha = JOptionPane.showOptionDialog(null, "O que deseja fazer ?", "Sistema",JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        opcoes,
        opcoes[0]);
        return escolha;
    }
}
