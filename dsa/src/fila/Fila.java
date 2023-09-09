package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        //Fila
        //FIFO - First in, first out.
        //Primeiro a entrar é o primeiro a sair.

        Queue<String> queue = new LinkedList<String>();
        System.out.println("Is empty? " + queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println("Is empty? " + queue.isEmpty());
        System.out.println("Quantidade de elementos na fila: " + queue.size());
        System.out.println("Steve existe na fila? " + queue.contains("Steve"));
        System.out.println("Cris existe na fila? " + queue.contains("Cris"));
        System.out.println(queue);

        System.out.println(queue.peek()); //Retorna(sem remover) o primeiro da fila.

        String removed = queue.poll(); //Remove o primeiro da fila
        System.out.println(removed + " foi removido...");

        System.out.println(queue);

        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);
        queue.poll();  //poll() não dá exceção quando não tiver mais elementos.
        System.out.println(queue);


    }
}
