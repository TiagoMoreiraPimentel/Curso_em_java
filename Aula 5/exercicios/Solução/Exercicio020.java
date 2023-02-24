package Lista_002;

import java.util.Scanner;

/*
    20.  Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos lados de um triângulo e, 
    se forem verificar se é um triângulo equilátero, isósceles ou escalenos. Se eles não formarem um triângulo, 
    escrever a mensagem. Considere as seguintes propriedades: 

    • O comprimento de cada lado em um triângulo é menor que a soma dos outros dois lados; 

    • Equiláteros: tem os comprimentos dos três lados iguais; 
    • Isósceles: tem os comprimentos de dois lados iguais; 
    • Escaleno: tem os comprimentos dos três lados diferentes.

 */
public class Exercicio020 {

    public static void main(String[] args) {
        //Crio o objeto de captura de fluxo de dados
        Scanner entrada = new Scanner(System.in);

        //Lados do Triangulo
        System.out.println("X: ");
        int x = entrada.nextInt();
        System.out.println("Y: ");
        int y = entrada.nextInt();
        System.out.println("Z: ");
        int z = entrada.nextInt();

        //Validar as entradas e criar as regras de negocio
        if (x < y + z && y < x + z && z < x + y) {
            
            if (x == y && y == z) {
                //1° Regra
                //Equiláteros: tem os comprimentos dos três lados iguais;
                System.out.println("Triângulo Equilátero");
            } //Isósceles: tem os comprimentos de dois lados iguais; 
            else if (x == y || x == z || y == z) {
                System.out.println("Triângulo Isósceles");
            } //3° Regra
            //Escaleno: tem os comprimentos dos três lados diferentes.
            else {
                System.out.println("Triângulo Escaleno");
            }
        }
        else
        {
            System.out.println("Os lados não Formam um Triângulo");
        }
    }

}
