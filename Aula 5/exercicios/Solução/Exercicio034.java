package Lista_002;
import java.util.Scanner;   //Importa o Scanner para capturar fluxo de dados
import java.util.Random;    //Importa a Classe Gera numeros aleatórios
/*
    34. Faça um algoritmo em Java que gere automaticamente 2 valores inteiros, 
    e questione o usuário a soma de ambos. O programa deve retornar o feedback 
    da resposta, além de mostrar o resultado correto, caso a resposta seja falsa.
 */

public class Exercicio034 {
    
    public static void main(String[] args)
    {
        int numero01;               //Primeiro numero
        int numero02;               //Segundo numero
        int soma;                   //Soma dos numeros
        int respostaUser;           //Resposta do usuário
        
        //Cria e instancia a classe Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Cria o objeto Random
        Random randomNumeros = new Random();
        
        //Obtem 2 numeros randomicos, ou seja(Aleatórios) entre 1 á 100
        numero01 = randomNumeros.nextInt(100);
        numero02 = randomNumeros.nextInt(100);
        
        System.out.println("Qual é sua Resposta " +
                            "para o problema ?");
        
        System.out.println( numero01 + " + " +
                            numero02 + " = ? ");
        
        
        //Calcula a resposta
        soma = numero01 + numero02;
        
        //Obtem a resposta do Usuário
        respostaUser = entrada.nextInt();
        
        //Mostra o resultado do Usuário
        if(respostaUser == soma)
            System.out.println("Correto!");
        else
        {
            System.out.println("Desculpe, resposta Errada. " +
                                "A resposta Correta é " +
                                soma);
        }
    }
    
}
