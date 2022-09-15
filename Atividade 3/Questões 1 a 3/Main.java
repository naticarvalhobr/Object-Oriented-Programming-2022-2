import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        /* Escreva uma classe que represente uma lâmpada. Crie objetos do tipo 
        lâmpada. Insira informações nos objetos.*/
        
        Lampada p1 = new Lampada(); 
        
        System.out.println("Marca: ");
        String marca = tc.nextLine();
        
        System.out.println("Potencia: ");
        double potencia = tc.nextDouble();
        
        System.out.println("Marca " + marca);
        System.out.println("Potencia " + potencia);
        
        /* *************************************************** 
        Escreva uma classe que represente uma conta bancária. Crie objetos do 
        tipo conta. Insira informações nos objetos.*/
        
        Conta p2 = new Conta();
        
        System.out.println("Nome: ");
        String nome = tc.nextLine();
        
        System.out.println("Numero: ");
        double numero = tc.nextDouble();
        
        System.out.println("CPF: ");
        double cpf = tc.nextDouble();
        
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("CPF: " + cpf);
        
        /* *************************************************** 
        Escreva uma classe que represente um livro que está à venda em uma 
        livraria. Crie objetos do tipo livro. Insira informações nos objetos.*/
        
        Livro p3 = new Livro();
        
        System.out.println("Nome: ");
        String name = tc.nextLine();
        
        System.out.println("Autor: ");
        String autor = tc.nextLine();
        
        System.out.println("ISBN: ");
        int ISBN = tc.nextInt();
        
        System.out.println("Estoque: ");
        int estoque = tc.nextInt();
        
        System.out.println("Nome: " + name);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Estoque: " + estoque);
    }
}
