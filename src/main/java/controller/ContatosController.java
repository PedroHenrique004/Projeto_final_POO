package controller;

import model.GerenciadorDeContatos; // Importa do pacote model
import model.Contato;              // Importa do pacote model
import view.ContatosView;          // Importa do pacote view

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContatosController {
    private GerenciadorDeContatos model;
    private ContatosView view;

    public ContatosController(GerenciadorDeContatos model, ContatosView view) {
        this.model = model;
        this.view = view;

        view.getAdicionarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = view.getNomeField().getText();
                String telefone = view.getTelefoneField().getText();
                model.adicionarContato(nome, telefone);
                view.getNomeField().setText("");
                view.getTelefoneField().setText("");
            }
        });

        view.getListarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder contatosText = new StringBuilder();
                for (Contato contato : model.listarContatos()) {
                    contatosText.append(contato.toString()).append("\n");
                }
                view.getContatosArea().setText(contatosText.toString());
            }
        });

        view.getRemoverButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = view.getNomeField().getText();
                model.removerContato(nome);
                view.getNomeField().setText("");
            }
        });
    }
}
