package model;

import java.util.ArrayList;

public class GerenciadorDeContatos {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public ArrayList<Contato> listarContatos() {
        return contatos;
    }

    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
    }
}

