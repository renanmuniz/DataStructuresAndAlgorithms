package linkedList;

import java.util.LinkedList;

public class ListaEncadeadaUsoPratico {
    public static void main(String[] args) {
        //Uso prático de lista encadeada:
        //Implementação de uma playlist.

        LinkedList<String> playlist = new LinkedList<>();

        playlist.offer("musica1");
        playlist.offer("musica2");
        playlist.offer("musica3");
        playlist.offer("musica4");
        playlist.offer("musica5");
        playlist.offer("musica6");

        //exibindo a playlist:
        System.out.println(playlist);

        //tocou musica1:
        playlist.poll();

        //exibindo a playlist:
        System.out.println(playlist);

        //tocou musica2:
        playlist.poll();
        //tocou musica3:
        playlist.poll();

        //exibindo a playlist:
        System.out.println(playlist);

        //adicionou mais uma musica:
        playlist.offer("musica7");

        //adicionou mais uma musica:
        playlist.offer("musica8");

        //exibindo a playlist:
        System.out.println(playlist);

        //tocou musica4:
        playlist.poll();

        //exibindo a playlist:
        System.out.println(playlist);
    }
}
