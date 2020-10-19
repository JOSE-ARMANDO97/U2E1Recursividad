package Principal;

import Logica.Recursividad;
import java.util.Scanner;


public class Main extends Recursividad {
    public static void main(String args[]){
        
        Scanner leer=new Scanner(System.in);
    Recursividad R = new Recursividad();
     boolean continuar = true;
        int num, menu,d,i=0;
        String palabra ;
    
    
 
        while(continuar){
    
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("***********************************");
        System.out.println(" 1.-Serie Fibonacci ");
        System.out.println(" 2.-Presentar números del 1 al 10");
        System.out.println(" 3.-Factorial ");
        System.out.println(" 4.- Desaparecer numeros");
        System.out.println(" 5.-  Recorriendo un Palindromo");
        System.out.println(" 6-  salir");
        menu=leer.nextInt();
        
          switch(menu){
              case 1:
                  System.out.println("INGRESE NUMERO DE INICIO");
                  num=leer.nextInt();
                  int num1=9;
                  System.out.println( R.Fibonacci(num));
                  System.out.println(R.mostrarSerie(num1));
                 break;
              case 2:
                  System.out.println("INGRESE NUMERO");
                  num=leer.nextInt();
                 System.out.println(R.Presentar_números(num));
                 break;
              case 3:
                  System.out.println("INGRESE EL NUMERO QUE DESEA SABER EL FACTURIAL");
                  num=leer.nextInt();
                  System.out.println(R.factorialRecursivo(num));
                  break;
              case 4:
                  
                  num=11;
                 
               System.out.println(R.Desaparece_números(num,i));
                 
                 break;
              case 5:
                    System.out.println("INGRESE LA PALABRA");
                  palabra=leer.next();
                d=palabra.length()-1;
                
               System.out.println(R.Palindromo(palabra,i,d));
                 break;
              case 6:
                  System.out.println("Saliendo...");
                  continuar = false;
                 break;
                 default:
                 System.out.println("opcion incorrecta");
                 break;
           
          }
       }
  }
}

