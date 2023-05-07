package Lista_002;
import java.util.Scanner;
/*
    42. Escreva um programa em Java, para calcular o preço com desconto e o preço total após o desconto
    Dado:
    Se o valor da compra for superior a 1.000, 10% de desconto
    Se o valor da compra for superior a 5.000, 20% de desconto
    Se o valor da compra for superior a 10.000, 30% de desconto.

 */
public class Exercicio042 {
    
    public final static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        double pv;
        System.out.print("Insira o valor Comprado: ");
        pv = entrada.nextDouble();
        
        //Se o valor da compra for superior a 1.000, 10% de desconto
        if(pv > 1000)
        {
            System.out.printf("\nDesconto = %f", pv * 0.1);
            System.out.printf("\nTotal = %f", pv - pv * 0.1);
        }
        //Se o valor da compra for superior a 5.000, 20% de desconto
        else if(pv > 5000)
        {
            System.out.printf("\nDesconto = %f", pv * 0.2);
            System.out.printf("\nTotal = %f", pv - pv * 0.2);
        }
        //Se o valor da compra for superior a 10.000, 30% de desconto.
        else if(pv > 10000)
        {
            System.out.printf("\nDesconto = %f", pv * 0.3);
            System.out.printf("\nTotal = %f", pv - pv * 0.3);
        }
    }
    
}
