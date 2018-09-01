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
        
    }
    
    public void sign_in(){
        //aqui se ingresara normalmente
        int name;
        int pass;
    }
    
    public void registro(){
        //Aqui se crearan las cuentas
        int name;
        int pass;
        int email;
        
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
