package fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaUsoPratico {
    public static void main(String[] args) {

        //Fila
        //Uso prático - disparo de emails
        Queue<Email> emailsToSend = new LinkedList<>();
        emailsToSend.offer(new Email("cris", "bob", "test1", "this is my queue test1"));
        emailsToSend.offer(new Email("rob", "mary", "test2", "this is my queue test2"));
        emailsToSend.offer(new Email("peter", "john", "test3", "this is my queue test3"));
        emailsToSend.offer(new Email("sofie", "jane", "test4", "this is my queue teste4"));

        System.out.println("Enviando emails: " + emailsToSend);
        while (!emailsToSend.isEmpty()) {
            System.out.println("Sending email from " + emailsToSend.peek().from + " to " + emailsToSend.peek().to + " subject " + emailsToSend.peek().subject);
            emailsToSend.poll();

            System.out.println("Falta enviar: " + emailsToSend);
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Email {
    public String to;
    public String from;
    public String subject;
    public String text;

    public Email(String to, String from, String subject, String text) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
