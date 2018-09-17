package ar.com.eduit.javad.clase02;

public class Clase02 {
    public static void main(String[] args) {
        //Sicronismo de Hilo
        class Hilo implements Runnable{
            private String nombre;
            private int ms;

            public Hilo(String nombre, int ms) {
                this.nombre = nombre;
                this.ms = ms;
            }
            
            @Override
            public void run(){
                for(int a = 1; a <= 10; a++){
                    System.out.println(nombre + " " + a);
                    
                    try {Thread.sleep(ms);} catch (Exception e) {}
                    Thread.yield();
                }
            }
        }//end class Thread
        Thread t1 = new Thread(new Hilo("Hilo 1", 1000));
        Thread t2 = new Thread(new Hilo("Hilo 2", 500));
        Thread t3 = new Thread(new Hilo("Hilo 3", 100));
        Thread t4 = new Thread(new Hilo("Hilo 4", 400));
        
        t1.setPriority(Thread.MIN_PRIORITY); //es de 1 a 10, min_prioriry es = 1
        t2.setPriority(Thread.NORM_PRIORITY); //NORM_PRIORITY = 5
        t3.setPriority(Thread.MAX_PRIORITY); //MAX_PRIORITY = 10
        t4.setPriority(4);
        
        System.out.println(t1.getState()); //State = NEW
        System.out.println(t1.isAlive());
        
        try{
            //t1.start();
            //t2.start();
            //t3.start();
            //t3.join(); //El hilo 4 no se startea hasta que termine el 3
            //t4.start();
            
            //t1.join();
            //t2.join();
            //t3.join(); //El hilo 3 se une al hilo principal (el hilo principal va a dejar de ejecutar hasta que el hilo 3 termine)
            //t4.join();
        }catch (Exception e) {}
        /* 
        try {Thread.sleep(200);} catch (Exception e) {}
        System.out.println(t1.getState()); //State = TIME_WAITING (lo agarramos asleep)
        System.out.println(t1.isAlive());
        
        try {Thread.sleep(10000);} catch (Exception e) {}
        System.out.println(t1.getState());
        System.out.println(t1.isAlive()); //STATE = TERMINATED (lo agarramos cuando cuando esta muerto)
        */
        //System.out.println("-- Fin del programa --");
        
        class Cuenta{
            private float saldo = 1000;
            
            public void devitar(float monto){
                System.out.println("-- Iniciando Debito --");
                synchronized(this){
                    if(saldo >= monto){
                        try {Thread.sleep(2000);} catch (Exception e) {}

                        saldo -= monto;
                        System.out.println("Debito realizado. Saldo = " + saldo);
                    }else {
                        System.out.println("Saldo insuficiente");
                    }
                }
                System.out.println("-- Finalizano Debito");
            }
        }//en Clas Cuenta
        
        class Cliente implements Runnable{
            Cuenta cuenta;

            public Cliente(Cuenta Cuenta) {
                this.cuenta = Cuenta;
            }
            
            @Override
            public void run(){
                cuenta.devitar(1000);
            }
        }//end class Cliente
        
        //El sincronismo funciona sobre u unico objeto
        Cuenta cuenta = new Cuenta();
        
        Thread tCliente1 = new Thread(new Cliente(cuenta));
        Thread tCliente2 = new Thread(new Cliente(cuenta));
        
        tCliente1.start();
        tCliente2.start();
    }
}