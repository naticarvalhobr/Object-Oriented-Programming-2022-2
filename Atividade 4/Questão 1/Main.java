import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner tc = new Scanner(System.in); 
        
        Produto p1 = new Produto();
        
        System.out.println("Nome do produto: ");
        String m = tc.nextLine(); 
        p1.setNome(m);
        
        System.out.println("Preco do produto: ");
        double n = tc.nextDouble(); 
        p1.setPreco(n);
        
        System.out.println("Quantidades do produto: ");
        int p = tc.nextInt(); 
        p1.setQtd(p);
        
        System.out.println("Nome " + p1.getNome()+ ", preco " + p1.getPreco() + " e qtd " + p1.getQtd());
       
        p1.calc();
    }
}