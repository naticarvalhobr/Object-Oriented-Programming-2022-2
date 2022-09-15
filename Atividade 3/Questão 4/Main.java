/* Faça um programa para controle de empréstimo de livros, com as classes 
Empréstimo, Livro e Pessoa. Crie objetos do tipo Empréstimo, livro e pessoa. 
Insira informações nos objetos. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Emprestimo p1 = new Emprestimo();
        Livro p2 = new Livro();
        Pessoa p3 = new Pessoa();
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("ISBN do livro a ser emprestado: ");
        int n = tc.nextInt(); 
        p1.setISBN(n);
        
        System.out.println("Data do emprestimo: ");
        int m = tc.nextInt(); 
        p1.setData(m);
        
        tc.nextLine();
        System.out.println("Nome de quem esta emprestando: ");
        String p = tc.nextLine();
        p1.setNome(p);
        
        System.out.println("ISBN " + p1.getISBN() + ", data " + p1.getData() + " e nome " + p1.getNome());
        
        /* ******************************* */
        
        System.out.println("ISBN do livro: ");
        int q = tc.nextInt(); 
        p2.setISBN(q);
        
        tc.nextLine();
        System.out.println("Nome do livro: ");
        String r = tc.nextLine(); 
        p2.setNome(r);
        
        System.out.println("Autor do livro: ");
        String s = tc.nextLine();
        p2.setAutor(s);
        
        System.out.println("ISBN " + p2.getISBN() + ", nome " + p2.getNome() + " e autor " + p2.getAutor());
    
        /* ******************************* */
        
        System.out.println("Nome: ");
        String t = tc.nextLine(); 
        p3.setNome(t);
        
        System.out.println("CPF: ");
        int u = tc.nextInt(); 
        p3.setCPF(u);
        
        System.out.println("Telefone: ");
        int v = tc.nextInt(); 
        p3.setTelefone(v);
        
        System.out.println("Nome " + p3.getNome() + ", CPF " + p3.getCPF() + " e telefone " + p3.getTelefone());
    }
}
