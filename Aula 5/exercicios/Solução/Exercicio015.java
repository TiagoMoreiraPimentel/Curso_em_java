package Lista_002;
import java.util.Scanner;
/*
    Elabore um algoritmo a ler 4 notas de um aluno (de 1 a 10). Após calcular a média das notas, 
    apresentar a mensagem “Aprovada” se o aluno tiver obtido média maior ou igual a 6, caso contrário, 
    apresentar “Reprovado”.
 */
public class Exercicio015 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int nota01, nota02, nota03, nota04;
        System.out.println("Nota 01:");
        nota01 = entrada.nextInt();
        System.out.println("Nota 02:");
        nota02 = entrada.nextInt();
        System.out.println("Nota 03:");
        nota03 = entrada.nextInt();
        System.out.println("Nota 04:");
        nota04 = entrada.nextInt();
        
        int media = (nota01 + nota02 + nota03 + nota04) / 4;
        
        if(media >= 6)
        {
            System.out.println("Aprovado!");
        } 
        else
        {
            System.out.println("Reprovado!");
        }
    }
    
}
