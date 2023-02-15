package ClassForThreads;

public class ClassForThreads {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread(); // текущий поток

        System.out.println("Name: " + thread.getName());
        System.out.println("ID: " + thread.getId());
        System.out.println("Alive: " + thread.isAlive());
        System.out.println("Priority: " + thread.getPriority());
        System.out.println("Daemon: " + thread.isDaemon());
        // Daemon thread - демон поток (терминология UNIX) т.е. это
        // потом с низким приоритетом, который работает на заднем фоне для
        // выполнения таких задач как сбор мусора и так далее
        thread.setName("my-thread");
        System.out.println("New name: " + thread.getName());
    }
}
