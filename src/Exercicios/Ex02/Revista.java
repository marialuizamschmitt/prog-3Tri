package Exercicios.Ex02;

public class Revista extends Publicacao implements Reservavel{

    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void reservar() {

    }
}
