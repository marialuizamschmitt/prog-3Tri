package Aula32;

public class Lista <T>{
    private T[] elementos;
    private int tamanho;

    public Lista() {
        this(10);
    }

    public Lista (int capacidade){
        elementos = (T[]) new Object [capacidade];
        tamanho = 0;

    }

    private void aumentaCapacidade(){
        if(tamanho == elementos.length){
            T[] aux = (T[]) new Object[tamanho*2];
            for(int i=0;i<elementos.length;i++){
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
    }

    public void adiciona(T elemento){
        aumentaCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void adiciona (int posicao, T elemento){
        if(posicao<0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posicao "+posicao+"é invalido");
        aumentaCapacidade();
        for (int i=tamanho-1; i>=posicao;i--){
            elementos[i+1]=elementos[i];
        }
        elementos[posicao]=elemento;
        tamanho++;
    }

    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(T elemento) {
        int posicao = posicaoDe(elemento);
        if (posicao >= 0) {
            remove(posicao);
            return true;
        }
        return false;
    }

    public T remove (int posicao){
        if(posicao<0 || posicao >=tamanho)
            throw new IllegalArgumentException("Poscicao "+posicao+" é inválida");
        T copia = elementos[posicao];
        for(int i=posicao;i<tamanho-1; i++){
            elementos[i]=elementos[i+1];
        }
        tamanho--;
        return copia;
    }

    public int posicaoDe(T elemento){
        for(int i=0;i<tamanho;i++) {
            if (elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }

    public int ultimaPosicaoElemento(T elemento) {
        for (int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }

    public void limpar() {
        elementos = (T[]) new Object[elementos.length];
        tamanho = 0;
    }

    //tamanho da lista
    public int tamanho() {
        return tamanho;
    }

    //verifica se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    public T obter(int posicao){
        if(posicao<0 || posicao>=tamanho)
            throw new IllegalArgumentException("Posição "+posicao+" é inválida");
        return elementos[posicao];
    }

    /**
     * Método que retorna a lita em formato de String
     * @return se a lista estiver vazia = [], se a lista possuir elementos
     * retorna [1, 2, 3, 4, ...]
     */
    @Override
    public String toString(){
        String retorno = "[";
        if(tamanho>0){
            for(int i=0;i<tamanho-1;i++)
                retorno+=elementos[i]+", ";
            retorno+=elementos[tamanho-1];
        }
        return retorno+"]";
}

}
