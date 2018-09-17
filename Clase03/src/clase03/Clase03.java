package clase03;

public class Clase03 {

    public static void main(String[] args) {
        //Clase 03
        class Saludo{
            public void saludar(String nombre, boolean esJefe){
                if(esJefe){
                    System.out.println("Jefe -> Hola a todos!");
                    
                    synchronized(this) {
                        notifyAll();
                    }
                }else {
                    try { 
                        synchronized(this){
                            wait();
                            System.out.printf("%s -> Hola Jefe! \n", nombre); //%f incrusta un string; %d incusta un numero. tambien se puede hacer con System.out.format
                            Thread.sleep(2000);
                        }
                    } catch (Exception e) {}
                }
            }
        }//end class Saludo
        class Empleado implements Runnable{
            private String nombre;
            private boolean esJefe;
            private Saludo saludo;

            public Empleado(String nombre, boolean esJefe, Saludo saludo) {
                this.nombre = nombre;
                this.esJefe = esJefe;
                this.saludo = saludo;
            }
            
            @Override
            public void run(){
                System.out.format("%s llego. \n", nombre);
                saludo.saludar(nombre, esJefe);
            }
        }//end class Empleado
        Saludo saludo = new Saludo();
        Empleado e1 = new Empleado("Mario", false, saludo);
        Empleado e2 = new Empleado("Ana", false, saludo);
        Empleado e3 = new Empleado("Luis", false, saludo);
        Empleado e4 = new Empleado("Dario", false, saludo);
        Empleado e5 = new Empleado("Jefe", true, saludo);
        
        try {
            new Thread(e1).start();
            new Thread(e2).start();
            new Thread(e3).start();
            new Thread(e4).start();
            Thread.sleep(200);
            new Thread(e5).start();
        } catch(Exception e) {}
        
        /*
                        Conexion TCP
        SERVER                               CLIENT
        -------                             --------
        ServerSocket(port)                  Socket(IP, port);
        .accept()     
        -------                             --------
        OutputStream  ------------------>   InputStream
        InputStream   <------------------   OtputStream     
        -------                             --------
        .close()                            .close()
        
        DataPutputStream DataInputStream - Datos primitivos de Java(float, double, boolean, int, etc)
        ObjectOutputStream ObjectInputStream - Objetos de Java
        */
        
        
    }//end main()
}//end Clase03