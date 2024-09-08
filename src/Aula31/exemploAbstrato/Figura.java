package Aula31.exemploAbstrato;

public abstract class Figura {
    private String nomeFigura;
    public  String getNomeFigura(){
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura){
        this.nomeFigura = nomeFigura;
    }

    public abstract double calculaArea();
    public abstract double calculaPerimetro();

    @Override
    public String toString(){
        String retorno = "Nome: "+nomeFigura;
        retorno+="\narea: "+calculaArea();
        retorno+="\nperimetro: "+calculaPerimetro();
        return retorno;
    }
}
