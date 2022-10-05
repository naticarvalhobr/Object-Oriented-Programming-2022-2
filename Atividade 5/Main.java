import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner tc = new Scanner(System.in);
        
        ContaPoupanca usuario1 = new ContaPoupanca();
        ContaPoupanca usuario2 = new ContaPoupanca();
        double taxaJurosAnual;
        
        do{
            System.out.println("Taxa de juros anual: ");
            taxaJurosAnual = tc.nextDouble();
            if (taxaJurosAnual <= 0) {
                System.out.println("Taxa de juros invalida. Insira um valor maior que 0.");
            }
        } while (taxaJurosAnual <= 0);
        
        System.out.println("Dinheiro na conta: ");
        double m = tc.nextDouble(); 
        usuario1.setDinheiroNaConta(m);
        
        System.out.println("Dinheiro na conta 1: " + usuario1.getDinheiroNaConta());
        tc.nextLine();

        double p = usuario1.calcJurosMensais(m, taxaJurosAnual);
        double q = usuario1.atualizarSaldo(m, p);
        System.out.println("Os juros foram de R$ " + p + ", sendo o novo saldo R$ " + q);
        
        /*xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx*/        

        System.out.println("Dinheiro na conta: ");
        double n = tc.nextDouble(); 
        usuario2.setDinheiroNaConta(n);
        
        System.out.println("Dinheiro na conta 2: " + usuario2.getDinheiroNaConta());
        tc.nextLine();

        double r = usuario2.calcJurosMensais(n, taxaJurosAnual);
        double s = usuario2.atualizarSaldo(n, r);
        System.out.println("Os juros foram de R$ " + r + ", sendo o novo saldo R$ " + s);
        
        /*xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx*/
        
        System.out.println("Deseja atualizar a taxa de juros anual? (S/N) ");
        String opcao = tc.nextLine();
        if ((opcao == "S") || (opcao == "s")) {
            do {
                System.out.println("Nova taxa de juros anual: ");
                taxaJurosAnual = tc.nextDouble();
                usuario1.atualizarJurosAnual(taxaJurosAnual);
                if (taxaJurosAnual <= 0) {
                    System.out.println("Taxa de juros invalida. Insira um valor maior que 0.");
                }
            } while (taxaJurosAnual <= 0);
        }
    }
}
