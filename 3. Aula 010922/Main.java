import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(); // Criou o objeto (é uma variável). Os objetos vão apontar para as classes.
        // Em alguns casos, pode inicializar já passando parâmetros.
        
        Scanner tc = new Scanner(System.in);    
        System.out.println("Digite o nome:");
        // p1.nome = tc.nextLine(); -- Se os atributos fossem públicos
        String n = tc.nextLine(); // cria variável auxiliar para armazenar temporariamente até definir os dados nos atributos
        
        System.out.println("Digite o ano de nascimento:");        
        // p1.dataN = tc.nextInt(); -- Se os atributos fossem públicos
        int ano = tc.nextInt();
        
        p1.setNome(n);
        
        p1.idade = p1.calc(p1.dataN); // variável idade armazena o resultado do método
        
        System.out.println("Nome: " + p1.getNome() + " e idade: " + p1.idade);
    }
}
