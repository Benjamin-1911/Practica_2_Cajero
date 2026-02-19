package views;

import java.util.Scanner;

public class CajeroVistas {
    
    Scanner objeTeclado = new Scanner (System.in);
    
    public void enviarMensaje(String mensaje){
        System.out.println(mensaje);
        
    }
    
    /*public String pedirDatoString (){
        return objeTeclado.nextLine();
    }
    
    public double pedirDouble (){
    return objeTeclado.nextDouble();
    }*/
    
    public int mostrarMenu(){
            System.out.println("\n1. Ver saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
       
       return objeTeclado.nextInt();
   }
    
    
    
    
    
    
    
    
    
    
    public <T> T pedirDato(Class<T> tipo) {
        if (tipo == String.class) {
            return tipo.cast(objeTeclado.nextLine());
        }
        if (tipo == Double.class) {
            return tipo.cast(objeTeclado.nextDouble());
        }

        throw new IllegalArgumentException("Tipo no soportado");
    }
}
