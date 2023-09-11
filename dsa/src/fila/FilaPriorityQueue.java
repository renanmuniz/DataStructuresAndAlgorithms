package fila;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaPriorityQueue {
    public static void main(String[] args) {
        // É uma fila (FIFO) mas que é ordenada.

        //Exemplo 1: Ordem alfabetica.
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("B");
        queue.offer("E");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println();

        //Exemplo 1: Ordem alfabetica reversa.
        Queue<String> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        queue2.offer("C");
        queue2.offer("A");
        queue2.offer("F");
        queue2.offer("B");
        queue2.offer("E");
        queue2.offer("D");

        while(!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
        System.out.println();

        //Exemplo adicionando elementos mesmo apos tirar outros:

        Queue<String> queue3 = new PriorityQueue<>();

        queue3.offer("C");
        queue3.offer("A");
        queue3.offer("F");
        queue3.offer("E");
        queue3.offer("D");

        System.out.println("Removendo: " + queue3.poll());

        queue3.offer("B");
        queue3.offer("G");

        while(!queue3.isEmpty()) {
            System.out.println(queue3.poll());
        }
        System.out.println();


        //Exemplo adicionando elementos mesmo apos tirar outros em ordem reversa:

        Queue<String> queue4 = new PriorityQueue<>(Collections.reverseOrder());

        queue4.offer("C");
        queue4.offer("A");
        queue4.offer("F");
        queue4.offer("E");
        queue4.offer("D");

        System.out.println("Removendo: " + queue4.poll());

        queue4.offer("B");
        queue4.offer("G");

        while(!queue4.isEmpty()) {
            System.out.println(queue4.poll());
        }
        System.out.println();


        //Funciona com números também e qualquer tipo de objeto que possa ser ordenado

        Queue<Double> queue5 = new PriorityQueue<>();

        queue5.offer(1.7);
        queue5.offer(2.5);
        queue5.offer(1.2);
        queue5.offer(0.5);
        queue5.offer(3.0);

        while(!queue5.isEmpty()) {
            System.out.println(queue5.poll());
        }
        System.out.println();



    }
}
