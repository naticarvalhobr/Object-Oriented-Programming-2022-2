/*
nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados 
para mês, dia e ano de nascimento), altura (em metros) e peso (em quilogramas) 
da pessoa
*/

public class HealthProfile {
    private String nome, sobrenome, sexo;
    private int dia_nasc, mes_nasc, ano_nasc, idade, freqMax;
    private double altura, peso, freqAlvoMin, freqAlvoMax, IMC;
    
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
    
    public void setSexo(String sexo){ 
        this.sexo = sexo; 
    }
    
    public String getSexo (){ 
        return sexo;
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
    
    public void setAltura(double altura){ 
        this.altura = altura; 
    }
    
    public double getAltura (){ 
        return altura;
    }
    
    public void setPeso(double peso){ 
        this.peso = peso; 
    }
    
    public double getPeso (){ 
        return peso;
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
    
    public double calcIMC(double peso, double altura) {
        IMC = peso / (altura * altura);
        return IMC;
    }
}
