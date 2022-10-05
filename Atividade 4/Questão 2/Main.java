import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner tc = new Scanner(System.in); 
        
        Pessoa p1 = new Pessoa();
        
        System.out.println("Nome: ");
        String m = tc.nextLine(); 
        p1.setNome(m);
        
        System.out.println("Sobrenome: ");
        String n = tc.nextLine(); 
        p1.setSobrenome(n);
        
        System.out.println("Dia de nascimento: ");
        int p = tc.nextInt(); 
        p1.setDia_nasc(p);
        
        System.out.println("Mes de nascimento: ");
        int q = tc.nextInt(); 
        p1.setMes_nasc(q);
        
        System.out.println("Ano de nascimento: ");
        int r = tc.nextInt(); 
        p1.setAno_nasc(r);
        
        System.out.println("Nome " + p1.getNome() + ", sobrenome " + p1.getSobrenome() + " e data de nascimento " + p1.getDia_nasc() + "/" + p1.getMes_nasc() + "/" + p1.getAno_nasc());
        
        int s = p1.calcIdade(r);
        System.out.println("Idade: " + s + " anos.");
        
        int t = p1.calcFreqMax(s);
        System.out.println("Frequencia cardiaca maxima: " + t + " bpm.");
        
        double v = p1.calcFreqAlvoMin(t);
        double w = p1.calcFreqAlvoMax(t);
        System.out.println("Frequencia cardiaca alvo deve estar entre " + v + " bpm e " + w + " bpm.");
        
    }
}