package Lista_002;
import java.util.Scanner;
/*  
   12. - Escrever um algoritmo que leia dois valores inteiros distintos e informe qual é o maior
 */
public class Exercicio012 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Valor 01");
        int val01 = entrada.nextInt();
        System.out.println("Valor 02");
        int val02 = entrada.nextInt();
        
        if(val01 > val02)
        {
            System.out.println("Valor 01 Maior");
        } else {
            System.out.println("Valor 02 Maior");
        }
    }
}
