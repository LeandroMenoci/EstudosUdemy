package Colecoes;

import java.util.LinkedList;
import java.util.Queue;
public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportameno ocorre quando a fila está cheia
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafael");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elementos da fila (sem remover)
        // Diferença é o comportameno ocorre quando a fila está vazia
        System.out.println(fila.peek()); // retorna null se a fila estiver vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção (java.util.NoSuchElementException)
        System.out.println(fila.element());

        // fila.size(); // saber o tamanho da fila
        // fila.clear(); // limpar a fila
        // fila.isEmpty(); // para saber se a fila está ou não vazia
        // fila.contains(); // para saber se determinado item contém na fila

        // Poll e Remove -> obter o próximo elemento da fila e remove!
        // Diferença é o comportameno ocorre quando a fila está vazia
        System.out.println(fila.poll()); // retorna null se a fila estiver vazia
        System.out.println(fila.remove());// Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
