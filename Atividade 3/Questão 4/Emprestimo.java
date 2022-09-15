public class Emprestimo {
    private int ISBN, data;
    private String nome;
    
    public void setISBN(int ISBN){ 
        this.ISBN = ISBN; 
    }
    
    public void setData(int data){ 
        this.data = data; 
    }
    
    public void setNome(String nome){ 
        this.nome = nome; 
    }
    
    public int getISBN (){ 
        return ISBN;
    }
    
    public int getData (){ 
        return data;
    }
    
    public String getNome (){ 
        return nome;
    }
}
