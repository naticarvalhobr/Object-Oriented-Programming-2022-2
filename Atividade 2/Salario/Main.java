/*
A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do
funcionário, que deverá ser acrescido das horas extras, e caso tenham sido trabalhadas.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Trabalhador p1 = new Trabalhador();
        
        Scanner tc = new Scanner(System.in); 
        
        System.out.println("Horas trabalhadas em um mês: ");
        int n = tc.nextInt(); 
        p1.settotalHoras(n);
        
        System.out.println("Salario por hora: ");
        int m = tc.nextInt(); 
        p1.setsalarioHora(m);
        
        System.out.println("Salario total: " + p1.getsalarioTotal());
    }
}
