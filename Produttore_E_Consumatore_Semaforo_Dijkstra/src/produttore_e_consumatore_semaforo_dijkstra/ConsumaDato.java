package produttore_e_consumatore_semaforo_dijkstra;

public class ConsumaDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public ConsumaDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    public void run(){
        while(true){
            pieno.P();
            dato = Main.buffer;
            System.out.println("Lettore: dato letto " + dato);
            vuoto.V();
        }
    }
}
