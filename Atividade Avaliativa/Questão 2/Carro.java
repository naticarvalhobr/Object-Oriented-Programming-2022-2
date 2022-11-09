import java.util.Scanner;

public class Carro extends Veiculos {
  
  double km;

  public Carro(String modelo, double preco, double km) {
    super(modelo, preco);
  }
  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
      this.preco = preco;
  }
  
  public double getKm() {
    return km;
  }
  public void setKm(double km) {
      this.km = km;
  }

   public void insertData(){
      Scanner s = new Scanner(System.in);
      System.out.println("\nDigite o modelo: ");
      String m = s.nextLine();
      System.out.println("Digite o preço: ");
      double p = s.nextDouble();
      System.out.println("Digite o Km: ");
      double k = s.nextDouble();
      setModelo(m);
      setPreco(p);
      setKm(k);  
    }

  public void reajusteCarro(){
    if(getKm()>=100000){
      double reajusteC = getPreco() - (getPreco()*0.08);
      System.out.println("O valor do carro reajustado é:");
      System.out.println(reajusteC+ "\n");
    }
  }
  
}