package Lista_002;
import java.util.Scanner;

/*
    25. Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano. 

    Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo. 

    Mostre uma mensagem informando o saldo médio e o valor do crédito. 

    Saldo médio Percentual 
    de 0 a 200 nenhum crédito de 201 a 400 20% do valor 
    do saldo médio de 401 a 600 30% 
    do valor do saldo médio acima de 601 40% do valor do saldo médio
 */
public class Exercicio025 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        double media    = 0.0;
        double credito  = 0.0;
        
        System.out.println("Media do Saldo: ");
        media = entrada.nextDouble();
        
        /*
            de 0 a 200 nenhum crédito 1°
            de 201 a 400 20% do valor 
            do saldo médio 
            de 401 a 600 30% 
            do valor do saldo médio acima 
            de 601 40% do valor do saldo médio
        */
        
        if(media == 0 || media <= 200)
        {
            credito = 0.0;
            
            System.out.println("Nenhum Crédito!!");
        }
        else if(media >= 201 && media <= 400)
        {
            credito = media * 0.20;
            
            System.out.println("Foi Concedido um Crédito de R$: " + credito + ".");
        }
        else if(media >= 401 && media <= 600)
        {
            credito = media * 0.30;
            
            System.out.println("Foi Concedido um Crédito de R$: " + credito + ".");
        }
        else if(media > 600)
        {
            credito = media * 0.40;
            
            System.out.println("Foi Concedido um Crédito de R$: " + credito + ".");
        }
    }
    
}
