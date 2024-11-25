package view;

import javax.swing.*;
import java.awt.*;

public class ContatosView extends JFrame {
    private JTextField nomeField;
    private JTextField telefoneField;
    private JTextArea contatosArea;
    private JButton adicionarButton, listarButton, removerButton;

    public ContatosView() {
        setTitle("Lista de Contatos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Nome:"));
        nomeField = new JTextField(20);
        add(nomeField);

        add(new JLabel("Telefone:"));
        telefoneField = new JTextField(20);
        add(telefoneField);

        adicionarButton = new JButton("Adicionar");
        add(adicionarButton);

        listarButton = new JButton("Listar");
        add(listarButton);

        removerButton = new JButton("Remover");
        add(removerButton);

        contatosArea = new JTextArea(10, 30);
        contatosArea.setEditable(false);
        add(new JScrollPane(contatosArea));
    }

    public JTextField getNomeField() { return nomeField; }
    public JTextField getTelefoneField() { return telefoneField; }
    public JButton getAdicionarButton() { return adicionarButton; }
    public JButton getListarButton() { return listarButton; }
    public JButton getRemoverButton() { return removerButton; }
    public JTextArea getContatosArea() { return contatosArea; }
}

