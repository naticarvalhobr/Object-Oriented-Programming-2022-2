public class Pessoa {
    private int CPF, telefone;
    private String nome;
    
    public void setCPF(int CPF){ 
        this.CPF = CPF; 
    }
    
    public void setTelefone(int telefone){ 
        this.telefone = telefone; 
    }
    
    public void setNome(String nome){ 
        this.nome = nome; 
    }
    
    public int getCPF (){ 
        return CPF;
    }
    
    public int getTelefone (){ 
        return telefone;
    }
    
    public String getNome (){ 
        return nome;
    }
}
