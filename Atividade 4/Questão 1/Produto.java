public class Produto {
    private double preco, preco_total;
    private int qtd;
    private String nome;
    
    public void setNome(String nome){ 
        this.nome = nome; 
    }
    
    public void setPreco(double preco){ 
        this.preco = preco; 
    }
    
    public void setQtd(int qtd){ 
        this.qtd = qtd; 
    }
    
    public String getNome (){ 
        return nome;
    }
    
    public double getPreco (){ 
        return preco;
    }
    
    public int getQtd (){ 
        return qtd;
    }
    
    public void calc(){
        if (this.qtd <= 10){
            this.preco_total = this.preco * this.qtd;
        } else if ((qtd >= 11) && (qtd <= 20)) {
            preco_total = (preco * qtd) * 0.1;
        } else if ((qtd >= 21) && (qtd <= 50)) {
            preco_total = (preco * qtd) * 0.2;
        } else if (qtd > 50) {
            preco_total = (preco * qtd) * 0.25;
        }
        System.out.println("Preco total: " + preco_total);
    }
}
