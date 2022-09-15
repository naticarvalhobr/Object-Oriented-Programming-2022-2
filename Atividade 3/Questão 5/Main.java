/* Identifique as classes e implemente um programa para a seguinte especificação
: “O supermercado vende diferentes tipos de produtos. Cada produto tem um preço
e uma quantidade em estoque. Um pedido de um cliente é composto de itens, onde 
cada item especifica o produto que o cliente deseja e a respectiva quantidade. 
Esse pedido pode ser pago em dinheiro, cheque ou cartão.”  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner tc = new Scanner(System.in); 
        
        Produto p1 = new Produto();
        
        System.out.println("ID do produto: ");
        int m = tc.nextInt(); 
        p1.setID(m);
        
        System.out.println("Preco do produto: ");
        double n = tc.nextDouble(); 
        p1.setPreco(n);
        
        System.out.println("Estoque do produto: ");
        double p = tc.nextDouble(); 
        p1.setEstoque(p);
        
        System.out.println("ID " + p1.getID() + ", preco " + p1.getPreco() + " e estoque " + p1.getEstoque());
        
        /* ************************************* */
        
        Item p2 = new Item();
        
        System.out.println("ID do item da compra: ");
        int q = tc.nextInt(); 
        p2.setID(q);
        
        System.out.println("Qtd do item da compra: ");
        int r = tc.nextInt(); 
        p2.setQtd(r);
        
        System.out.println("ID " + p2.getID() + " e qtd " + p2.getQtd());
        
        /* ************************************* */
        
        Pedido p3 = new Pedido();
        
        System.out.println("Forma de pagamento do pedido: ");
        String s = tc.nextLine(); 
        p3.setPagamento(s);
        
        System.out.println("Pagamento " + p3.getPagamento());
    }
}
