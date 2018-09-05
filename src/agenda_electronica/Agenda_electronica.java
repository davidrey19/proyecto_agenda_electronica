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
        opc = tec.nextInt();
        System.out.println();
        System.out.println();
        
        while(opc==0 || opc>3){
            System.out.println("VALOR FUERA DE RANGO.");
            System.out.print("Ingrese nuevamente su valor → ");
            opc=tec.nextInt();
            System.out.println();
            System.out.println();
         
        }
        
        if(opc==1){
            sign_in();
        }else if(opc==2){
            registro();
        }else if(opc==3){
            System.exit(0);
        }
    }
    
    public void sign_in(){
        //aqui se ingresara normalmente
        String name;
        String pass;
        
        System.out.println("INICIA SESION");
        System.out.println();
        System.out.print("Ingrese nombre de usuario → ");
        name=tec.nextLine();
        tec.nextLine();
        System.out.println();
        System.out.print("Ingrese contraseña → ");
        pass=tec.nextLine();
        
        
        
        welcome();
        
        
    }
    
    public void registro(){
        //Aqui se crearan las cuentas
        String name;
        String pass;
        String email;
        String verificacion;
        
        System.out.println("MENU DE REGISTRO ");
        System.out.println();
        System.out.print("Ingrese su nombre → ");
        name=tec.nextLine();
        tec.nextLine();
        System.out.println();
        System.out.print("Ingrese correo electronico → ");
        email=tec.nextLine();
        System.out.println();
        System.out.print("Ingrese su contraseña → ");
        pass=tec.nextLine();
        System.out.println();
        System.out.print("Ingrese nuevamente su contraseña → ");
        verificacion = tec.nextLine();
        System.out.println();
        System.out.println();
        
        while(pass == null ? verificacion != null : !pass.equals(verificacion) ){
            System.out.println("Las contraseñan NO  cuadran!");
            System.out.print("Ingrese su contraseña nuevamente → ");
            pass=tec.nextLine();
            System.out.print("Ingrese nuevamente su contraseña → ");
            verificacion = tec.nextLine();
            System.out.println();
            System.out.println();
        }
        
    }
    
    public void welcome(){
        //aqui dara un anuncio de bienvenido y se preguntara si pasa a crear evento o  sale al menu principal
        
        System.out.println("Bienvenido");
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
