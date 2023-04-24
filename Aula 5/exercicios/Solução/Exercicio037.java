package Lista_002;
import java.util.Scanner;
/*
    37. Faça um programa Java programa que solicite ao usuário que digite três nomes. 
    Seu programa deve exibir os nomes em ordem decrescente.
 */
public class Exercicio037 {
    
   public static void main(String[] args)
   {
       String nome01, nome02, nome03;
       
       Scanner entrada = new Scanner(System.in);
       
       //Obtem os nomes dos usuarios
       System.out.println("Nome 01: ");
       nome01 = entrada.nextLine();
       System.out.println("Nome 02: ");
       nome02 = entrada.nextLine();
       System.out.println("Nome 03: ");
       nome03 = entrada.nextLine();
       
       //Criar regra para imprimir em Ordem decrescente
       if(nome01.compareTo(nome02) > 0 && nome01.compareTo(nome03) > 0)
       {
           System.out.println(nome01);
           
           if(nome02.compareTo(nome03) > 0)
           {
               System.out.println(nome02);
               System.out.println(nome03);
           }
           else
           {
               System.out.println(nome03);
               System.out.println(nome02);
           }
       }
       else if(nome02.compareTo(nome01) > 0 && nome02.compareTo(nome03) > 0)
       {
           System.out.println(nome02);
           
           if(nome01.compareTo(nome03) > 0)
           {
               System.out.println(nome01);
               System.out.println(nome03);
           }
           else
           {
               System.out.println(nome03);
               System.out.println(nome01);
           }
       }
       else
       {
           System.out.println(nome03);
           
           if(nome01.compareTo(nome02) > 0)
           {
               System.out.println(nome01);
               System.out.println(nome02);
           }
           else
           {
               System.out.println(nome02);
               System.out.println(nome01);
           }
       }
   }
    
}
