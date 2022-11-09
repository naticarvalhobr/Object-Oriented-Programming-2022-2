import java.util.Scanner;

public class Moto extends Veiculos {
  
  int ano;

  public Moto(String modelo, double preco, double ano) {
    super(modelo, preco);
  }
  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getAno() {
    return ano;
  }
  
  public void setAno(int ano) {
    this.ano = ano;
  }

    public void insertData(){
      Scanner s = new Scanner(System.in);
      System.out.println("\nDigite o modelo: ");
      String m = s.nextLine();
      System.out.println("Digite o preço: ");
      double p = s.nextDouble();
      System.out.println("Digite o ano: ");
      int a = s.nextInt();
      setModelo(m);
      setPreco(p);
      setAno(a);      
    }

  public void reajusteMoto(){
    if(getAno()>=2008){
      double reajusteM = getPreco() + (getPreco()*0.1);
      System.out.println("O valor da moto reajustado é:");
      System.out.println(reajusteM+ "\n");
    }
  }
  
}

