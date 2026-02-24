package models;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CajeroModelo {
    
    //Estructuras de datos para almacenar informacion.
        /*String[] usuarios = {"1234", "5678"};
        String[] nombres = {"Juan", "Maria"};
        double[] saldos = {1000.0, 2500.0};
        */
        List<String> listaNombres = new ArrayList<>(List.of("Juan", "Maria"));
        List<String> listaUsuarios = new ArrayList<>(List.of("1234", "5678"));
        List<Double> listaSaldos = new ArrayList<>(List.of(1000.0, 2500.0));
        
        
        public String getUsuarios(int index){
        return listaUsuarios.get(index);
        }
        
        public String getNombres(int index){
        return listaNombres.get(index);
        }
    
        
        public Double getSaldos(int index){
        return listaSaldos.get(index);
        }
        
        public List<String> getListaUsuarios(){
        return listaUsuarios;
        }
        
        public boolean retiro(double retiro, int usuarioActual){
                if (retiro <= listaSaldos.get(usuarioActual)) { //Verifica la cantidad de dinero
                    double saldoActual = listaSaldos.get(usuarioActual);
                    saldoActual -= retiro;
                    listaSaldos.set(usuarioActual, saldoActual);
                    return true;
                } else {
                    return false;
                }
        }
        
        public void deposito(double deposito, int usuarioActual){
                double saldoActual = listaSaldos.get(usuarioActual); //Deposito
                saldoActual += deposito; 
                listaSaldos.set(usuarioActual, saldoActual);
        }
    
    
    
}
