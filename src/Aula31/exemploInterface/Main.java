package Aula31.exemploInterface;

public class Main {
    public static void main(String[] args) {
        Vetor v1= new Vetor(10);

        v1.adiciona("Elemento 1");
        v1.adiciona("Elemento 2");
        v1.adiciona("Elemento 3");
        v1.adiciona("Elemento 4");

        System.out.println("Qual o tamanho da lista: "+v1.tamanho());
        System.out.println(v1);
        System.out.println("Removendo o elemento: "+v1.remove());
        System.out.println(v1);

        //métodos disponíveis apenas na classe nao poderão ser instanciados na interface
        Lista l1 = new Vetor(5); //lista foi criado com o construtor de Vetor
        l1.adiciona("Teste");
        l1.adiciona("Teste 2");
        l1.remove();
        l1.tamanho();
        System.out.println(l1);
        //Para criar uma instância de uma interface, precisa-se usar o construtor de uma classe que o implemente,
        //Desta forma, estarão disponíveis na instância criada apenas os métodos comuns a interface e a classe, com o
        //comportamento implementado na classe.
    }
}
