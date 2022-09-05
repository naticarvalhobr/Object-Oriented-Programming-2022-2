package Package1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double numEmpregado, anoNasc, anoIng, idade, trabalho;
        
        System.out.println("Número do empregado: ");
        numEmpregado = num.nextDouble();

        do { 
            System.out.println("Ano de nascimento: ");
            anoNasc = num.nextDouble();
            
            if (anoNasc <= 0) {
                System.out.println("Ano de nascimento inválido.");
            }
        } while (anoNasc <= 0);
        
        do { 
            System.out.println("Ano de ingresso na empresa: ");
            anoIng = num.nextDouble();
            
            if (anoIng <= 0) {
                System.out.println("Ano de ingresso inválido.");
            }
        } while (anoIng <= 0);
        num.close();
        
       idade = 2022 - anoNasc;
       trabalho = 2022 - anoIng;
       
       if ((idade >= 65) || (trabalho >= 30) || ((idade >= 60) && (trabalho >= 25))){
           System.out.println("Requerer aposentadoria");
       } else {
           System.out.println("Não requerer");
       }
    }
}

