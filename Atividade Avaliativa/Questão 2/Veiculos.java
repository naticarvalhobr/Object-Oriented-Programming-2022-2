public class Veiculos{
  String modelo;
  double preco;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

  public Veiculos(String modelo, double preco) {
    setModelo(modelo);
    setPreco(preco);
  }
 /* 
  public void printDados(){
    String pd = getModelo()+ " " +getPreco()+ "\n";
    System.out.println("\n---Lista---");
    System.out.println(pd);
  }
*/ 
}
