package ar.com.eduit.javadv.clase01;

public class Clase01 {
    public static void main(String[] args) {
        /*
        Curso: Java Advanced    15 Horas
        Días: Miércoles 10:00h a 13:00 hs
        Profe: Carlso Ríos  carlosrios@educacionit.com
        Materiales: alumni.educacionit.com
        */
        
        System.out.println("Version de java: " + System.getProperty("java.version"));
        System.out.println("Cantidad de nucleos: " + Runtime.getRuntime().availableProcessors());
        
        /*
            Tarea 1: Cargar archivo1 del medio a    10s
            Tarea 2: Cargar archivo2 del medio b    10s
            Tarea 3: Abrir un formulario y mostrar contenido de los archivos    1s
                 10s        10s    1s           Tiempo Total: 21s
            |----------|----------|-|
                Tarea1    Tarea2   Tarea3
        
            /En paralelo se ejecutan los procesos usando hilos (Threads)
                10s
            |----------|
                Tarea1
                10s
            |----------|
                Tarea2
                         1s
                        |-|
                         Tarea3
            /Tiempo Total: 11s
        
            /
                10s
            |----------|
                Tarea1
                10s
            |----------|
                Tarea2
             1s
            |-|
             Tarea3
            /Tiempo Total: 11s
        */
        
        //Declaracion de clase interna
        class Hilo extends Thread{
            private String nombre;

            public Hilo(String nombre) {
                this.nombre = nombre;
            }
            
            @Override
            public void run(){
                //Este método se ejecuta en un hilo nuevo.
                for(int a = 1; a<= 10; a++){
                    System.out.println(nombre + " " + a);
                    try {Thread.sleep(1000);}catch (Exception e){}
                }
            }
        }//Cierra la clase interna (Hilo)
        
        Hilo hilo1 = new Hilo("hilo1");
        Hilo hilo2 = new Hilo("hilo2");
        Hilo hilo3 = new Hilo("hilo3");
        Hilo hilo4 = new Hilo("hilo4");
        
        //El método run() no se ejecuta en un hilo nuevo.
        //hilo1.run();
        //hilo2.run();
        //hilo3.run();
        //hilo4.run();
        
        //El método start() ejecuta el método run() en un hilo nuevo
        //hilo1.start();
        //hilo2.start();
        //hilo3.start();
        //hilo4.start();
        
        //Hilo anónimo (No tiene una forma de llamarlo)
        //new Hilo("hilo5").start();
        
        //Lanza java.lang.IllegalThreadStateExceptionhilo3. No se puede startear 2 veces
        //hilo1.start();
        
        //Interface Runneable
        class HiloRunnable implements Runnable{ //Asi se puede desocupar la herencia.
            private String nombre;

            public HiloRunnable(String nombre) {
                this.nombre = nombre;
            }
            
            @Override
            public void run() {
                for(int a = 1; a <= 10; a++) {
                    System.out.println(nombre + " " + a);
                    try {Thread.sleep(1000);}catch(Exception e) {}
                }
            }
        }//Cierra clase HiloRunnable
        
        HiloRunnable hiloR1 = new HiloRunnable("hiloR1");
        HiloRunnable hiloR2 = new HiloRunnable("hiloR2");
        HiloRunnable hiloR3 = new HiloRunnable("hiloR3");
        HiloRunnable hiloR4 = new HiloRunnable("hiloR4");
        
        Thread tHiloR1 = new Thread(hiloR1);
        Thread tHiloR2 = new Thread(hiloR2);
        Thread tHiloR3 = new Thread(hiloR3);
        Thread tHiloR4 = new Thread(hiloR4);
        
        tHiloR1.start();
        tHiloR2.start();
        tHiloR3.start();
        tHiloR4.start();
        
        //HiloRunnable anónimo
        new Thread(new HiloRunnable("hiloR5")).start();
    }//Cierra el metodo main
}//Cierra la clase principal
