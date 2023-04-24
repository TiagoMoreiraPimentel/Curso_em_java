package Lista_002;
/*
    40. Faça um programa Java que decifre de forma autônoma os caracteres gerados de forma aleatória pelo programa.
 */
public class Exercicio040 {
    
    public static void main(String[] args)
    {
        char caractere = 'A';
        
        //Gerando todos os caracteres da Tabela ASCII, tanto maiusculas, quanto minusculas. Caso não seja um caractere ele irá avisar
        caractere = (char)(128.0 * Math.random());
        
        if(caractere >= 'A') { //Maior que A
            
            if(caractere <= 'Z') //Menor que Z
            {
                //Então é letra Maiuscula
                System.out.println("Voce tem a letra Maiuscula: " + caractere);
            }else{
                if(caractere >= 'a') {
                    if(caractere <= 'z')
                    {
                        //Então é letra Minuscula
                        System.out.println("Voce tem a letra Minuscula: " + caractere);
                    }
                    else
                    {
                        System.out.println(""
                                + "O codigo é maior que 'A' mas, não é uma Letra");
                    }
                }else{
                    System.out.println(""
                            + "O codigo é menor que 'A' e não é uma Letra");
                }
            }
        }else{
            System.out.println("O codigo é menor que 'A', então não é uma Letra");
        }
            
                
    }
    
}
