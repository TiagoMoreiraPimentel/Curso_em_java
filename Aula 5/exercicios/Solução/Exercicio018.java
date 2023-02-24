package Lista_002;
import java.util.Scanner;
/*
    18. Elabore um algoritmo que leia 5 valores inteiros e apresente na tela o maior e o menor deles.
 */
public class Exercicio018 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int valor01 = 0, valor02 = 0, valor03 = 0, valor04 = 0, valor05 = 0;
        
        System.out.println("Valor 01:");
        valor01 = entrada.nextInt();
        System.out.println("Valor 02:");
        valor02 = entrada.nextInt();
        System.out.println("Valor 03:");
        valor03 = entrada.nextInt();
        System.out.println("Valor 04:");
        valor04 = entrada.nextInt();
        System.out.println("Valor 05:");
        valor05 = entrada.nextInt();
        
        //Criar a regra de verificacao do Maior
        //1° Regra aplicada a todos os valores
        if(valor01 > valor02 && valor01 > valor03 && valor01 > valor04 && valor01 > valor05)
        {
            System.out.println("Valor 01 é o Maior: " + valor01);
        }
        else if(valor02 > valor01 && valor02 > valor03 && valor02 > valor04 && valor02 > valor05)
        {
            System.out.println("Valor 02 é o Maior: " + valor02);
        }
        else if(valor03 > valor01 && valor03 > valor02 && valor03 > valor04 && valor03 > valor05)
        {
            System.out.println("Valor 03 é o Maior: " + valor03);
        }
        else if(valor04 > valor01 && valor04 > valor02 && valor04 > valor03 && valor04 > valor05)
        {
            System.out.println("Valor 04 é o Maior: " + valor04);
        }
        else 
        {
          System.out.println("Valor 05 é o Maior: " + valor05);  
        }
        //=================================================================================================
        
        //Criar a regra de verificacao do Maior
        //1° Regra aplicada todos os valores
        if(valor01 < valor02 && valor01 < valor03 && valor01 < valor04 && valor01 < valor05)
        {
            System.out.println("Valor 01 é o Menor: " + valor01);  
        }
        else if(valor02 < valor01 && valor02 < valor03 && valor02 < valor04 && valor02 < valor05)
        {
            System.out.println("Valor 02 é o Menor: " + valor02); 
        }
        else if(valor03 < valor01 && valor03 < valor02 && valor03 < valor04 && valor03 < valor05)
        {
            System.out.println("Valor 03 é o Menor: " + valor03); 
        }
        else if(valor04 < valor01 && valor04 < valor02 && valor04 < valor03 && valor04 < valor05)
        {
            System.out.println("Valor 04 é o Menor: " + valor04); 
        }
        else 
        {
            System.out.println("Valor 05 é o Menor: " + valor05); 
        }
    }
    
}
