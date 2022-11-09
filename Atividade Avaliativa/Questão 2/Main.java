import java.util.Scanner;

public class Main{
  public static void main (String[] args){
    
  Scanner s = new Scanner(System.in);

  Moto moto = new Moto("",0,0);
  Carro carro = new Carro("",0,0);
  Veiculos veiculos = new Veiculos("",0);

  int opcao=0, i;

    for(i=0; i<2; i++){
      System.out.println("\n\n--Escolha uma opção:--\n");
      System.out.println("1 - Cadastrar uma moto");
      System.out.println("2 - Cadastrar um carro");
      System.out.println("Digite a opção escolhida: ");
      opcao = s.nextInt();

      switch(opcao){
        case 1:
          moto.insertData();
        break;
  
        case 2:
          carro.insertData();
        break;
      }
    }

    
    System.out.println("\n---Lista---");
    System.out.println(moto.getModelo()+ " - "+ moto.getPreco()+ " - " +moto.getAno()+ "\n" 
                       +carro.getModelo()+ " - "+ carro.getPreco()+ " - " +carro.getKm()+ "\n");
    
    System.out.println("Total de preços dos veículos cadastrados: ");
    System.out.println(moto.getPreco() + carro.getPreco()+ "\n");

    moto.reajusteMoto();
    carro.reajusteCarro();
}
}