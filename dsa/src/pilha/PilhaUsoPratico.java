package pilha;

import java.time.LocalDateTime;
import java.util.Stack;

public class PilhaUsoPratico {
    static Stack<String> urlAnterior = new Stack<>();
    static Stack<String> urlPosterior = new Stack<>();
    static String urlAtual;

    public static void main(String[] args) {

        //pilha.Pilha - Uso Prático
        //Navegação para página anterior/posterior do navegador.

        System.out.println("\n--- Exemplo De Usos Reais ---");
        System.out.println("\nNavegação entre páginas anterior/posterior no navegador:");

        navegar("google.com");
        navegar("gmail.com");
        navegar("youtube.com");
        voltar();
        avancar();
        voltar();
        voltar();
        navegar("outlook.com");
        voltar();
        voltar();
        voltar();
        voltar();
        avancar();
        avancar();
        avancar();
    }

    public static void navegar(String endereco) {
        System.out.println("Navegando para o endereço digitado: " + endereco);
        urlAnterior.push(endereco);
        if(!urlPosterior.isEmpty()) {
            urlPosterior.clear();
        }

        System.out.println("URL VISITADA: " + urlAnterior);
        System.out.println("URL POSTERIOR: " + urlPosterior);
        System.out.println();
    }

    public static void voltar() {
        if(!urlAnterior.isEmpty()) {
            System.out.println("<- Botão voltar");
            urlPosterior.push(urlAnterior.pop());

            System.out.println("URL VISITADA: " + urlAnterior);
            System.out.println("URL POSTERIOR: " + urlPosterior);
            System.out.println();
        } else {
            System.out.println("Não há páginas para voltar.\n");
        }
    }

    public static void avancar() {
        if(!urlPosterior.isEmpty()) {
            System.out.println("-> Botão avançar");
            urlAnterior.push(urlPosterior.pop());

            System.out.println("URL VISITADA: " + urlAnterior);
            System.out.println("URL POSTERIOR: " + urlPosterior);
            System.out.println();
        } else {
            System.out.println("Não há páginas para avancar.\n");
        }

    }

}
