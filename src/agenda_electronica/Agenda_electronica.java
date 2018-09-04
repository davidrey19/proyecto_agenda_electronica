/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_electronica;

import java.util.Scanner;

/**
 *
 * @author JB
 */
public class Agenda_electronica {
    Scanner tec = new Scanner(System.in); //Escaner se llama "tec"
    int opc; //Esta sera la variable que se utilizara para cuando se elija una opcion en los menu
    String usuarios [] [] = new String [0][3]; //array donde se almacena los usuarios
    int contador; // Este sera un contador para aumentar el array;
    
    public Agenda_electronica() {
       home();
    }
    public void home(){
        //Aqui sera el menu principal
        System.out.println("MENU DE PRINCIPAL.");
        System.out.println();
        System.out.println("1. Iniciar Sesion");
        System.out.println("2. Registrarse");
        System.out.println("3. Salir");
        System.out.println();
        System.out.print("Elija → ");
        
        
        
    }
    
    public void sign_in(){
        //aqui se ingresara normalmente
        int name;
        int pass;
        
        System.out.println("INICIA SESION");
        System.out.println();
        System.out.print("Ingrese nombre de usuario → ");
        System.out.println();
        System.out.print("Ingrese contraseña → ");
        
        
        
    }
    
    public void registro(){
        //Aqui se crearan las cuentas
        int name;
        int pass;
        int email;
        
        System.out.println("MENU DE REGISTRO ");
        System.out.println();
        System.out.print("Ingrese su nombre → ");
        System.out.println();
        System.out.print("Ingrese correo electronico → ");
        System.out.println();
        System.out.print("Ingrese su contraseña →");
        System.out.println();
        System.out.print("Ingrese nuevamente su contraseña");
        System.out.println();
        
    }
    
    public void welcome(){
        //aqui dara un anuncio de bienvenido y se preguntara si pasa a crear evento o  sale al menu principal
    }
    
    public void menu_control_eventos(){
       //aqui el menu de crear eventos 
    }
    
    public void crear_evento(){
        //aqui se crearan los evento
    }
    
    public void ver_evento(){
        //aqui se mostraran todos los eventp
    }

    
    public static void main(String[] args) {
        Agenda_electronica calla = new  Agenda_electronica();
    }
    
}
