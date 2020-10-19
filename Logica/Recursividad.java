package Logica;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Recursividad {
    Scanner leer=new Scanner(System.in);
    int limite=9,i,f, dato;
    boolean palindromo=false;
  
   
   public int Fibonacci(int n ){
  
        if (n>1){
            try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Recursividad.class.getName()).log(Level.SEVERE, null, ex);
        }
           return Fibonacci(n-1) + Fibonacci(n-2); 
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
        }
    }

   public String mostrarSerie(int limite) {
        System.out.println(" serie "+this.limite+":");
        for (int i = 0; i < limite; i++) {
            System.out.print(Fibonacci(i)+" ");
        }
        System.out.println();
       return "Termino la serie";
    }

public int Presentar_números(int numero){
    
    if(numero<0){
    System.out.println(" Error el numero que introduciste es negativo");
    }else if(numero==0){ 
        System.out.println(" Termino ");
    }else{
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Recursividad.class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.println(numero);
      Presentar_números(numero-1);
      }
    return numero;
}



public int factorialRecursivo(int n){
    if(n<0){
        System.out.println(n);
    return 1;
    }else{
    if(n==0){
    return 1;
    }else{
    return n*factorialRecursivo(n-1);
    }
   }
  }


public   int Desaparece_números(int n, int i ){
  int A[] = new int[n];
  for(i=0;i<n;i++){
 System.out.println("  INGRESE NUMERO PARA EL ARREGLO");
  A[i]=leer.nextInt();
  }
  if(n==A[0]){
        System.out.println(" Termino:"+ A[i]);
    }else{
      System.out.println(A.length);
        Desaparece_números(n-1,i);
}
        return A.length;
                    
}

public boolean Palindromo(String Palabra,int i,int d){
         
 if(i<d){
 if(Palabra.charAt(i)==Palabra.charAt(d)){
     int length = Palabra.length();
     Palindromo(Palabra,i+1,d-1);
         palindromo=true;
          System.out.println("****La palabra  si es  un palindromo***" +Palabra);
     }else
     palindromo=false;
System.out.println("*****La palabra  no es  palindromo *****  " +Palabra);
        
 }
 return false;
 }

}
