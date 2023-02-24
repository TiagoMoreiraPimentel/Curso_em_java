package Lista_002;
import java.util.Scanner;
/*
    22. Escrever um algoritmo que lê um valor em reais e calcule qual o menor número 
    possível de notas de 100, 50, 10, 5 e 1 em que o valor lido pode ser decomposto. 
    Escrever o valor lido e a relação de notas necessárias.
 */
public class Exercicio022 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int valor;
        int quant_nota100;
        int quant_nota50;
        int quant_nota10;
        int quant_nota05;
        int quant_nota01;
        
        System.out.println("Informe um valor: ");
        valor = entrada.nextInt();
        
        quant_nota100 = valor / 100;
        valor = valor - (quant_nota100 * 100);
        
        quant_nota50 = valor / 50;
        valor = valor - (quant_nota50 * 50);
        
        quant_nota10 = valor / 10;
        valor = valor - (quant_nota10 * 10);
        
        quant_nota05 = valor / 5;
        valor = valor - (quant_nota05 * 5);
        
        quant_nota01 = valor;
        
        System.out.println("Notas de 100: " + quant_nota100);
        System.out.println("Notas de 50: "  + quant_nota50);
        System.out.println("Notas de 10: "  + quant_nota10);
        System.out.println("Notas de 5: "   + quant_nota05);
        System.out.println("Notas de 1: "   + quant_nota01);
    }
    
}
