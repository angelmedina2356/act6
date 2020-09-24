package com.company;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int calif[]= new int[5];
    float promedio;
    int suma=0;
    String keyBoard = "" ;


        System.out.println("Bienvenido al sistema de calculo de calificaciones");
        System.out.println("Ingresa el nombre del alumno");
        keyBoard=scanner.nextLine();
        System.out.println("Ingrese la primer calificacion");
        calif[0]=scanner.nextInt();

        System.out.println("Ingrese la segugnda calificacion");
        calif[1]=scanner.nextInt();

        System.out.println("Ingrese la tercer calificacion");
        calif[2]=scanner.nextInt();

        System.out.println("Ingrese la cuarta calificacion");
        calif[3]=scanner.nextInt();

        System.out.println("Ingrese la quinta calificacion");
        calif[4]=scanner.nextInt();

        for(int u=0; u<calif.length;u++) {
            suma += calif[u];
        }
        promedio=(suma/ calif.length);
        System.out.println("El promedio es: " +promedio);

        if (promedio>=0&&promedio<=50)
            System.out.println("La calificacion final aes F");
        else
        if (promedio>=51&&promedio<=60)
            System.out.println("La calificacion final es E");
        else
        if (promedio>61&&promedio<=70)
            System.out.println("La calificacion final es D");
        else
        if (promedio>=71&&promedio<=80)
            System.out.println("La calificacion final es C");
        else
        if (promedio>=81&&promedio<=90)
            System.out.println("La calificacion final es B");
        else
        if (promedio>=91&&promedio<=100)
            System.out.println("La calificacion final es A");
        else
            System.out.println("La calificacion es errona, verifica tus datos");
    }
}
