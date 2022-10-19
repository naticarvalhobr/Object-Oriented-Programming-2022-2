import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner tc = new Scanner(System.in);
        
        Ingresso ingresso = new Ingresso();
        Normal normal = new Normal();
        CamaroteInferior camaroteinferior = new CamaroteInferior();
        CamaroteSuperior camarotesuperior = new CamaroteSuperior();
        VIP vip = new VIP();
       
        ingresso.setValor(12);
        vip.setValorAdd(0.7f);
        camaroteinferior.setLocalizacaoIng("Primeiro piso");
        camarotesuperior.setTaxaAdicional(0.5f);
        normal.setValor(13);
        
        normal.imprimeIngNormal(normal.getValor());
        System.out.println("Ingresso VIP: " + vip.valorVip(ingresso.getValor()));
        System.out.println("Ingresso VIP Camarote Inferior: " + vip.valorVip(ingresso.getValor()));
        
        String m = camaroteinferior.getLocalizacaoIng();
        camaroteinferior.imprimeLocalizacaoIng(m);
        
        camarotesuperior.setTaxaAdicional(15);
        camarotesuperior.valorIngressoCamSup(20);
        double n = vip.getValorAdd();
        System.out.println("Ingresso VIP Camarote Superior: " + camarotesuperior.valorIngressoCamSup(n));
    }
}