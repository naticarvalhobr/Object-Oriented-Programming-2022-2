import java.util.Scanner;

public class Midia implements GeralInterface {
    int codigo;
    double preco;
    String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public Midia(){};

    public Midia(int codigo, double preco, String nome){
      setCodigo(codigo);
      setPreco(preco);
      setNome(nome);
    };

    @Override
    public String getTipo(){
        System.out.println("---Midia---");
        return null;
    }

    @Override
    public String getDetalhes() {
        
        System.out.println("Adicionar dependente");
        return null;
    }

    @Override
    public void printDados(){
        
        System.out.println("Adicionar dependente"); 
    }
  
    @Override
    public void inserirDados(){
        Scanner tc = new Scanner(System.in);
      
        System.out.println("Codigo da midia: ");
        int c = tc.nextInt(); 
        setCodigo(c);
        
        System.out.println("Preco da midia: ");
        double p = tc.nextDouble(); 
        setPreco(p);
        
        System.out.println("Nome da midia: ");
        String n = tc.nextLine();
        setNome(n); 
    }   
}