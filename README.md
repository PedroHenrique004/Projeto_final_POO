# 📋 Lista de Contatos

Uma aplicação em **Java** para gerenciar uma lista de contatos com funcionalidades de *adicionar, listar* e *remover*. A interface gráfica é implementada com as bibliotecas **AWT** e **Swing** e segue o padrão de arquitetura **MVC** (Model-View-Controller).

---

## ⚙️ Funcionalidades

- ➕ **Adicionar** um contato informando nome e telefone.
- 📋 **Listar** todos os contatos cadastrados.
- 🗑️ **Remover** contatos pelo nome.
- 🖥️ Interface gráfica simples e intuitiva.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java  
- **IDE:** NetBeans  
- **Bibliotecas:** AWT e Swing  

---

## 🗂️ Estrutura do Projeto

O projeto segue o padrão **MVC** (Model-View-Controller) para uma organização clara e modular.

### 1. **Model (Modelo)**  
Define a lógica de dados da aplicação.  

- **Contato**: Classe que representa um contato, contendo os atributos `nome` e `telefone`.
- **GerenciadorDeContatos**: Classe responsável por gerenciar a lista de contatos com métodos para adicionar, listar e remover.

### 2. **View (Visão)**  
Define a interface gráfica da aplicação.  

- **ContatosView**: Classe que utiliza Swing para criar a interface do usuário, com campos de texto, botões e área de texto para exibição.

### 3. **Controller (Controlador)**  
Gerencia a interação entre a interface gráfica e os dados.  

- **ContatosController**: Classe que conecta os eventos da interface (como cliques nos botões) às operações realizadas no modelo.

### 4. **Main**  
O ponto de entrada da aplicação, que inicializa o **modelo**, a **visão** e o **controlador**.

