package Lista_002;
import java.util.Scanner;
/*
    13. - Elabore um algoritmo que leia do teclado o sexo de uma pessoa. Se o sexo digitado 
    for M ou F, escrever na tela “Sexo válido!”. Caso contrário, informar “Sexo inválido!”;
 */
public class Exercicio013 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe Sexo: ");
        String caractereString = entrada.next();
        
        System.out.println("Informe Sexo: ");
        char caractere = entrada.next().charAt(0);
        
        if(caractereString.contains("Masculino") || caractereString.contains("masculino") || caractereString.contains("Feminino") || caractereString.contains("feminino"))
        {
            System.out.println("Sexo Válido!");
        }
        else if(caractere == 'M' || caractere == 'm' || caractere == 'F' || caractere == 'f')
        {
            System.out.println("Sexo Válido!");
        }
        else
        {
            System.out.println("Sexo inválido!");
        }     
    }
}
