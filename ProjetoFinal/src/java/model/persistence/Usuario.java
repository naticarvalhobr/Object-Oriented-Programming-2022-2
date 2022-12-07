package model.persistence;

public class Usuario {

    private String id;
    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private Endereco endereco;

    public boolean setId(String id) {
        this.id = id;
        return false;
    }

    public String getId() {
        return this.id;
    }

    public boolean setNome(String nome) {
        //encapsular
        this.nome = nome;
        return false;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setCpf(String cpf) {
        this.cpf = cpf;
        return false;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    public boolean setRg(String rg) {
        this.rg = rg;
        return false;
    }

    public String getRg() {
        return this.rg;
    }

    public boolean setSexo(String sexo) {
        this.sexo = sexo;
        return false;
    }

    public String getSexo() {
        return this.sexo;
    }

    public boolean setEndereco(Endereco endereco) {
        this.endereco = endereco;
        
        return false;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

}
