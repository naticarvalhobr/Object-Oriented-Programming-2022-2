public class Livro {
    private int ISBN;
    private String nome, autor;
    
    public void setISBN(int ISBN){ 
        this.ISBN = ISBN; 
    }
    
    public void setNome(String nome){ 
        this.nome = nome; 
    }
    
    public void setAutor(String autor){ 
        this.autor = autor; 
    }
    
    public int getISBN (){ 
        return ISBN;
    }
    
    public String getNome (){ 
        return nome;
    }
    
    public String getAutor (){ 
        return autor;
    }
}
