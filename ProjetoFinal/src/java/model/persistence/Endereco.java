package model.persistence;

import java.util.List;

public class Endereco {

    private String id;
    private String logradouro;
    private String cep;
    private String bairro;
    private String uf;
    private String pais;
    private List<Usuario> usuarios;

    public boolean setId(String id) {
        this.id = id;
        return false;
    }

    public String getId() {
        return this.id;
    }

    public boolean setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return false;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public boolean setCep(String cep) {
        this.cep = cep;
        return false;
    }

    public String getCep() {
        return this.cep;
    }

    public boolean setBairro(String bairro) {
        this.bairro = bairro;
        return false;
    }

    public String getBairro() {
        return this.bairro;
    }

    public boolean setUf(String uf) {
        this.uf = uf;
        return false;
    }

    public String getUf() {
        return this.uf ;
    }

    public boolean setPais(String pais) {
        this.pais = pais;
        return false;
    }

    public String getPais() {
        return this.pais;
    }

}
