package util;

/**
 * Classe que representa o semaforo criado por Dijkstra
 */
public class Semaphore {
    
    private int value;
    
    public Semaphore(int v) {
        value = v;
    }
    
    public synchronized void down() {
        while (value <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value--;
    }
    
    public synchronized void up() {
        ++value;
        notify();
    }
}
