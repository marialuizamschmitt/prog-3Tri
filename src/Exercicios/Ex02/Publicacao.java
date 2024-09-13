package Exercicios.Ex02;

public abstract class  Publicacao {

    public String titulo;

    public String autor;

    public int anoPublicacao;

    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract void emprestar();
    public abstract void devolver();


}

