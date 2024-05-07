package AulaMT;

/**
 *  Implementação do metodo Runnable para uso em threads
 */
public class InterfaceRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
