package Aula32;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        //ArrayLits<tipo -> Integer/ Float/ Double/ pessoa>nome = new
        //ArrayList<>(capacidade->opiciomal)
        ArrayList<String>l1=new ArrayList<>();
        //Método para adiiconar elementos
        l1.add("A");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        l1.add("F");
        l1.add("G");
        System.out.println(l1);
        l1.add(1,"B");
        System.out.println(l1);
    }
}
