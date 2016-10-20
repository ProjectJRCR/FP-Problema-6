/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;
import java.util.*;
/**
 *Este programa para sacar el sueldo de alguien cuando 
 *te dan cuanto le pagan por hora y las horas que trabaja
 * @author JorgeRicardo
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double horas,pago,sueldo;/*tres variables una es las horas que 
                                trabaja otra cuanto le pagan por hora
                                 y el sueldo es cunato le pagan por 
                                trabajar esas horas*/
    horas=pedirDatos("Ingrese las horas que trabajo: ");
    pago=pedirDatos("Ingrese su sueldo por hora normal: ");
    sueldo=calcularSu(horas,pago);
    mostrarSueldo(horas,sueldo);       
    }
    public static double pedirDatos(String quees){
        /*uso un solo metodo para 
     pedir las horas y el pago por hora*/
    Scanner teclado=new Scanner(System.in);
    System.out.println(quees);
    double soh=teclado.nextDouble();
    return soh;
    }
    public static double calcularSu(double horas,double pago){
    double s;//s es el sueldo
    if(horas<=40)//checo si es trabajo mas de 40 horas    
    s=horas*pago;//si trabajo 40 o menos de 40 hago esta operación
    else if (horas<=48)//checo si trabajo menos o igual que 48 horas
    s=((horas-40)*(pago*2))+(pago*40);/*si trabajo menos o igual que 48 horas 
                                           hace esta operación*/
    else s=((horas-48)*(pago*3))+(pago*56);//si no se hace esta operacion
    return s;
    }
    public static void mostrarSueldo(double horas,double sueldo){
        /*muestro el sueldo que recivira
        esta persona por trabajar esas horas*/
        System.out.println("Trabajaste "+horas+"h y te van a pagar "+sueldo+" pesos");
    }
            
}
