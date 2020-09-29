/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaabc;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Ana Karen
 */

public class PilaABC {
    /**
     * @param args the command line arguments
     */
    int pA[], pB[], pC[];

   
    public void LlenarPilasAB(int total){
        pA = new int[total];        
        for (int i=0; i<total; i++){
            pA[i]=(int) (Math.random() * (100));            
        }
        pB = new int[total];
        for (int x=0; x<total; x++){
            pB[x]=(int) (Math.random() * (200)+100);
        }
    }
       public void MostrasPilasAB(int total){
        System.out.print("Pila A\n");
        for (int i=0; i<total; i++){
            System.out.print(" "+pA[i]);
        }
        
        System.out.print("\n Pila B\n");
        for (int z=0; z<total; z++){
            System.out.print(" "+pB[z]);
        }
    }
        public void EliminarPilas(int total){
        for (int i=0; i<total; i++){
            pA[i]=0;            
        }
        for (int x=0; x<total; x++){
            pB[x]=0;
        }
        System.out.println("datos eliminados");
    }
        public void UnirPilas(int total){
        pC= new int [total];
              System.out.print("Pila A\n");
        for (int i=0; i<total; i++){
            int valor1= pA[i];
            int valor2= pB[i];
            int suma= valor1 + valor2;
            pC[i]=suma;
        }
        
        System.out.print("\n Pila C llena");
        
    } 
        public void MostrasPilaC(int total){
        System.out.print("Pila A\n");
        for (int i=0; i<total; i++){
            System.out.print(" "+pA[i]);
        }
        
        System.out.print("\n Pila B\n");
        for (int z=0; z<total; z++){
            System.out.print(" "+pB[z]);
        }
        System.out.print("\n Pila C\n");
        for (int k=0; k<total; k++){
            System.out.print(" "+pC[k]);
        }
    }
    
    public static void main(String[] args) throws IOException { //readline() nos obliga a declarar IOException
        //Nos sirve como lector
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el valor de la pila");
        //con este se lee que retorna el String con el dato y se guardan los datos
        String numero = br.readLine();
        int PilaTotal = Integer.parseInt(numero);
        PilaABC p = new PilaABC();
        Scanner sc = new Scanner (System.in);
      int opt;
      do{
          System.out.println("\n1 Llenar pilas\n"
                  + "2 Mostrar pilas\n"
                  + "3 Vaciar pilas\n"
                  + "4 Unir pilas\n"
                  + "5 Mostrar pila C\n"
                  + "6 Salir");
          switch(opt=sc.nextInt()){
              case 1:
                  p.LlenarPilasAB(PilaTotal);
                  break;
              case 2:
                  p.MostrasPilasAB(PilaTotal);
                  break;
              case 3:
                  p.EliminarPilas(PilaTotal);
                  break;
              case 4:
                  p.UnirPilas(PilaTotal);
                  break;
              case 5:
                  p.MostrasPilaC(PilaTotal);
                  break;
      }
       
       
      }while(opt !=6);

        
    }
    
}
