package Aula31.exemploInterface;

public class Vetor implements Lista {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    /**
     * Adiciona um elemento a lista
     * @param elemento elemento que será adicionado a lista
     */
    @Override
    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    @Override
    public String remove() {
        if (tamanho < 0) {
            return elementos[--tamanho];
        }
        return null;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }
    /**
     * Retorna a lista em formato de conjunto
     * @return [] = vazio ou ["Elemento 1", "Elemento 2", "Elemento n"]
     */
    @Override
    public String toString(){
        String resposta = "[";
        if (tamanho>0){
            for(int i=0;i<tamanho-1;i++){
                resposta+= elementos[i]+", ";
            }
            resposta+= elementos[tamanho-1];
        }
        resposta+="]";
        return resposta;
    }
}
