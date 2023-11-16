package view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //ImageIcon imageIcon = new ImageIcon("icone.png");

       JOptionPane.showMessageDialog(null,
               "Bem Vindo", "Mensagem do sistema",
               JOptionPane.INFORMATION_MESSAGE);

        
        
        Object[] opcoes = {"Cadastrar Usuário", "Acessar Usuario"};
        
        int escolha = JOptionPane.showOptionDialog(null, "O que deseja fazer ?", "Sistema",JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        opcoes,
        opcoes[0]);

        if(escolha == 0){
            String nome = (String) JOptionPane.showInputDialog("Digite seu nome:");
            String senha = (String) JOptionPane.showInputDialog("Digite sua senha:");
            // Falta Criar o usuário!!!!
        }

        if (escolha == 1){
            // egar input do usuario e senha, verificar se está cadastrado e mostrar opções para CRUD dos contatos!!
        }

       

       

        int retorno = JOptionPane.showConfirmDialog(null,
                "Deseja continuar?", "Mensagem do sistema",
                JOptionPane.YES_NO_OPTION);

        if(retorno == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    "Escolheu sim");
        }
        if(retorno == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,
                    "Escolheu não");
        }
        if(retorno == JOptionPane.CLOSED_OPTION){
            JOptionPane.showMessageDialog(null,
                    "Fechou");
        }

    }
}