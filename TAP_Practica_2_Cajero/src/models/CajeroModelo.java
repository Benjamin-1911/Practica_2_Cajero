package models;

import java.util.Scanner;

public class CajeroModelo {
    
    //Estructuras de datos para almacenar informacion.
        
        String[] usuarios = {"1234", "5678"};
        String[] nombres = {"Juan", "Maria"};
        double[] saldos = {1000.0, 2500.0};
        
        public String[] getUsuarios(){
        return usuarios;
        }
        
        public String[] getNombres(){
        return nombres;
        }
    
        
        public double[] getSaldos(){
        return saldos;
        }
        
        public boolean retiro(double retiro, int usuarioActual){
                if (retiro <= saldos[usuarioActual]) { //Verifica la cantidad de dinero
                    saldos[usuarioActual] -= retiro;
                    return true;
                } else {
                    return false;
                }
        }
        
        public void deposito(double deposito, int usuarioActual){
                saldos[usuarioActual] += deposito; //Deposito
        }
    
    
    
}
