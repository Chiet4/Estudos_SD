package AulaMT;

/**
 *  JAVA MULTITHREAD - Threads e Runnable
 *  Criar threads, criam novas linhas de execução de acordo com a quantidaded de nucleos
 *
 */

public class Main {
    public static void main(String[] args) {
        // Somente Thread atual
        Thread j = Thread.currentThread();
        System.out.println(j.getName());

        InterfaceRunnable myRunn =new InterfaceRunnable();
        // Crir nova thread
        Thread t1 = new Thread(myRunn);
        //t1.run(); apenas executa na mesma thread
        //t1.start(); // executa em uma nova Thread

        // Runnable como lambda --- Bem mais eficas do que criar outra classe
        Thread t2 = new Thread( () -> System.out.println(Thread.currentThread().getName()));
        //t2.start();
        //t2.start(); não pode iniciar a thread mais de uma vez

        // varías threads podem executar o mesmo processo ou o mesmo objeto
        Thread t3 = new Thread(myRunn);

        // execução em palalelo, uma pode executar antes da outra
        t1.start();
        t2.start();
        t3.start();
    }
}