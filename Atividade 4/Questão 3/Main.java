import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner tc = new Scanner(System.in);
        
        HealthProfile p1 = new HealthProfile();
        
        System.out.println("Nome: ");
        String m = tc.nextLine(); 
        p1.setNome(m);
        
        System.out.println("Sobrenome: ");
        String n = tc.nextLine(); 
        p1.setSobrenome(n);
        
        System.out.println("Sexo (F/M): ");
        String o = tc.nextLine(); 
        p1.setSexo(o);
        
        System.out.println("Dia de nascimento: ");
        int p = tc.nextInt(); 
        p1.setDia_nasc(p);
        
        System.out.println("Mes de nascimento: ");
        int q = tc.nextInt(); 
        p1.setMes_nasc(q);
        
        System.out.println("Ano de nascimento: ");
        int r = tc.nextInt(); 
        p1.setAno_nasc(r);
        
        System.out.println("Altura em metro: ");
        double s = tc.nextDouble(); 
        p1.setAltura(s);
        
        System.out.println("Peso em kg: ");
        double t = tc.nextDouble(); 
        p1.setPeso(t);
        
        System.out.println("Nome " + p1.getNome() + ", sobrenome " + p1.getSobrenome());
        System.out.println("Sexo " + p1.getSexo());
        System.out.println("Data de nascimento " + p1.getDia_nasc() + "/" + p1.getMes_nasc() + "/" + p1.getAno_nasc());
        System.out.println("Altura " + p1.getAltura() + "m e peso " + p1.getPeso() + "kg.");
        
        int u = p1.calcIdade(r);
        System.out.println("Idade: " + u + " anos.");
        
        int v = p1.calcFreqMax(u);
        System.out.println("Frequencia cardiaca maxima: " + v + " bpm.");
        
        double x = p1.calcFreqAlvoMin(v);
        double w = p1.calcFreqAlvoMax(v);
        System.out.println("Frequencia cardiaca alvo deve estar entre " + x + " bpm e " + w + " bpm.");
        
        double y = p1.calcIMC(t, s);
        System.out.println("Indice de Massa Corporal " + y);
    }
}
