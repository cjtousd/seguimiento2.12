/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;


public class Ejercicio12 {


    public static void main(String[] args) {
                
        Scanner entrada = new Scanner(System.in);
        String nom;
        double nht, vhn,het,hee8, salario;
        
        System.out.println("Ingrese el nombre del trabajador");
        nom = entrada.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        nht=entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora normal");
        vhn=entrada.nextDouble();
        
        if (nht>40){
            het=nht-40;
            if(het>8){
                hee8=het-8;
                salario=40*vhn+16*vhn+hee8*3*vhn;
            }
            else{
                salario=40*vhn+het*2*vhn;
                
            }
        }else{
            salario=nht*vhn;
        }
        
        System.out.println("El trabajador "+ nom +" devengo: $" + salario);
    }    
}    
    

