import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        
        // Instanciar a classe Produto
        Produto p1 = new Produto(); // Construtor padrão: sempre que for inicializar um objeto, precisa dele. Não adiciona nenhum valor no objeto. Os atributos são inicializados com valor null.
        Produto p2 = new Produto(); // Sempre instanciar no topo da página
        Produto p3 = new Produto();
        Produto p4 = new Produto("Relogio", "Xiaomi", 10);
        
        System.out.println("Marca: " + p4.marca);
        System.out.println("Nome: " + p3.nome);
        
        p1.codigo_barras = "12543";
        p1.marca = "Intel";
        p1.nome = "Core i3";
        p1.preco = 800.00;
        p1.qtd = 10;
        p1.desconto = 0.1;
        
        //System.out.println(p1); - Aponta pro endereço da classe
        System.out.println(
            "Dados do produto: " 
            + p1.codigo_barras 
            + ", " + p1.marca 
            + ", " + p1.nome 
            + ", R$" + p1.preco 
            + ", " + p1.qtd);
        
        p1.mostrarDados();
        p1.calcularDesconto();
        
        System.out.println("Preco com desconto: " + p1.calcularDesconto());
        
        System.out.println("************");
        
        Scanner n = new Scanner (System.in);
        
        System.out.println("Nome do produto:");    
        String nome = n.nextLine();
        System.out.println("Preco do produto:");
        double p = n.nextDouble();
        System.out.println("Desconto do produto:");
        double d = n.nextDouble();
        
        double resultado = p2.calcularDesconto2(p, d);
        System.out.println("Resultado: R$" + resultado);
    }
}
