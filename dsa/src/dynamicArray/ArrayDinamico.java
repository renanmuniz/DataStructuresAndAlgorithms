package dynamicArray;

import java.util.ArrayList;

public class ArrayDinamico {
    //Complexidade O(1) para inserir ao final
    //Complexidade O(1) para deletar ao final
    //Complexidade O(n) para buscar pois precisar percorrer todos os elementos
    //Vantagens:  Acesso randomico aos elementos sem precisar percorrer um a um O(n)
    //            Diferente da linkedList, em que os dados estao separados e com referencia para prox/anterior,
    //            no arrayList estão alocados sequencialmente na memória.
    //            rapido para inserir/deletar elementos no final, pois nao precisa realocar os elementos
    //Desvantagens: Maior consumo de memoria, pois aloca mais memoria do que contem de elementos para possiveis adicoes
    //              Trocar elementos de posicao caso adicione/remova elementos que nao sejam no fim consome tempo O(n)
    //              Redimensionar o array em casos de adicao/remocao de elementos consome tempo O(n)
    //Capacidade padrão definida de 10 elementos.
    //Pode ser alterada passando como argumento no construtor a quantidade de elementos desejada.
    //Ex.: ArrayList<String> arrayList = new ArrayList<>(1000);


    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>(10);
        myArrayList.add("abc");
        myArrayList.add("def");
        System.out.println(myArrayList);
        myArrayList.add("ghi");
        myArrayList.remove("def");
        System.out.println(myArrayList);
        myArrayList.add(0,"123");
        myArrayList.add("jkl");
        myArrayList.remove(1);
        System.out.println(myArrayList);
    }






}
