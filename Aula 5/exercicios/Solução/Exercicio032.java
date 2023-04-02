package Lista_002;
import javax.swing.JOptionPane; //Classe solicitada no Enunciado
/*
    32. Crie um programa em Java, para calcular o valor a receber do trabalhador semanalmente, multiplicadas horas x valor da hora.
    Importante: Quero com interface de usuário "JoptionPane". Classe ainda não usada no curso!
*/

public class Exercicio032 {
    
    public static void main(String[] args)
    {
        String inputString; //Para entrade de leitura
        String nome;        //O nome do usuário
        int horas;          //Numero de numeros trabalhadas durante a semana.
        double valorHora;   //Valor Hora
        double valorPagar;  //Valor á Pagar
        
        //Obtenha o nome do usuário
        nome = JOptionPane.showInputDialog("Qual seu Nome: ?" );
        
        //Oter horas trabalhadas
        inputString = JOptionPane.showInputDialog(" Quantas horas " +
                                                  " você trabalhou esta semana ?");         
        
        //Converter a entrada para um int
        horas = Integer.parseInt(inputString);
        
        //Obtenha a Valor/Hora
        inputString = JOptionPane.showInputDialog(" Qual é o Valor da Hora ?");
        
        //Converter a entrada para um double
        valorHora = Double.parseDouble(inputString);
        
        //Calculando o salário do colaborador
        valorPagar = valorHora * horas;
        
        //Exiba os resultados
        JOptionPane.showMessageDialog(null, "Olá " +
                                            nome + ". Seu Salário Bruto é R$: " + 
                                            valorPagar);
        
        //Força o termino do programa
        System.exit(0);
    }
    
}
