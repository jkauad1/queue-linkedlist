package Main;

import classes.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue fila = new Queue();

        fila.enqueue(10);
        fila.enqueue(20);

        System.out.println(fila.getFront());
        System.out.println(fila.getRear());

        fila.enqueue(30);
        fila.enqueue(40);

        fila.dequeue();

        System.out.println("After dequeue");

    }
}