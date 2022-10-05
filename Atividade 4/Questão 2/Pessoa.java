public class Pessoa {
    private String nome, sobrenome;
    private int dia_nasc, mes_nasc, ano_nasc, idade, freqMax;
    private double freqAlvoMin, freqAlvoMax;
    
    public void setNome(String nome){ 
        this.nome = nome; 
    }
    
    public String getNome (){ 
        return nome;
    }
    
    public void setSobrenome(String sobrenome){ 
        this.sobrenome = sobrenome; 
    }
    
    public String getSobrenome (){ 
        return sobrenome;
    }
    
    public void setDia_nasc(int dia_nasc){ 
        this.dia_nasc = dia_nasc; 
    }
    
    public int getDia_nasc (){ 
        return dia_nasc;
    }
    
    public void setMes_nasc(int mes_nasc){ 
        this.mes_nasc = mes_nasc; 
    }
    
    public int getMes_nasc (){ 
        return mes_nasc;
    }
    
    public void setAno_nasc(int ano_nasc){ 
        this.ano_nasc = ano_nasc; 
    }
    
    public int getAno_nasc (){ 
        return ano_nasc;
    }
    
    public int calcIdade(int ano_nasc){
        idade = 2022 - ano_nasc;
        return idade;
    }
    
    public int calcFreqMax(int idade) {
        freqMax = 220 - idade;
        return freqMax;
    }
    
    public double calcFreqAlvoMin(int freqMax) {
        freqAlvoMin = freqMax * 0.5;
        return freqAlvoMin;
    }
    
    public double calcFreqAlvoMax(int freqMax) {
        freqAlvoMax = freqMax * 0.85;
        return freqAlvoMax;
    }
}