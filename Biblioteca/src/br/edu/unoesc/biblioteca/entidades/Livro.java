package br.edu.unoesc.biblioteca.entidades;



public class Livro {

    private int isbn;
    private String nome;
    private String autor;
    private int edicao;
    private int anoDePublicacao;
    private String editora;
    private String resumoDoLivro;

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setResumoDoLivro(String resumo){
        this.resumoDoLivro = resumo;
    }
    
    public String getResumoDoLivro(){
        return this.resumoDoLivro;
    }
    
}
