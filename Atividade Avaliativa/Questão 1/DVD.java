public class DVD extends Midia implements GeralInterface {
    int nFaixas;
    
    public DVD(){};
  
    public DVD(int codigo, double preco, String nome, int nFaixas) {
      super(codigo, preco, nome);
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
    
    @Override
    public String getTipo(){
        System.out.println("---DVD---");
        return null;
    }
    
    @Override
    public String getDetalhes() {
        
        System.out.println("Adicionar dependente");
        return null;
    }
    
    @Override
    public void inserirDados(){
        
        System.out.println("Adicionar dependente");    
    }
}