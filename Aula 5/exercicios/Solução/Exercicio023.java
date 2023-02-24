package Lista_002;
import java.util.Scanner;
/*
    23. - Num determinado Estado, para transferências de veículos, 
    o DETRAN cobra uma taxa de 

    1% para carros fabricados antes de 1990 

    e uma taxa de 1.5% para os fabricados de 1990 em diante, 
    taxa esta incidindo sobre o valor de tabela do carro. 

    O algoritmo abaixo lê o ano e o preço do carro e a seguir calcula e imprime imposto a ser pago.

 */
public class Exercicio023 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ano: ");
        int ano = entrada.nextInt();
        System.out.println("Preço: ");
        double preco = entrada.nextDouble();
        
        if(ano < 1990)
        {
            double imposto = 0.0;
            
            //Cast de tipagem de dados
            imposto = ((preco * 01) / 100); //1%
            
            System.out.println("Imposto a ser Pago: " + imposto);
        }
        else
        {
            double imposto = 0.0;
            
            imposto = ((preco * 001.5) / 100); //1,5%
            
            System.out.println("Imposto a ser Pago: " + imposto);
        }
    }
    
}
