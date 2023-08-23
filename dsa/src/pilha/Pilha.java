package pilha;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        //pilha.Pilha
        //Estrutura de dados do tipo LIFO Last in First Out
        //Último a entrar é o primeiro a sair
        System.out.println("PILHA");
        Stack<String> pilha = new Stack<String>();

        System.out.println("Está vazia? " + pilha.isEmpty());
        System.out.println(pilha);

        pilha.push("Renan");
        pilha.push("Joao");
        pilha.push("Maria");
        pilha.push("Jose");

        System.out.println("Está vazia? " + pilha.isEmpty());
        System.out.println(pilha);

        pilha.pop(); //remove o ultimo adicionado
        System.out.println("Está vazia? " + pilha.isEmpty());
        System.out.println(pilha);

        pilha.pop();
        pilha.pop();
        pilha.pop();

        System.out.println("Está vazia? " + pilha.isEmpty());
        System.out.println(pilha);

        pilha.push("Alfredo");
        System.out.println("Está vazia? " + pilha.isEmpty());
        System.out.println(pilha);

        String nome = pilha.pop();
        System.out.println("NOME: " + nome);

        System.out.println("Está vazia? " + pilha.isEmpty());
        System.out.println(pilha);

        System.out.println("Ver sem remover:");
        pilha.push("Alberto");
        System.out.println("Está vazia? " + pilha.isEmpty());
        System.out.println(pilha);
        nome = pilha.peek();
        System.out.println("NOME: " + nome);
        System.out.println("Está vazia? " + pilha.isEmpty());
        System.out.println(pilha);

    }
}
