import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Midia midia = new Midia();
        
        int opcao=0, i;

        Scanner tc = new Scanner(System.in);

        for(i=0; i<2; i++){
          System.out.println("\n\n--Escolha uma opção:--\n");
          System.out.println("1 - DVD");
          System.out.println("2 - CD");
          System.out.println("Digite a opção escolhida: ");
          opcao = tc.nextInt();
    
          switch(opcao){
            case 1:
              midia.inserirDados();
            break;
      
            case 2:
              midia.inserirDados();
            break;
          }
        }
      
    }
}