package Lista_002;
import java.util.Scanner;
/*
    14. Elabore um algoritmo que leia dois números inteiros e mostre o resultado da diferença do maior valor pelo menor;
*/

public class Exercicio014 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("N° 1:");
        int num01 = entrada.nextInt();
        System.out.println("N° 2:");
        int num02 = entrada.nextInt();
        
        if(num01 > num02)
        {
            int diferenca01 = num01 - num02;
            System.out.println("Diferença maior para o menor: " + diferenca01);
        }
        else
        {
            int diferenca02 = num02 - num01;
            System.out.println("Diferença maior para o menor" + diferenca02);
        }
    }
    
}
