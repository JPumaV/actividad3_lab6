public class Test {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> queue = new PriorityQueueLinkSort<>();

        queue.enqueue("Tarea baja", 1);
        queue.enqueue("Tarea media", 5);
        queue.enqueue("Tarea alta", 10);
        queue.enqueue("Tarea urgente", 15);

        System.out.println("Cola después de agregar elementos:");
        System.out.println(queue);

        try {
            System.out.println("Elemento al frente: " + queue.front());
            System.out.println("Elemento al final: " + queue.back());

            System.out.println("Eliminando elemento con mayor prioridad: " + queue.dequeue());
            System.out.println("Cola después de eliminar:");
            System.out.println(queue);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}
