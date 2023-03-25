package Lista_002;
import java.util.Scanner;
/*
    27. Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.
 */
public class Exercicio027 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int a = 0, b = 0, c = 0, soma = 0;
        
        System.out.println("Informe 3 Valores");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        
        soma = (a + b);
        
        if((soma) < c)
        {
            System.out.println("A soma de A + B é Menor que C: " + c);
        }
        else
        {
            System.out.println("C é maior que a soma de A + B: " + soma);
        }
    }
    
}
