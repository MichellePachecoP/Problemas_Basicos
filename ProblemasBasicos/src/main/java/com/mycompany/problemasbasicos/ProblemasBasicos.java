package com.mycompany.problemasbasicos;

import java.util.Scanner;

public class ProblemasBasicos {

    /**public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al Teatro Moro.");
        
        System.out.println("Favor, para la compra de entradas, le solicitamos que nos indique la siguiente informacion.");
        System.out.println("Su nombre: ");
        String nombre = entrada.next();
        System.out.println("Su apellido paterno: ");
        String apellido = entrada.next();
        System.out.println("Su edad: ");
        int edad = entrada.nextInt();
        
        System.out.println("Bienvenido(a), " + nombre + " " + apellido + " de la edad de " + edad + " años.");
        System.out.println("A continuacion, sera re dirigido a la pagina de compras."); 
   }
}**/
    /**public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("A continuacion, realizaremos la siguiente operacion: ");
        System.out.println("Division.");
        
        System.out.println("Ingrese un primer valor: ");
        double valoruno = entrada.nextDouble();
        
        System.out.println("Ingrese un segundo valor (dicho valor no puede ser igual a 0): ");
        double valordos = entrada.nextDouble();
        
        if (valordos == 0) {
            System.out.println("Valor invalido.");
        } else {
            double resultado = valoruno / valordos;
            System.out.println("El resultado de su division es: " + resultado);
        }
    }
}**/
    
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int valoruno = entrada.nextInt();
        System.out.println("Ingrese un segundo valor: ");
        int valordos = entrada.nextInt();
        int resultado = valoruno + valordos;
        if (resultado >100) {
            System.out.println("El resultado de la suma entre " + valoruno + " y " + valordos + " es " + resultado + ", lo que corresponde a un numero mayor que 100.");
        } else {
            System.out.println("El resultado de la suma entre " + valoruno + " y " + valordos + " es " + resultado + ", lo que corresponde a un numero menor que 100");
        }
    }
}