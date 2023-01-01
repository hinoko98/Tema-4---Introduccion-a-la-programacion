/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mision.tic.tema4;

import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Tema4 {

    public static void main(String[] args) {
        //variable para el IF numeroIf 
        //variable para el WHILE numeroWhile 
        //variable para el FOR numeroFor
        System.out.println("Ejercicio de IF");
        System.out.println("Bienvenido");
        System.out.println("Escriba un numero");
        Scanner Scanner_sc = new Scanner(System.in);
        
        int numeroIf = Scanner_sc.nextInt();
        if (numeroIf == 0){
            System.out.println("El numero digitado es " + numeroIf);
        }else if (numeroIf >0 ){
            System.out.println("El numero " + numeroIf + " es positivo");
        }else {
            System.out.println("El numero " + numeroIf + " es negativo");
        }
        
        System.out.println("");
        System.out.println("Ejercicio de While");
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println("Numero en el While es: " + numeroWhile);   
            numeroWhile++; 
        }
        
        System.out.println("");
        System.out.println("Ejercicio de Do While");
        int i = 3;
        do{
            System.out.println("Numero en el Do While es: " + i);
            i++;
        } while (i < 3);

        System.out.println("");
        System.out.println("Ejercicio de For");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Numero en el For es: " + numeroFor);         
        }
        
        System.out.println("");
        System.out.println("Ejercicio de Switch");
        System.out.println("Escriba una de las 4 estaciones del año");
        System.out.println(" - PRIMAVERA - ");
        System.out.println(" - VERANO - ");
        System.out.println(" - OTOÑO - ");
        System.out.println(" - INVIERNO - ");
        
        Scanner Scannersc = new Scanner(System.in);
        String  estacionSwitch = Scannersc.nextLine();
        switch (estacionSwitch) { 
            case "VERANO": case "verano":
                System.out.println("Estas en la Estacion de Verano");
                break;
            case "PRIMAVERA": case "primavera":
                System.out.println("Estas en la Estacion de Primavera ");
                break;
            case "OTOÑO": case "otoño":
                System.out.println("Estas en la Estacion de Otoño");
                break;
            case "INVIERNO": case "invierno":
                System.out.println("Estas en la Estacion de Invierno");
                break;
            default:
                System.out.println("No has escogido una estacion del año");
                System.out.println("Has escrito (" + estacionSwitch + ")");
        }
    } 
}       

