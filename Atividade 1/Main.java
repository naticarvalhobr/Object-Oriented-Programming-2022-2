package Package1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
    
        double totalHoras;
        
        do {
        System.out.println("Horas trabalhadas em um mês: ");
        totalHoras = num.nextDouble();
        
        if (totalHoras < 160) {
            System.out.println("Mínimo total de horas não foi atingido.");
        }
        } while (totalHoras < 160); 
        
        System.out.println("Salário por hora: ");
        double salarioHora = num.nextDouble();
        num.close();
        
        double salarioBase, salarioTotal, extra, salarioExtra;
        
        if (totalHoras == 160){
            salarioBase = salarioHora * 160;
            salarioTotal = salarioBase;
        } else {
            salarioBase = salarioHora * 160;
            extra = totalHoras - 160;
            salarioExtra = extra * 1.5;
            salarioTotal = salarioBase + salarioExtra;
        }
        
       System.out.println("Salário por hora: " +salarioTotal);
    }
}