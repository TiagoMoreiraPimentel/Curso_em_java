package Lista_002;
import java.util.Scanner;
/*
 *  11. Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno 
    durante o semestre. Calcular a sua média (aritmética), informar o nome e sua 
    menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).
 */
public class Exercicio011 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = entrada.next();
        
        System.out.println("Nota 01:");
        double nota01 = entrada.nextDouble();
        System.out.println("Nota 02:");
        double nota02 = entrada.nextDouble();
        System.out.println("Nota 03:");
        double nota03 = entrada.nextDouble();
        
        //calcula a media das notas
        double mediaAritmetica = (nota01 + nota02 + nota03) / 3;
        
        //verificar feedback para o aluno
        if(mediaAritmetica >= 7.0)
        {
            System.out.println("Aluno Aprovado!");
        
        }else if(mediaAritmetica >= 5.1 && mediaAritmetica <= 6.9)
        {
            System.out.println("Recuperação");
        }
        else
        {
            System.out.println("Reprovado!");
        }
    }
    
}
