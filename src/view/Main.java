package view;

import java.util.List;

import javax.swing.*;

import dao.UsuarioDao;
import model.Usuario;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
        "Bem Vindo", "Mensagem do sistema",
        JOptionPane.INFORMATION_MESSAGE);
        
        while(true){
            UsuarioDao dao = new UsuarioDao();
            Object[] opcoes = {"Listar Usuários","Cadastrar Usuário", "Acessar Usuário"};      
            int escolha = Menu.show(opcoes);

            if(escolha == 0){
                List<Usuario> usuarios = dao.listarUsuarios();
                JOptionPane.showMessageDialog(null,
                usuarios, "Mensagem do sistema",
                JOptionPane.INFORMATION_MESSAGE);
            }
            else if(escolha == 1){
                String mensagem;
                String email = (String) JOptionPane.showInputDialog("Digite seu email:");
                String senha = (String) JOptionPane.showInputDialog("Digite sua senha:");
                if (dao.addUsuario(new Usuario(email, senha))) {
                    mensagem = "Salvo com sucesso!";
                } else {
                    mensagem = "Falha ao salvar!";
                }
                JOptionPane.showMessageDialog(null,
                mensagem, "Mensagem do sistema",
                JOptionPane.INFORMATION_MESSAGE);
            }

            else if (escolha == 2){
                String email = (String) JOptionPane.showInputDialog("Digite o email do usuário que você deseja acessar:");
                Usuario usuario = dao.buscarPorEmail(email);
                if(usuario != null){
                    JOptionPane.showMessageDialog(null,
                    usuario, "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "Usuário não encontrado!", "Mensagem do sistema",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(escolha == -1){
                break;
            }
            int retorno = JOptionPane.showConfirmDialog(null,
                "Deseja continuar?", "Mensagem do sistema",
                JOptionPane.YES_NO_OPTION);

            if(retorno == JOptionPane.YES_OPTION){
                
            }
            if(retorno == JOptionPane.NO_OPTION ||
                retorno == JOptionPane.CLOSED_OPTION){
                JOptionPane.showMessageDialog(null,"Obrigado",
                "Mensagem do Sistema",
                JOptionPane.INFORMATION_MESSAGE); 
                break;              
            }
        }
    }
}