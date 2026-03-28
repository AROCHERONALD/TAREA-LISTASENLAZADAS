package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

public final class LinkedListChallenges {

    private LinkedListChallenges() {
    }

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        challenge1CountOccurrences();
        challenge2Clean();
        challenge3ReverseInPlace();
        challenge4RemoveDuplicates();
        System.out.println();
    }

    private static void challenge1CountOccurrences() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("LOGIN");

        System.out.println("Reto 1 - Count Occurrences");
        System.out.println("Eventos: " + eventos);
        System.out.println("Resultado esperado para LOGIN: 3");
        System.out.println("Resultado obtenido: " + eventos.countOccurrences("LOGIN"));
        System.out.println();
    }

    private static void challenge2Clean() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(10);
        numeros.addLast(20);
        numeros.addLast(30);

        System.out.println("Reto 2 - Clean");
        System.out.println("Antes: " + numeros + " size: " + numeros.size());
        int eliminados = numeros.clean();
        System.out.println("Nodos eliminados: " + eliminados);
        System.out.println("Despues: " + numeros + " size: " + numeros.size());
        System.out.println();
    }

    private static void challenge3ReverseInPlace() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(2);
        numeros.addLast(4);
        numeros.addLast(5);
        numeros.addLast(6);

        System.out.println("Reto 3 - Reverse In Place");
        System.out.println("Antes: " + numeros);
        numeros.reverseInPlace();
        System.out.println("Despues: " + numeros);
        System.out.println();
    }

    private static void challenge4RemoveDuplicates() {
        SinglyLinkedList<String> letras = new SinglyLinkedList<>();
        letras.addLast("A");
        letras.addLast("B");
        letras.addLast("A");
        letras.addLast("C");
        letras.addLast("B");
        letras.addLast("D");

        System.out.println("Reto 4 - Remove Duplicates");
        System.out.println("Antes: " + letras);
        int eliminados = letras.removeDuplicates();
        System.out.println("Duplicados eliminados: " + eliminados);
        System.out.println("Despues: " + letras);
        System.out.println();
    }
}