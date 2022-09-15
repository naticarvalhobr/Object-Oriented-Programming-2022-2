public class Produto {
    private double preco, estoque;
    private int ID;
    
    public void setPreco(double preco){ 
        this.preco = preco; 
    }
    
    public void setEstoque(double estoque){ 
        this.estoque = estoque; 
    }
    
    public void setID(int ID){ 
        this.ID = ID; 
    }
    
    public double getPreco (){ 
        return preco;
    }
    
    public double getEstoque (){ 
        return estoque;
    }
    
    public int getID (){ 
        return ID;
    }
}
