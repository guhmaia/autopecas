package modelo;

import visao.TelaLogin;

public class Principal {

    
    public static void main(String[] args) {
        TelaLogin tela = new TelaLogin();
        tela.setSize(400, 350);
        tela.setResizable(false);
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }
    
}
