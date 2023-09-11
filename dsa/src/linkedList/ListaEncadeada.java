package linkedList;

import java.util.LinkedList;

public class ListaEncadeada {
    public static void main(String[] args) {
        //LinkedList funciona como se fosse um array, porem para
        //inserir e remover elementos é mais performatico, pois nao aloca uma faixa toda de memoria.
        //vai alocando um a um e cada elemento possui alem do dado um ponteiro para o anterior e proximo nó. O^1
        //no caso de arrays, ao inserir/remover elementos, os outros são deslocados de posição.
        //na linkedList não, o elemento apenas é adicionado e é ajustado seus ponteiros para anterior/proximo

        //desvantagem em casos de busca O^n, pois nao estão na mesma posicao de memoria e tem que ficar redirecionando
        //nao tem indice  ex.: myList[0]
        //consome mais memoria por conta dos ponteiros de anterior/proximo.

        LinkedList<String> linkedList = new LinkedList<>();

        //inserindo com push funciona como uma pilha, first-in last-out
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.push("F");

        while(!linkedList.isEmpty()) {
            System.out.println(linkedList.pop());
        }

        //----------
        System.out.println("Garantindo a ordem de insercao dos elementos:");

        LinkedList<String> linkedList2 = new LinkedList<>();

        //inserindo com offer funciona como uma fila, first-in first-out
        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("F");

        linkedList2.add(4,"E"); //inserir elemento na lista na posicao desejada.
        while(!linkedList2.isEmpty()) {
            System.out.println(linkedList2.pop());
        }


        //linkedList.poll() retorna nulo se a lista estiver vazia
        //linkedList.pop() joga exceção se a lista estiver vazia

        //poll()
        System.out.println("Removendo com poll()");
        LinkedList<String> linkedListPoll = new LinkedList<>();

        linkedListPoll.offer("1");
        linkedListPoll.offer("2");

        System.out.println(linkedListPoll.poll());
        System.out.println(linkedListPoll.poll());
        System.out.println(linkedListPoll.poll());

        //pop()
        System.out.println("Removendo com pop()");
        LinkedList<String> linkedListPop = new LinkedList<>();

        linkedListPoll.offer("1");
        linkedListPoll.offer("2");

        try{
            System.out.println(linkedListPoll.pop());
            System.out.println(linkedListPoll.pop());
            System.out.println(linkedListPoll.pop());
        } catch (Exception e) {
            System.out.println("Pop lança exceção: " + e);
        }


        System.out.println("fim.");
    }
}
