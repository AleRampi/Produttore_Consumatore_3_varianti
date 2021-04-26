package produttore_e_consumatore_semaforo_dijkstra;

public class Semaforo {
    int valore;
    public Semaforo(int valore){
        this.valore = valore;
    }
    
    synchronized public void P(){
        while(valore == 0){
            try{
                wait();
            } catch(InterruptedException e) {
            }
        }
        valore--;
    }
    synchronized public void V(){
        valore++;
        notify();
    }
}
