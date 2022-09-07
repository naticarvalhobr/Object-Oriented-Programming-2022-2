/*
 Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito:

- Ter no mínimo 65 anos de idade.
- Ter trabalhado no mínimo 30 anos.
- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Empregado p1 = new Empregado();
        
        Scanner tc = new Scanner(System.in); 

        System.out.println("Número do empregado: ");
        int n = tc.nextInt(); 
        p1.setnumEmp(n);
        
        System.out.println("Ano de nascimento: ");
        int m = tc.nextInt(); 
        p1.setanoN(m);
        
        System.out.println("Ano de ingresso na empresa: ");
        int p = tc.nextInt(); 
        p1.setanoI(p);
        
        if ((p1.idade >= 65) || (p1.trabalho >= 30) || ((p1.idade >= 60) && (p1.trabalho >= 25))){
           System.out.println("Requerer aposentadoria");
       } else {
           System.out.println("Não requerer");
       }   
    }
}
