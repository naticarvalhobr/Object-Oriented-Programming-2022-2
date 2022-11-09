public class CD extends Midia implements GeralInterface {
    int nMusicas;

    public CD(){};

    public CD(int codigo, double preco, String nome, int nMusicas) {
      super(codigo, preco, nome);
    }
  
    
    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
  
    @Override
    public String getTipo(){
        System.out.println("---CD---");
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