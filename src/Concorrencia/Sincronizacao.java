package Concorrencia;

/**
 * JAVA MUTITHREAD - Synchronized
 */

public class Sincronizacao {
    static int i = -1;

    public static void main(String[] args) {
        MeuRunnable runnable = new MeuRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

//    public synchronized static void imprime() {
//        synchronized (Sincronizacao.class){
//        i++;
//        String name = Thread.currentThread().getName();
//        System.out.println(name + ":" + i);}
//    }

    public static class MeuRunnable implements Runnable {
        //        static Object lock1 = new Object();
//        static Object lock2 = new Object();
        @Override
        // public synchronized void run() { por método
        public void run() {
            synchronized (this) {
                i++;
                String name = Thread.currentThread().getName();
                System.out.println(name + ":" + i);
            }
        }
//            synchronized (lock1) { // por blocos de codigo
//                i++;
//                String name = Thread.currentThread().getName();
//                System.out.println(name + ":" + i);
//            }synchronized (lock2) { // por blocos de codigo
//                i++;
//                String name = Thread.currentThread().getName();
//                System.out.println(name + ":" + i);
//            }
    }
}

