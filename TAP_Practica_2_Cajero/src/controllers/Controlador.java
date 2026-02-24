package controllers;

import models.*;
import views.*;

public class Controlador {

    //Numero de intentos y ver si te saca del menu o no.
        int intentos = 0;
        boolean salir = false;
        int usuarioActual = -1;
    
    private CajeroVistas vista;
    private CajeroModelo modelo;

    public Controlador() {
        this.vista = new CajeroVistas();
        this.modelo = new CajeroModelo();
    }
    
    public void pantallaInicial(){
    
        while (intentos < 3 && usuarioActual == -1) {
            vista.enviarMensaje("Ingrese su PIN: ");
            String PIN = vista.pedirDato(String.class);
            
            for (int i = 0; i < modelo.getListaUsuarios().size(); i++) {
                if (modelo.getUsuarios(i).equals(PIN)) {
                    usuarioActual = i;
                    break;
                }
            }
            
            if (usuarioActual == -1) {
                vista.enviarMensaje("PIN incorrecto.");
                intentos++;
            }
        }
        
            if (usuarioActual == -1) {
            vista.enviarMensaje("Demasiados intentos fallidos. Adiós.");
            return;
        }
            else menuPrincipal();
    }
    
    public void menuPrincipal(){
        vista.enviarMensaje("Bienvenido, " + modelo.getNombres(usuarioActual));
        int opcion;
        
        do {
        opcion = vista.mostrarMenu();
        switch (opcion){
            case 1:
                vista.enviarMensaje("Su saldo es: $" + modelo.getSaldos(usuarioActual));
                break;
            case 2:
                vista.enviarMensaje("Ingrese cantidad a retirar: ");
                Double retiro = vista.pedirDato(Double.class);
                
                    if (modelo.retiro (retiro, usuarioActual)){
                        vista.enviarMensaje("Retiro exitoso. Nuevo saldo: $" + modelo.getSaldos(usuarioActual));
                    }
                    else   
                        vista.enviarMensaje("Fondos insuficientes.");
                break;
            case 3:
                vista.enviarMensaje("Ingrese cantidad a depositar: ");
                Double deposito = vista.pedirDato(Double.class);
                
                modelo.deposito(deposito, usuarioActual);
                
                vista.enviarMensaje("Depósito exitoso. Nuevo saldo: $" + modelo.getSaldos(usuarioActual));
                break;
            case 0:
                vista.enviarMensaje("Gracias por usar el cajero.");
                break;
            default:
                vista.enviarMensaje("Opción inválida.");
                break;
        }
        }
        while (opcion != 0);
        }
    }
    

