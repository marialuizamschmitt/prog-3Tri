package Exercicios.Ex02;

public class Livro extends Publicacao implements Reservavel{

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {
        System.out.println("Livro '" + titulo + "' emprestado.");
    }

    @Override
    public void devolver() {
        System.out.println("Livro '" + titulo + "' devolvido.");
    }

    @Override
    public void reservar() {
        System.out.println("Livro '" + titulo + "' reservado.");
    }
}
