package Lista_002;

/*
    33. Faça um algoritmo em Java que use todos os Operadores Lógicos. (Lógica Booleana na prática)

    //Famosa Tabela Verdade

    Entrada: IDADE de uma Pessoa, start inicial 75 Anos;

 */

public class Exercicio033 {
    
    public static void main(String[] args)
    {
        int idade = 75;
        boolean testeBoolean;
        
        //-------------------------------------------------------------------------------------
        
        testeBoolean = (idade > 18 && idade < 65);
        System.out.println(idade + " > 18 && " + idade + " < 65 é: " + testeBoolean);
        
        //-------------------------------------------------------------------------------------
        
        //Circuito curto com o Operador AND "E"
        testeBoolean = (idade < 65 && idade > 18);
        System.out.println(idade + " < 65 && " + idade + " > 18 é: " + testeBoolean);
        
        //-------------------------------------------------------------------------------------
        
        //Circuito curto com o Operador OR "OU", Forço uma saida "falsa"
        testeBoolean = (idade > 65 || idade < 18 && false);
        System.out.println(idade + " > 65 || " + idade + " < 18" + " && false é: " + testeBoolean);
        
        //-------------------------------------------------------------------------------------
        
        //usamos parenteses para forçar a execução da "Premissa Lógica"
        testeBoolean = ((idade > 65 || idade < 18) && false);
        System.out.println("( " + idade + " > 65 || " + idade + " < 18)" + " && false é: " + testeBoolean);
        
        //-------------------------------------------------------------------------------------
    }
    
}
