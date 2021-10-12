/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_6;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
//Invocaremos esta clase en el programa01d para ingresar datos
//Clase con metodos los cuales tendran la funcion de capturar los datos que ingrese el usuario
class CapturaEntrada{
    //Es public es accesible, el metodo es static solo podremos acceder a traves de la clase
    public static int capturarEntero(String msg){//Recibe un parametro que nombraremos como msg para que lo imprima despues
        Scanner sc = new Scanner(System.in);//Creacion de la clase Scanner esta esta siendo importada por medio de import java.util.* es una clase ya fabricada por java
                                            //Recibira lo que mandemos por el teclado  
        System.out.println(""+msg+": ");//Se imprimira el msg que mandamos
        return (sc.nextInt());//Se captura un tipo de dato entero
    }

    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(""+msg+": ");
        return (sc.nextFloat());//Se captura un tipo de dato Flotante
    }

    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(""+msg+": ");
        return (sc.nextDouble());//Se captura un tipo de dato double
    }

    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(""+msg+": ");
        return (sc.nextLine());//Se captura un tipo de dato cadena
    }
    public static char capturarCaracter(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(""+msg+": ");
        return (sc.next().charAt(0));//Se captura un tipo de dato char
    }

}
