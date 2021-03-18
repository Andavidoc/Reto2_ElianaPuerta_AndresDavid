
package com.mycompany.reto2;

import java.util.Scanner;


public class Reto2 {
    
    // Eliana Janneth Puerta Morales
    // Andrés David Ocampo
    
    public static void main(String[]args ){           
                   
        System.out.println("Punto 1:"); 
        punto1();
        System.out.println("Punto 2:");
        punto2();
        System.out.println("Punto 3:");
        punto3();
        System.out.println("Punto 4:");
        punto4();
        System.out.println("Punto 5:");
        punto5();
        
        System.out.println("Reto 2 realizado por Eliana Puerta y Andrés David");
    }   
    static void punto1(){   
        
        int numero;
        int hasta;
        Scanner lector = new Scanner(System.in);
        
         System.out.println("Ingrese numero de multiplicaciones que desea obtener:  ");
                numero = lector.nextInt();
         System.out.println("Ingrese el numero hasta el cual multiplicar:  ");
                hasta = lector.nextInt();
                
         for (int i = 1 ; i < numero+1; i++){
             System.out.println("Tabla del " + i + ": ");
             for (int j = 1; j <  hasta+1; j++){
             System.out.println(i+"*"+j+ " = " + i*j);             
             }         
         }
        System.out.println("Terminaste \n");
        }
    
    static void punto2(){
    int cuadrados;
   
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese los primeros cuadrados que desea obtener ");
                cuadrados = lector.nextInt();
             for (int j = 1; j <= cuadrados; j++){   
                 int contador = -1;
                for(int i = 1 ; i <= j; i++){                    
                     contador = contador + 2;
                if (i < j) {
                System.out.print(contador + " + ");    
                }
                else{
                    System.out.print(contador + " = ");
                }
                }
                System.out.println(j*j);
                }
             
             System.out.println("Terminaste \n");
    }
    
