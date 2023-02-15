package Control1;

public class ThreadUtil {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        printIfDaemon(thread);
        getName(thread);


        
    }
    public static boolean printIfDaemon(Thread thread){
        /*if (thread.isDaemon() == true) {
            System.out.println("daemon");
        } else {
            System.out.println("not daemon");
        }*/
        System.out.println(thread.isDaemon() ? "Daemon" : "Not Daemon");
        return thread.isDaemon();
    }
    public static String getName(Thread thread) {
        thread.setName("my-thread");
        System.out.println(thread.getName());
        return thread.getName();
    }
}
