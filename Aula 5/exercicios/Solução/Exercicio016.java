package Lista_002;
import java.util.Scanner;
/**
    16. Altere o algoritmo anterior para que seja lido do teclado, além das notas, o sexo do aluno (M ou F). 
    * Se for masculino, o resultado deverá ser precedido de “Caro aluno, seu resultado é: “. Se for feminino, 
    * o resultado deverá ser precedido de “Cara aluna, seu resultado é: “.
 */
public class Exercicio016 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nota 01: ");
        int nota01 = entrada.nextInt();
        System.out.println("Nota 02: ");
        int nota02 = entrada.nextInt();
        
        System.out.println("Informe o Sexo (M ou F) ");
        char caractere = entrada.next().charAt(0);
        
        int media = (nota01 + nota02) / 2;
        
        if(caractere == 'M' || caractere == 'm')
        {
            System.out.println("Caro Aluno sua nota deu Média: " + media);
        }
        
        if(caractere == 'F' || caractere == 'f')
        {
            System.out.println("Cara Aluna sua nota deu Média: " + media);
        }
    }
    
}