    static void punto3(){
       
    int cuadrados;
   
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese los primeros cubos que desea obtener ");
                cuadrados = lector.nextInt();
                int contador = -1;
             for (int j = 1; j <= cuadrados; j++){   
                 System.out.print(j+"³ = ");
                for(int i = 1 ; i <= j; i++){                    
                     contador = contador + 2;
                if (i < j) {
                System.out.print(contador + " + ");    
                }
                else{
                    System.out.print(contador + " = ");
                }
                }
                System.out.println(j*j*j);
                }
             System.out.println("Terminaste \n");
    }
    static void punto4(){
        int retiro;
        int exito;
        int cienmil = 0,cincuentamil = 0,veintemil = 0,diezmil = 0,cincomil = 0,dosmil = 0,mil = 0,quinientos = 0,docientos = 0,cien = 0,cincuenta = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Teniendo en cuenta la denominacion de la moneda colombiana, ingrese el monto de dinero a retirar : ");
        retiro = lector.nextInt();
        exito = retiro;
                                
                
                while( retiro > 0 ){
                if(retiro >= 100000){
                    cienmil = cienmil +1 ;
                    retiro = retiro - 100000;
                }
                else if(retiro >= 50000){
                    cincuentamil = cincuentamil +1 ;
                    retiro = retiro - 50000;
                } 
                else if(retiro >= 20000){
                    veintemil = veintemil +1 ;
                    retiro = retiro - 20000;
                }
                else if(retiro >= 10000){
                    diezmil = diezmil +1 ;
                    retiro = retiro - 10000;
                }
                else if(retiro >= 5000){
                    cincomil = cincomil +1 ;
                    retiro = retiro - 5000;
                }
                else if(retiro >= 2000){
                    dosmil = dosmil +1 ;
                    retiro = retiro - 2000;
                }
                else if(retiro >= 1000){
                    mil = mil +1 ;
                    retiro = retiro - 1000;
                }
                else if(retiro >= 500){
                    quinientos = quinientos +1 ;
                    retiro = retiro - 500;
                }
                else if(retiro >= 200){
                    docientos = docientos +1 ;
                    retiro = retiro - 200;
                }
                else if(retiro >= 100){
                    cien = cien +1 ;
                    retiro = retiro - 100;
                }
                else if(retiro >= 50){
                    cincuenta = cincuenta +1 ;
                    retiro = retiro - 50;
                }                  
                else if(retiro < 50 ){
                    System.out.println("Por favor ingrese un valor válido.");
                    break;
                }    
                }
    if(retiro == 0){    
        System.out.println("Usted ha realizado un retiro por " + exito + " pesos de la siguiente manera:" );
        
    if(cienmil > 0 ){
        if (cienmil == 1){
            System.out.println(cienmil + " bitelle de 100.000");
        }
        else {
            System.out.println(cienmil + " billetes de 100.000");
        }
    }
    if(cincuentamil > 0 ){
        if (cincuentamil == 1){
            System.out.println(cincuentamil + " bitelle de 50.000");
        }
        else {
            System.out.println(cincuentamil + " billetes de 50.000");
        }
    }
    if(veintemil > 0 ){
        if (veintemil == 1){
            System.out.println(veintemil + " bitelle de 20.000");
        }
        else {
            System.out.println(veintemil + " billetes de 20.000");
        }
    }
    if(diezmil > 0 ){
        if (diezmil == 1){
            System.out.println(diezmil + " bitelle de 10.000");
        }
        else {
            System.out.println(diezmil + " billetes de 10.000");
        }
    }
    if(cincomil > 0 ){
        if (cincomil == 1){
            System.out.println(cincomil + " bitelle de 5.000");
        }
        else {
            System.out.println(cincomil + " billetes de 5.000");
        }
    }
    if(dosmil > 0 ){
        if (dosmil == 1){
            System.out.println(dosmil + " bitelle de 2.000");
        }
        else {
            System.out.println(dosmil + " billetes de 2.000");
        }
    }
    if(mil > 0 ){
        if (mil == 1){
            System.out.println(mil + " moneda de 1.000");
        }
        else {
            System.out.println(mil + " monedas de 1.000");
        }
    }
    if(quinientos > 0 ){
        if (quinientos == 1){
            System.out.println(quinientos + " moneda de 500");
        }
        else {
            System.out.println(quinientos + " monedas de 500");
        }
    }
    if(docientos > 0 ){
        if (docientos == 1){
            System.out.println(docientos + " moneda de 200");
        }
        else {
            System.out.println(docientos + " monedas de 200");
        }
    }
    if(cien > 0 ){
        if (cien == 1){
            System.out.println(cien + " moneda de 100");
        }
        else {
            System.out.println(cien + " monedas de 100");
        }
    }
    if(cincuenta > 0 ){
        if (cincuenta == 1){
            System.out.println(cincuenta + " moneda de 50");
        }
        else {
            System.out.println(cincuenta + " monedas de 50");
        }
    }
    }
        System.out.println("Terminaste \n");
    }
    static void punto5(){
        Scanner Entrada = new Scanner(System.in); 
        System.out.println("Ingrese el valor de n: ");
        int n = Entrada.nextInt();
        System.out.println("Ingrese el valor de m: ");
        int m = Entrada.nextInt();
        int nm = n - m;
        double facn = n;
        double facm = m;
        double facnm = nm;
        double formula;
        if (n > m){            
       
        for (var i  = n-1 ; i >= 0; i--){
            if (i >= 1){                
            facn = facn * i;
            }
        }
        for (var j  = m-1; j >= 0; j--){
            if (j >= 1){                
            facm = facm * j;
            }
        }
        for (var k  = nm-1; k >= 0; k--){
            if (k >= 1){
                
            facnm = facnm * k;
            }
        }
        if (facm == 0){
            facm = 1;
        }
        if(facnm == 0){
        facnm = 1;}
        
        formula = (facn)/(facm *(facnm));
        System.out.println("Aplicando la formula (n/m)= n!/(m!(n-m)!)" );
        System.out.println(n +"/"+m+" = "+n+"!/("+m+"!("+n+"-"+m+")!) = " + formula);
        }
        else {
        System.out.println("n tiene que ser mayor a m");
        }
        System.out.println("Terminaste \n");
}
    }
        

    
    

