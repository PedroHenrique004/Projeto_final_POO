package controller;

import model.GerenciadorDeContatos;
import view.ContatosView;

public class main {
    public static void main(String[] args) {
        GerenciadorDeContatos model = new GerenciadorDeContatos();
        ContatosView view = new ContatosView();
        new ContatosController(model, view);
        view.setVisible(true);
    }
}
