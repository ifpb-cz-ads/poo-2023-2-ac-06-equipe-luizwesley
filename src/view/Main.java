package view;

import javax.swing.*;

import dao.UsuarioDao;
import model.Usuario;

public class Main {
    public static void main(String[] args) {

        

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
            String email = (String) JOptionPane.showInputDialog("Digite seu email:");
            String senha = (String) JOptionPane.showInputDialog("Digite sua senha:");
            UsuarioDao dao = new UsuarioDao();
            if (dao.addUsuario(new Usuario(email, senha))) {
                System.out.println("Salvo com sucesso!");
            } else {
                System.out.println("Falha ao salvar!");
        }

        if (escolha == 1){
            // Pegar input do usuario e senha, verificar se está cadastrado e mostrar opções para CRUD dos contatos!!
        }

       

       

        int retorno = JOptionPane.showConfirmDialog(null,
                "Deseja continuar?", "Mensagem do sistema",
                JOptionPane.YES_NO_OPTION);

        if(retorno == JOptionPane.YES_OPTION){
            // Voltar para opções de crud
        }
        if(retorno == JOptionPane.NO_OPTION){
            // Voltar para antes de acessar usuário (linha 18)
        }
        if(retorno == JOptionPane.CLOSED_OPTION){
            JOptionPane.showMessageDialog(null,
                    "Obrigado");
        }

    }
}
}