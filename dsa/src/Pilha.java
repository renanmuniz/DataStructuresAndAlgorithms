import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        //Pilha
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


        //Exemplo de uso real:
        //Stack trace de erro de exceção
        //Ir para página visitada anteriormente ou posteriormente
        System.out.println("\n--- Exemplo De Usos Reais ---");
        System.out.println("Navegação entre páginas anterior/posterior no navegador:\n");

        Stack<String> urlAnterior = new Stack<>();
        Stack<String> urlPosterior = new Stack<>();

        System.out.println("Inicio na página do Google:");
        urlAnterior.push("google.com.br");

        System.out.println("\nVou para gmail:");
        urlPosterior.push("gmail.com");

        System.out.println("URL ANTERIOR: " + urlAnterior);
        System.out.println("URL POSTERIOR: " + urlPosterior);

        System.out.println("\nvou do gmail para outlook:");
        urlAnterior.push("gmail.com");
        urlPosterior.pop();
        urlPosterior.push("outlook.com");

        System.out.println("URL ANTERIOR: " + urlAnterior);
        System.out.println("URL POSTERIOR: " + urlPosterior);

        System.out.println("\nvou do outlook para duckduckgo:");
        urlAnterior.push("outlook.com");
        urlPosterior.pop();
        urlPosterior.push("duckduckgo.com");

        System.out.println("URL ANTERIOR: " + urlAnterior);
        System.out.println("URL POSTERIOR: " + urlPosterior);

        System.out.println("\nvolto para outlook:");
        urlAnterior.pop();
        urlPosterior.push("outlook.com");

        System.out.println("URL ANTERIOR: " + urlAnterior);
        System.out.println("URL POSTERIOR: " + urlPosterior);

        System.out.println("\nvolto mais um para gmail:");
        urlAnterior.pop();
        urlPosterior.push("gmail.com");

        System.out.println("URL ANTERIOR: " + urlAnterior);
        System.out.println("URL POSTERIOR: " + urlPosterior);

        System.out.println("\navanço de volta para outlook:");
        urlPosterior.pop();
        urlAnterior.push("gmail.com");

        System.out.println("URL ANTERIOR: " + urlAnterior);
        System.out.println("URL POSTERIOR: " + urlPosterior);

        System.out.println("\nse digito novo endereço(youtube.com) e não navego pelo anteorior/posterior:");
        urlPosterior.clear(); //limpa sequencia posterior pois mudou o destino da navegação
        urlAnterior.push("outlook.com"); //salva o endereço que tava na anterior
        urlPosterior.push("youtube.com"); //vai para novo endereço

        System.out.println("URL ANTERIOR: " + urlAnterior);
        System.out.println("URL POSTERIOR: " + urlPosterior);



    }
}
